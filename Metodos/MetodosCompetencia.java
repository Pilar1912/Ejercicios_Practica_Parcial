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
                String cateActual = a[i][j].getCategoria();

                Boolean procesada = false;
                for (int k = 0; k < a.length; k++) {
                    for (int k2 = 0; k2 < a.length; k2++) {
                        if (a[i][j].getCategoria().equalsIgnoreCase(cateActual)) {
                            if (k < i || (k == i && k2 < j)) {
                                procesada = true;
                            }
                        }
                        
                    }
                }

                if(procesada == false){
                    ObjCompetencia mejorDeEstaCategoria = a[i][j];

                    for (int k = 0; k < a.length; k++) {
                        for (int k2 = 0; k2 < a.length; k2++) {
                            if (a[k][k2] != null && a[k][k2].getCategoria().equalsIgnoreCase(cateActual)) {
                                if (a[k][k2].getResultado() > mejorDeEstaCategoria.getResultado()) {
                                    mejorDeEstaCategoria = a[k][k2];
                                }
                            }
                        }
                    }
                System.out.println("Categoría: " + mejorDeEstaCategoria.getCategoria());
                System.out.println("  > Nombre: " + mejorDeEstaCategoria.getNombre());
                System.out.println("  > Edad: " + mejorDeEstaCategoria.getEdad());
                System.out.println("  > Mejor Resultado: " + mejorDeEstaCategoria.getResultado());
                System.out.println("-------------------------------------------");
                }

            }
        }

        
        return a;
    }
    
}
