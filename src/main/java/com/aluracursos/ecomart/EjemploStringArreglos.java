package com.aluracursos.ecomart;

public class EjemploStringArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.lenght() = " + trabalenguas.length());//lengh en un string
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length; //length es un atributo
        System.out.println("largo= " + largo);
        for (int i = 0; i < largo; i++) {
            //System.out.println("arreglo = "+arreglo[i]);
            //System.out.print(arreglo[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }
        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); //[.]
        l = archivoArr.length;
        System.out.println("l = "+l);
        for (int j = 0; j < l; j++) {
            System.out.println(archivoArr[j]);

        }
    }
}
