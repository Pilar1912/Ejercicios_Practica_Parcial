package Metodos;

import Clases.ObjServicios;
import java.util.Scanner;
import java.time.LocalDate;

public class MetodosServicios {
    
    public ObjServicios[][] RegistrarServicio(ObjServicios[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Ingrese el nombre del cliente:");
                String nombreCliente = sc.next();
                System.out.println("Ingrese el nombre del empleado:");
                String empleado = sc.next();
                System.out.println("Ingrese el servicio que se le brindó al cliente:");
                String servicio = sc.next();

                System.out.println("Ingrese el precio del servicio brindado al cliente:");
                
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: ¡Ingresaste letras! Debe ser un número decimal.");
                    System.out.println("Intente de nuevo el precio:");
                    sc.next(); 
                }
                
                Double precio = sc.nextDouble();

                System.out.println("Ingrese la fecha en la que se le brindó el servicio al cliente (aaaa/mm/dd):");
                LocalDate fecha = LocalDate.parse(sc.next(), java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd"));

                ObjServicios o = new ObjServicios(nombreCliente, empleado, servicio, precio, fecha);

                a[i][j] = o;
                

            }
            
        }

        return a;
    }

    public ObjServicios[][] MostrarServicios(ObjServicios[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Cliente: " + a[i][j].getNombreCliente());
                System.out.println("Empleado: " + a[i][j].getEmpleado());
                System.out.println("Servicio: " + a[i][j].getServicio());
                System.out.println("Precio: " + a[i][j].getPrecio());
                System.out.println("Fecha: " + a[i][j].getFecha());
                System.out.println();
            }
        }

        return a;
    }

    public ObjServicios[][] MostrarInforme(ObjServicios[][] a, Scanner sc) {

    for (int mes = 1; mes <= 12; mes++) {

        String empleadoMes = "";
        Double precioMes = 0.0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                if (a[i][j] != null && a[i][j].getFecha().getMonthValue() == mes) {

                    String empleadoActual = a[i][j].getEmpleado();
                    Double precioActual = 0.0;

                    for (int k = 0; k < a.length; k++) {
                        for (int l = 0; l < a[0].length; l++) {

                            if (a[k][l] != null && a[k][l].getEmpleado().equals(empleadoActual) && a[k][l].getFecha().getMonthValue() == mes) {
                                precioActual += a[k][l].getPrecio();
                            }
                        }
                    }

                    if (precioActual > precioMes) {
                        precioMes = precioActual;
                        empleadoMes = empleadoActual;
                    }
                }
            }
        }

        if (!empleadoMes.isEmpty()) {
            System.out.println(
                "El empleado con mayores ventas en el mes " + mes +
                " es: " + empleadoMes +
                " con un total de ventas de: " + precioMes
            );
        } else {
            System.out.println(
                "No se registraron ventas en el mes " + mes
            );
        }
    }

    return a;
}
    
}
