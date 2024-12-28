
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class MapasPortales {

    private static void cargarDatos() {

        // Crear el mapa para Alcyone

        Mapa mapaAlcyone = new Mapa();
        mapaAlcyone.setNombreMapa("Alcyone".toLowerCase());

        List<Portales> listPortalesAlcyone = new ArrayList<>();
        Portales portales11Alcyone = new Portales();
        portales11Alcyone.setNamePortal("bootes");
        portales11Alcyone.setNumeroPortal(1);
        portales11Alcyone.setDescPortal("izq arriba");
        portales11Alcyone.setIrZona(4);
        portales11Alcyone.setAparecerPortal(2);
        listPortalesAlcyone.add(portales11Alcyone);

        Portales portales2Alcyone2 = new Portales();
        portales2Alcyone2.setNamePortal("orion");
        portales2Alcyone2.setNumeroPortal(2);
        portales2Alcyone2.setDescPortal("der arriba");
        portales2Alcyone2.setIrZona(3);
        portales2Alcyone2.setAparecerPortal(4);

        listPortalesAlcyone.add(portales2Alcyone2);

        Portales portales33Alcyone = new Portales();
        portales33Alcyone.setNamePortal("maia");
        portales33Alcyone.setNumeroPortal(3);
        portales33Alcyone.setDescPortal("izq abajo");
        portales33Alcyone.setIrZona(2);
        portales33Alcyone.setAparecerPortal(1);

        listPortalesAlcyone.add(portales33Alcyone);
        Portales portales44Alcyone = new Portales();
        portales44Alcyone.setNamePortal("auriga");
        portales44Alcyone.setNumeroPortal(4);
        portales44Alcyone.setDescPortal("der abajo");

        portales44Alcyone.setIrZona(3);
        portales44Alcyone.setAparecerPortal(4);

        listPortalesAlcyone.add(portales44Alcyone);

        List<Zona> listZonaAlcyone = new ArrayList<>();
        Zona zonaAlcyone = new Zona();
        zonaAlcyone.setNombreZona("ZONA 1");
        zonaAlcyone.setNumeroZona(1);
        zonaAlcyone.setListPortales(listPortalesAlcyone);
        listZonaAlcyone.add(zonaAlcyone);
        mapaAlcyone.setListZona(listZonaAlcyone);


        // ZONA 2

        Mapa mapaAlcyone2 = new Mapa();
        mapaAlcyone2.setNombreMapa("Alcyone".toLowerCase());

        List<Portales> listPortalesAlcyone2 = new ArrayList<>();

        Portales portales1Alcyone2 = new Portales();
        portales1Alcyone2.setNamePortal("sirius");
        portales1Alcyone2.setNumeroPortal(1);
        portales1Alcyone2.setDescPortal("arriba izq 0");
        portales1Alcyone2.setIrZona(1);
        portales1Alcyone2.setAparecerPortal(3);

        listPortalesAlcyone2.add(portales1Alcyone2);

        Portales portales2Alcyone22 = new Portales();
        portales2Alcyone22.setNamePortal("alcyone");
        portales2Alcyone22.setNumeroPortal(2);
        portales2Alcyone22.setDescPortal("arriba der 1");
        portales2Alcyone22.setIrZona(3);
        portales2Alcyone22.setAparecerPortal(2);
        listPortalesAlcyone2.add(portales2Alcyone22);

        Portales portales3Alcyone2 = new Portales();
        portales3Alcyone2.setNamePortal("cygni");
        portales3Alcyone2.setNumeroPortal(3);
        portales3Alcyone2.setDescPortal("abajo izq 2");
        portales3Alcyone2.setIrZona(2);
        portales3Alcyone2.setAparecerPortal(2);
        listPortalesAlcyone2.add(portales3Alcyone2);

        Portales portales4Alcyone2 = new Portales();
        portales4Alcyone2.setNamePortal("sirius");
        portales4Alcyone2.setNumeroPortal(4);
        portales4Alcyone2.setDescPortal("abajo der 3");
        portales4Alcyone2.setIrZona(2);
        portales4Alcyone2.setAparecerPortal(3);
        listPortalesAlcyone2.add(portales4Alcyone2);

        List<Zona> listZonaAlcyone2 = new ArrayList<>();

        Zona zonaAlcyone2 = new Zona();
        zonaAlcyone2.setNombreZona("ZONA 2");
        zonaAlcyone2.setNumeroZona(2);
        zonaAlcyone2.setListPortales(listPortalesAlcyone2);
        listZonaAlcyone2.add(zonaAlcyone2);

        mapaAlcyone2.setListZona(listZonaAlcyone2);



        // MAPA 3
        Mapa mapaAlcyone3 = new Mapa();
        mapaAlcyone3.setNombreMapa("Alcyone".toLowerCase());

        List<Portales> listPortalesAlcyone3 = new ArrayList<>();

        Portales portales1Alcyone3 = new Portales();
        portales1Alcyone3.setNamePortal("volantis");
        portales1Alcyone3.setNumeroPortal(1);
        portales1Alcyone3.setDescPortal("arriba izq 0");
        portales1Alcyone3.setIrZona(3);
        portales1Alcyone3.setAparecerPortal(2);
        listPortalesAlcyone3.add(portales1Alcyone3);

        Portales portales2Alcyone3 = new Portales();
        portales2Alcyone3.setNamePortal("alcyone");
        portales2Alcyone3.setNumeroPortal(2);
        portales2Alcyone3.setDescPortal("arriba der 1");
        portales2Alcyone3.setIrZona(2);
        portales2Alcyone3.setAparecerPortal(2);
        listPortalesAlcyone3.add(portales2Alcyone3);

        Portales portales3Alcyone3 = new Portales();
        portales3Alcyone3.setNamePortal("aquila");
        portales3Alcyone3.setNumeroPortal(3);
        portales3Alcyone3.setDescPortal("abajo izq 2");
        portales3Alcyone3.setIrZona(2);
        portales3Alcyone3.setAparecerPortal(3);
        listPortalesAlcyone3.add(portales3Alcyone3);

        Portales portales4Alcyone3 = new Portales();
        portales4Alcyone3.setNamePortal("auriga");
        portales4Alcyone3.setNumeroPortal(4);
        portales4Alcyone3.setDescPortal("abajo der 3");
        portales4Alcyone3.setIrZona(4);
        portales4Alcyone3.setAparecerPortal(1);
        listPortalesAlcyone3.add(portales4Alcyone3);

        List<Zona> listZonaAlcyone3 = new ArrayList<>();

        Zona zonaAlcyone3 = new Zona();
        zonaAlcyone3.setNombreZona("ZONA 3");
        zonaAlcyone3.setNumeroZona(3);
        zonaAlcyone3.setListPortales(listPortalesAlcyone3);
        listZonaAlcyone3.add(zonaAlcyone3);

        mapaAlcyone3.setListZona(listZonaAlcyone3);

        // MAPA 4
        Mapa mapaAlcyone4 = new Mapa();
        mapaAlcyone4.setNombreMapa("Alcyone".toLowerCase());

        List<Portales> listPortalesAlcyone4 = new ArrayList<>();

        Portales portales1Alcyone4 = new Portales();
        portales1Alcyone4.setNamePortal("helvetios");
        portales1Alcyone4.setNumeroPortal(1);
        portales1Alcyone4.setDescPortal("arriba izq 0");
        portales1Alcyone4.setIrZona(4);
        portales1Alcyone4.setAparecerPortal(4);
        listPortalesAlcyone4.add(portales1Alcyone4);

        Portales portales2Alcyone4 = new Portales();
        portales2Alcyone4.setNamePortal("cygni");
        portales2Alcyone4.setNumeroPortal(2);
        portales2Alcyone4.setDescPortal("arriba der 1");
        portales2Alcyone4.setIrZona(1);
        portales2Alcyone4.setAparecerPortal(2);
        listPortalesAlcyone4.add(portales2Alcyone4);

        Portales portales3Alcyone4 = new Portales();
        portales3Alcyone4.setNamePortal("sadatoni");
        portales3Alcyone4.setNumeroPortal(3);
        portales3Alcyone4.setDescPortal("abajo izq 2");
        portales3Alcyone4.setIrZona(1);
        portales3Alcyone4.setAparecerPortal(3);
        listPortalesAlcyone4.add(portales3Alcyone4);

        Portales portales4Alcyone4 = new Portales();
        portales4Alcyone4.setNamePortal("auriga");
        portales4Alcyone4.setNumeroPortal(4);
        portales4Alcyone4.setDescPortal("abajo der 3");
        portales4Alcyone4.setIrZona(4);
        portales4Alcyone4.setAparecerPortal(4);
        listPortalesAlcyone4.add(portales4Alcyone4);

        List<Zona> listZonaAlcyone4 = new ArrayList<>();

        Zona zonaAlcyone4 = new Zona();
        zonaAlcyone4.setNombreZona("ZONA 4");
        zonaAlcyone4.setNumeroZona(4);
        zonaAlcyone4.setListPortales(listPortalesAlcyone4);
        listZonaAlcyone4.add(zonaAlcyone4);

        mapaAlcyone4.setListZona(listZonaAlcyone4);

        // Crear el mapa para ATLAS A
        Mapa mapaAtlasA = new Mapa();
        mapaAtlasA.setNombreMapa("ATLAS A");

        List<Zona> listZonaAtlasA = new ArrayList<>();

        // ZONA 1
        Zona zona1AtlasA = new Zona();
        zona1AtlasA.setNombreZona("ZONA 1");
        zona1AtlasA.setNumeroZona(1);

        List<Portales> listPortales1AtlasA = new ArrayList<>();

        Portales portales1AtlasA1 = new Portales();
        portales1AtlasA1.setNamePortal("eridani");
        portales1AtlasA1.setNumeroPortal(1);
        portales1AtlasA1.setDescPortal("izq arriba 0");
        portales1AtlasA1.setIrZona(1);
        portales1AtlasA1.setAparecerPortal(3);
        listPortales1AtlasA.add(portales1AtlasA1);

        Portales portales1AtlasA2 = new Portales();
        portales1AtlasA2.setNamePortal("sirius");
        portales1AtlasA2.setNumeroPortal(2);
        portales1AtlasA2.setDescPortal("der arriba 1");
        portales1AtlasA2.setIrZona(4);
        portales1AtlasA2.setAparecerPortal(4);
        listPortales1AtlasA.add(portales1AtlasA2);

        Portales portales1AtlasA3 = new Portales();
        portales1AtlasA3.setNamePortal("bootes");
        portales1AtlasA3.setNumeroPortal(3);
        portales1AtlasA3.setDescPortal("izq abajo 2");
        portales1AtlasA3.setIrZona(2);
        portales1AtlasA3.setAparecerPortal(3);
        listPortales1AtlasA.add(portales1AtlasA3);

        Portales portales1AtlasA4 = new Portales();
        portales1AtlasA4.setNamePortal("atlas b");
        portales1AtlasA4.setNumeroPortal(4);
        portales1AtlasA4.setDescPortal("der abajo 3");
        portales1AtlasA4.setIrZona(1);
        portales1AtlasA4.setAparecerPortal(3);
        listPortales1AtlasA.add(portales1AtlasA4);

        zona1AtlasA.setListPortales(listPortales1AtlasA);
        listZonaAtlasA.add(zona1AtlasA);

        // ZONA 2
        Zona zona2AtlasA = new Zona();
        zona2AtlasA.setNombreZona("ZONA 2");
        zona2AtlasA.setNumeroZona(2);

        List<Portales> listPortales2AtlasA = new ArrayList<>();

        Portales portales2AtlasA1 = new Portales();
        portales2AtlasA1.setNamePortal("helvetios");
        portales2AtlasA1.setNumeroPortal(1);
        portales2AtlasA1.setDescPortal("arriba izq 0");
        portales2AtlasA1.setIrZona(2);
        portales2AtlasA1.setAparecerPortal(2);
        listPortales2AtlasA.add(portales2AtlasA1);

        Portales portales2AtlasA2 = new Portales();
        portales2AtlasA2.setNamePortal("helvetios");
        portales2AtlasA2.setNumeroPortal(2);
        portales2AtlasA2.setDescPortal("arriba der 1");
        portales2AtlasA2.setIrZona(1);
        portales2AtlasA2.setAparecerPortal(2);
        listPortales2AtlasA.add(portales2AtlasA2);

        Portales portales2AtlasA3 = new Portales();
        portales2AtlasA3.setNamePortal("bootes");
        portales2AtlasA3.setNumeroPortal(3);
        portales2AtlasA3.setDescPortal("abajo izq 2");
        portales2AtlasA3.setIrZona(4);
        portales2AtlasA3.setAparecerPortal(4);
        listPortales2AtlasA.add(portales2AtlasA3);

        Portales portales2AtlasA4 = new Portales();
        portales2AtlasA4.setNamePortal("auriga");
        portales2AtlasA4.setNumeroPortal(4);
        portales2AtlasA4.setDescPortal("abajo der 3");
        portales2AtlasA4.setIrZona(2);
        portales2AtlasA4.setAparecerPortal(1);
        listPortales2AtlasA.add(portales2AtlasA4);

        zona2AtlasA.setListPortales(listPortales2AtlasA);
        listZonaAtlasA.add(zona2AtlasA);

        mapaAtlasA.setListZona(listZonaAtlasA);

        // MAPA 3
        Zona zona3AtlasA = new Zona();
        zona3AtlasA.setNombreZona("ZONA 3");
        zona3AtlasA.setNumeroZona(3);

        List<Portales> listPortales3AtlasA = new ArrayList<>();

        Portales portales3AtlasA1 = new Portales();
        portales3AtlasA1.setNamePortal("eridani");
        portales3AtlasA1.setNumeroPortal(1);
        portales3AtlasA1.setDescPortal("arriba izq 0");
        portales3AtlasA1.setIrZona(1);
        portales3AtlasA1.setAparecerPortal(4);
        listPortales3AtlasA.add(portales3AtlasA1);

        Portales portales3AtlasA2 = new Portales();
        portales3AtlasA2.setNamePortal("sirius");
        portales3AtlasA2.setNumeroPortal(2);
        portales3AtlasA2.setDescPortal("arriba der 1");
        portales3AtlasA2.setIrZona(3);
        portales3AtlasA2.setAparecerPortal(4);
        listPortales3AtlasA.add(portales3AtlasA2);

        Portales portales3AtlasA3 = new Portales();
        portales3AtlasA3.setNamePortal("cygni");
        portales3AtlasA3.setNumeroPortal(3);
        portales3AtlasA3.setDescPortal("abajo izq 2");
        portales3AtlasA3.setIrZona(3);
        portales3AtlasA3.setAparecerPortal(4);
        listPortales3AtlasA.add(portales3AtlasA3);

        Portales portales3AtlasA4 = new Portales();
        portales3AtlasA4.setNamePortal("bootes");
        portales3AtlasA4.setNumeroPortal(4);
        portales3AtlasA4.setDescPortal("abajo der 3");
        portales3AtlasA4.setIrZona(1);
        portales3AtlasA4.setAparecerPortal(2);
        listPortales3AtlasA.add(portales3AtlasA4);

        zona3AtlasA.setListPortales(listPortales3AtlasA);
        listZonaAtlasA.add(zona3AtlasA);

        // MAPA 4
        Zona zona4AtlasA = new Zona();
        zona4AtlasA.setNombreZona("ZONA 4");
        zona4AtlasA.setNumeroZona(4);

        List<Portales> listPortales4AtlasA = new ArrayList<>();

        Portales portales4AtlasA1 = new Portales();
        portales4AtlasA1.setNamePortal("maia");
        portales4AtlasA1.setNumeroPortal(1);
        portales4AtlasA1.setDescPortal("arriba izq 0");
        portales4AtlasA1.setIrZona(2);
        portales4AtlasA1.setAparecerPortal(3);
        listPortales4AtlasA.add(portales4AtlasA1);

        Portales portales4AtlasA2 = new Portales();
        portales4AtlasA2.setNamePortal("aquila");
        portales4AtlasA2.setNumeroPortal(2);
        portales4AtlasA2.setDescPortal("arriba der 1");
        portales4AtlasA2.setIrZona(2);
        portales4AtlasA2.setAparecerPortal(1);
        listPortales4AtlasA.add(portales4AtlasA2);

        Portales portales4AtlasA3 = new Portales();
        portales4AtlasA3.setNamePortal("sirius");
        portales4AtlasA3.setNumeroPortal(3);
        portales4AtlasA3.setDescPortal("abajo izq 2");
        portales4AtlasA3.setIrZona(2);
        portales4AtlasA3.setAparecerPortal(1);
        listPortales4AtlasA.add(portales4AtlasA3);

        Portales portales4AtlasA4 = new Portales();
        portales4AtlasA4.setNamePortal("aquila");
        portales4AtlasA4.setNumeroPortal(4);
        portales4AtlasA4.setDescPortal("abajo der 3");
        portales4AtlasA4.setIrZona(3);
        portales4AtlasA4.setAparecerPortal(2);
        listPortales4AtlasA.add(portales4AtlasA4);

        zona4AtlasA.setListPortales(listPortales4AtlasA);
        listZonaAtlasA.add(zona4AtlasA);

        mapaAtlasA.setListZona(listZonaAtlasA);

        // Crear el mapa para ATLAS B
        Mapa mapaAtlasB = new Mapa();
        mapaAtlasB.setNombreMapa("ATLAS B");

        List<Zona> listZonaAtlasB = new ArrayList<>();

        // ZONA 1
        Zona zona1AtlasB = new Zona();
        zona1AtlasB.setNombreZona("ZONA 1");
        zona1AtlasB.setNumeroZona(1);

        List<Portales> listPortales1AtlasB = new ArrayList<>();

        Portales portales1AtlasB1 = new Portales();
        portales1AtlasB1.setNamePortal("maia");
        portales1AtlasB1.setNumeroPortal(1);
        portales1AtlasB1.setDescPortal("izq arriba 0");
        portales1AtlasB1.setIrZona(1);
        portales1AtlasB1.setAparecerPortal(2);
        listPortales1AtlasB.add(portales1AtlasB1);

        Portales portales1AtlasB2 = new Portales();
        portales1AtlasB2.setNamePortal("maia");
        portales1AtlasB2.setNumeroPortal(2);
        portales1AtlasB2.setDescPortal("der arriba 1");
        portales1AtlasB2.setIrZona(1);
        portales1AtlasB2.setAparecerPortal(3);
        listPortales1AtlasB.add(portales1AtlasB2);

        Portales portales1AtlasB3 = new Portales();
        portales1AtlasB3.setNamePortal("atlas a");
        portales1AtlasB3.setNumeroPortal(3);
        portales1AtlasB3.setDescPortal("izq abajo 2");
        portales1AtlasB3.setIrZona(1);
        portales1AtlasB3.setAparecerPortal(4);
        listPortales1AtlasB.add(portales1AtlasB3);

        Portales portales1AtlasB4 = new Portales();
        portales1AtlasB4.setNamePortal("sirius");
        portales1AtlasB4.setNumeroPortal(4);
        portales1AtlasB4.setDescPortal("der abajo 3");
        portales1AtlasB4.setIrZona(1);
        portales1AtlasB4.setAparecerPortal(3);
        listPortales1AtlasB.add(portales1AtlasB4);

        zona1AtlasB.setListPortales(listPortales1AtlasB);
        listZonaAtlasB.add(zona1AtlasB);

        // ZONA 2
        Zona zona2AtlasB = new Zona();
        zona2AtlasB.setNombreZona("ZONA 2");
        zona2AtlasB.setNumeroZona(2);

        List<Portales> listPortales2AtlasB = new ArrayList<>();

        Portales portales2AtlasB1 = new Portales();
        portales2AtlasB1.setNamePortal("persei");
        portales2AtlasB1.setNumeroPortal(1);
        portales2AtlasB1.setDescPortal("arriba izq 0");
        portales2AtlasB1.setIrZona(4);
        portales2AtlasB1.setAparecerPortal(4);
        listPortales2AtlasB.add(portales2AtlasB1);

        Portales portales2AtlasB2 = new Portales();
        portales2AtlasB2.setNamePortal("orion");
        portales2AtlasB2.setNumeroPortal(2);
        portales2AtlasB2.setDescPortal("arriba der 1");
        portales2AtlasB2.setIrZona(1);
        portales2AtlasB2.setAparecerPortal(2);
        listPortales2AtlasB.add(portales2AtlasB2);

        Portales portales2AtlasB3 = new Portales();
        portales2AtlasB3.setNamePortal("orion");
        portales2AtlasB3.setNumeroPortal(3);
        portales2AtlasB3.setDescPortal("abajo izq 2");
        portales2AtlasB3.setIrZona(3);
        portales2AtlasB3.setAparecerPortal(1);
        listPortales2AtlasB.add(portales2AtlasB3);

        Portales portales2AtlasB4 = new Portales();
        portales2AtlasB4.setNamePortal("aquila");
        portales2AtlasB4.setNumeroPortal(4);
        portales2AtlasB4.setDescPortal("abajo der 3");
        portales2AtlasB4.setIrZona(2);
        portales2AtlasB4.setAparecerPortal(4);
        listPortales2AtlasB.add(portales2AtlasB4);

        zona2AtlasB.setListPortales(listPortales2AtlasB);
        listZonaAtlasB.add(zona2AtlasB);

        mapaAtlasB.setListZona(listZonaAtlasB);

        // MAPA 3
        Zona zona3AtlasB = new Zona();
        zona3AtlasB.setNombreZona("ZONA 3");
        zona3AtlasB.setNumeroZona(3);

        List<Portales> listPortales3AtlasB = new ArrayList<>();

        Portales portales3AtlasB1 = new Portales();
        portales3AtlasB1.setNamePortal("helvetios");
        portales3AtlasB1.setNumeroPortal(1);
        portales3AtlasB1.setDescPortal("arriba izq 0");
        portales3AtlasB1.setIrZona(1);
        portales3AtlasB1.setAparecerPortal(4);
        listPortales3AtlasB.add(portales3AtlasB1);

        Portales portales3AtlasB2 = new Portales();
        portales3AtlasB2.setNamePortal("orion");
        portales3AtlasB2.setNumeroPortal(2);
        portales3AtlasB2.setDescPortal("arriba der 1");
        portales3AtlasB2.setIrZona(1);
        portales3AtlasB2.setAparecerPortal(1);
        listPortales3AtlasB.add(portales3AtlasB2);

        Portales portales3AtlasB3 = new Portales();
        portales3AtlasB3.setNamePortal("cygni");
        portales3AtlasB3.setNumeroPortal(3);
        portales3AtlasB3.setDescPortal("abajo izq 2");
        portales3AtlasB3.setIrZona(3);
        portales3AtlasB3.setAparecerPortal(2);
        listPortales3AtlasB.add(portales3AtlasB3);

        Portales portales3AtlasB4 = new Portales();
        portales3AtlasB4.setNamePortal("atlas c");
        portales3AtlasB4.setNumeroPortal(4);
        portales3AtlasB4.setDescPortal("abajo der 3");
        portales3AtlasB4.setIrZona(1);
        portales3AtlasB4.setAparecerPortal(3);
        listPortales3AtlasB.add(portales3AtlasB4);

        zona3AtlasB.setListPortales(listPortales3AtlasB);
        listZonaAtlasB.add(zona3AtlasB);

        // MAPA 4
        Zona zona4AtlasB = new Zona();
        zona4AtlasB.setNombreZona("ZONA 4");
        zona4AtlasB.setNumeroZona(4);

        List<Portales> listPortales4AtlasB = new ArrayList<>();

        Portales portales4AtlasB1 = new Portales();
        portales4AtlasB1.setNamePortal("helvetios");
        portales4AtlasB1.setNumeroPortal(1);
        portales4AtlasB1.setDescPortal("arriba izq 0");
        portales4AtlasB1.setIrZona(4);
        portales4AtlasB1.setAparecerPortal(2);
        listPortales4AtlasB.add(portales4AtlasB1);

        Portales portales4AtlasB2 = new Portales();
        portales4AtlasB2.setNamePortal("maia");
        portales4AtlasB2.setNumeroPortal(2);
        portales4AtlasB2.setDescPortal("arriba der 1");
        portales4AtlasB2.setIrZona(3);
        portales4AtlasB2.setAparecerPortal(1);
        listPortales4AtlasB.add(portales4AtlasB2);

        Portales portales4AtlasB3 = new Portales();
        portales4AtlasB3.setNamePortal("sadatoni");
        portales4AtlasB3.setNumeroPortal(3);
        portales4AtlasB3.setDescPortal("abajo izq 2");
        portales4AtlasB3.setIrZona(3);
        portales4AtlasB3.setAparecerPortal(3);
        listPortales4AtlasB.add(portales4AtlasB3);

        Portales portales4AtlasB4 = new Portales();
        portales4AtlasB4.setNamePortal("eridani");
        portales4AtlasB4.setNumeroPortal(4);
        portales4AtlasB4.setDescPortal("abajo der 3");
        portales4AtlasB4.setIrZona(4);
        portales4AtlasB4.setAparecerPortal(4);
        listPortales4AtlasB.add(portales4AtlasB4);

        zona4AtlasB.setListPortales(listPortales4AtlasB);
        listZonaAtlasB.add(zona4AtlasB);

        mapaAtlasB.setListZona(listZonaAtlasB);

        // Crear el mapa para ATLAS C
        Mapa mapaAtlasC = new Mapa();
        mapaAtlasC.setNombreMapa("ATLAS C");

        List<Zona> listZonaAtlasC = new ArrayList<>();

        // ZONA 1
        Zona zona1AtlasC = new Zona();
        zona1AtlasC.setNombreZona("ZONA 1");
        zona1AtlasC.setNumeroZona(1);

        List<Portales> listPortales1AtlasC = new ArrayList<>();

        Portales portales1AtlasC1 = new Portales();
        portales1AtlasC1.setNamePortal("orion");
        portales1AtlasC1.setNumeroPortal(1);
        portales1AtlasC1.setDescPortal("arriba izq 0");
        portales1AtlasC1.setIrZona(4);
        portales1AtlasC1.setAparecerPortal(3);
        listPortales1AtlasC.add(portales1AtlasC1);

        Portales portales1AtlasC2 = new Portales();
        portales1AtlasC2.setNamePortal("orion");
        portales1AtlasC2.setNumeroPortal(2);
        portales1AtlasC2.setDescPortal("arriba der 1");
        portales1AtlasC2.setIrZona(4);
        portales1AtlasC2.setAparecerPortal(4);
        listPortales1AtlasC.add(portales1AtlasC2);

        Portales portales1AtlasC3 = new Portales();
        portales1AtlasC3.setNamePortal("atlas b");
        portales1AtlasC3.setNumeroPortal(3);
        portales1AtlasC3.setDescPortal("abajo izq 2");
        portales1AtlasC3.setIrZona(3);
        portales1AtlasC3.setAparecerPortal(4);
        listPortales1AtlasC.add(portales1AtlasC3);

        Portales portales1AtlasC4 = new Portales();
        portales1AtlasC4.setNamePortal("persei");
        portales1AtlasC4.setNumeroPortal(4);
        portales1AtlasC4.setDescPortal("abajo der 3");
        portales1AtlasC4.setIrZona(4);
        portales1AtlasC4.setAparecerPortal(1);
        listPortales1AtlasC.add(portales1AtlasC4);

        zona1AtlasC.setListPortales(listPortales1AtlasC);
        listZonaAtlasC.add(zona1AtlasC);

        // ZONA 2
        Zona zona2AtlasC = new Zona();
        zona2AtlasC.setNombreZona("ZONA 2");
        zona2AtlasC.setNumeroZona(2);

        List<Portales> listPortales2AtlasC = new ArrayList<>();

        Portales portales2AtlasC1 = new Portales();
        portales2AtlasC1.setNamePortal("eridani");
        portales2AtlasC1.setNumeroPortal(1);
        portales2AtlasC1.setDescPortal("arriba izq 0");
        portales2AtlasC1.setIrZona(2);
        portales2AtlasC1.setAparecerPortal(3);
        listPortales2AtlasC.add(portales2AtlasC1);

        Portales portales2AtlasC2 = new Portales();
        portales2AtlasC2.setNamePortal("sadatoni");
        portales2AtlasC2.setNumeroPortal(2);
        portales2AtlasC2.setDescPortal("arriba der 1");
        portales2AtlasC2.setIrZona(2);
        portales2AtlasC2.setAparecerPortal(1);
        listPortales2AtlasC.add(portales2AtlasC2);

        Portales portales2AtlasC3 = new Portales();
        portales2AtlasC3.setNamePortal("maia");
        portales2AtlasC3.setNumeroPortal(3);
        portales2AtlasC3.setDescPortal("abajo izq 2");
        portales2AtlasC3.setIrZona(2);
        portales2AtlasC3.setAparecerPortal(4);
        listPortales2AtlasC.add(portales2AtlasC3);

        Portales portales2AtlasC4 = new Portales();
        portales2AtlasC4.setNamePortal("orion");
        portales2AtlasC4.setNumeroPortal(4);
        portales2AtlasC4.setDescPortal("abajo der 3");
        portales2AtlasC4.setIrZona(1);
        portales2AtlasC4.setAparecerPortal(3);
        listPortales2AtlasC.add(portales2AtlasC4);

        zona2AtlasC.setListPortales(listPortales2AtlasC);
        listZonaAtlasC.add(zona2AtlasC);

        mapaAtlasC.setListZona(listZonaAtlasC);

        // MAPA 3
        Zona zona3AtlasC = new Zona();
        zona3AtlasC.setNombreZona("ZONA 3");
        zona3AtlasC.setNumeroZona(3);

        List<Portales> listPortales3AtlasC = new ArrayList<>();

        Portales portales3AtlasC1 = new Portales();
        portales3AtlasC1.setNamePortal("sadatoni");
        portales3AtlasC1.setNumeroPortal(1);
        portales3AtlasC1.setDescPortal("arriba izq 0");
        portales3AtlasC1.setIrZona(4);
        portales3AtlasC1.setAparecerPortal(3);
        listPortales3AtlasC.add(portales3AtlasC1);

        Portales portales3AtlasC2 = new Portales();
        portales3AtlasC2.setNamePortal("volantis");
        portales3AtlasC2.setNumeroPortal(2);
        portales3AtlasC2.setDescPortal("arriba der 1");
        portales3AtlasC2.setIrZona(1);
        portales3AtlasC2.setAparecerPortal(3);
        listPortales3AtlasC.add(portales3AtlasC2);

        Portales portales3AtlasC3 = new Portales();
        portales3AtlasC3.setNamePortal("persei");
        portales3AtlasC3.setNumeroPortal(3);
        portales3AtlasC3.setDescPortal("abajo izq 2");
        portales3AtlasC3.setIrZona(3);
        portales3AtlasC3.setAparecerPortal(2);
        listPortales3AtlasC.add(portales3AtlasC3);

        Portales portales3AtlasC4 = new Portales();
        portales3AtlasC4.setNamePortal("aquila");
        portales3AtlasC4.setNumeroPortal(4);
        portales3AtlasC4.setDescPortal("abajo der 3");
        portales3AtlasC4.setIrZona(3);
        portales3AtlasC4.setAparecerPortal(3);
        listPortales3AtlasC.add(portales3AtlasC4);

        zona3AtlasC.setListPortales(listPortales3AtlasC);
        listZonaAtlasC.add(zona3AtlasC);

        // MAPA 4
        Zona zona4AtlasC = new Zona();
        zona4AtlasC.setNombreZona("ZONA 4");
        zona4AtlasC.setNumeroZona(4);

        List<Portales> listPortales4AtlasC = new ArrayList<>();

        Portales portales4AtlasC1 = new Portales();
        portales4AtlasC1.setNamePortal("bootes");
        portales4AtlasC1.setNumeroPortal(1);
        portales4AtlasC1.setDescPortal("arriba izq 0");
        portales4AtlasC1.setIrZona(1);
        portales4AtlasC1.setAparecerPortal(4);
        listPortales4AtlasC.add(portales4AtlasC1);

        Portales portales4AtlasC2 = new Portales();
        portales4AtlasC2.setNamePortal("sadatoni");
        portales4AtlasC2.setNumeroPortal(2);
        portales4AtlasC2.setDescPortal("arriba der 1");
        portales4AtlasC2.setIrZona(1);
        portales4AtlasC2.setAparecerPortal(2);
        listPortales4AtlasC.add(portales4AtlasC2);

        Portales portales4AtlasC3 = new Portales();
        portales4AtlasC3.setNamePortal("auriga");
        portales4AtlasC3.setNumeroPortal(3);
        portales4AtlasC3.setDescPortal("abajo izq 2");
        portales4AtlasC3.setIrZona(4);
        portales4AtlasC3.setAparecerPortal(2);
        listPortales4AtlasC.add(portales4AtlasC3);

        Portales portales4AtlasC4 = new Portales();
        portales4AtlasC4.setNamePortal("orion");
        portales4AtlasC4.setNumeroPortal(4);
        portales4AtlasC4.setDescPortal("abajo der 3");
        portales4AtlasC4.setIrZona(2);
        portales4AtlasC4.setAparecerPortal(4);
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
        zona1Aquila.setNumeroZona(1);

        List<Portales> listPortales1Aquila = new ArrayList<>();

        Portales portales1Aquila1 = new Portales();
        portales1Aquila1.setNamePortal("aquila");
        portales1Aquila1.setNumeroPortal(1);
        portales1Aquila1.setDescPortal("arriba izq 0");
        portales1Aquila1.setIrZona(4);
        portales1Aquila1.setAparecerPortal(2);
        listPortales1Aquila.add(portales1Aquila1);

        Portales portales1Aquila2 = new Portales();
        portales1Aquila2.setNamePortal("maia");
        portales1Aquila2.setNumeroPortal(2);
        portales1Aquila2.setDescPortal("arriba der 1");
        portales1Aquila2.setIrZona(4);
        portales1Aquila2.setAparecerPortal(3);
        listPortales1Aquila.add(portales1Aquila2);

        Portales portales1Aquila3 = new Portales();
        portales1Aquila3.setNamePortal("bootes");
        portales1Aquila3.setNumeroPortal(3);
        portales1Aquila3.setDescPortal("abajo izq 2");
        portales1Aquila3.setIrZona(3);
        portales1Aquila3.setAparecerPortal(3);
        listPortales1Aquila.add(portales1Aquila3);

        Portales portales1Aquila4 = new Portales();
        portales1Aquila4.setNamePortal("sirius");
        portales1Aquila4.setNumeroPortal(4);
        portales1Aquila4.setDescPortal("abajo der 3");
        portales1Aquila4.setIrZona(2);
        portales1Aquila4.setAparecerPortal(2);
        listPortales1Aquila.add(portales1Aquila4);

        zona1Aquila.setListPortales(listPortales1Aquila);
        listZonaAquila.add(zona1Aquila);

        // ZONA 2
        Zona zona2Aquila = new Zona();
        zona2Aquila.setNombreZona("ZONA 2");
        zona2Aquila.setNumeroZona(2);

        List<Portales> listPortales2Aquila = new ArrayList<>();

        Portales portales2Aquila1 = new Portales();
        portales2Aquila1.setNamePortal("atlas a");
        portales2Aquila1.setNumeroPortal(1);
        portales2Aquila1.setDescPortal("arriba izq 0");
        portales2Aquila1.setIrZona(4);
        portales2Aquila1.setAparecerPortal(2);
        listPortales2Aquila.add(portales2Aquila1);

        Portales portales2Aquila2 = new Portales();
        portales2Aquila2.setNamePortal("sadatoni");
        portales2Aquila2.setNumeroPortal(2);
        portales2Aquila2.setDescPortal("arriba der 1");
        portales2Aquila2.setIrZona(3);
        portales2Aquila2.setAparecerPortal(4);
        listPortales2Aquila.add(portales2Aquila2);

        Portales portales2Aquila3 = new Portales();
        portales2Aquila3.setNamePortal("alcyone");
        portales2Aquila3.setNumeroPortal(3);
        portales2Aquila3.setDescPortal("abajo izq 2");
        portales2Aquila3.setIrZona(3);
        portales2Aquila3.setAparecerPortal(3);
        listPortales2Aquila.add(portales2Aquila3);

        Portales portales2Aquila4 = new Portales();
        portales2Aquila4.setNamePortal("atlas b");
        portales2Aquila4.setNumeroPortal(4);
        portales2Aquila4.setDescPortal("abajo der 3");
        portales2Aquila4.setIrZona(2);
        portales2Aquila4.setAparecerPortal(4);
        listPortales2Aquila.add(portales2Aquila4);

        zona2Aquila.setListPortales(listPortales2Aquila);
        listZonaAquila.add(zona2Aquila);

        mapaAquila.setListZona(listZonaAquila);

        // MAPA 3
        Zona zona3Aquila = new Zona();
        zona3Aquila.setNombreZona("ZONA 3");
        zona3Aquila.setNumeroZona(3);

        List<Portales> listPortales3Aquila = new ArrayList<>();

        Portales portales3Aquila1 = new Portales();
        portales3Aquila1.setNamePortal("cygni");
        portales3Aquila1.setNumeroPortal(1);
        portales3Aquila1.setDescPortal("arriba izq 0");
        portales3Aquila1.setIrZona(3);
        portales3Aquila1.setAparecerPortal(3);
        listPortales3Aquila.add(portales3Aquila1);

        Portales portales3Aquila2 = new Portales();
        portales3Aquila2.setNamePortal("atlas a");
        portales3Aquila2.setNumeroPortal(2);
        portales3Aquila2.setDescPortal("arriba der 1");
        portales3Aquila2.setIrZona(4);
        portales3Aquila2.setAparecerPortal(4);
        listPortales3Aquila.add(portales3Aquila2);

        Portales portales3Aquila3 = new Portales();
        portales3Aquila3.setNamePortal("atlas c");
        portales3Aquila3.setNumeroPortal(3);
        portales3Aquila3.setDescPortal("abajo izq 2");
        portales3Aquila3.setIrZona(3);
        portales3Aquila3.setAparecerPortal(4);
        listPortales3Aquila.add(portales3Aquila3);

        Portales portales3Aquila4 = new Portales();
        portales3Aquila4.setNamePortal("volantis");
        portales3Aquila4.setNumeroPortal(4);
        portales3Aquila4.setDescPortal("abajo der 3");
        portales3Aquila4.setIrZona(4);
        portales3Aquila4.setAparecerPortal(3);
        listPortales3Aquila.add(portales3Aquila4);

        zona3Aquila.setListPortales(listPortales3Aquila);
        listZonaAquila.add(zona3Aquila);

        // MAPA 4
        Zona zona4Aquila = new Zona();
        zona4Aquila.setNombreZona("ZONA 4");
        zona4Aquila.setNumeroZona(4);

        List<Portales> listPortales4Aquila = new ArrayList<>();

        Portales portales4Aquila1 = new Portales();
        portales4Aquila1.setNamePortal("bootes");
        portales4Aquila1.setNumeroPortal(1);
        portales4Aquila1.setDescPortal("arriba izq 0");
        portales4Aquila1.setIrZona(3);
        portales4Aquila1.setAparecerPortal(4);
        listPortales4Aquila.add(portales4Aquila1);

        Portales portales4Aquila2 = new Portales();
        portales4Aquila2.setNamePortal("aquila");
        portales4Aquila2.setNumeroPortal(2);
        portales4Aquila2.setDescPortal("arriba der 1");
        portales4Aquila2.setIrZona(1);
        portales4Aquila2.setAparecerPortal(1);
        listPortales4Aquila.add(portales4Aquila2);

        Portales portales4Aquila3 = new Portales();
        portales4Aquila3.setNamePortal("eridani");
        portales4Aquila3.setNumeroPortal(3);
        portales4Aquila3.setDescPortal("abajo izq 2");
        portales4Aquila3.setIrZona(3);
        portales4Aquila3.setAparecerPortal(1);
        listPortales4Aquila.add(portales4Aquila3);

        Portales portales4Aquila4 = new Portales();
        portales4Aquila4.setNamePortal("bootes");
        portales4Aquila4.setNumeroPortal(4);
        portales4Aquila4.setDescPortal("abajo der 3");
        portales4Aquila4.setIrZona(3);
        portales4Aquila4.setAparecerPortal(1);
        listPortales4Aquila.add(portales4Aquila4);

        zona4Aquila.setListPortales(listPortales4Aquila);
        listZonaAquila.add(zona4Aquila);

        mapaAquila.setListZona(listZonaAquila);

        // Crear el mapa para Auriga
        Mapa mapaAuriga = new Mapa();
        mapaAuriga.setNombreMapa("AURIGA");

        List<Zona> listZonaAuriga = new ArrayList<>();

        // ZONA 1
        Zona zona1Auriga = new Zona();
        zona1Auriga.setNombreZona("ZONA 1");
        zona1Auriga.setNumeroZona(1);

        List<Portales> listPortales1Auriga = new ArrayList<>();

        Portales portales1Auriga1 = new Portales();
        portales1Auriga1.setNamePortal("volantis");
        portales1Auriga1.setNumeroPortal(1);
        portales1Auriga1.setDescPortal("izq arriba 0");
        portales1Auriga1.setIrZona(2);
        portales1Auriga1.setAparecerPortal(3);
        listPortales1Auriga.add(portales1Auriga1);

        Portales portales1Auriga2 = new Portales();
        portales1Auriga2.setNamePortal("volantis");
        portales1Auriga2.setNumeroPortal(2);
        portales1Auriga2.setDescPortal("der arriba 1");
        portales1Auriga2.setIrZona(3);
        portales1Auriga2.setAparecerPortal(4);
        listPortales1Auriga.add(portales1Auriga2);

        Portales portales1Auriga3 = new Portales();
        portales1Auriga3.setNamePortal("persei");
        portales1Auriga3.setNumeroPortal(3);
        portales1Auriga3.setDescPortal("izq abajo 2");
        portales1Auriga3.setIrZona(2);
        portales1Auriga3.setAparecerPortal(2);
        listPortales1Auriga.add(portales1Auriga3);

        Portales portales1Auriga4 = new Portales();
        portales1Auriga4.setNamePortal("auriga");
        portales1Auriga4.setNumeroPortal(4);
        portales1Auriga4.setDescPortal("der abajo 3");
        portales1Auriga4.setIrZona(3);
        portales1Auriga4.setAparecerPortal(1);
        listPortales1Auriga.add(portales1Auriga4);

        zona1Auriga.setListPortales(listPortales1Auriga);
        listZonaAuriga.add(zona1Auriga);

        // ZONA 2
        Zona zona2Auriga = new Zona();
        zona2Auriga.setNombreZona("ZONA 2");
        zona2Auriga.setNumeroZona(2);

        List<Portales> listPortales2Auriga = new ArrayList<>();

        Portales portales2Auriga1 = new Portales();
        portales2Auriga1.setNamePortal("atlas a");
        portales2Auriga1.setNumeroPortal(1);
        portales2Auriga1.setDescPortal("arriba izq 0");
        portales2Auriga1.setIrZona(2);
        portales2Auriga1.setAparecerPortal(4);
        listPortales2Auriga.add(portales2Auriga1);

        Portales portales2Auriga2 = new Portales();
        portales2Auriga2.setNamePortal("sirius");
        portales2Auriga2.setNumeroPortal(2);
        portales2Auriga2.setDescPortal("arriba der 1");
        portales2Auriga2.setIrZona(4);
        portales2Auriga2.setAparecerPortal(1);
        listPortales2Auriga.add(portales2Auriga2);

        Portales portales2Auriga3 = new Portales();
        portales2Auriga3.setNamePortal("sadatoni");
        portales2Auriga3.setNumeroPortal(3);
        portales2Auriga3.setDescPortal("abajo izq 2");
        portales2Auriga3.setIrZona(2);
        portales2Auriga3.setAparecerPortal(4);
        listPortales2Auriga.add(portales2Auriga3);

        Portales portales2Auriga4 = new Portales();
        portales2Auriga4.setNamePortal("eridani");
        portales2Auriga4.setNumeroPortal(4);
        portales2Auriga4.setDescPortal("abajo der 3");
        portales2Auriga4.setIrZona(3);
        portales2Auriga4.setAparecerPortal(2);
        listPortales2Auriga.add(portales2Auriga4);

        zona2Aquila.setListPortales(listPortales2Auriga);
        listZonaAuriga.add(zona2Auriga);

        mapaAuriga.setListZona(listZonaAuriga);

        // MAPA 3
        Zona zona3Auriga = new Zona();
        zona3Auriga.setNombreZona("ZONA 3");
        zona3Auriga.setNumeroZona(3);

        List<Portales> listPortales3Auriga = new ArrayList<>();

        Portales portales3Auriga1 = new Portales();
        portales3Auriga1.setNamePortal("auriga");
        portales3Auriga1.setNumeroPortal(1);
        portales3Auriga1.setDescPortal("arriba izq 0");
        portales3Auriga1.setIrZona(1);
        portales3Auriga1.setAparecerPortal(4);
        listPortales3Auriga.add(portales3Auriga1);

        Portales portales3Auriga2 = new Portales();
        portales3Auriga2.setNamePortal("persei");
        portales3Auriga2.setNumeroPortal(2);
        portales3Auriga2.setDescPortal("arriba der 1");
        portales3Auriga2.setIrZona(1);
        portales3Auriga2.setAparecerPortal(3);
        listPortales3Auriga.add(portales3Auriga2);

        Portales portales3Auriga3 = new Portales();
        portales3Auriga3.setNamePortal("eridani");
        portales3Auriga3.setNumeroPortal(3);
        portales3Auriga3.setDescPortal("abajo izq 2");
        portales3Auriga3.setIrZona(4);
        portales3Auriga3.setAparecerPortal(3);
        listPortales3Auriga.add(portales3Auriga3);

        Portales portales3Auriga4 = new Portales();
        portales3Auriga4.setNamePortal("alcyone");
        portales3Auriga4.setNumeroPortal(4);
        portales3Auriga4.setDescPortal("abajo der 3");
        portales3Auriga4.setIrZona(1);
        portales3Auriga4.setAparecerPortal(4);
        listPortales3Auriga.add(portales3Auriga4);

        zona3Auriga.setListPortales(listPortales3Auriga);
        listZonaAuriga.add(zona3Auriga);

        // MAPA 4
        Zona zona4Auriga = new Zona();
        zona4Auriga.setNombreZona("ZONA 4");
        zona4Auriga.setNumeroZona(4);

        List<Portales> listPortales4Auriga = new ArrayList<>();

        Portales portales4Auriga1 = new Portales();
        portales4Auriga1.setNamePortal("alcyone");
        portales4Auriga1.setNumeroPortal(1);
        portales4Auriga1.setDescPortal("arriba izq 1");
        portales4Auriga1.setIrZona(3);
        portales4Auriga1.setAparecerPortal(4);
        listPortales4Auriga.add(portales4Auriga1);

        Portales portales4Auriga2 = new Portales();
        portales4Auriga2.setNamePortal("atlas c");
        portales4Auriga2.setNumeroPortal(2);
        portales4Auriga2.setDescPortal("arriba der 2");
        portales4Auriga2.setIrZona(4);
        portales4Auriga2.setAparecerPortal(3);
        listPortales4Auriga.add(portales4Auriga2);

        Portales portales4Auriga3 = new Portales();
        portales4Auriga3.setNamePortal("eridani");
        portales4Auriga3.setNumeroPortal(3);
        portales4Auriga3.setDescPortal("abajo izq 3");
        portales4Auriga3.setIrZona(1);
        portales4Auriga3.setAparecerPortal(1);
        listPortales4Auriga.add(portales4Auriga3);

        Portales portales4Auriga4 = new Portales();
        portales4Auriga4.setNamePortal("alcyone");
        portales4Auriga4.setNumeroPortal(4);
        portales4Auriga4.setDescPortal("abajo der 4");
        portales4Auriga4.setIrZona(4);
        portales4Auriga4.setAparecerPortal(4);
        listPortales4Auriga.add(portales4Auriga4);

        zona4Auriga.setListPortales(listPortales4Auriga);
        listZonaAuriga.add(zona4Auriga);

        mapaAuriga.setListZona(listZonaAuriga);

        // Crear el mapa para Bootes
        Mapa mapaBootes = new Mapa();
        mapaBootes.setNombreMapa("BOOTES");

        List<Zona> listZonaBootes = new ArrayList<>();

        // ZONA 1
        Zona zona1Bootes = new Zona();
        zona1Bootes.setNombreZona("ZONA 1");
        zona1Bootes.setNumeroZona(1);

        List<Portales> listPortales1Bootes = new ArrayList<>();

        Portales portales1Bootes1 = new Portales();
        portales1Bootes1.setNamePortal("bootes");
        portales1Bootes1.setNumeroPortal(1);
        portales1Bootes1.setDescPortal("arriba izq 1");
        portales1Bootes1.setIrZona(2);
        portales1Bootes1.setAparecerPortal(2);
        listPortales1Bootes.add(portales1Bootes1);

        Portales portales1Bootes2 = new Portales();
        portales1Bootes2.setNamePortal("atlas a");
        portales1Bootes2.setNumeroPortal(2);
        portales1Bootes2.setDescPortal("arriba der 2");
        portales1Bootes2.setIrZona(3);
        portales1Bootes2.setAparecerPortal(4);
        listPortales1Bootes.add(portales1Bootes2);

        Portales portales1Bootes3 = new Portales();
        portales1Bootes3.setNamePortal("sirius");
        portales1Bootes3.setNumeroPortal(3);
        portales1Bootes3.setDescPortal("abajo izq 3");
        portales1Bootes3.setIrZona(3);
        portales1Bootes3.setAparecerPortal(2);
        listPortales1Bootes.add(portales1Bootes3);

        Portales portales1Bootes4 = new Portales();
        portales1Bootes4.setNamePortal("atlas c");
        portales1Bootes4.setNumeroPortal(4);
        portales1Bootes4.setDescPortal("abajo der 4");
        portales1Bootes4.setIrZona(4);
        portales1Bootes4.setAparecerPortal(1);
        listPortales1Bootes.add(portales1Bootes4);

        zona1Bootes.setListPortales(listPortales1Bootes);
        listZonaBootes.add(zona1Bootes);

        // ZONA 2
        Zona zona2Bootes = new Zona();
        zona2Bootes.setNombreZona("ZONA 2");
        zona2Bootes.setNumeroZona(2);

        List<Portales> listPortales2Bootes = new ArrayList<>();

        Portales portales2Bootes1 = new Portales();
        portales2Bootes1.setNamePortal("cygni");
        portales2Bootes1.setNumeroPortal(1);
        portales2Bootes1.setDescPortal("arriba izq 1");
        portales2Bootes1.setIrZona(1);
        portales2Bootes1.setAparecerPortal(4);
        listPortales2Bootes.add(portales2Bootes1);

        Portales portales2Bootes2 = new Portales();
        portales2Bootes2.setNamePortal("bootes");
        portales2Bootes2.setNumeroPortal(2);
        portales2Bootes2.setDescPortal("arriba der 2");
        portales2Bootes2.setIrZona(1);
        portales2Bootes2.setAparecerPortal(1);
        listPortales2Bootes.add(portales2Bootes2);

        Portales portales2Bootes3 = new Portales();
        portales2Bootes3.setNamePortal("atlas a");
        portales2Bootes3.setNumeroPortal(3);
        portales2Bootes3.setDescPortal("abajo izq 3");
        portales2Bootes3.setIrZona(1);
        portales2Bootes3.setAparecerPortal(3);
        listPortales2Bootes.add(portales2Bootes3);

        Portales portales2Bootes4 = new Portales();
        portales2Bootes4.setNamePortal("maia");
        portales2Bootes4.setNumeroPortal(4);
        portales2Bootes4.setDescPortal("abajo der 4");
        portales2Bootes4.setIrZona(4);
        portales2Bootes4.setAparecerPortal(4);
        listPortales2Bootes.add(portales2Bootes4);

        zona2Bootes.setListPortales(listPortales2Bootes);
        listZonaBootes.add(zona2Bootes);

        mapaBootes.setListZona(listZonaBootes);

        // MAPA 3
        Zona zona3Bootes = new Zona();
        zona3Bootes.setNombreZona("ZONA 3");
        zona3Bootes.setNumeroZona(3);

        List<Portales> listPortales3Bootes = new ArrayList<>();

        Portales portales3Bootes1 = new Portales();
        portales3Bootes1.setNamePortal("aquila");
        portales3Bootes1.setNumeroPortal(1);
        portales3Bootes1.setDescPortal("arriba izq 1");
        portales3Bootes1.setIrZona(4);
        portales3Bootes1.setAparecerPortal(4);
        listPortales3Bootes.add(portales3Bootes1);

        Portales portales3Bootes2 = new Portales();
        portales3Bootes2.setNamePortal("orion");
        portales3Bootes2.setNumeroPortal(2);
        portales3Bootes2.setDescPortal("arriba der 2");
        portales3Bootes2.setIrZona(4);
        portales3Bootes2.setAparecerPortal(1);
        listPortales3Bootes.add(portales3Bootes2);

        Portales portales3Bootes3 = new Portales();
        portales3Bootes3.setNamePortal("aquila");
        portales3Bootes3.setNumeroPortal(3);
        portales3Bootes3.setDescPortal("abajo izq 3");
        portales3Bootes3.setIrZona(1);
        portales3Bootes3.setAparecerPortal(3);
        listPortales3Bootes.add(portales3Bootes3);

        Portales portales3Bootes4 = new Portales();
        portales3Bootes4.setNamePortal("aquila");
        portales3Bootes4.setNumeroPortal(4);
        portales3Bootes4.setDescPortal("abajo der 4");
        portales3Bootes4.setIrZona(4);
        portales3Bootes4.setAparecerPortal(1);
        listPortales3Bootes.add(portales3Bootes4);

        zona3Bootes.setListPortales(listPortales3Bootes);
        listZonaBootes.add(zona3Bootes);

        // MAPA 4
        Zona zona4Bootes = new Zona();
        zona4Bootes.setNombreZona("ZONA 4");
        zona4Bootes.setNumeroZona(4);

        List<Portales> listPortales4Bootes = new ArrayList<>();

        Portales portales4Bootes1 = new Portales();
        portales4Bootes1.setNamePortal("volantis");
        portales4Bootes1.setNumeroPortal(1);
        portales4Bootes1.setDescPortal("arriba izq 1");
        portales4Bootes1.setIrZona(1);
        portales4Bootes1.setAparecerPortal(4);
        listPortales4Bootes.add(portales4Bootes1);

        Portales portales4Bootes2 = new Portales();
        portales4Bootes2.setNamePortal("alcyone");
        portales4Bootes2.setNumeroPortal(2);
        portales4Bootes2.setDescPortal("arriba der 2");
        portales4Bootes2.setIrZona(1);
        portales4Bootes2.setAparecerPortal(1);
        listPortales4Bootes.add(portales4Bootes2);

        Portales portales4Bootes3 = new Portales();
        portales4Bootes3.setNamePortal("persei");
        portales4Bootes3.setNumeroPortal(3);
        portales4Bootes3.setDescPortal("abajo izq 3");
        portales4Bootes3.setIrZona(2);
        portales4Bootes3.setAparecerPortal(4);
        listPortales4Bootes.add(portales4Bootes3);

        Portales portales4Bootes4 = new Portales();
        portales4Bootes4.setNamePortal("atlas a");
        portales4Bootes4.setNumeroPortal(4);
        portales4Bootes4.setDescPortal("abajo der 4");
        portales4Bootes4.setIrZona(2);
        portales4Bootes4.setAparecerPortal(3);
        listPortales4Bootes.add(portales4Bootes4);

        zona4Bootes.setListPortales(listPortales4Bootes);
        listZonaBootes.add(zona4Bootes);

        mapaBootes.setListZona(listZonaBootes);

        // Crear el mapa para Cygni
        Mapa mapaCygni = new Mapa();
        mapaCygni.setNombreMapa("CYGNI");

        List<Zona> listZonaCygni = new ArrayList<>();

        // ZONA 1
        Zona zona1Cygni = new Zona();
        zona1Cygni.setNombreZona("ZONA 1");
        zona1Cygni.setNumeroZona(1);

        List<Portales> listPortales1Cygni = new ArrayList<>();

        Portales portales1Cygni1 = new Portales();
        portales1Cygni1.setNamePortal("orion");
        portales1Cygni1.setNumeroPortal(1);
        portales1Cygni1.setDescPortal("arriba izq 1");
        portales1Cygni1.setIrZona(4);
        portales1Cygni1.setAparecerPortal(2);
        listPortales1Cygni.add(portales1Cygni1);

        Portales portales1Cygni2 = new Portales();
        portales1Cygni2.setNamePortal("alcyone");
        portales1Cygni2.setNumeroPortal(2);
        portales1Cygni2.setDescPortal("arriba der 2");
        portales1Cygni2.setIrZona(4);
        portales1Cygni2.setAparecerPortal(2);
        listPortales1Cygni.add(portales1Cygni2);

        Portales portales1Cygni3 = new Portales();
        portales1Cygni3.setNamePortal("sirius");
        portales1Cygni3.setNumeroPortal(3);
        portales1Cygni3.setDescPortal("abajo izq 3");
        portales1Cygni3.setIrZona(4);
        portales1Cygni3.setAparecerPortal(3);
        listPortales1Cygni.add(portales1Cygni3);

        Portales portales1Cygni4 = new Portales();
        portales1Cygni4.setNamePortal("bootes");
        portales1Cygni4.setNumeroPortal(4);
        portales1Cygni4.setDescPortal("abajo der 4");
        portales1Cygni4.setIrZona(2);
        portales1Cygni4.setAparecerPortal(1);
        listPortales1Cygni.add(portales1Cygni4);

        zona1Cygni.setListPortales(listPortales1Cygni);
        listZonaCygni.add(zona1Cygni);

        // ZONA 2
        Zona zona2Cygni = new Zona();
        zona2Cygni.setNombreZona("ZONA 2");
        zona2Cygni.setNumeroZona(2);

        List<Portales> listPortales2Cygni = new ArrayList<>();

        Portales portales2Cygni1 = new Portales();
        portales2Cygni1.setNamePortal("sadatoni");
        portales2Cygni1.setNumeroPortal(1);
        portales2Cygni1.setDescPortal("arriba izq 1");
        portales2Cygni1.setIrZona(3);
        portales2Cygni1.setAparecerPortal(2);
        listPortales2Cygni.add(portales2Cygni1);

        Portales portales2Cygni2 = new Portales();
        portales2Cygni2.setNamePortal("alcyone");
        portales2Cygni2.setNumeroPortal(2);
        portales2Cygni2.setDescPortal("arriba der 2");
        portales2Cygni2.setIrZona(2);
        portales2Cygni2.setAparecerPortal(3);
        listPortales2Cygni.add(portales2Cygni2);

        Portales portales2Cygni3 = new Portales();
        portales2Cygni3.setNamePortal("orion");
        portales2Cygni3.setNumeroPortal(3);
        portales2Cygni3.setDescPortal("abajo izq 3");
        portales2Cygni3.setIrZona(2);
        portales2Cygni3.setAparecerPortal(3);
        listPortales2Cygni.add(portales2Cygni3);

        Portales portales2Cygni4 = new Portales();
        portales2Cygni4.setNamePortal("volantis");
        portales2Cygni4.setNumeroPortal(4);
        portales2Cygni4.setDescPortal("abajo der 4");
        portales2Cygni4.setIrZona(3);
        portales2Cygni4.setAparecerPortal(3);
        listPortales2Cygni.add(portales2Cygni4);

        zona2Cygni.setListPortales(listPortales2Cygni);
        listZonaCygni.add(zona2Cygni);

        // ZONA 3
        Zona zona3Cygni = new Zona();
        zona3Cygni.setNombreZona("ZONA 3");
        zona3Cygni.setNumeroZona(3);

        List<Portales> listPortales3Cygni = new ArrayList<>();

        Portales portales3Cygni1 = new Portales();
        portales3Cygni1.setNamePortal("maia");
        portales3Cygni1.setNumeroPortal(1);
        portales3Cygni1.setDescPortal("arriba izq 1");
        portales3Cygni1.setIrZona(1);
        portales3Cygni1.setAparecerPortal(1);
        listPortales3Cygni.add(portales3Cygni1);

        Portales portales3Cygni2 = new Portales();
        portales3Cygni2.setNamePortal("atlas b");
        portales3Cygni2.setNumeroPortal(2);
        portales3Cygni2.setDescPortal("arriba der 2");
        portales3Cygni2.setIrZona(3);
        portales3Cygni2.setAparecerPortal(3);
        listPortales3Cygni.add(portales3Cygni2);

        Portales portales3Cygni3 = new Portales();
        portales3Cygni3.setNamePortal("aquila");
        portales3Cygni3.setNumeroPortal(3);
        portales3Cygni3.setDescPortal("abajo izq 3");
        portales3Cygni3.setIrZona(3);
        portales3Cygni3.setAparecerPortal(1);
        listPortales3Cygni.add(portales3Cygni3);

        Portales portales3Cygni4 = new Portales();
        portales3Cygni4.setNamePortal("atlas a");
        portales3Cygni4.setNumeroPortal(4);
        portales3Cygni4.setDescPortal("abajo der 4");
        portales3Cygni4.setIrZona(3);
        portales3Cygni4.setAparecerPortal(3);
        listPortales3Cygni.add(portales3Cygni4);

        zona3Cygni.setListPortales(listPortales3Cygni);
        listZonaCygni.add(zona3Cygni);

        // ZONA 4
        Zona zona4Cygni = new Zona();
        zona4Cygni.setNombreZona("ZONA 4");
        zona4Cygni.setNumeroZona(4);

        List<Portales> listPortales4Cygni = new ArrayList<>();

        Portales portales4Cygni1 = new Portales();
        portales4Cygni1.setNamePortal("eridani");
        portales4Cygni1.setNumeroPortal(1);
        portales4Cygni1.setDescPortal("arriba izq 1");
        portales4Cygni1.setIrZona(4);
        portales4Cygni1.setAparecerPortal(2);
        listPortales4Cygni.add(portales4Cygni1);

        Portales portales4Cygni2 = new Portales();
        portales4Cygni2.setNamePortal("eridani");
        portales4Cygni2.setNumeroPortal(2);
        portales4Cygni2.setDescPortal("arriba der 2");
        portales4Cygni2.setIrZona(3);
        portales4Cygni2.setAparecerPortal(3);
        listPortales4Cygni.add(portales4Cygni2);

        Portales portales4Cygni3 = new Portales();
        portales4Cygni3.setNamePortal("persei");
        portales4Cygni3.setNumeroPortal(3);
        portales4Cygni3.setDescPortal("abajo izq 3");
        portales4Cygni3.setIrZona(4);
        portales4Cygni3.setAparecerPortal(2);
        listPortales4Cygni.add(portales4Cygni3);

        Portales portales4Cygni4 = new Portales();
        portales4Cygni4.setNamePortal("persei");
        portales4Cygni4.setNumeroPortal(4);
        portales4Cygni4.setDescPortal("abajo der 4");
        portales4Cygni4.setIrZona(2);
        portales4Cygni4.setAparecerPortal(1);
        listPortales4Cygni.add(portales4Cygni4);

        zona4Cygni.setListPortales(listPortales4Cygni);
        listZonaCygni.add(zona4Cygni);

        mapaCygni.setListZona(listZonaCygni);

        // Crear el mapa para Eridani
        Mapa mapaEridani = new Mapa();
        mapaEridani.setNombreMapa("ERIDANI");

        List<Zona> listZonaEridani = new ArrayList<>();

        // ZONA 1
        Zona zona1Eridani = new Zona();
        zona1Eridani.setNombreZona("ZONA 1");
        zona1Eridani.setNumeroZona(1);

        List<Portales> listPortales1Eridani = new ArrayList<>();

        Portales portales1Eridani1 = new Portales();
        portales1Eridani1.setNamePortal("auriga");
        portales1Eridani1.setNumeroPortal(1);
        portales1Eridani1.setDescPortal("arriba izq 1");
        portales1Eridani1.setIrZona(4);
        portales1Eridani1.setAparecerPortal(3);
        listPortales1Eridani.add(portales1Eridani1);

        Portales portales1Eridani2 = new Portales();
        portales1Eridani2.setNamePortal("sirius");
        portales1Eridani2.setNumeroPortal(2);
        portales1Eridani2.setDescPortal("arriba der 2");
        portales1Eridani2.setIrZona(2);
        portales1Eridani2.setAparecerPortal(4);
        listPortales1Eridani.add(portales1Eridani2);

        Portales portales1Eridani3 = new Portales();
        portales1Eridani3.setNamePortal("atlas a");
        portales1Eridani3.setNumeroPortal(3);
        portales1Eridani3.setDescPortal("abajo izq 3");
        portales1Eridani3.setIrZona(1);
        portales1Eridani3.setAparecerPortal(1);
        listPortales1Eridani.add(portales1Eridani3);

        Portales portales1Eridani4 = new Portales();
        portales1Eridani4.setNamePortal("atlas a");
        portales1Eridani4.setNumeroPortal(4);
        portales1Eridani4.setDescPortal("abajo der 4");
        portales1Eridani4.setIrZona(3);
        portales1Eridani4.setAparecerPortal(1);
        listPortales1Eridani.add(portales1Eridani4);

        zona1Eridani.setListPortales(listPortales1Eridani);
        listZonaEridani.add(zona1Eridani);

        // ZONA 2
        Zona zona2Eridani = new Zona();
        zona2Eridani.setNombreZona("ZONA 2");
        zona2Eridani.setNumeroZona(2);

        List<Portales> listPortales2Eridani = new ArrayList<>();

        Portales portales2Eridani1 = new Portales();
        portales2Eridani1.setNamePortal("sadatoni");
        portales2Eridani1.setNumeroPortal(1);
        portales2Eridani1.setDescPortal("arriba izq 1");
        portales2Eridani1.setIrZona(2);
        portales2Eridani1.setAparecerPortal(2);
        listPortales2Eridani.add(portales2Eridani1);

        Portales portales2Eridani2 = new Portales();
        portales2Eridani2.setNamePortal("persei");
        portales2Eridani2.setNumeroPortal(2);
        portales2Eridani2.setDescPortal("arriba der 2");
        portales2Eridani2.setIrZona(1);
        portales2Eridani2.setAparecerPortal(2);
        listPortales2Eridani.add(portales2Eridani2);

        Portales portales2Eridani3 = new Portales();
        portales2Eridani3.setNamePortal("atlas c");
        portales2Eridani3.setNumeroPortal(3);
        portales2Eridani3.setDescPortal("abajo izq 3");
        portales2Eridani3.setIrZona(1);
        portales2Eridani3.setAparecerPortal(1);
        listPortales2Eridani.add(portales2Eridani3);

        Portales portales2Eridani4 = new Portales();
        portales2Eridani4.setNamePortal("helvetios");
        portales2Eridani4.setNumeroPortal(4);
        portales2Eridani4.setDescPortal("abajo der 4");
        portales2Eridani4.setIrZona(4);
        portales2Eridani4.setAparecerPortal(3);
        listPortales2Eridani.add(portales2Eridani4);

        zona2Eridani.setListPortales(listPortales2Eridani);
        listZonaEridani.add(zona2Eridani);

        // ZONA 3
        Zona zona3Eridani = new Zona();
        zona3Eridani.setNombreZona("ZONA 3");
        zona3Eridani.setNumeroZona(3);

        List<Portales> listPortales3Eridani = new ArrayList<>();

        Portales portales3Eridani1 = new Portales();
        portales3Eridani1.setNamePortal("aquila");
        portales3Eridani1.setNumeroPortal(1);
        portales3Eridani1.setDescPortal("arriba izq 1");
        portales3Eridani1.setIrZona(4);
        portales3Eridani1.setAparecerPortal(3);
        listPortales3Eridani.add(portales3Eridani1);

        Portales portales3Eridani2 = new Portales();
        portales3Eridani2.setNamePortal("auriga");
        portales3Eridani2.setNumeroPortal(2);
        portales3Eridani2.setDescPortal("arriba der 2");
        portales3Eridani2.setIrZona(2);
        portales3Eridani2.setAparecerPortal(4);
        listPortales3Eridani.add(portales3Eridani2);

        Portales portales3Eridani3 = new Portales();
        portales3Eridani3.setNamePortal("cygni");
        portales3Eridani3.setNumeroPortal(3);
        portales3Eridani3.setDescPortal("abajo izq 3");
        portales3Eridani3.setIrZona(4);
        portales3Eridani3.setAparecerPortal(2);
        listPortales3Eridani.add(portales3Eridani3);

        Portales portales3Eridani4 = new Portales();
        portales3Eridani4.setNamePortal("persei");
        portales3Eridani4.setNumeroPortal(4);
        portales3Eridani4.setDescPortal("abajo der 4");
        portales3Eridani4.setIrZona(4);
        portales3Eridani4.setAparecerPortal(3);
        listPortales3Eridani.add(portales3Eridani4);

        zona3Eridani.setListPortales(listPortales3Eridani);
        listZonaEridani.add(zona3Eridani);

        // ZONA 4
        Zona zona4Eridani = new Zona();
        zona4Eridani.setNombreZona("ZONA 4");
        zona4Eridani.setNumeroZona(4);

        List<Portales> listPortales4Eridani = new ArrayList<>();

        Portales portales4Eridani1 = new Portales();
        portales4Eridani1.setNamePortal("helvetios");
        portales4Eridani1.setNumeroPortal(1);
        portales4Eridani1.setDescPortal("arriba izq 1");
        portales4Eridani1.setIrZona(2);
        portales4Eridani1.setAparecerPortal(3);
        listPortales4Eridani.add(portales4Eridani1);

        Portales portales4Eridani2 = new Portales();
        portales4Eridani2.setNamePortal("cygni");
        portales4Eridani2.setNumeroPortal(2);
        portales4Eridani2.setDescPortal("arriba der 2");
        portales4Eridani2.setIrZona(4);
        portales4Eridani2.setAparecerPortal(1);
        listPortales4Eridani.add(portales4Eridani2);

        Portales portales4Eridani3 = new Portales();
        portales4Eridani3.setNamePortal("auriga");
        portales4Eridani3.setNumeroPortal(3);
        portales4Eridani3.setDescPortal("abajo izq 3");
        portales4Eridani3.setIrZona(3);
        portales4Eridani3.setAparecerPortal(3);
        listPortales4Eridani.add(portales4Eridani3);

        Portales portales4Eridani4 = new Portales();
        portales4Eridani4.setNamePortal("atlas b");
        portales4Eridani4.setNumeroPortal(4);
        portales4Eridani4.setDescPortal("abajo der 4");
        portales4Eridani4.setIrZona(4);
        portales4Eridani4.setAparecerPortal(4);
        listPortales4Eridani.add(portales4Eridani4);

        zona4Eridani.setListPortales(listPortales4Eridani);
        listZonaEridani.add(zona4Eridani);

        mapaEridani.setListZona(listZonaEridani);

        // Crear el mapa para Helvetios
        Mapa mapaHelvetios = new Mapa();
        mapaHelvetios.setNombreMapa("HELVETIOS");

        List<Zona> listZonaHelvetios = new ArrayList<>();

        // ZONA 1
        Zona zona1Helvetios = new Zona();
        zona1Helvetios.setNombreZona("ZONA 1");
        zona1Helvetios.setNumeroZona(1);

        List<Portales> listPortales1Helvetios = new ArrayList<>();

        Portales portales1Helvetios1 = new Portales();
        portales1Helvetios1.setNamePortal("maia");
        portales1Helvetios1.setNumeroPortal(1);
        portales1Helvetios1.setDescPortal("arriba izq 1");
        portales1Helvetios1.setIrZona(2);
        portales1Helvetios1.setAparecerPortal(2);
        listPortales1Helvetios.add(portales1Helvetios1);

        Portales portales1Helvetios2 = new Portales();
        portales1Helvetios2.setNamePortal("atlas a");
        portales1Helvetios2.setNumeroPortal(2);
        portales1Helvetios2.setDescPortal("arriba der 2");
        portales1Helvetios2.setIrZona(2);
        portales1Helvetios2.setAparecerPortal(2);
        listPortales1Helvetios.add(portales1Helvetios2);

        Portales portales1Helvetios3 = new Portales();
        portales1Helvetios3.setNamePortal("persei");
        portales1Helvetios3.setNumeroPortal(3);
        portales1Helvetios3.setDescPortal("abajo izq 3");
        portales1Helvetios3.setIrZona(3);
        portales1Helvetios3.setAparecerPortal(4);
        listPortales1Helvetios.add(portales1Helvetios3);

        Portales portales1Helvetios4 = new Portales();
        portales1Helvetios4.setNamePortal("atlas b");
        portales1Helvetios4.setNumeroPortal(4);
        portales1Helvetios4.setDescPortal("abajo der 4");
        portales1Helvetios4.setIrZona(3);
        portales1Helvetios4.setAparecerPortal(1);
        listPortales1Helvetios.add(portales1Helvetios4);

        zona1Helvetios.setListPortales(listPortales1Helvetios);
        listZonaHelvetios.add(zona1Helvetios);

        // ZONA 2
        Zona zona2Helvetios = new Zona();
        zona2Helvetios.setNombreZona("ZONA 2");
        zona2Helvetios.setNumeroZona(2);

        List<Portales> listPortales2Helvetios = new ArrayList<>();

        Portales portales2Helvetios1 = new Portales();
        portales2Helvetios1.setNamePortal("helvetios");
        portales2Helvetios1.setNumeroPortal(1);
        portales2Helvetios1.setDescPortal("arriba izq 1");
        portales2Helvetios1.setIrZona(3);
        portales2Helvetios1.setAparecerPortal(3);
        listPortales2Helvetios.add(portales2Helvetios1);

        Portales portales2Helvetios2 = new Portales();
        portales2Helvetios2.setNamePortal("atlas a");
        portales2Helvetios2.setNumeroPortal(2);
        portales2Helvetios2.setDescPortal("arriba der 2");
        portales2Helvetios2.setIrZona(2);
        portales2Helvetios2.setAparecerPortal(1);
        listPortales2Helvetios.add(portales2Helvetios2);

        Portales portales2Helvetios3 = new Portales();
        portales2Helvetios3.setNamePortal("eridani");
        portales2Helvetios3.setNumeroPortal(3);
        portales2Helvetios3.setDescPortal("abajo izq 3");
        portales2Helvetios3.setIrZona(4);
        portales2Helvetios3.setAparecerPortal(1);
        listPortales2Helvetios.add(portales2Helvetios3);

        Portales portales2Helvetios4 = new Portales();
        portales2Helvetios4.setNamePortal("sadatoni");
        portales2Helvetios4.setNumeroPortal(4);
        portales2Helvetios4.setDescPortal("abajo der 4");
        portales2Helvetios4.setIrZona(2);
        portales2Helvetios4.setAparecerPortal(3);
        listPortales2Helvetios.add(portales2Helvetios4);

        zona2Helvetios.setListPortales(listPortales2Helvetios);
        listZonaHelvetios.add(zona2Helvetios);

        // ZONA 3
        Zona zona3Helvetios = new Zona();
        zona3Helvetios.setNombreZona("ZONA 3");
        zona3Helvetios.setNumeroZona(3);

        List<Portales> listPortales3Helvetios = new ArrayList<>();

        Portales portales3Helvetios1 = new Portales();
        portales3Helvetios1.setNamePortal("maia");
        portales3Helvetios1.setNumeroPortal(1);
        portales3Helvetios1.setDescPortal("arriba izq 1");
        portales3Helvetios1.setIrZona(3);
        portales3Helvetios1.setAparecerPortal(4);
        listPortales3Helvetios.add(portales3Helvetios1);

        Portales portales3Helvetios2 = new Portales();
        portales3Helvetios2.setNamePortal("persei");
        portales3Helvetios2.setNumeroPortal(2);
        portales3Helvetios2.setDescPortal("arriba der 2");
        portales3Helvetios2.setIrZona(1);
        portales3Helvetios2.setAparecerPortal(4);
        listPortales3Helvetios.add(portales3Helvetios2);

        Portales portales3Helvetios3 = new Portales();
        portales3Helvetios3.setNamePortal("helvetios");
        portales3Helvetios3.setNumeroPortal(3);
        portales3Helvetios3.setDescPortal("abajo izq 3");
        portales3Helvetios3.setIrZona(2);
        portales3Helvetios3.setAparecerPortal(1);
        listPortales3Helvetios.add(portales3Helvetios3);

        Portales portales3Helvetios4 = new Portales();
        portales3Helvetios4.setNamePortal("persei");
        portales3Helvetios4.setNumeroPortal(4);
        portales3Helvetios4.setDescPortal("abajo der 4");
        portales3Helvetios4.setIrZona(2);
        portales3Helvetios4.setAparecerPortal(3);
        listPortales3Helvetios.add(portales3Helvetios4);

        zona3Helvetios.setListPortales(listPortales3Helvetios);
        listZonaHelvetios.add(zona3Helvetios);

        // ZONA 4
        Zona zona4Helvetios = new Zona();
        zona4Helvetios.setNombreZona("ZONA 4");
        zona4Helvetios.setNumeroZona(4);

        List<Portales> listPortales4Helvetios = new ArrayList<>();

        Portales portales4Helvetios1 = new Portales();
        portales4Helvetios1.setNamePortal("sirius");
        portales4Helvetios1.setNumeroPortal(1);
        portales4Helvetios1.setDescPortal("arriba izq 1");
        portales4Helvetios1.setIrZona(2);
        portales4Helvetios1.setAparecerPortal(1);
        listPortales4Helvetios.add(portales4Helvetios1);

        Portales portales4Helvetios2 = new Portales();
        portales4Helvetios2.setNamePortal("atlas b");
        portales4Helvetios2.setNumeroPortal(2);
        portales4Helvetios2.setDescPortal("arriba der 2");
        portales4Helvetios2.setIrZona(4);
        portales4Helvetios2.setAparecerPortal(1);
        listPortales4Helvetios.add(portales4Helvetios2);

        Portales portales4Helvetios3 = new Portales();
        portales4Helvetios3.setNamePortal("eridani");
        portales4Helvetios3.setNumeroPortal(3);
        portales4Helvetios3.setDescPortal("abajo izq 3");
        portales4Helvetios3.setIrZona(2);
        portales4Helvetios3.setAparecerPortal(4);
        listPortales4Helvetios.add(portales4Helvetios3);

        Portales portales4Helvetios4 = new Portales();
        portales4Helvetios4.setNamePortal("alcyone");
        portales4Helvetios4.setNumeroPortal(4);
        portales4Helvetios4.setDescPortal("abajo der 4");
        portales4Helvetios4.setIrZona(4);
        portales4Helvetios4.setAparecerPortal(1);
        listPortales4Helvetios.add(portales4Helvetios4);

        zona4Helvetios.setListPortales(listPortales4Helvetios);
        listZonaHelvetios.add(zona4Helvetios);

        mapaHelvetios.setListZona(listZonaHelvetios);

        // Crear el mapa para Maia
        Mapa mapaMaia = new Mapa();
        mapaMaia.setNombreMapa("MAIA");

        List<Zona> listZonaMaia = new ArrayList<>();

        // ZONA 1
        Zona zona1Maia = new Zona();
        zona1Maia.setNombreZona("ZONA 1");
        zona1Maia.setNumeroZona(1);

        List<Portales> listPortales1Maia = new ArrayList<>();

        Portales portales1Maia1 = new Portales();
        portales1Maia1.setNamePortal("cygni");
        portales1Maia1.setNumeroPortal(1);
        portales1Maia1.setDescPortal("arriba izq 1");
        portales1Maia1.setIrZona(3);
        portales1Maia1.setAparecerPortal(1);
        listPortales1Maia.add(portales1Maia1);

        Portales portales1Maia2 = new Portales();
        portales1Maia2.setNamePortal("atlas b");
        portales1Maia2.setNumeroPortal(2);
        portales1Maia2.setDescPortal("arriba der 2");
        portales1Maia2.setIrZona(1);
        portales1Maia2.setAparecerPortal(1);
        listPortales1Maia.add(portales1Maia2);

        Portales portales1Maia3 = new Portales();
        portales1Maia3.setNamePortal("atlas b");
        portales1Maia3.setNumeroPortal(3);
        portales1Maia3.setDescPortal("abajo izq 3");
        portales1Maia3.setIrZona(1);
        portales1Maia3.setAparecerPortal(2);
        listPortales1Maia.add(portales1Maia3);

        Portales portales1Maia4 = new Portales();
        portales1Maia4.setNamePortal("volantis");
        portales1Maia4.setNumeroPortal(4);
        portales1Maia4.setDescPortal("abajo der 4");
        portales1Maia4.setIrZona(1);
        portales1Maia4.setAparecerPortal(1);
        listPortales1Maia.add(portales1Maia4);

        zona1Maia.setListPortales(listPortales1Maia);
        listZonaMaia.add(zona1Maia);

        // ZONA 2
        Zona zona2Maia = new Zona();
        zona2Maia.setNombreZona("ZONA 2");
        zona2Maia.setNumeroZona(2);

        List<Portales> listPortales2Maia = new ArrayList<>();

        Portales portales2Maia1 = new Portales();
        portales2Maia1.setNamePortal("alcyone");
        portales2Maia1.setNumeroPortal(1);
        portales2Maia1.setDescPortal("arriba izq 1");
        portales2Maia1.setIrZona(1);
        portales2Maia1.setAparecerPortal(3);
        listPortales2Maia.add(portales2Maia1);

        Portales portales2Maia2 = new Portales();
        portales2Maia2.setNamePortal("helvetios");
        portales2Maia2.setNumeroPortal(2);
        portales2Maia2.setDescPortal("arriba der 2");
        portales2Maia2.setIrZona(1);
        portales2Maia2.setAparecerPortal(1);
        listPortales2Maia.add(portales2Maia2);

        Portales portales2Maia3 = new Portales();
        portales2Maia3.setNamePortal("atlas a");
        portales2Maia3.setNumeroPortal(3);
        portales2Maia3.setDescPortal("abajo izq 3");
        portales2Maia3.setIrZona(4);
        portales2Maia3.setAparecerPortal(1);
        listPortales2Maia.add(portales2Maia3);

        Portales portales2Maia4 = new Portales();
        portales2Maia4.setNamePortal("atlas c");
        portales2Maia4.setNumeroPortal(4);
        portales2Maia4.setDescPortal("abajo der 4");
        portales2Maia4.setIrZona(2);
        portales2Maia4.setAparecerPortal(3);
        listPortales2Maia.add(portales2Maia4);

        zona2Maia.setListPortales(listPortales2Maia);
        listZonaMaia.add(zona2Maia);

        // ZONA 3
        Zona zona3Maia = new Zona();
        zona3Maia.setNombreZona("ZONA 3");
        zona3Maia.setNumeroZona(3);

        List<Portales> listPortales3Maia = new ArrayList<>();

        Portales portales3Maia1 = new Portales();
        portales3Maia1.setNamePortal("atlas b");
        portales3Maia1.setNumeroPortal(1);
        portales3Maia1.setDescPortal("arriba izq 1");
        portales3Maia1.setIrZona(4);
        portales3Maia1.setAparecerPortal(2);
        listPortales3Maia.add(portales3Maia1);

        Portales portales3Maia2 = new Portales();
        portales3Maia2.setNamePortal("maia");
        portales3Maia2.setNumeroPortal(2);
        portales3Maia2.setDescPortal("arriba der 2");
        portales3Maia2.setIrZona(4);
        portales3Maia2.setAparecerPortal(2);
        listPortales3Maia.add(portales3Maia2);

        Portales portales3Maia3 = new Portales();
        portales3Maia3.setNamePortal("sirius");
        portales3Maia3.setNumeroPortal(3);
        portales3Maia3.setDescPortal("abajo izq 3");
        portales3Maia3.setIrZona(1);
        portales3Maia3.setAparecerPortal(2);
        listPortales3Maia.add(portales3Maia3);

        Portales portales3Maia4 = new Portales();
        portales3Maia4.setNamePortal("helvetios");
        portales3Maia4.setNumeroPortal(4);
        portales3Maia4.setDescPortal("abajo der 4");
        portales3Maia4.setIrZona(3);
        portales3Maia4.setAparecerPortal(1);
        listPortales3Maia.add(portales3Maia4);

        zona3Maia.setListPortales(listPortales3Maia);
        listZonaMaia.add(zona3Maia);

        // ZONA 4
        Zona zona4Maia = new Zona();
        zona4Maia.setNombreZona("ZONA 4");
        zona4Maia.setNumeroZona(4);

        List<Portales> listPortales4Maia = new ArrayList<>();

        Portales portales4Maia1 = new Portales();
        portales4Maia1.setNamePortal("orion");
        portales4Maia1.setNumeroPortal(1);
        portales4Maia1.setDescPortal("arriba izq 1");
        portales4Maia1.setIrZona(3);
        portales4Maia1.setAparecerPortal(3);
        listPortales4Maia.add(portales4Maia1);

        Portales portales4Maia2 = new Portales();
        portales4Maia2.setNamePortal("maia");
        portales4Maia2.setNumeroPortal(2);
        portales4Maia2.setDescPortal("arriba der 2");
        portales4Maia2.setIrZona(3);
        portales4Maia2.setAparecerPortal(2);
        listPortales4Maia.add(portales4Maia2);

        Portales portales4Maia3 = new Portales();
        portales4Maia3.setNamePortal("aquila");
        portales4Maia3.setNumeroPortal(3);
        portales4Maia3.setDescPortal("abajo izq 3");
        portales4Maia3.setIrZona(1);
        portales4Maia3.setAparecerPortal(2);
        listPortales4Maia.add(portales4Maia3);

        Portales portales4Maia4 = new Portales();
        portales4Maia4.setNamePortal("bootes");
        portales4Maia4.setNumeroPortal(4);
        portales4Maia4.setDescPortal("abajo der 4");
        portales4Maia4.setIrZona(2);
        portales4Maia4.setAparecerPortal(4);
        listPortales4Maia.add(portales4Maia4);

        zona4Maia.setListPortales(listPortales4Maia);
        listZonaMaia.add(zona4Maia);

        mapaMaia.setListZona(listZonaMaia);

        // --------------------------------------------------------------------------------------------------------------------------

        // Crear el mapa para Orion
        Mapa mapaOrion = new Mapa();
        mapaOrion.setNombreMapa("ORION");

        List<Zona> listZonaOrion = new ArrayList<>();

        // ZONA 1
        Zona zona1Orion = new Zona();
        zona1Orion.setNombreZona("ZONA 1");
        zona1Orion.setNumeroZona(1);

        List<Portales> listPortales1Orion = new ArrayList<>();

        Portales portales1Orion1 = new Portales();
        portales1Orion1.setNamePortal("atlas b");
        portales1Orion1.setNumeroPortal(1);
        portales1Orion1.setDescPortal("izq arriba 1");
        portales1Orion1.setIrZona(3);
        portales1Orion1.setAparecerPortal(2);
        listPortales1Orion.add(portales1Orion1);

        Portales portales1Orion2 = new Portales();
        portales1Orion2.setNamePortal("atlas b");
        portales1Orion2.setNumeroPortal(2);
        portales1Orion2.setDescPortal("der arriba 2");
        portales1Orion2.setIrZona(2);
        portales1Orion2.setAparecerPortal(2);
        listPortales1Orion.add(portales1Orion2);

        Portales portales1Orion3 = new Portales();
        portales1Orion3.setNamePortal("atlas c");
        portales1Orion3.setNumeroPortal(3);
        portales1Orion3.setDescPortal("izq abajo 3");
        portales1Orion3.setIrZona(2);
        portales1Orion3.setAparecerPortal(4);
        listPortales1Orion.add(portales1Orion3);

        Portales portales1Orion4 = new Portales();
        portales1Orion4.setNamePortal("volantis");
        portales1Orion4.setNumeroPortal(4);
        portales1Orion4.setDescPortal("der abajo 4");
        portales1Orion4.setIrZona(2);
        portales1Orion4.setAparecerPortal(4);
        listPortales1Orion.add(portales1Orion4);

        zona1Orion.setListPortales(listPortales1Orion);
        listZonaOrion.add(zona1Orion);

        // ZONA 2
        Zona zona2Orion = new Zona();
        zona2Orion.setNombreZona("ZONA 2");
        zona2Orion.setNumeroZona(2);

        List<Portales> listPortales2Orion = new ArrayList<>();

        Portales portales2Orion1 = new Portales();
        portales2Orion1.setNamePortal("sadatoni");
        portales2Orion1.setNumeroPortal(1);
        portales2Orion1.setDescPortal("arriba izq 1");
        portales2Orion1.setIrZona(1);
        portales2Orion1.setAparecerPortal(4);
        listPortales2Orion.add(portales2Orion1);

        Portales portales2Orion2 = new Portales();
        portales2Orion2.setNamePortal("volantis");
        portales2Orion2.setNumeroPortal(2);
        portales2Orion2.setDescPortal("arriba der 2");
        portales2Orion2.setIrZona(2);
        portales2Orion2.setAparecerPortal(2);
        listPortales2Orion.add(portales2Orion2);

        Portales portales2Orion3 = new Portales();
        portales2Orion3.setNamePortal("cygni");
        portales2Orion3.setNumeroPortal(3);
        portales2Orion3.setDescPortal("abajo izq 3");
        portales2Orion3.setIrZona(2);
        portales2Orion3.setAparecerPortal(3);
        listPortales2Orion.add(portales2Orion3);

        Portales portales2Orion4 = new Portales();
        portales2Orion4.setNamePortal("atlas c");
        portales2Orion4.setNumeroPortal(4);
        portales2Orion4.setDescPortal("abajo der 4");
        portales2Orion4.setIrZona(4);
        portales2Orion4.setAparecerPortal(4);
        listPortales2Orion.add(portales2Orion4);

        zona2Orion.setListPortales(listPortales2Orion);
        listZonaOrion.add(zona2Orion);

        // ZONA 3
        Zona zona3Orion = new Zona();
        zona3Orion.setNombreZona("ZONA 3");
        zona3Orion.setNumeroZona(3);

        List<Portales> listPortales3Orion = new ArrayList<>();

        Portales portales3Orion1 = new Portales();
        portales3Orion1.setNamePortal("atlas b");
        portales3Orion1.setNumeroPortal(1);
        portales3Orion1.setDescPortal("arriba izq 1");
        portales3Orion1.setIrZona(2);
        portales3Orion1.setAparecerPortal(3);
        listPortales3Orion.add(portales3Orion1);

        Portales portales3Orion2 = new Portales();
        portales3Orion2.setNamePortal("persei");
        portales3Orion2.setNumeroPortal(2);
        portales3Orion2.setDescPortal("arriba der 2");
        portales3Orion2.setIrZona(1);
        portales3Orion2.setAparecerPortal(1);
        listPortales3Orion.add(portales3Orion2);

        Portales portales3Orion3 = new Portales();
        portales3Orion3.setNamePortal("maia");
        portales3Orion3.setNumeroPortal(3);
        portales3Orion3.setDescPortal("abajo izq 3");
        portales3Orion3.setIrZona(4);
        portales3Orion3.setAparecerPortal(1);
        listPortales3Orion.add(portales3Orion3);

        Portales portales3Orion4 = new Portales();
        portales3Orion4.setNamePortal("alcyone");
        portales3Orion4.setNumeroPortal(4);
        portales3Orion4.setDescPortal("abajo der 4");
        portales3Orion4.setIrZona(1);
        portales3Orion4.setAparecerPortal(2);
        listPortales3Orion.add(portales3Orion4);

        zona3Orion.setListPortales(listPortales3Orion);
        listZonaOrion.add(zona3Orion);

        // ZONA 4
        Zona zona4Orion = new Zona();
        zona4Orion.setNombreZona("ZONA 4");
        zona4Orion.setNumeroZona(4);

        List<Portales> listPortales4Orion = new ArrayList<>();

        Portales portales4Orion1 = new Portales();
        portales4Orion1.setNamePortal("bootes");
        portales4Orion1.setNumeroPortal(1);
        portales4Orion1.setDescPortal("arriba izq 1");
        portales4Orion1.setIrZona(3);
        portales4Orion1.setAparecerPortal(2);
        listPortales4Orion.add(portales4Orion1);

        Portales portales4Orion2 = new Portales();
        portales4Orion2.setNamePortal("cygni");
        portales4Orion2.setNumeroPortal(2);
        portales4Orion2.setDescPortal("arriba der 2");
        portales4Orion2.setIrZona(1);
        portales4Orion2.setAparecerPortal(1);
        listPortales4Orion.add(portales4Orion2);

        Portales portales4Orion3 = new Portales();
        portales4Orion3.setNamePortal("atlas c");
        portales4Orion3.setNumeroPortal(3);
        portales4Orion3.setDescPortal("abajo izq 3");
        portales4Orion3.setIrZona(1);
        portales4Orion3.setAparecerPortal(1);
        listPortales4Orion.add(portales4Orion3);

        Portales portales4Orion4 = new Portales();
        portales4Orion4.setNamePortal("atlas c");
        portales4Orion4.setNumeroPortal(4);
        portales4Orion4.setDescPortal("abajo der 4");
        portales4Orion4.setIrZona(2);
        portales4Orion4.setAparecerPortal(2);
        listPortales4Orion.add(portales4Orion4);

        zona4Orion.setListPortales(listPortales4Orion);
        listZonaOrion.add(zona4Orion);

        mapaOrion.setListZona(listZonaOrion);

        // --------------------------------------------------------------------------------------------------------------------------

        // --------------------------------------------------------------------------------------------------------------------------

        // Crear el mapa para Persei
        Mapa mapaPersei = new Mapa();
        mapaPersei.setNombreMapa("PERSEI");

        List<Zona> listZonaPersei = new ArrayList<>();

        // ZONA 1
        Zona zona1Persei = new Zona();
        zona1Persei.setNombreZona("ZONA 1");
        zona1Persei.setNumeroZona(1);

        List<Portales> listPortales1Persei = new ArrayList<>();

        Portales portales1Persei1 = new Portales();
        portales1Persei1.setNamePortal("orion");
        portales1Persei1.setNumeroPortal(1);
        portales1Persei1.setDescPortal("izq arriba 1");
        portales1Persei1.setIrZona(3);
        portales1Persei1.setAparecerPortal(2);
        listPortales1Persei.add(portales1Persei1);

        Portales portales1Persei2 = new Portales();
        portales1Persei2.setNamePortal("eridani");
        portales1Persei2.setNumeroPortal(2);
        portales1Persei2.setDescPortal("der arriba 2");
        portales1Persei2.setIrZona(2);
        portales1Persei2.setAparecerPortal(2);
        listPortales1Persei.add(portales1Persei2);

        Portales portales1Persei3 = new Portales();
        portales1Persei3.setNamePortal("auriga");
        portales1Persei3.setNumeroPortal(3);
        portales1Persei3.setDescPortal("izq abajo 3");
        portales1Persei3.setIrZona(3);
        portales1Persei3.setAparecerPortal(2);
        listPortales1Persei.add(portales1Persei3);

        Portales portales1Persei4 = new Portales();
        portales1Persei4.setNamePortal("helvetios");
        portales1Persei4.setNumeroPortal(4);
        portales1Persei4.setDescPortal("der abajo 4");
        portales1Persei4.setIrZona(3);
        portales1Persei4.setAparecerPortal(2);
        listPortales1Persei.add(portales1Persei4);

        zona1Persei.setListPortales(listPortales1Persei);
        listZonaPersei.add(zona1Persei);

        // ZONA 2
        Zona zona2Persei = new Zona();
        zona2Persei.setNombreZona("ZONA 2");
        zona2Persei.setNumeroZona(2);

        List<Portales> listPortales2Persei = new ArrayList<>();

        Portales portales2Persei1 = new Portales();
        portales2Persei1.setNamePortal("cygni");
        portales2Persei1.setNumeroPortal(1);
        portales2Persei1.setDescPortal("arriba izq 1");
        portales2Persei1.setIrZona(4);
        portales2Persei1.setAparecerPortal(4);
        listPortales2Persei.add(portales2Persei1);

        Portales portales2Persei2 = new Portales();
        portales2Persei2.setNamePortal("auriga");
        portales2Persei2.setNumeroPortal(2);
        portales2Persei2.setDescPortal("arriba der 2");
        portales2Persei2.setIrZona(1);
        portales2Persei2.setAparecerPortal(3);
        listPortales2Persei.add(portales2Persei2);

        Portales portales2Persei3 = new Portales();
        portales2Persei3.setNamePortal("helvetios");
        portales2Persei3.setNumeroPortal(3);
        portales2Persei3.setDescPortal("abajo izq 3");
        portales2Persei3.setIrZona(3);
        portales2Persei3.setAparecerPortal(4);
        listPortales2Persei.add(portales2Persei3);

        Portales portales2Persei4 = new Portales();
        portales2Persei4.setNamePortal("bootes");
        portales2Persei4.setNumeroPortal(4);
        portales2Persei4.setDescPortal("abajo der 4");
        portales2Persei4.setIrZona(4);
        portales2Persei4.setAparecerPortal(3);
        listPortales2Persei.add(portales2Persei4);

        zona2Persei.setListPortales(listPortales2Persei);
        listZonaPersei.add(zona2Persei);

        // ZONA 3
        Zona zona3Persei = new Zona();
        zona3Persei.setNombreZona("ZONA 3");
        zona3Persei.setNumeroZona(3);

        List<Portales> listPortales3Persei = new ArrayList<>();

        Portales portales3Persei1 = new Portales();
        portales3Persei1.setNamePortal("volantis");
        portales3Persei1.setNumeroPortal(1);
        portales3Persei1.setDescPortal("arriba izq 1");
        portales3Persei1.setIrZona(2);
        portales3Persei1.setAparecerPortal(1);
        listPortales3Persei.add(portales3Persei1);

        Portales portales3Persei2 = new Portales();
        portales3Persei2.setNamePortal("atlas c");
        portales3Persei2.setNumeroPortal(2);
        portales3Persei2.setDescPortal("arriba der 2");
        portales3Persei2.setIrZona(3);
        portales3Persei2.setAparecerPortal(3);
        listPortales3Persei.add(portales3Persei2);

        Portales portales3Persei3 = new Portales();
        portales3Persei3.setNamePortal("sadatoni");
        portales3Persei3.setNumeroPortal(3);
        portales3Persei3.setDescPortal("abajo izq 3");
        portales3Persei3.setIrZona(4);
        portales3Persei3.setAparecerPortal(4);
        listPortales3Persei.add(portales3Persei3);

        Portales portales3Persei4 = new Portales();
        portales3Persei4.setNamePortal("helvetios");
        portales3Persei4.setNumeroPortal(4);
        portales3Persei4.setDescPortal("abajo der 4");
        portales3Persei4.setIrZona(1);
        portales3Persei4.setAparecerPortal(3);
        listPortales3Persei.add(portales3Persei4);

        zona3Persei.setListPortales(listPortales3Persei);
        listZonaPersei.add(zona3Persei);

        // ZONA 4
        Zona zona4Persei = new Zona();
        zona4Persei.setNombreZona("ZONA 4");
        zona4Persei.setNumeroZona(4);

        List<Portales> listPortales4Persei = new ArrayList<>();

        Portales portales4Persei1 = new Portales();
        portales4Persei1.setNamePortal("atlas c");
        portales4Persei1.setNumeroPortal(1);
        portales4Persei1.setDescPortal("arriba izq 1");
        portales4Persei1.setIrZona(1);
        portales4Persei1.setAparecerPortal(4);
        listPortales4Persei.add(portales4Persei1);

        Portales portales4Persei2 = new Portales();
        portales4Persei2.setNamePortal("cygni");
        portales4Persei2.setNumeroPortal(2);
        portales4Persei2.setDescPortal("arriba der 2");
        portales4Persei2.setIrZona(4);
        portales4Persei2.setAparecerPortal(3);
        listPortales4Persei.add(portales4Persei2);

        Portales portales4Persei3 = new Portales();
        portales4Persei3.setNamePortal("eridani");
        portales4Persei3.setNumeroPortal(3);
        portales4Persei3.setDescPortal("abajo izq 3");
        portales4Persei3.setIrZona(3);
        portales4Persei3.setAparecerPortal(4);
        listPortales4Persei.add(portales4Persei3);

        Portales portales4Persei4 = new Portales();
        portales4Persei4.setNamePortal("atlas b");
        portales4Persei4.setNumeroPortal(4);
        portales4Persei4.setDescPortal("abajo der 4");
        portales4Persei4.setIrZona(2);
        portales4Persei4.setAparecerPortal(1);
        listPortales4Persei.add(portales4Persei4);

        zona4Persei.setListPortales(listPortales4Persei);
        listZonaPersei.add(zona4Persei);

        mapaPersei.setListZona(listZonaPersei);

        // --------------------------------------------------------------------------------------------------------------------------

        // --------------------------------------------------------------------------------------------------------------------------

        // Crear el mapa para Sadatoni
        Mapa mapaSadatoni = new Mapa();
        mapaSadatoni.setNombreMapa("SADATONI");

        List<Zona> listZonaSadatoni = new ArrayList<>();

        // ZONA 1
        Zona zona1Sadatoni = new Zona();
        zona1Sadatoni.setNombreZona("ZONA 1");
        zona1Sadatoni.setNumeroZona(1);

        List<Portales> listPortales1Sadatoni = new ArrayList<>();

        Portales portales1Sadatoni1 = new Portales();
        portales1Sadatoni1.setNamePortal("sirius");
        portales1Sadatoni1.setNumeroPortal(1);
        portales1Sadatoni1.setDescPortal("izq arriba 1");
        portales1Sadatoni1.setIrZona(3);
        portales1Sadatoni1.setAparecerPortal(3);
        listPortales1Sadatoni.add(portales1Sadatoni1);

        Portales portales1Sadatoni2 = new Portales();
        portales1Sadatoni2.setNamePortal("atlas c");
        portales1Sadatoni2.setNumeroPortal(2);
        portales1Sadatoni2.setDescPortal("der arriba 2");
        portales1Sadatoni2.setIrZona(4);
        portales1Sadatoni2.setAparecerPortal(2);
        listPortales1Sadatoni.add(portales1Sadatoni2);

        Portales portales1Sadatoni3 = new Portales();
        portales1Sadatoni3.setNamePortal("alcyone");
        portales1Sadatoni3.setNumeroPortal(3);
        portales1Sadatoni3.setDescPortal("izq abajo 3");
        portales1Sadatoni3.setIrZona(4);
        portales1Sadatoni3.setAparecerPortal(3);
        listPortales1Sadatoni.add(portales1Sadatoni3);

        Portales portales1Sadatoni4 = new Portales();
        portales1Sadatoni4.setNamePortal("orion");
        portales1Sadatoni4.setNumeroPortal(4);
        portales1Sadatoni4.setDescPortal("der abajo 4");
        portales1Sadatoni4.setIrZona(2);
        portales1Sadatoni4.setAparecerPortal(1);
        listPortales1Sadatoni.add(portales1Sadatoni4);

        zona1Sadatoni.setListPortales(listPortales1Sadatoni);
        listZonaSadatoni.add(zona1Sadatoni);

        // ZONA 2
        Zona zona2Sadatoni = new Zona();
        zona2Sadatoni.setNombreZona("ZONA 2");
        zona2Sadatoni.setNumeroZona(2);

        List<Portales> listPortales2Sadatoni = new ArrayList<>();

        Portales portales2Sadatoni1 = new Portales();
        portales2Sadatoni1.setNamePortal("atlas c");
        portales2Sadatoni1.setNumeroPortal(1);
        portales2Sadatoni1.setDescPortal("arriba izq 1");
        portales2Sadatoni1.setIrZona(2);
        portales2Sadatoni1.setAparecerPortal(2);
        listPortales2Sadatoni.add(portales2Sadatoni1);

        Portales portales2Sadatoni2 = new Portales();
        portales2Sadatoni2.setNamePortal("eridani");
        portales2Sadatoni2.setNumeroPortal(2);
        portales2Sadatoni2.setDescPortal("arriba der 2");
        portales2Sadatoni2.setIrZona(2);
        portales2Sadatoni2.setAparecerPortal(1);
        listPortales2Sadatoni.add(portales2Sadatoni2);

        Portales portales2Sadatoni3 = new Portales();
        portales2Sadatoni3.setNamePortal("helvetios");
        portales2Sadatoni3.setNumeroPortal(3);
        portales2Sadatoni3.setDescPortal("abajo izq 3");
        portales2Sadatoni3.setIrZona(2);
        portales2Sadatoni3.setAparecerPortal(4);
        listPortales2Sadatoni.add(portales2Sadatoni3);

        Portales portales2Sadatoni4 = new Portales();
        portales2Sadatoni4.setNamePortal("auriga");
        portales2Sadatoni4.setNumeroPortal(4);
        portales2Sadatoni4.setDescPortal("abajo der 4");
        portales2Sadatoni4.setIrZona(2);
        portales2Sadatoni4.setAparecerPortal(3);
        listPortales2Sadatoni.add(portales2Sadatoni4);

        zona2Sadatoni.setListPortales(listPortales2Sadatoni);
        listZonaSadatoni.add(zona2Sadatoni);

        // ZONA 3
        Zona zona3Sadatoni = new Zona();
        zona3Sadatoni.setNombreZona("ZONA 3");
        zona3Sadatoni.setNumeroZona(3);

        List<Portales> listPortales3Sadatoni = new ArrayList<>();

        Portales portales3Sadatoni1 = new Portales();
        portales3Sadatoni1.setNamePortal("sirius");
        portales3Sadatoni1.setNumeroPortal(1);
        portales3Sadatoni1.setDescPortal("arriba izq 1");
        portales3Sadatoni1.setIrZona(1);
        portales3Sadatoni1.setAparecerPortal(1);
        listPortales3Sadatoni.add(portales3Sadatoni1);

        Portales portales3Sadatoni2 = new Portales();
        portales3Sadatoni2.setNamePortal("cygni");
        portales3Sadatoni2.setNumeroPortal(2);
        portales3Sadatoni2.setDescPortal("arriba der 2");
        portales3Sadatoni2.setIrZona(2);
        portales3Sadatoni2.setAparecerPortal(1);
        listPortales3Sadatoni.add(portales3Sadatoni2);

        Portales portales3Sadatoni3 = new Portales();
        portales3Sadatoni3.setNamePortal("atlas b");
        portales3Sadatoni3.setNumeroPortal(3);
        portales3Sadatoni3.setDescPortal("abajo izq 3");
        portales3Sadatoni3.setIrZona(4);
        portales3Sadatoni3.setAparecerPortal(3);
        listPortales3Sadatoni.add(portales3Sadatoni3);

        Portales portales3Sadatoni4 = new Portales();
        portales3Sadatoni4.setNamePortal("aquila");
        portales3Sadatoni4.setNumeroPortal(4);
        portales3Sadatoni4.setDescPortal("abajo der 4");
        portales3Sadatoni4.setIrZona(2);
        portales3Sadatoni4.setAparecerPortal(2);
        listPortales3Sadatoni.add(portales3Sadatoni4);

        zona3Sadatoni.setListPortales(listPortales3Sadatoni);
        listZonaSadatoni.add(zona3Sadatoni);

        // ZONA 4
        Zona zona4Sadatoni = new Zona();
        zona4Sadatoni.setNombreZona("ZONA 4");
        zona4Sadatoni.setNumeroZona(4);

        List<Portales> listPortales4Sadatoni = new ArrayList<>();

        Portales portales4Sadatoni1 = new Portales();
        portales4Sadatoni1.setNamePortal("volantis");
        portales4Sadatoni1.setNumeroPortal(1);
        portales4Sadatoni1.setDescPortal("arriba izq 1");
        portales4Sadatoni1.setIrZona(4);
        portales4Sadatoni1.setAparecerPortal(4);
        listPortales4Sadatoni.add(portales4Sadatoni1);

        Portales portales4Sadatoni2 = new Portales();
        portales4Sadatoni2.setNamePortal("sirius");
        portales4Sadatoni2.setNumeroPortal(2);
        portales4Sadatoni2.setDescPortal("arriba der 2");
        portales4Sadatoni2.setIrZona(4);
        portales4Sadatoni2.setAparecerPortal(2);
        listPortales4Sadatoni.add(portales4Sadatoni2);

        Portales portales4Sadatoni3 = new Portales();
        portales4Sadatoni3.setNamePortal("atlas c");
        portales4Sadatoni3.setNumeroPortal(3);
        portales4Sadatoni3.setDescPortal("abajo izq 3");
        portales4Sadatoni3.setIrZona(3);
        portales4Sadatoni3.setAparecerPortal(1);
        listPortales4Sadatoni.add(portales4Sadatoni3);

        Portales portales4Sadatoni4 = new Portales();
        portales4Sadatoni4.setNamePortal("persei");
        portales4Sadatoni4.setNumeroPortal(4);
        portales4Sadatoni4.setDescPortal("abajo der 4");
        portales4Sadatoni4.setIrZona(3);
        portales4Sadatoni4.setAparecerPortal(3);
        listPortales4Sadatoni.add(portales4Sadatoni4);

        zona4Sadatoni.setListPortales(listPortales4Sadatoni);
        listZonaSadatoni.add(zona4Sadatoni);

        mapaSadatoni.setListZona(listZonaSadatoni);

        // --------------------------------------------------------------------------------------------------------------------------

        // Crear el mapa para Sirius
        Mapa mapaSirius = new Mapa();
        mapaSirius.setNombreMapa("SIRIUS");

        List<Zona> listZonaSirius = new ArrayList<>();

        // ZONA 1
        Zona zona1Sirius = new Zona();
        zona1Sirius.setNombreZona("ZONA 1");
        zona1Sirius.setNumeroZona(1);

        List<Portales> listPortales1Sirius = new ArrayList<>();

        Portales portales1Sirius1 = new Portales();
        portales1Sirius1.setNamePortal("sadatoni");
        portales1Sirius1.setNumeroPortal(1);
        portales1Sirius1.setDescPortal("izq arriba 1");
        portales1Sirius1.setIrZona(3);
        portales1Sirius1.setAparecerPortal(1);
        listPortales1Sirius.add(portales1Sirius1);

        Portales portales1Sirius2 = new Portales();
        portales1Sirius2.setNamePortal("maia");
        portales1Sirius2.setNumeroPortal(2);
        portales1Sirius2.setDescPortal("der arriba 2");
        portales1Sirius2.setIrZona(3);
        portales1Sirius2.setAparecerPortal(3);
        listPortales1Sirius.add(portales1Sirius2);

        Portales portales1Sirius3 = new Portales();
        portales1Sirius3.setNamePortal("alcyone");
        portales1Sirius3.setNumeroPortal(3);
        portales1Sirius3.setDescPortal("izq abajo 3");
        portales1Sirius3.setIrZona(2);
        portales1Sirius3.setAparecerPortal(1);
        listPortales1Sirius.add(portales1Sirius3);

        Portales portales1Sirius4 = new Portales();
        portales1Sirius4.setNamePortal("atlas b");
        portales1Sirius4.setNumeroPortal(4);
        portales1Sirius4.setDescPortal("der abajo 4");
        portales1Sirius4.setIrZona(1);
        portales1Sirius4.setAparecerPortal(4);
        listPortales1Sirius.add(portales1Sirius4);

        zona1Sirius.setListPortales(listPortales1Sirius);
        listZonaSirius.add(zona1Sirius);

        // ZONA 2
        Zona zona2Sirius = new Zona();
        zona2Sirius.setNombreZona("ZONA 2");
        zona2Sirius.setNumeroZona(2);

        List<Portales> listPortales2Sirius = new ArrayList<>();

        Portales portales2Sirius1 = new Portales();
        portales2Sirius1.setNamePortal("helvetios");
        portales2Sirius1.setNumeroPortal(1);
        portales2Sirius1.setDescPortal("arriba izq 1");
        portales2Sirius1.setIrZona(4);
        portales2Sirius1.setAparecerPortal(1);
        listPortales2Sirius.add(portales2Sirius1);

        Portales portales2Sirius2 = new Portales();
        portales2Sirius2.setNamePortal("aquila");
        portales2Sirius2.setNumeroPortal(2);
        portales2Sirius2.setDescPortal("arriba der 2");
        portales2Sirius2.setIrZona(1);
        portales2Sirius2.setAparecerPortal(4);
        listPortales2Sirius.add(portales2Sirius2);

        Portales portales2Sirius3 = new Portales();
        portales2Sirius3.setNamePortal("alcyone");
        portales2Sirius3.setNumeroPortal(3);
        portales2Sirius3.setDescPortal("abajo izq 3");
        portales2Sirius3.setIrZona(2);
        portales2Sirius3.setAparecerPortal(4);
        listPortales2Sirius.add(portales2Sirius3);

        Portales portales2Sirius4 = new Portales();
        portales2Sirius4.setNamePortal("eridani");
        portales2Sirius4.setNumeroPortal(4);
        portales2Sirius4.setDescPortal("abajo der 4");
        portales2Sirius4.setIrZona(1);
        portales2Sirius4.setAparecerPortal(2);
        listPortales2Sirius.add(portales2Sirius4);

        zona2Sirius.setListPortales(listPortales2Sirius);
        listZonaSirius.add(zona2Sirius);

        // ZONA 3
        Zona zona3Sirius = new Zona();
        zona3Sirius.setNombreZona("ZONA 3");
        zona3Sirius.setNumeroZona(3);

        List<Portales> listPortales3Sirius = new ArrayList<>();

        Portales portales3Sirius1 = new Portales();
        portales3Sirius1.setNamePortal("atlas a");
        portales3Sirius1.setNumeroPortal(1);
        portales3Sirius1.setDescPortal("arriba izq 1");
        portales3Sirius1.setIrZona(4);
        portales3Sirius1.setAparecerPortal(3);
        listPortales3Sirius.add(portales3Sirius1);

        Portales portales3Sirius2 = new Portales();
        portales3Sirius2.setNamePortal("bootes");
        portales3Sirius2.setNumeroPortal(2);
        portales3Sirius2.setDescPortal("arriba der 2");
        portales3Sirius2.setIrZona(1);
        portales3Sirius2.setAparecerPortal(3);
        listPortales3Sirius.add(portales3Sirius2);

        Portales portales3Sirius3 = new Portales();
        portales3Sirius3.setNamePortal("sadatoni");
        portales3Sirius3.setNumeroPortal(3);
        portales3Sirius3.setDescPortal("abajo izq 3");
        portales3Sirius3.setIrZona(1);
        portales3Sirius3.setAparecerPortal(1);
        listPortales3Sirius.add(portales3Sirius3);

        Portales portales3Sirius4 = new Portales();
        portales3Sirius4.setNamePortal("atlas a");
        portales3Sirius4.setNumeroPortal(4);
        portales3Sirius4.setDescPortal("abajo der 4");
        portales3Sirius4.setIrZona(3);
        portales3Sirius4.setAparecerPortal(2);
        listPortales3Sirius.add(portales3Sirius4);

        zona3Sirius.setListPortales(listPortales3Sirius);
        listZonaSirius.add(zona3Sirius);

        // ZONA 4
        Zona zona4Sirius = new Zona();
        zona4Sirius.setNombreZona("ZONA 4");
        zona4Sirius.setNumeroZona(4);

        List<Portales> listPortales4Sirius = new ArrayList<>();

        Portales portales4Sirius1 = new Portales();
        portales4Sirius1.setNamePortal("auriga");
        portales4Sirius1.setNumeroPortal(1);
        portales4Sirius1.setDescPortal("arriba izq 1");
        portales4Sirius1.setIrZona(2);
        portales4Sirius1.setAparecerPortal(2);
        listPortales4Sirius.add(portales4Sirius1);

        Portales portales4Sirius2 = new Portales();
        portales4Sirius2.setNamePortal("sadatoni");
        portales4Sirius2.setNumeroPortal(2);
        portales4Sirius2.setDescPortal("arriba der 2");
        portales4Sirius2.setIrZona(4);
        portales4Sirius2.setAparecerPortal(2);
        listPortales4Sirius.add(portales4Sirius2);

        Portales portales4Sirius3 = new Portales();
        portales4Sirius3.setNamePortal("cygni");
        portales4Sirius3.setNumeroPortal(3);
        portales4Sirius3.setDescPortal("abajo izq 3");
        portales4Sirius3.setIrZona(1);
        portales4Sirius3.setAparecerPortal(3);
        listPortales4Sirius.add(portales4Sirius3);

        Portales portales4Sirius4 = new Portales();
        portales4Sirius4.setNamePortal("atlas a");
        portales4Sirius4.setNumeroPortal(4);
        portales4Sirius4.setDescPortal("abajo der 4");
        portales4Sirius4.setIrZona(1);
        portales4Sirius4.setAparecerPortal(2);
        listPortales4Sirius.add(portales4Sirius4);

        zona4Sirius.setListPortales(listPortales4Sirius);
        listZonaSirius.add(zona4Sirius);

        mapaSirius.setListZona(listZonaSirius);

        // Crear el mapa para Volantis
        Mapa mapaVolantis = new Mapa();
        mapaVolantis.setNombreMapa("VOLANTIS");

        List<Zona> listZonaVolantis = new ArrayList<>();

        // ZONA 1
        Zona zona1Volantis = new Zona();
        zona1Volantis.setNombreZona("ZONA 1");
        zona1Volantis.setNumeroZona(1);

        List<Portales> listPortales1Volantis = new ArrayList<>();

        Portales portales1Volantis1 = new Portales();
        portales1Volantis1.setNamePortal("maia");
        portales1Volantis1.setNumeroPortal(1);
        portales1Volantis1.setDescPortal("izq arriba 1");
        portales1Volantis1.setIrZona(1);
        portales1Volantis1.setAparecerPortal(4);
        listPortales1Volantis.add(portales1Volantis1);

        Portales portales1Volantis2 = new Portales();
        portales1Volantis2.setNamePortal("volantis");
        portales1Volantis2.setNumeroPortal(2);
        portales1Volantis2.setDescPortal("der arriba 2");
        portales1Volantis2.setIrZona(4);
        portales1Volantis2.setAparecerPortal(2);
        listPortales1Volantis.add(portales1Volantis2);

        Portales portales1Volantis3 = new Portales();
        portales1Volantis3.setNamePortal("atlas c");
        portales1Volantis3.setNumeroPortal(3);
        portales1Volantis3.setDescPortal("izq abajo 3");
        portales1Volantis3.setIrZona(3);
        portales1Volantis3.setAparecerPortal(2);
        listPortales1Volantis.add(portales1Volantis3);

        Portales portales1Volantis4 = new Portales();
        portales1Volantis4.setNamePortal("bootes");
        portales1Volantis4.setNumeroPortal(4);
        portales1Volantis4.setDescPortal("der abajo 4");
        portales1Volantis4.setIrZona(4);
        portales1Volantis4.setAparecerPortal(1);
        listPortales1Volantis.add(portales1Volantis4);

        zona1Volantis.setListPortales(listPortales1Volantis);
        listZonaVolantis.add(zona1Volantis);

        // ZONA 2
        Zona zona2Volantis = new Zona();
        zona2Volantis.setNombreZona("ZONA 2");
        zona2Volantis.setNumeroZona(2);

        List<Portales> listPortales2Volantis = new ArrayList<>();

        Portales portales2Volantis1 = new Portales();
        portales2Volantis1.setNamePortal("persei");
        portales2Volantis1.setNumeroPortal(1);
        portales2Volantis1.setDescPortal("arriba izq 1");
        portales2Volantis1.setIrZona(3);
        portales2Volantis1.setAparecerPortal(1);
        listPortales2Volantis.add(portales2Volantis1);

        Portales portales2Volantis2 = new Portales();
        portales2Volantis2.setNamePortal("orion");
        portales2Volantis2.setNumeroPortal(2);
        portales2Volantis2.setDescPortal("arriba der 2");
        portales2Volantis2.setIrZona(2);
        portales2Volantis2.setAparecerPortal(2);
        listPortales2Volantis.add(portales2Volantis2);

        Portales portales2Volantis3 = new Portales();
        portales2Volantis3.setNamePortal("auriga");
        portales2Volantis3.setNumeroPortal(3);
        portales2Volantis3.setDescPortal("abajo izq 3");
        portales2Volantis3.setIrZona(1);
        portales2Volantis3.setAparecerPortal(1);
        listPortales2Volantis.add(portales2Volantis3);

        Portales portales2Volantis4 = new Portales();
        portales2Volantis4.setNamePortal("orion");
        portales2Volantis4.setNumeroPortal(4);
        portales2Volantis4.setDescPortal("abajo der 4");
        portales2Volantis4.setIrZona(1);
        portales2Volantis4.setAparecerPortal(4);
        listPortales2Volantis.add(portales2Volantis4);

        zona2Volantis.setListPortales(listPortales2Volantis);
        listZonaVolantis.add(zona2Volantis);

        // ZONA 3
        Zona zona3Volantis = new Zona();
        zona3Volantis.setNombreZona("ZONA 3");
        zona3Volantis.setNumeroZona(3);

        List<Portales> listPortales3Volantis = new ArrayList<>();

        Portales portales3Volantis1 = new Portales();
        portales3Volantis1.setNamePortal("volantis");
        portales3Volantis1.setNumeroPortal(1);
        portales3Volantis1.setDescPortal("arriba izq 1");
        portales3Volantis1.setIrZona(4);
        portales3Volantis1.setAparecerPortal(1);
        listPortales3Volantis.add(portales3Volantis1);

        Portales portales3Volantis2 = new Portales();
        portales3Volantis2.setNamePortal("alcyone");
        portales3Volantis2.setNumeroPortal(2);
        portales3Volantis2.setDescPortal("arriba der 2");
        portales3Volantis2.setIrZona(3);
        portales3Volantis2.setAparecerPortal(1);
        listPortales3Volantis.add(portales3Volantis2);

        Portales portales3Volantis3 = new Portales();
        portales3Volantis3.setNamePortal("cygni");
        portales3Volantis3.setNumeroPortal(3);
        portales3Volantis3.setDescPortal("abajo izq 3");
        portales3Volantis3.setIrZona(2);
        portales3Volantis3.setAparecerPortal(4);
        listPortales3Volantis.add(portales3Volantis3);

        Portales portales3Volantis4 = new Portales();
        portales3Volantis4.setNamePortal("auriga");
        portales3Volantis4.setNumeroPortal(4);
        portales3Volantis4.setDescPortal("abajo der 4");
        portales3Volantis4.setIrZona(1);
        portales3Volantis4.setAparecerPortal(2);
        listPortales3Volantis.add(portales3Volantis4);

        zona3Volantis.setListPortales(listPortales3Volantis);
        listZonaVolantis.add(zona3Volantis);

        // ZONA 4
        Zona zona4Volantis = new Zona();
        zona4Volantis.setNombreZona("ZONA 4");
        zona4Volantis.setNumeroZona(4);

        List<Portales> listPortales4Volantis = new ArrayList<>();

        Portales portales4Volantis1 = new Portales();
        portales4Volantis1.setNamePortal("volantis");
        portales4Volantis1.setNumeroPortal(1);
        portales4Volantis1.setDescPortal("arriba izq 1");
        portales4Volantis1.setIrZona(3);
        portales4Volantis1.setAparecerPortal(1);
        listPortales4Volantis.add(portales4Volantis1);

        Portales portales4Volantis2 = new Portales();
        portales4Volantis2.setNamePortal("volantis");
        portales4Volantis2.setNumeroPortal(2);
        portales4Volantis2.setDescPortal("arriba der 2");
        portales4Volantis2.setIrZona(1);
        portales4Volantis2.setAparecerPortal(2);
        listPortales4Volantis.add(portales4Volantis2);

        Portales portales4Volantis3 = new Portales();
        portales4Volantis3.setNamePortal("aquila");
        portales4Volantis3.setNumeroPortal(3);
        portales4Volantis3.setDescPortal("abajo izq 3");
        portales4Volantis3.setIrZona(3);
        portales4Volantis3.setAparecerPortal(4);
        listPortales4Volantis.add(portales4Volantis3);

        Portales portales4Volantis4 = new Portales();
        portales4Volantis4.setNamePortal("sadatoni");
        portales4Volantis4.setNumeroPortal(4);
        portales4Volantis4.setDescPortal("abajo der 4");
        portales4Volantis4.setIrZona(4);
        portales4Volantis4.setAparecerPortal(1);
        listPortales4Volantis.add(portales4Volantis4);

        zona4Volantis.setListPortales(listPortales4Volantis);
        listZonaVolantis.add(zona4Volantis);

        mapaVolantis.setListZona(listZonaVolantis);

        // ----------------------------------------------------------------------------------------------

        // Crear una lista para almacenar todos los mapas
    

        // Agregar cada mapa a la lista
        todosLosMapas.add(mapaAlcyone);
        todosLosMapas.add(mapaAtlasA);
        todosLosMapas.add(mapaAtlasB);
        todosLosMapas.add(mapaAtlasC);
        todosLosMapas.add(mapaAquila);
        todosLosMapas.add(mapaAuriga);
        todosLosMapas.add(mapaBootes);
        todosLosMapas.add(mapaCygni);
        todosLosMapas.add(mapaEridani);
        todosLosMapas.add(mapaHelvetios);
        todosLosMapas.add(mapaMaia);
        todosLosMapas.add(mapaOrion);
        todosLosMapas.add(mapaPersei);
        todosLosMapas.add(mapaSadatoni);
        todosLosMapas.add(mapaSirius);
        todosLosMapas.add(mapaVolantis);



        // ----------------------------------------------------------------------------------------------

    }
    private static List<Mapa> todosLosMapas = new ArrayList<>();
    // Método para buscar las primeras dos rutas
     // Método para buscar las primeras dos rutas

     
    public static void main(String[] args) {

        cargarDatos();



                // Crear una instancia de RutaFinder
        // Crear una instancia de RutaFinder
        RutaFinder rutaFinder = new RutaFinder(todosLosMapas);

            // Ejemplo de llamada al método
            String mapaOrigen = "atlas b";
            int zonaOrigen = 1;
            String mapaDestino = "volantis";
            int zonaDestino = 1;
            List<Set<Paso>>  pasos = rutaFinder.encontrarRutaConPasos(mapaOrigen, zonaOrigen, mapaDestino, zonaDestino);

            Mapa mapaInicio = todosLosMapas.stream().filter(f-> f.getNombreMapa().equalsIgnoreCase(mapaOrigen.trim())  ).findFirst().orElse(new Mapa());
            Zona zonaInicio = mapaInicio.getListZona().stream().filter(fi->fi.getNumeroZona() == zonaOrigen ).findFirst().orElse(new Zona());
            System.out.println("zona "+zonaInicio);
            System.out.println(" Ruta Inicio "+mapaOrigen+ " zona origen "+ zonaOrigen);
            pasos.forEach(item->{
                item.forEach(itemFo->{
                    System.out.println("Mapa: "+itemFo.getNombreMapa()+" Zona "+ itemFo.getNumeroZona() +" Portal: "+ itemFo.getNumeroPortal()+" "  );
                });
            });



    }




   
    
}

// javac MapasPortales.java && java MapasPortales