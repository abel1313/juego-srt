public class Paso {
    private String nombreMapa;
    private int numeroZona;
    private int numeroPortal;

    public Paso(String nombreMapa, int numeroZona, int numeroPortal) {
        this.nombreMapa = nombreMapa;
        this.numeroZona = numeroZona;
        this.numeroPortal = numeroPortal;
    }

    public String getNombreMapa() {
        return nombreMapa;
    }

    public int getNumeroZona() {
        return numeroZona;
    }

    public int getNumeroPortal() {
        return numeroPortal;
    }
}
