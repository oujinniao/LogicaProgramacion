package com.aluracursos.ecomart;

public class OperadoresLogico {
    public static void main(String[] args) {


        int i = 3;
        byte j= 3;
        float k= 127e-7f;
        double l= 2.14413e3;
        boolean m= false;

        boolean b1 = i == j && k < l && m==false;// && ambas condiciones se tiene que cumplir

        System.out.println("b1 = "+b1);

        boolean b2 = i == j || k>l; // -|| or-al menos una condicion se tiene que cumplir
        System.out.println("b2 =" +b2);

        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 =" +b3);

        //el operador lógico && -and-devuelve verdadero si ambas condiciones son verdaderas
        //el operador lógico || -or- devuelve verdadera si al menos uan condición es verdadera
        //tb es importante usar si tenemos varias operaciones lógicas s tiene prioridad
        //la precedencia es de izquierda a derecha
        //la prioridad siempre la va tener el and &&

        boolean b4 = i ==j || k<l && m == true; //aqui se evalua de derecha a izquierda

        System.out.println(" b4 =" +b4);

        //boolean b5 =true || true && false; //igual a true
        boolean b5 = (true || true) && false; //igual a false
        System.out.println("b5 =" +b5   );

        boolean b6 = true || (false && false) || false; //da true, primero se evalua && o and
        System.out.println(" b6 = " +b6);

        boolean b7 = ((true || false)&& false || false);//igual a fasle
        System.out.println("b7 =" +b7);



    }
}
