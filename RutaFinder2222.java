import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.sampled.Port;

import java.util.*;
import java.util.*;

public class RutaFinder2222 {

    private List<Mapa> mapas;

    public RutaFinder(List<Mapa> mapas) {
        this.mapas = mapas;
    }

    public List<String> encontrarRuta(String mapaOrigen, int zonaOrigen, String mapaDestino, int zonaDestino) {
        Set<String> visitados = new HashSet<>();
        List<String> resultado = new ArrayList<>();

        // Validar si en el mapa actual existe el destino con la zona destino
        Mapa mapaActual = obtenerMapaPorNombre(mapaOrigen);
        if (mapaActual != null) {
            for (Zona zona : mapaActual.getListZona()) {
                if (zona.getNumeroZona() == zonaOrigen) {
                    List<Portales> portales = zona.getListPortales();
                    if (portales != null) {
                        for (Portales portal : portales) {
                            if (portal.getNamePortal().equalsIgnoreCase(mapaDestino)
                                    && portal.getIrZona() == zonaDestino) {
                                resultado.add("Ruta " + (resultado.size() + 1) + ":");
                                resultado.add("Estoy en el mapa " + mapaOrigen + " zona " + zonaOrigen +
                                        " y me dirijo al portal " + portal.getNumeroPortal() +
                                        " que me lleva al mapa " + mapaDestino +
                                        " zona " + zonaDestino + " portal " + portal.getAparecerPortal());
                                resultado.add("Has llegado a tu destino: " + mapaDestino + " zona " + zonaDestino);
                                return resultado; // Salir del método al encontrar la ruta
                            }
                        }
                    }
                }
            }
        }
        // de aqui pa arriba esta bien
        // Si no se encuentra una ruta directa en el mapa y zona actuales, iniciar
        // búsqueda por portales
        // Solo se va a recorrer solo los 4 portales del mapa en el que inicio y la zona
        // Aqui estoy en atlas b zona 0

        // tengo que sacar los portales en los que voy a iterar
        Zona zonaMap = mapaActual.getListZona().stream().filter(filZona -> filZona.getNumeroZona() == zonaOrigen)
                .findFirst().orElse(null);
        List<Portales> listPortales = zonaMap.getListPortales();
        // Aqui estoy en el mapa y zona origen aqui itero
        listPortales.forEach(portales -> {
            Mapa mapSalto = obtenerMapaPorNombre(portales.getNamePortal());
            // Aqui ya salete ahora valido si en este mapa zona 1 esta la ruta directa si
            // no, inicio mapa por mapa de nuevo
            // maia aqui deberia llegar al mapa maia zona
            Zona zonaMap2 = mapSalto.getListZona().stream()
                    .filter(filZona -> filZona.getNumeroZona() == portales.getIrZona()).findFirst().orElse(null);
            List<Portales> listPortales2 = zonaMap2.getListPortales();
            Optional<Portales> porVol = listPortales2.stream()
                    .filter(filVol -> filVol.getNamePortal().equalsIgnoreCase(mapaDestino)).findFirst();
            if (porVol.isPresent()) {
                Portales portalesVol = porVol.get();
                final String destinoEncontrado = "Iniciamos en el MAPA "
                        .concat(mapaOrigen).concat(" zona ").concat(zonaOrigen + " ")
                        .concat("Que te llevaria al mapa ").concat(portales.getNamePortal().toUpperCase())
                        .concat(" a la zona ").concat(portales.getIrZona() + " ").concat(" portal ")
                        .concat(portales.getAparecerPortal() + " ")
                        .concat(" Tomas el portal ").concat(portalesVol.getNumeroPortal() + " ")
                        .concat("que te llevar a ").concat(portalesVol.getNamePortal()
                                .concat(" a zona ").concat(portalesVol.getIrZona() + " Portal ")
                                .concat(portalesVol.getAparecerPortal() + ""));

                System.out.println(destinoEncontrado);
            } else {

                listPortales2.forEach(forOtro -> {
                    Mapa mapSaltoNuevo = obtenerMapaPorNombre(forOtro.getNamePortal());
                    // Aqui ya salete ahora valido si en este mapa zona 1 esta la ruta directa si
                    // no, inicio mapa por mapa de nuevo
                    // maia aqui deberia llegar al mapa maia zona
                    Zona zonaMap2Nuevo = mapSaltoNuevo.getListZona().stream()
                            .filter(filZona -> filZona.getNumeroZona() == forOtro.getIrZona()).findFirst()
                            .orElse(null);
                    List<Portales> portalesNueva = zonaMap2Nuevo.getListPortales();
                    Optional<Portales> porVolNuevo = portalesNueva.stream()
                    .filter(filVolNu -> filVolNu.getNamePortal().equalsIgnoreCase(mapaDestino)).findFirst();
                    if (porVolNuevo.isPresent()) {
                        Portales portalesVol = porVol.get();
                        final String destinoEncontrado = "Iniciamos en el MAPA "
                                .concat(mapaOrigen).concat(" zona ").concat(zonaOrigen + " ")
                                .concat("Que te llevaria al mapa ").concat(forOtro.getNamePortal().toUpperCase())
                                .concat(" a la zona ").concat(forOtro.getIrZona() + " ").concat(" portal ")
                                .concat(forOtro.getAparecerPortal() + " ")
                                .concat(" Tomas el portal ").concat(portalesVol.getNumeroPortal() + " ")
                                .concat("que te llevar a ").concat(portalesVol.getNamePortal()
                                        .concat(" a zona ").concat(portalesVol.getIrZona() + " Portal ")
                                        .concat(portalesVol.getAparecerPortal() + ""));
        
                        System.out.println(destinoEncontrado);
                    }else{

                        System.out.println(" Legamos a dos ");
                    }
                    
                    
                });

                System.out.println("Nombre del mapa al que vas a saltar: ");
            }

        });

        for (int portalInicial = 1; portalInicial <= 4; portalInicial++) {

            Stack<Paso> stack = new Stack<>();
            List<String> rutaActual = new ArrayList<>();
            stack.push(new Paso(mapaOrigen, zonaOrigen, portalInicial));

            while (!stack.isEmpty()) {
                Paso actual = stack.pop();
                visitados.add(actual.getMapa() + "-" + actual.getZona() + "-" + actual.getPortal());

                // Validar si en la zona actual existe el destino con la zona destino
                List<Portales> portales = obtenerPortales(actual.getMapa(), actual.getZona());
                if (portales != null) {
                    for (Portales portal : portales) {
                        // if (portal.getNamePortal().equalsIgnoreCase(mapaDestino) &&
                        // portal.getIrZona() == zonaDestino) { esta validacion no va, aqui iria ir a
                        // buscar el primer portal
                        // que seria portal.getNombre getNamePortal portal.getIrZona() y
                        // portal.getAprecerPortal tendria que hacer una busqueda de todos los mapas
                        // para entrar al mapa maia y buscar todo lo que ya te expliqeu me entendiste?
                        if (portal.getNamePortal().equalsIgnoreCase(mapaDestino) && portal.getIrZona() == zonaDestino) {
                            rutaActual.add(
                                    "Inicio en mapa " + mapaOrigen + " zona " + zonaOrigen + " Para llevar me dirijo a "
                                            + actual.getMapa() + " zona " + actual.getZona() +
                                            "  " +
                                            " y me dirijo al portal " + portal.getNumeroPortal() +
                                            " que me lleva al mapa " + mapaDestino +
                                            " zona " + zonaDestino + " portal " + portal.getAparecerPortal());
                            resultado.add("Ruta " + (resultado.size() + 1) + ":");
                            resultado.addAll(rutaActual);
                            resultado.add("Has llegado a tu destino: " + mapaDestino + " zona " + zonaDestino);
                            return resultado; // Salir del método al encontrar la ruta
                        }

                        // Agregar el siguiente paso a la pila para continuar la búsqueda
                        Mapa siguienteMapa = obtenerMapaPorNombre(portal.getNamePortal());
                        if (siguienteMapa != null) {
                            Paso siguiente = new Paso(siguienteMapa.getNombreMapa(), portal.getIrZona(),
                                    portal.getAparecerPortal());
                            if (!visitados.contains(
                                    siguiente.getMapa() + "-" + siguiente.getZona() + "-" + siguiente.getPortal())) {
                                stack.push(siguiente);

                            }
                        }
                    }
                }
            }
        }

        if (resultado.isEmpty()) {
            resultado.add("No se encontró una ruta a tu destino.");
        }
        return resultado;
    }

    private List<Portales> obtenerPortales(String mapa, int zona) {
        Mapa mapaObj = obtenerMapaPorNombre(mapa);
        if (mapaObj != null) {
            for (Zona z : mapaObj.getListZona()) {
                if (z.getNumeroZona() == zona) {
                    return z.getListPortales();
                }
            }
        }
        return Collections.emptyList();
    }

    public boolean verificarDestino(String mapaActual, int zonaActual, String mapaDestino, int zonaDestino,
            Set<String> visitados, List<String> rutaActual, List<String> resultado) {
        Mapa mapa = obtenerMapaPorNombre(mapaActual);
        if (mapa != null) {
            for (Zona zona : mapa.getListZona()) {
                if (zona.getNumeroZona() == zonaActual) {
                    List<Portales> portales = zona.getListPortales();
                    if (portales != null) {
                        for (Portales portal : portales) {
                            if (portal.getNamePortal().equalsIgnoreCase(mapaDestino)
                                    && portal.getIrZona() == zonaDestino) {
                                String ruta = "Estoy en el mapa " + mapaActual + " zona " + zonaActual +
                                        " y me dirijo al portal " + portal.getNumeroPortal() +
                                        " que me lleva al mapa " + mapaDestino +
                                        " zona " + zonaDestino + " portal " + portal.getAparecerPortal();
                                if (!rutaActual.contains(ruta)) {
                                    rutaActual.add(ruta);
                                    resultado.add("Ruta " + (resultado.size() + 1) + ":");
                                    resultado.addAll(rutaActual);
                                    resultado.add("Has llegado a tu destino: " + mapaDestino + " zona " + zonaDestino);
                                    return true; // Encontró el destino
                                }
                            }
                        }
                    }
                }
            }
        }
        return false; // No encontró el destino
    }

    private Mapa obtenerMapaPorNombre(String nombreMapa) {
        for (Mapa mapa : mapas) {
            if (mapa.getNombreMapa().equalsIgnoreCase(nombreMapa)) {
                return mapa;
            }
        }
        return null;
    }
}
