package Metodos;

import Clases.ObjCelulares;
import java.util.Scanner;

public class MetodosCelulares {

    public ObjCelulares[][] RegistrarCelulares(ObjCelulares[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Ingrese la marca del celular: ");
                String marca = sc.next();
                System.out.println("Ingrese el modelo del celular: ");
                String modelo = sc.next();
                System.out.println("Ingrese la RAM del celular: ");
                String ram = sc.next();
                System.out.println("Ingrese el almacenamiento interno del celular: ");
                String almacenamiento = sc.next();

                Boolean cantValida = true;
                int cantidad = 0;

                while(cantValida){
                    System.out.print("Ingrese la cantidad que hay en stock: ");
                if(sc.hasNextInt()){
                    cantidad = sc.nextInt();
                    cantValida = false; 
                } else {
                    System.out.println("Opción inválida. Debe ingresar un número entero.");
                    sc.next();
                }           
                }
                
                System.out.println("Ingrese el precio del celular: ");
                Double precio = sc.nextDouble();
                System.out.println("Si el celular tiene promoción escriba SI o NO:");
                String promo = sc.next();

                Double descuento = 0.0;
                if (promo.trim().replaceAll("\\s+", "").equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el valor del descuento: ");
                    descuento = sc.nextDouble();
                }else{
                    descuento = 0.0;
                }

                ObjCelulares o = new ObjCelulares(modelo, marca, precio, cantidad, ram, almacenamiento,promo, descuento);

                a[i][j] = o;
            }
        }

        return a;
    }

    public ObjCelulares[][] MostrarDatos(ObjCelulares[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j].getPromocion().trim().replaceAll("\\s+", "").equalsIgnoreCase("si")) {
                    System.out.println("Modelo: " + a[i][j].getModelo());
                    System.out.println("Marca: " + a[i][j].getMarca());
                    System.out.println("RAM: " + a[i][j].getRam());
                    System.out.println("Almacenamiento interno: " + a[i][j].getAlmacenamiento());
                    System.out.println("Precio SIN descuento: " + a[i][j].getPrecio());
                    System.out.println("Descuento: " + a[i][j].getDescuento() + "%");
                    System.out.println("Precio CON descuento: " + (a[i][j].getPrecio() * (100 - a[i][j].getDescuento()))/100 );
                    System.out.println("---------------------------------------------------------------");
                }
            }
        }

        return a;
    }
}
