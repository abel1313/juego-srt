public class Portales {

    private String namePortal;
    private int numeroPortal;
    private String descPortal;

    private int irZona;
    private int aparecerPortal;

    // Constructor
    public Portales() {
    }

    // Setter
    public void setNamePortal(String namePortal) {
        this.namePortal = namePortal;
    }

    public void setNumeroPortal(int numeroPortal) {
        this.numeroPortal = numeroPortal;
    }

    public void setDescPortal(String descPortal) {
        this.descPortal = descPortal;
    }

    public void setIrZona(int irZona) {
        this.irZona = irZona;
    }

    public void setAparecerPortal(int aparecerPortal) {
        this.aparecerPortal = aparecerPortal;
    }

    // Getter
    public String getNamePortal() {
        return namePortal.toLowerCase();
    }

    public int getNumeroPortal() {
        return numeroPortal;
    }

    public String getDescPortal() {
        return descPortal.toLowerCase();
    }

    public int getIrZona() {
        return irZona;
    }

    public int getAparecerPortal() {
        return aparecerPortal;
    }

    // toString
    @Override
    public String toString() {
        return "Portales{" +
                "namePortal='" + namePortal + '\'' +
                ", numeroPortal=" + numeroPortal +
                ", descPortal='" + descPortal + '\'' +
                ", irZona=" + irZona +
                ", aparecerPortal=" + aparecerPortal +
                '}';
    }
}
