package Menu;

import Clases.ObjCompetencia;
import Metodos.MetodosCompetencia;
import java.util.Scanner;

public class MenuCompetencia {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MetodosCompetencia mc = new MetodosCompetencia();
    System.out.println("Ingrese la dimensión de la matriz: ");
    int n = sc.nextInt();
    ObjCompetencia[][] com = new ObjCompetencia[n][n];
    Boolean continuar = true;
    while (continuar) {
        System.out.println("Bienvenido al sistema de competencia");
        System.out.println("1. Ingresar particiapntes.");
        System.out.println("2. Mostrar participantes.");
        System.out.println("3. Salir.");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                com = mc.RegistrarParticipante(com, sc);
                break;
            case 2:
                mc.MostrarDatos(com, sc);
                break;
            case 3:
                System.out.println("Hasta luego");
                continuar = false;
                break;
            default:
                System.out.println("Opción inválida");
                break;

        }
        
    }
    }
}
