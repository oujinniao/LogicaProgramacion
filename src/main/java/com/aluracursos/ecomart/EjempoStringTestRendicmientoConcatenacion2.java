package com.aluracursos.ecomart;


public class EjempoStringTestRendicmientoConcatenacion2 {
    public static void main(String[] args) {


        //------variables de entrada Método  append()------------------
        String a="a";
        String b="b";

        System.out.println("---DEMOSTRACION DE METODOS BUILDER---");
        System.out.println("variables de entrada: a = " +a+ " , b= " + b +"\n");

        System.out.println("1. MÉTODO: append() (agregar al final)");
        StringBuilder sbAppend = new StringBuilder("Hola "); //inicial hola

        //Encadenamiento de append
        sbAppend.append("mundo ").append(a).append(b);
        System.out.println("Estado después de append:"+sbAppend);//Resultado
        System.out.println("---------------------------------------------------\n");

        //==============METODO 2: insert======================================
        System.out.println("2. METODO : insert(offset. str)(Insertar en posicion)");
        StringBuilder sbInsert = new StringBuilder("Java parece fácil "); //inicial "java parece fácil

        //Insertamos la variable b en el indice 9 después de "es"

        int indice = 9;

        System.out.println("Estado despúes de insert " + sbInsert);//resultado
        System.out.println("======================================");

        //==========================================================================
        // METODO 3.  delete()

        System.out.println("3. Metodo : delete(start, end)( Eliminar rango");
        StringBuilder sbDelete = new StringBuilder("esteesuntexto"); //inicio

        //eliminamos "esun" ( índice 4-5-6).
        // va desde el índice 4 (incluido) hasta el 8 (excluido)
        System.out.println("rango a eliminar: del índice 4 al 8 (excluido)");

        sbDelete.delete(4 , 8);
        System.out.println("Estado despúes de delete : " +sbDelete);
        System.out.print("=============================================\n");

        //----------METODO 4: replace---------------------------------------
        System.out.print("4. METODO: replace(star , end, str) (Reemplazar rango)");
        StringBuilder sbReplace = new StringBuilder("versión 1.0.0");//inicio
        //reemplazamos el primer "0" con la variable b
        sbReplace.replace(10,11,b);
        System.out.print("Estado después del 1er replace " + sbReplace);//resultado

        //reemplazamos toda la palabrea version con a
        sbReplace.replace(0,7,a);

        System.out.print("Estado despúes de 2do replace: " + sbReplace);//resultado
        System.out.print("------------------------------------------'\n");

        // MÉTODO 5: reverse()
        // ====================================================
        System.out.println("5. MÉTODO: reverse() (Invertir cadena)");
        StringBuilder sbReverse = new StringBuilder(a);
        sbReverse.append(b).append("cdefg"); // Inicial: "abcdefg"

        System.out.println("Cadena original: " + sbReverse);

        sbReverse.reverse();

        System.out.println("Estado después de reverse: " + sbReverse); // Resultado: "gfedcba"
        System.out.println("----------------------------------------------\n");


        // ====================================================
        // MÉTODO 6: toString()
        // ====================================================
        System.out.println("6. MÉTODO: toString() (Convertir a String inmutable)");
        StringBuilder sbToString = new StringBuilder("Proceso finalizado");

        // Trabajamos con el StringBuilder
        sbToString.append(" con éxito.");

        // Convertimos el contenido final del StringBuilder a un String
        String resultadoFinal = sbToString.toString();

        System.out.println("Contenido del StringBuilder: " + sbToString);
        System.out.println("Resultado como objeto String: " + resultadoFinal);
        System.out.println("Tipo de dato de 'resultadoFinal': String");
        System.out.println("----------------------------------------------\n");
    }
}






