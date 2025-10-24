package com.aluracursos.ecomart;

public class EjemploStringValidar
{

    public static void main (String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = " "; //"pramacion java";
            System.out.println(curso.toUpperCase());
        }
        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2= curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco =curso.isBlank();
        
        if (!esVacio) {

            System.out.print(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);

        }
    }
}
