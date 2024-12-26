import java.util.Set;

public class Nodo {
    String mapa;
    int zona;
    int aparecerPortal;
    Set<Paso> pasos;

    Nodo(String mapa, int zona, int aparecerPortal, Set<Paso> pasos) {
        this.mapa = mapa;
        this.zona = zona;
        this.aparecerPortal = aparecerPortal;
        this.pasos = pasos;
    }
}
