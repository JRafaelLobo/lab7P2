package lab7p2_joselobo;

public class Archivo {

    private String nombre, link, extencion;
    private double tamano;

    public Archivo() {
    }

    public Archivo(String nombre, String link, String extencion, double tamano) {
        this.nombre = nombre;
        this.link = link;
        this.extencion = extencion;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
