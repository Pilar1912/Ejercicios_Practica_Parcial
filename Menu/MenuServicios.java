package Menu;

import Clases.ObjServicios;
import Metodos.MetodosServicios;
import java.util.Scanner;

public class MenuServicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosServicios ms = new MetodosServicios();
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = sc.nextInt();
        ObjServicios[][] ser = new ObjServicios[n][n];
        Boolean continuar = true;
        while(continuar){
            System.out.println("Bienvenida a la tienda de servicios");
            System.out.println("Ingresa la opción que deseas realizar:");
            System.out.println("1. Ingresar servicios.");
            System.out.println("2. Ver los servicios brindados.");
            System.out.println("3. Ver informe.");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    ser = ms.RegistrarServicio(ser, sc);
                    break;
                case 2:
                    ms.MostrarServicios(ser, sc);
                    break;
                case 3:
                    ms.MostrarInforme(ser, sc);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continuar = false;
                    break;
            }
        }
    }
    
}
