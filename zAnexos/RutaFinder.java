import java.util.*;

public class RutaFinder {

    private List<Mapa> mapas;

    public RutaFinder(List<Mapa> mapas) {
        this.mapas = mapas;
    }

    
        public List<Set<Paso>> encontrarRutaConPasos(String mapaOrigen, int zonaOrigen, String mapaDestino, int zonaDestino) {
            Set<String> visitados = new HashSet<>();
            List<Set<Paso>> rutasEncontradas = new ArrayList<>();
            Queue<Nodo> queue = new LinkedList<>();
            queue.add(new Nodo(mapaOrigen, zonaOrigen, -1, new HashSet<>()));
    
            while (!queue.isEmpty()) {
                Nodo actual = queue.poll();
                String mapaActual = actual.mapa;
                int zonaActual = actual.zona;
                Set<Paso> pasosActuales = actual.pasos;
    
                // Marcar la visita actual
                String claveVisita = mapaActual + "-" + zonaActual;
                if (visitados.contains(claveVisita)) {
                    continue;
                }
                visitados.add(claveVisita);
    
                // Agregar el paso actual a la ruta
                if (!(mapaActual.equals(mapaOrigen) && zonaActual == zonaOrigen)) {
                    pasosActuales.add(new Paso(mapaActual, zonaActual, actual.aparecerPortal));
                }
    
                // Verificar si hemos llegado al destino
                if (mapaActual.equalsIgnoreCase(mapaDestino) && zonaActual == zonaDestino) {
                    rutasEncontradas.add(new HashSet<>(pasosActuales));
                    continue;
                }
    
                // Obtener los portales de la zona actual
                Mapa mapa = obtenerMapaPorNombre(mapaActual);
                if (mapa != null) {
                    for (Zona zona : mapa.getListZona()) {
                        if (zona.getNumeroZona() == zonaActual) {
                            List<Portales> portales = zona.getListPortales();
                            if (portales != null) {
                                for (Portales portal : portales) {
                                    if (portal != null && portal.getNamePortal() != null) {
                                        Nodo nuevoNodo = new Nodo(portal.getNamePortal(), portal.getIrZona(), portal.getNumeroPortal(), new HashSet<>(pasosActuales));
                                        queue.add(nuevoNodo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
    
            return rutasEncontradas;
        }
    
        private Mapa obtenerMapaPorNombre(String nombreMapa) {
            for (Mapa mapa : this.mapas) {
                if (mapa.getNombreMapa().equalsIgnoreCase(nombreMapa)) {
                    return mapa;
                }
            }
            return null;
        }
  
}
