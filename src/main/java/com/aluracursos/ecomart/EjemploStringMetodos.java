package com.aluracursos.ecomart;

public class EjemploStringMetodos {
    public static void main(String[] args){

        String nombre = "Luisz";

        System.out.println("nombre.length() = "+nombre.length());
        System.out.println("nombre.toLowerCase() = "+nombre.toUpperCase());
        System.out.println("nombre.equals(\"Eugenioz\") = " +nombre.equals("Eugenio"));
        System.out.println("nombre.equals(\"eugenioz\") = " +nombre.equals("eugenio"));
        System.out.println("nombre.equalsIgnoreCase(\"Eugenio\") = "+nombre.equalsIgnoreCase("eugenio"));
        System.out.println("nombre.compareTo(\"Luiszz\") = " +nombre.compareTo("Luisz"));
        System.out.println("nombre.compareTo(\"Luiszz\") = " +nombre.compareTo(" Eugenioz"));//devuelve un int
        System.out.println("nombre.chartAt(0) = " +nombre.charAt(0));
        System.out.println("nombre.chartAt(1) = " +nombre.charAt(1));
        System.out.println("nombre.chartAt(4) = " +nombre.charAt(4));
        System.out.println("nombre.chartAt(nombre.length-1()) = " +nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = "+ nombre.substring(1));//comienza desde la posicion 1
        System.out.println("nombre.substring(0) = "+ nombre.substring(0));//lista todo
        System.out.println("nombre.substring(1) = "+ nombre.substring(1, 3));//el 3 no se incluye
        System.out.println("nombre.substring(5) = "+ nombre.substring(nombre.length()-1));
        System.out.println("nombre.substring(5) = "+ nombre.substring(nombre.length()-2));

        String trabalenguas ="trabalenguas";
        System.out.println("trabalenguas = " +trabalenguas.replace("a","."));//reemplza la "a"
        System.out.println("trabalenguas = " +trabalenguas);
        System.out.println("trabalenguas.index = " +trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf() = " +trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf = " +trabalenguas.indexOf("z"));
        System.out.println("trabalenguas.indexOf(t) = " +trabalenguas.indexOf("t"));//el indexOf retorna el numero de posicion
        System.out.println("trabalenguas.contains = " +trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains = " +trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains = " +trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startWith = " +trabalenguas.startsWith("t"));//retorna un buleano falso/verdadero
        System.out.println("trabalenguas.startWith = " +trabalenguas.startsWith("m"));
        System.out.println("trabalenguas.starEnd = " +trabalenguas.endsWith("t"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas    ".trim()); //quita espacios en blanco






    }
}
