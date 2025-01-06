
import RutaFinder from './models/RutaFinder.js';

import alcyone from './alcyone/alcyoneAdd.js';
import atlasA from './atlasA/atlasAAdd.js';
import atlasB from './atlasB/atlasBAdd.js';
import atlasC from './atlasC/atlasCAdd.js';
import aquila from './aquila/aquilaAdd.js';
import auriga from './auriga/aurigaAdd.js';
import bootes from './bootes/bootesAdd.js';
import cygni from './cygni/cygniAdd.js';
import eridani from './eridani/eridaniAdd.js';
import helvetios from './helvetios/helvetiosAdd.js';
import maia from './maia/maiaAdd.js';
import orion from './orion/orionAdd.js';
import persei from './persei/perseiAdd.js';
import sadatoni from './sadatoni/sadatoniAdd.js';
import sirius from './sirius/siriusAdd.js';
import volantis from './volantis/volantisAdd.js';
const todosLosMapas = []; // Aquí se agregarán todos los mapas como en Java
todosLosMapas.push(alcyone);
todosLosMapas.push(atlasA);
todosLosMapas.push(atlasB);
todosLosMapas.push(atlasC);
todosLosMapas.push(aquila);// REVISE HASTA AQUI
todosLosMapas.push(auriga);
todosLosMapas.push(bootes);
todosLosMapas.push(cygni);
todosLosMapas.push(eridani);
todosLosMapas.push(helvetios);
todosLosMapas.push(maia);
todosLosMapas.push(orion);
todosLosMapas.push(persei);
todosLosMapas.push(sadatoni);
todosLosMapas.push(sirius);
todosLosMapas.push(volantis);

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
      `<strong>Ruta ${rutaNum} encontrada:</br>Origen ${origenMapa} zona ${origenZona}</strong>`;
    ruta.forEach(paso => {
      const pasoDiv = document.createElement("div");
      pasoDiv.innerHTML =
        `<span class="portal">Portal: ${paso.numeroPortal}</span>, Mapa: ${paso.nombreMapa}, Zona: ${paso.numeroZona}`;
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