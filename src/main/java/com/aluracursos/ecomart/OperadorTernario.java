package com.aluracursos.ecomart;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

    String variable = 7==5? " es valido" : " No es valido";
        System.out.println("variable :"+variable);

        String estado = "";
        double promedio = 5.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println(" Ingresa la nota de matematicas : ");
        matematicas = s.nextDouble();
        System.out.println(" Ingresa la nota de ciencias : ");
        ciencias = s.nextDouble();
        System.out.println(" Ingresa la nota de historia : ");
        historia = s.nextDouble();

        promedio = (matematicas+ciencias+historia)/3;
        System.out.println("Promedio notas: "+promedio);

        estado = promedio>6? "Aprobado":"Rechazado";
        System.out.println("estado = "+estado);

        //=========otra forma de validar=============
       /* if(promedio>=6){
            estado ="Aprobado";
        }else {
            estado = " Rechazado";
        }*/

    }
}
