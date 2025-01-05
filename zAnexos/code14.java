
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

   


      

       

       
       
       
       

       
      


        System.out.println(todosLosMapas.toString());

        
        todosLosMapas.forEach(f-> System.out.println(f.getNombreMapa()));
        // ----------------------------------------------------------------------------------------------

    }
    private static List<Mapa> todosLosMapas = new ArrayList<>();
    // Método para buscar las primeras dos rutas
     // Método para buscar las primeras dos rutas

     
    public static void main(String[] args) {

        cargarDatos();

        String origen = "atlas b";
        String destino = "volantis";
        List<List<Paso>> rutas = buscarRutas("volantis", 0, "volantis", 4, todosLosMapas);
        Optional<List<Paso>> rutaConMenosMapas = obtenerRutaConMenosMapas(rutas);

        System.out.println("Ruta con menos mapas recorridos:");
        if (rutaConMenosMapas.isPresent()) {
            
            String modifiedString = rutaConMenosMapas.get().toString().replaceAll("[\\[\\] ]", "");
            System.out.println("Número total de mapas recorridos: " +modifiedString );
        } else {
            System.out.println("No se encontró ninguna ruta.");
        }

    }

        private static Optional<List<Paso>> obtenerRutaConMenosMapas(List<List<Paso>> rutas) {
        return rutas.stream()
                    .min(Comparator.comparingInt(ruta -> (int) ruta.stream()
                                                                   .map(Paso::getMapa)
                                                                   .distinct()
                                                                   .count()));
    }

     public static List<List<Paso>> buscarRutas(String origenMapa, int origenZona, String destinoMapa, int destinoZona, List<Mapa> todosLosMapas) {
        
        List<List<Paso>> rutas = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        Stack<Paso> rutaActual = new Stack<>();

        Mapa mapaOrigen = encontrarMapa(todosLosMapas, origenMapa.toLowerCase());
        

        if (mapaOrigen != null) {
            buscar(mapaOrigen, origenZona, destinoMapa.toLowerCase(), destinoZona, rutas, visitados, rutaActual, todosLosMapas);
            
        } else {
           // System.out.println("Mapa de origen no encontrado.");
        }
        return rutas;
    }

    private static void buscar(Mapa mapaActual, int zonaActual, String destinoMapa, int destinoZona, List<List<Paso>> rutas, Set<String> visitados, Stack<Paso> rutaActual, List<Mapa> todosLosMapas) {
        
        if (rutas.size() >= 2) return;

        String claveActual = mapaActual.getNombreMapa() + "-" + zonaActual;
        if (visitados.contains(claveActual)) return;
        visitados.add(claveActual);

        //System.out.println("Buscando en Mapa: " + mapaActual.getNombreMapa() + ", Zona: " + zonaActual);

        for (Zona zona : mapaActual.getListZona()) {
            if (zona.getNumeroZona() == zonaActual) {
                for (Portales portal : zona.getListPortales()) {
                    Paso nuevoPaso = new Paso(mapaActual.getNombreMapa(), zonaActual, portal.getNumeroPortal());
                    rutaActual.push(nuevoPaso);

                    //System.out.println("Explorando portal: " + portal.getNamePortal() + ", irZona: " + portal.getIrZona() + ", aparecerPortal: " + portal.getAparecerPortal());

                    Mapa siguienteMapa = encontrarMapa(todosLosMapas, portal.getNamePortal().toLowerCase());
                    if (siguienteMapa != null) {
                        if (siguienteMapa.getNombreMapa().equalsIgnoreCase(destinoMapa) && portal.getIrZona() == destinoZona) {
                            rutas.add(new ArrayList<>(rutaActual));
                        } else {
                            buscar(siguienteMapa, portal.getIrZona(), destinoMapa, destinoZona, rutas, visitados, rutaActual, todosLosMapas);
                        }
                    } else {
                        //System.out.println("Mapa no encontrado: " + portal.getNamePortal());
                    }
                    rutaActual.pop();
                }
            }
        }

        visitados.remove(claveActual);
    }

    private static Mapa encontrarMapa(List<Mapa> todosLosMapas, String nombreMapa) {
        for (Mapa mapa : todosLosMapas) {
            if (mapa.getNombreMapa().equalsIgnoreCase(nombreMapa)) {
                return mapa;
            }
        }
        return null;
    }
}

// javac MapasPortales.java && java MapasPortales