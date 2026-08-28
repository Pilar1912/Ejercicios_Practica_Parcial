package Clases;

public class ObjCelulares {
    private String Modelo;
    private String Marca;
    private Double Precio;
    private int Cantidad;
    private String Ram;
    private String Almacenamiento;
    private String Promocion;
    private Double Descuento;

    public ObjCelulares(){

    }

    public ObjCelulares(String modelo, String marca, Double precio, int cantidad, String ram, String almacenamiento, String promocion, Double descuento){
        Modelo = modelo;
        Marca = marca;
        Precio = precio;
        Cantidad = cantidad;
        Ram = ram;
        Almacenamiento = almacenamiento;
        Promocion = promocion;
        Descuento = descuento;
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

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }

    public String getPromocion() {
        return Promocion;
    }

    public void setPromocion(String promocion) {
        Promocion = promocion;
    }

    public Double getDescuento() {
        return Descuento;
    }

    public void setDescuento(Double descuento) {
        Descuento = descuento;
    }

    

}
