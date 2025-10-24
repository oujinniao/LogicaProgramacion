package com.aluracursos.ecomart;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j= 7;
        float k= 127e-7f;
        double l= 2.14413e3;
        boolean m= false;

        boolean b1= i==j; //Asigna a la variable booleana b1 el resultado de la pregunta, es i=j
        System.out.println("bi = "+b1);

        boolean b2 = !b1;
        System.out.println("b2 ="+b2 ); //retorna true

        boolean b3 =1!=j; //retorna true

        boolean b4 = m ==true;//el resultado es false

        boolean b5 = m!=true;//el resultado es true

        boolean b6 = i>j; //el resultado es false

        boolean b7 = i<j; //rel sultado es true







    }
}
