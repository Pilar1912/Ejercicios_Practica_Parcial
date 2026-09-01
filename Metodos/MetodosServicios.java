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

    public ObjServicios[][] MostrarInforme(ObjServicios[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j].getFecha().getMonthValue() == 1){
                    System.out.println("----------Informe de Enero----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 2){
                    System.out.println("----------Informe de Febrero----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 3){
                    System.out.println("----------Informe de Marzo----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 4){
                    System.out.println("----------Informe de Abril----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 5){
                    System.out.println("----------Informe de Mayo----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 6){
                    System.out.println("----------Informe de Junio----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 7){
                    System.out.println("----------Informe de Julio----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 8){
                    System.out.println("----------Informe de Agosto----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 9){
                    System.out.println("----------Informe de Septiembre----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 10){
                    System.out.println("----------Informe de Octubre----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 11){
                    System.out.println("----------Informe de Noviembre----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
                if(a[i][j].getFecha().getMonthValue() == 12){
                    System.out.println("----------Informe de Diciembre----------" );
                    System.out.println("Cliente: " + a[i][j].getNombreCliente());
                    System.out.println("Empleado: " + a[i][j].getEmpleado());
                    System.out.println("Servicio: " + a[i][j].getServicio());
                    System.out.println("Precio: " + a[i][j].getPrecio());
                    System.out.println("Fecha: " + a[i][j].getFecha());
                    System.out.println();
                }
            }
        }
        
        return a;
    }
    
}
