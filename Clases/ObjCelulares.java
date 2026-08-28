package Clases;

public class ObjCelulares {
    private String Modelo;
    private String Marca;
    private Double Precio;
    private int Cantidad;
    private String Caracteristicas;

    public ObjCelulares(){

    }

    public ObjCelulares(String modelo, String marca, Double precio, int cantidad, String caracteristicas){
        Modelo = modelo;
        Marca = marca;
        Precio = precio;
        Cantidad = cantidad;
        Caracteristicas = caracteristicas;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }

    

}
