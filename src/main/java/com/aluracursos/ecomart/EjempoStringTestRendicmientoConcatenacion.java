package com.aluracursos.ecomart;

import javax.lang.model.SourceVersion;



public class EjempoStringTestRendicmientoConcatenacion {
    public static void main(String[] args) {

        String a="a";
        String b="b";
        String c =a;

        StringBuilder sb = new StringBuilder(a);

        long inicio= System.currentTimeMillis();

        for(int i=0; i < 500; i++) {
            //c= c.concat(a).concat(b).concat("\n"); demoró 1 milisegundo
            //c +=a+b+"\n"; se demoró 20 milisegundos

            sb.append(a).append(b).append("\n"); //con este metodo la iteracion demoró 0 milisegundos
                 }


        long fin = System.currentTimeMillis();

        System.out.println(fin-inicio);
        System.out.println("c = " + c);

        System.out.println("sb = " + sb.toString());




    }
}
