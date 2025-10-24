package com.aluracursos.ecomart;

import javax.swing.*;
import java.sql.SQLOutput;

public class OperadorAritmetico {

    public static void main(String [] args){

        int i=5, j=4, suma= i+j;

        System.out.println("suma = " +suma);


        System.out.println("i+j = "+i+j);//con el operador + concatena y no suma
        System.out.println("i+j = "+(i+j));//aqui suma al usar parentesis

        int resta = i-j;
        System.out.println("resta ="  +resta);
        //System.out.println("i-j = "+i-j);//el operador no se puede aplicar aun string
        System.out.println("i-j ="+(i-j));

        int multiplicacion = i*j;
        System.out.println("multiplicacion = " +multiplicacion);

        int division = i/j;
        float div2 = (float) i /j;
        float div3= (float)i / (float)j;
        System.out.println("division = "+division);
        System.out.println("division 2 = "+div2);
        System.out.println("division 3 = "+div3);

        int resto = i % j;
        System.out.println("resto = " +resto);

        resto = 8 % 5;
        System.out.println(" resto2 = "+resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if(numero % 2 == 0) {
            System.out.println(" numero par  = " + numero);
        }else {
            System.out.println(" numero es impar = "+numero);
        }


    }
}
