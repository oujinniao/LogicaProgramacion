package com.aluracursos.ecomart;

import javax.lang.model.SourceVersion;

public class EjemploString {


    public static void main(String[] argd){

        String curso = "Programacion en Java";
       String curso2 = new String("Programacion en Java");

        boolean esIgual = curso==curso2;
        System.out.println("curso==curso2 = "+esIgual);

        //esIgual=curso.equalsIgnoreCase(curso2); ignora May y Min
        esIgual=curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 ="Programacion Java";//asigna a curso3 el valor de curso, no crea otro valor
        esIgual= curso == curso3;               //optimiza la memoria
        System.out.println("curso == curso3 = " + esIgual);
        
//siempre usamos equals para comprobar el contenido o el valor  de la variable








    }
}
