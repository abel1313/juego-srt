
import Nodo from './Nodo.js';
import Paso from './Paso.js';

export default class RutaFinder {
  constructor(todosLosMapas) {
    this.todosLosMapas = todosLosMapas;
  }

  encontrarRutaConPasos(mapaOrigen, zonaOrigen, mapaDestino, zonaDestino) {
    const visitados = new Set();
    const rutasEncontradas = [];
    const queue = [];
    queue.push(new Nodo(mapaOrigen, zonaOrigen, -1, new Set()));

    while (queue.length > 0) {
      const actual = queue.shift();
      const mapaActual = actual.mapa;
      const zonaActual = actual.zona;
      const pasosActuales = actual.pasos;

      // Marcar la visita actual
      const claveVisita = `${mapaActual}-${zonaActual}`;
      if (visitados.has(claveVisita)) {
        continue;
      }
      visitados.add(claveVisita);

      // Agregar el paso actual a la ruta
      if (!(mapaActual === mapaOrigen && zonaActual === zonaOrigen)) {
        pasosActuales.add(new Paso(mapaActual, zonaActual, actual.aparecerPortal));
      }

      // Verificar si hemos llegado al destino
      if (mapaActual.toLowerCase() === mapaDestino.toLowerCase() && zonaActual === zonaDestino) {
        rutasEncontradas.push(new Set([...pasosActuales]));
        continue;
      }

      // Obtener los portales de la zona actual
      const mapa = this.obtenerMapaPorNombre(mapaActual);
      if (mapa) {
        for (const zona of mapa.listZona) {
          if (zona.numeroZona === zonaActual) {
            const portales = zona.listPortales;
            if (portales) {
              for (const portal of portales) {
                if (portal && portal.namePortal) {
                  const nuevoNodo = new Nodo(portal.namePortal, portal.irZona, portal.numeroPortal, new Set([...
                    pasosActuales
                  ]));
                  queue.push(nuevoNodo);
                }
              }
            }
          }
        }
      }
    }

    return rutasEncontradas;
  }

  obtenerMapaPorNombre(nombreMapa) {
    return this.todosLosMapas.find(mapa => mapa.nombreMapa.toLowerCase() === nombreMapa.toLowerCase());
  }
}
