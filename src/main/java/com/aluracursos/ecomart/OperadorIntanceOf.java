package com.aluracursos.ecomart;

public class OperadorIntanceOf {

    public static void main(String[] args) {


        String texto =( "Creando un objeto de la clase String ...");

        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println(" El texto es de tipo String = "+b1);
        b1 = texto instanceof Object;
        System.out.println("el texto es de tipo string = "+b1);

        System.out.println(" es string = "+b1);

        b1 = num instanceof Integer;
        System.out.println("el numero es de tipo Integer = "+b1);



        b1 = num instanceof Number;
        System.out.println("el numero es de tipo Integer = "+b1);

        b1 = num instanceof Object;
        System.out.println("el numero es de tipo Integer = "+b1);



    }
}
