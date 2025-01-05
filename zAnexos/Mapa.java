import java.util.List;

public class Mapa {

    private String nombreMapa;
    private List<Zona> listZona;

    public String getNombreMapa() {
        return nombreMapa.toLowerCase();
    }

    public void setNombreMapa(String nombreMapa) {
        this.nombreMapa = nombreMapa;
    }

    public List<Zona> getListZona() {
        return listZona;
    }

    public void setListZona(List<Zona> listZona) {
        this.listZona = listZona;
    }

    @Override
    public String toString() {
        return "Mapa [nombreMapa=" + nombreMapa + ", listZona=" + listZona + "]";
    }
}
