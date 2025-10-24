package com.aluracursos.ecomart;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        //pre incremento
        int i = 1;
        int j = ++i;

        System.out.println("i = "+i);
        System.out.println("j ="+j);

        //post incremento

         i = 2;
         j = i++;// a i se le agrega 1, vale 3
        System.out.println("i ="+i);
        System.out.println("j ="+j);

        //pre decremento

        i = 3;// el operador -- está antes de la variable, i se decrementa primero, de 3 pasa a 2
        j= --i;   //el nuevo valor de i es 2, y ese valor se le asigna a J osea 2

        System.out.println("i = "+i);
        System.out.println("j ="+j);

        //post decremento, primero se asigna y luego se decrementa
        i = 4;
        j= i--;
        System.out.println("i ="+i); //3
        System.out.println("j ="+j);//4






    }
}
