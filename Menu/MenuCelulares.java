package Menu;

import Clases.ObjCelulares;
import Metodos.MetodosCelulares;
import java.util.Scanner;

public class MenuCelulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosCelulares mc = new MetodosCelulares();
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = sc.nextInt();
        ObjCelulares[][] cel = new ObjCelulares[n][n];
        Boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenida a la tienda de celulares");
            System.out.println("1. Ingresar celulares.");
            System.out.println("2. Ver los celulares con descuento.");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    cel = mc.RegistrarCelulares(cel,sc);
                    break;
                case 2:
                    mc.MostrarDatos(cel, sc);
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continuar = false;
                    break;
            }
            }
        } 
    }
    

