
import RutaFinder from './../models/RutaFinder.js';
import todosLosMapas from './llenarMapas.js';


// Función para buscar la ruta
export function buscarRuta() {
  console.error(todosLosMapas)
  const origenMapa = document.getElementById("origenMapa").value.toLowerCase();
  const origenZona = parseInt(document.getElementById("origenZona").value);
  const destinoMapa = document.getElementById("destinoMapa").value.toLowerCase();
  const destinoZona = parseInt(document.getElementById("destinoZona").value);

  const rutaFinder = new RutaFinder(todosLosMapas);
  const rutas = rutaFinder.encontrarRutaConPasos(origenMapa, origenZona, destinoMapa, destinoZona);
  mostrarRutas(rutas, origenMapa, origenZona);
}

// Función para mostrar las rutas encontradas
function mostrarRutas(rutas, origenMapa, origenZona) {
  const output = document.getElementById("output");
  output.innerHTML = "";

  if (rutas.length === 0) {
    output.innerHTML = "No se encontró ninguna ruta.";
    return;
  }

  let rutaNum = 1;
  rutas.forEach(ruta => {
    const rutaDiv = document.createElement("div");
    rutaDiv.classList.add("ruta");
    rutaDiv.innerHTML =
      `Por el <strong>Ruta ${rutaNum} encontrada:</br>Origen ${origenMapa} zona ${origenZona}</strong>`;
    ruta.forEach(paso => {
      const pasoDiv = document.createElement("div");
      pasoDiv.innerHTML =
        `Por el <span class="portal">Portal: ${paso.numeroPortal}</span>,Llegas al Mapa: ${paso.nombreMapa}, Zona: ${paso.numeroZona}`;
      pasoDiv.classList.add("paso"); // Añadir clase para estilos
      rutaDiv.appendChild(pasoDiv);

      // Añadir evento de clic a cada portal
      const portalSpan = pasoDiv.querySelector(".portal");
      portalSpan.addEventListener('click', () => {
        portalSpan.classList.toggle('seleccionado');
      });
    });
    output.appendChild(rutaDiv);
    rutaNum++;
  });


}