public List<String> encontrarRuta(String mapaOrigen, int zonaOrigen, String mapaDestino, int zonaDestino) {
    Set<String> visitados = new HashSet<>();
    List<String> resultado = new ArrayList<>();
    
    // Método para verificar destino y agregar ruta
    boolean destinoEncontrado = verificarDestino(mapaOrigen, zonaOrigen, mapaDestino, zonaDestino, new ArrayList<>(), resultado);
    if (destinoEncontrado) {
        return resultado;
    }
    
    // Obtener los portales de la zona de origen
    Mapa mapaActual = obtenerMapaPorNombre(mapaOrigen);
    Zona zonaMap = mapaActual.getListZona().stream()
            .filter(filZona -> filZona.getNumeroZona() == zonaOrigen)
            .findFirst()
            .orElse(null);
    if (zonaMap == null) {
        resultado.add("No se encontró una ruta a tu destino.");
        return resultado;
    }

    List<Portales> listPortales = zonaMap.getListPortales();
    listPortales.forEach(portales -> {
        Stack<Paso> stack = new Stack<>();
        stack.push(new Paso(mapaOrigen, zonaOrigen, portales.getNumeroPortal()));
        
        while (!stack.isEmpty()) {
            Paso actual = stack.pop();
            visitados.add(actual.getMapa() + "-" + actual.getZona() + "-" + actual.getPortal());

            Mapa mapSalto = obtenerMapaPorNombre(portales.getNamePortal());
            Zona zonaMap2 = mapSalto.getListZona().stream()
                    .filter(filZona -> filZona.getNumeroZona() == portales.getIrZona())
                    .findFirst()
                    .orElse(null);
            if (zonaMap2 == null) {
                continue;
            }
            List<Portales> listPortales2 = zonaMap2.getListPortales();
            Optional<Portales> porVol = listPortales2.stream()
                    .filter(filVol -> filVol.getNamePortal().equalsIgnoreCase(mapaDestino))
                    .findFirst();
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

                resultado.add(destinoEncontrado);
            } else {
                // Búsqueda recursiva en el nuevo mapa si no se encuentra la ruta directa
                listPortales2.forEach(forOtro -> {
                    if (!visitados.contains(forOtro.getNamePortal() + "-" + forOtro.getIrZona() + "-" + forOtro.getAparecerPortal())) {
                        Stack<Paso> stackNuevo = new Stack<>();
                        stackNuevo.push(new Paso(forOtro.getNamePortal(), forOtro.getIrZona(), forOtro.getAparecerPortal()));

                        while (!stackNuevo.isEmpty()) {
                            Paso nuevoActual = stackNuevo.pop();
                            visitados.add(nuevoActual.getMapa() + "-" + nuevoActual.getZona() + "-" + nuevoActual.getPortal());

                            Mapa mapSaltoNuevo = obtenerMapaPorNombre(forOtro.getNamePortal());
                            Zona zonaMap2Nuevo = mapSaltoNuevo.getListZona().stream()
                                    .filter(filZona -> filZona.getNumeroZona() == forOtro.getIrZona())
                                    .findFirst()
                                    .orElse(null);
                            if (zonaMap2Nuevo == null) {
                                continue;
                            }
                            List<Portales> portalesNueva = zonaMap2Nuevo.getListPortales();
                            Optional<Portales> porVolNuevo = portalesNueva.stream()
                                    .filter(filVolNu -> filVolNu.getNamePortal().equalsIgnoreCase(mapaDestino))
                                    .findFirst();
                            if (porVolNuevo.isPresent()) {
                                Portales portalesVolNuevo = porVolNuevo.get();
                                final String destinoEncontrado = "Iniciamos en el MAPA "
                                        .concat(mapaOrigen).concat(" zona ").concat(zonaOrigen + " ")
                                        .concat("Que te llevaria al mapa ").concat(forOtro.getNamePortal().toUpperCase())
                                        .concat(" a la zona ").concat(forOtro.getIrZona() + " ").concat(" portal ")
                                        .concat(forOtro.getAparecerPortal() + " ")
                                        .concat(" Tomas el portal ").concat(portalesVolNuevo.getNumeroPortal() + " ")
                                        .concat("que te llevar a ").concat(portalesVolNuevo.getNamePortal()
                                                .concat(" a zona ").concat(portalesVolNuevo.getIrZona() + " Portal ")
                                                .concat(portalesVolNuevo.getAparecerPortal() + ""));

                                resultado.add(destinoEncontrado);
                            }
                        }
                    }
                });
            }
        }
    });

    if (resultado.isEmpty()) {
        resultado.add("No se encontró una ruta a tu destino.");
    }
    return resultado;
}

private boolean verificarDestino(String mapaActual, int zonaActual, String mapaDestino, int zonaDestino, List<String> rutaActual, List<String> resultado) {
    Mapa mapa = obtenerMapaPorNombre(mapaActual);
    if (mapa != null) {
        for (Zona zona : mapa.getListZona()) {
            if (zona.getNumeroZona() == zonaActual) {
                List<Portales> portales = zona.getListPortales();
                if (portales != null) {
                    for (Portales portal : portales) {
                        if (portal.getNamePortal().equalsIgnoreCase(mapaDestino) && portal.getIrZona() == zonaDestino) {
                            rutaActual.add("Estoy en el mapa " + mapaActual + " zona " + zonaActual + 
                                          " y me dirijo al portal " + portal.getNumeroPortal() + 
                                          " que me lleva al mapa " + mapaDestino + 
                                          " zona " + zonaDestino + " portal " + portal.getAparecerPortal());
                            resultado.addAll(rutaActual);
                            resultado.add("Has llegado a tu destino: " + mapaDestino + " zona " + zonaDestino);
                            return true; // Encontró el destino
                        }
                    }
                }
            }
        }
    }
    return false; // No encontró el destino
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
    return Collections
}