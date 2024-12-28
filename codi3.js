 
        // MAPA 4
        Zona zona4AtlasC = new Zona();
        zona4AtlasC.setNombreZona("ZONA 4");
        zona4AtlasC.setNumeroZona(3);

        List<Portales> listPortales4AtlasC = new ArrayList<>();

        Portales portales4AtlasC1 = new Portales();
        portales4AtlasC1.setNamePortal("bootes");
        portales4AtlasC1.setNumeroPortal(1);
        portales4AtlasC1.setDescPortal("arriba izq 0");
        portales11Alcyone.setIrZona(1);
        portales11Alcyone.setAparecerPortal(4);
        listPortales4AtlasC.add(portales4AtlasC1);

        Portales portales4AtlasC2 = new Portales();
        portales4AtlasC2.setNamePortal("sadatoni");
        portales4AtlasC2.setNumeroPortal(2);
        portales4AtlasC2.setDescPortal("arriba der 1");
        portales11Alcyone.setIrZona(1);
        portales11Alcyone.setAparecerPortal(2);
        listPortales4AtlasC.add(portales4AtlasC2);

        Portales portales4AtlasC3 = new Portales();
        portales4AtlasC3.setNamePortal("auriga");
        portales4AtlasC3.setNumeroPortal(3);
        portales4AtlasC3.setDescPortal("abajo izq 2");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(2);
        listPortales4AtlasC.add(portales4AtlasC3);

        Portales portales4AtlasC4 = new Portales();
        portales4AtlasC4.setNamePortal("orion");
        portales4AtlasC4.setNumeroPortal(4);
        portales4AtlasC4.setDescPortal("abajo der 3");
        portales11Alcyone.setIrZona(2);
        portales11Alcyone.setAparecerPortal(4);
        listPortales4AtlasC.add(portales4AtlasC4);

        zona4AtlasC.setListPortales(listPortales4AtlasC);
        listZonaAtlasC.add(zona4AtlasC);

        mapaAtlasC.setListZona(listZonaAtlasC);

        // Crear el mapa para AQUILA
        Mapa mapaAquila = new Mapa();
        mapaAquila.setNombreMapa("AQUILA");

        List<Zona> listZonaAquila = new ArrayList<>();

        // ZONA 1
        Zona zona1Aquila = new Zona();
        zona1Aquila.setNombreZona("ZONA 1");
        zona1Aquila.setNumeroZona(0);

        List<Portales> listPortales1Aquila = new ArrayList<>();

        Portales portales1Aquila1 = new Portales();
        portales1Aquila1.setNamePortal("aquila");
        portales1Aquila1.setNumeroPortal(1);
        portales1Aquila1.setDescPortal("arriba izq 0");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(2);
        listPortales1Aquila.add(portales1Aquila1);

        Portales portales1Aquila2 = new Portales();
        portales1Aquila2.setNamePortal("maia");
        portales1Aquila2.setNumeroPortal(2);
        portales1Aquila2.setDescPortal("arriba der 1");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(3);
        listPortales1Aquila.add(portales1Aquila2);

        Portales portales1Aquila3 = new Portales();
        portales1Aquila3.setNamePortal("bootes");
        portales1Aquila3.setNumeroPortal(3);
        portales1Aquila3.setDescPortal("abajo izq 2");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(3);
        listPortales1Aquila.add(portales1Aquila3);

        Portales portales1Aquila4 = new Portales();
        portales1Aquila4.setNamePortal("sirius");
        portales1Aquila4.setNumeroPortal(4);
        portales1Aquila4.setDescPortal("abajo der 3");
        portales11Alcyone.setIrZona(2);
        portales11Alcyone.setAparecerPortal(2);
        listPortales1Aquila.add(portales1Aquila4);

        zona1Aquila.setListPortales(listPortales1Aquila);
        listZonaAquila.add(zona1Aquila);

        // ZONA 2
        Zona zona2Aquila = new Zona();
        zona2Aquila.setNombreZona("ZONA 2");
        zona2Aquila.setNumeroZona(1);

        List<Portales> listPortales2Aquila = new ArrayList<>();

        Portales portales2Aquila1 = new Portales();
        portales2Aquila1.setNamePortal("atlas a");
        portales2Aquila1.setNumeroPortal(1);
        portales2Aquila1.setDescPortal("arriba izq 0");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(2);
        listPortales2Aquila.add(portales2Aquila1);

        Portales portales2Aquila2 = new Portales();
        portales2Aquila2.setNamePortal("sadatoni");
        portales2Aquila2.setNumeroPortal(2);
        portales2Aquila2.setDescPortal("arriba der 1");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(4);
        listPortales2Aquila.add(portales2Aquila2);

        Portales portales2Aquila3 = new Portales();
        portales2Aquila3.setNamePortal("alcyone");
        portales2Aquila3.setNumeroPortal(3);
        portales2Aquila3.setDescPortal("abajo izq 2");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(3);
        listPortales2Aquila.add(portales2Aquila3);

        Portales portales2Aquila4 = new Portales();
        portales2Aquila4.setNamePortal("atlas b");
        portales2Aquila4.setNumeroPortal(4);
        portales2Aquila4.setDescPortal("abajo der 3");
        portales11Alcyone.setIrZona(2);
        portales11Alcyone.setAparecerPortal(4);
        listPortales2Aquila.add(portales2Aquila4);

        zona2Aquila.setListPortales(listPortales2Aquila);
        listZonaAquila.add(zona2Aquila);

        mapaAquila.setListZona(listZonaAquila);

        // MAPA 3
        Zona zona3Aquila = new Zona();
        zona3Aquila.setNombreZona("ZONA 3");
        zona3Aquila.setNumeroZona(2);

        List<Portales> listPortales3Aquila = new ArrayList<>();

        Portales portales3Aquila1 = new Portales();
        portales3Aquila1.setNamePortal("cygni");
        portales3Aquila1.setNumeroPortal(1);
        portales3Aquila1.setDescPortal("arriba izq 0");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(3);
        listPortales3Aquila.add(portales3Aquila1);

        Portales portales3Aquila2 = new Portales();
        portales3Aquila2.setNamePortal("atlas a");
        portales3Aquila2.setNumeroPortal(2);
        portales3Aquila2.setDescPortal("arriba der 1");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(4);
        listPortales3Aquila.add(portales3Aquila2);

        Portales portales3Aquila3 = new Portales();
        portales3Aquila3.setNamePortal("atlas c");
        portales3Aquila3.setNumeroPortal(3);
        portales3Aquila3.setDescPortal("abajo izq 2");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(4);
        listPortales3Aquila.add(portales3Aquila3);

        Portales portales3Aquila4 = new Portales();
        portales3Aquila4.setNamePortal("volantis");
        portales3Aquila4.setNumeroPortal(4);
        portales3Aquila4.setDescPortal("abajo der 3");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(3);
        listPortales3Aquila.add(portales3Aquila4);

        zona3Aquila.setListPortales(listPortales3Aquila);
        listZonaAquila.add(zona3Aquila);

        // MAPA 4
        Zona zona4Aquila = new Zona();
        zona4Aquila.setNombreZona("ZONA 4");
        zona4Aquila.setNumeroZona(3);

        List<Portales> listPortales4Aquila = new ArrayList<>();

        Portales portales4Aquila1 = new Portales();
        portales4Aquila1.setNamePortal("bootes");
        portales4Aquila1.setNumeroPortal(1);
        portales4Aquila1.setDescPortal("arriba izq 0");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(4);
        listPortales4Aquila.add(portales4Aquila1);

        Portales portales4Aquila2 = new Portales();
        portales4Aquila2.setNamePortal("aquila");
        portales4Aquila2.setNumeroPortal(2);
        portales4Aquila2.setDescPortal("arriba der 1");
        portales11Alcyone.setIrZona(1);
        portales11Alcyone.setAparecerPortal(1);
        listPortales4Aquila.add(portales4Aquila2);

        Portales portales4Aquila3 = new Portales();
        portales4Aquila3.setNamePortal("eridani");
        portales4Aquila3.setNumeroPortal(3);
        portales4Aquila3.setDescPortal("abajo izq 2");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(1);
        listPortales4Aquila.add(portales4Aquila3);

        Portales portales4Aquila4 = new Portales();
        portales4Aquila4.setNamePortal("bootes");
        portales4Aquila4.setNumeroPortal(4);
        portales4Aquila4.setDescPortal("abajo der 3");
        portales11Alcyone.setIrZona(3);
        portales11Alcyone.setAparecerPortal(1);
        listPortales4Aquila.add(portales4Aquila4);

        zona4Aquila.setListPortales(listPortales4Aquila);
        listZonaAquila.add(zona4Aquila);

        mapaAquila.setListZona(listZonaAquila);

        // Crear el mapa para Auriga
        Mapa mapaAuriga = new Mapa();
        mapaAuriga.setNombreMapa("AURIGA");