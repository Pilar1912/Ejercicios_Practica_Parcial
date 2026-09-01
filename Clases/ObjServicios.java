package Clases;

import java.time.LocalDate;

public class ObjServicios {
    private String NombreCliente;
    private String Empleado;
    private String Servicio;
    private Double Precio;
    private LocalDate Fecha;

    public ObjServicios(){

    }

    public ObjServicios(String nombreCliente, String empleado, String servicio, Double precio, LocalDate fecha) {
        NombreCliente = nombreCliente;
        Empleado = empleado;
        Servicio = servicio;
        Precio = precio;
        Fecha = fecha;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String empleado) {
        Empleado = empleado;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    
    
    
    
}
