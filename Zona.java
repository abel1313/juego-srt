import java.util.List;

public class Zona {

    private String nombreZona;
    private int numeroZona;
    private List<Portales> listPortales;

    public String getNombreZona() {
        return nombreZona.toLowerCase();
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public int getNumeroZona() {
        return numeroZona;
    }

    public void setNumeroZona(int numeroZona) {
        this.numeroZona = numeroZona;
    }

    public List<Portales> getListPortales() {
        return listPortales;
    }

    public void setListPortales(List<Portales> listPortales) {
        this.listPortales = listPortales;
    }

    @Override
    public String toString() {
        return "Zona [nombreZona=" + nombreZona + ", numeroZona=" + numeroZona + ", listPortales=" + listPortales + "]";
    }
}
