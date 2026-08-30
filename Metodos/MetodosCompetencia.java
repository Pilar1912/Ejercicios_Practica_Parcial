package Metodos;

import Clases.ObjCompetencia;
import java.util.Scanner;

public class MetodosCompetencia {

    public ObjCompetencia[][] RegistrarParticipante(ObjCompetencia[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Ingrese el nombre del participante:");
                String nombre = sc.next();
                System.out.println("Ingrese la edad del participante:");
                String edad = sc.next();
                System.out.println("Ingrese la categoria en la que está el participante:");
                String categoria = sc.next();

                System.out.println("Ingrese el resultado obtenido por el participante en la categoria ingresada:");
                
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: ¡Ingresaste letras! Debe ser un número decimal.");
                    System.out.println("Intente de nuevo el resultado:");
                    sc.next(); 
                }
                
                Double resultado = sc.nextDouble();

                ObjCompetencia o = new ObjCompetencia(nombre, edad, categoria, resultado);

                a[i][j] = o;
                

            }
            
        }

        return a;
    }

    public ObjCompetencia[][] MostrarDatos(ObjCompetencia[][] a, Scanner sc){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("El nombre del participante es: " + a[i][j].getNombre());
                System.out.println("La edad del participante es: " + a[i][j].getEdad());
                System.out.println("La categoria en la que participa es: " + a[i][j].getCategoria());
                System.out.println("El resultado es: " + a[i][j].getResultado());
            }
        }
        return a;
    }
    
}
