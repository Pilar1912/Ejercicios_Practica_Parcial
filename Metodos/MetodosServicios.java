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

        for(int mes = 1; mes <= 12; mes++){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    ObjServicios mejorEmpleado = a[i][j];

                    for(int k = 0; k < a.length; k++) {
                        for (int k2 = 0; k2 < a[0].length; k2++) {
                            if(a[k][k2].getFecha().getMonthValue() == mes){
                                if(a[k][k2].getPrecio() > mejorEmpleado.getPrecio()){
                                    mejorEmpleado = a[k][k2];
                                }
                            }
                        }
                    }

                    if(mejorEmpleado.getFecha().getMonthValue() == mes){
                        System.out.println("----------Informe de " + mejorEmpleado.getFecha().getMonth() + "----------" );
                        System.out.println("Cliente: " + mejorEmpleado.getNombreCliente());
                        System.out.println("Empleado: " + mejorEmpleado.getEmpleado());
                        System.out.println("Servicio: " + mejorEmpleado.getServicio());
                        System.out.println("Precio: " + mejorEmpleado.getPrecio());
                        System.out.println("Fecha: " + mejorEmpleado.getFecha());
                        System.out.println();
                    }
                }
            }
        }
        
        
        return a;
    }
    
}
