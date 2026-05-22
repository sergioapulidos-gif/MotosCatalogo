package model;

public class Motocicleta {

    private int id;
    private String modelo;
    private int cilindraje;
    private double precio;
    private int marcaId;

    public Motocicleta() {
    }

    public Motocicleta(int id,
                       String modelo,
                       int cilindraje,
                       double precio,
                       int marcaId) {

        this.id = id;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.marcaId = marcaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }
}
