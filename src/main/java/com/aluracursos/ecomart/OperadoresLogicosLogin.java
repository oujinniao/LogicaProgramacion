package com.aluracursos.ecomart;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Eugenio";
        usernames[1] = "Admin";
        usernames[2] = "Juan";
        passwords[0] = "123456";
        passwords[1] = "654321";
        passwords[2] = "789";*/
       //====================================================================
        //==========otra forma de autenticar==================

       String[] usernames = {"Eugenio","Admin","Juan"};
        String[] passwords = {"123456","654321","789"};


        Scanner scanner = new Scanner(System.in);

        System.out.println(" INGRESA TU NOMBRE DE USUARIO:");

        String usuario = scanner.nextLine();

        System.out.println("INGRESA TU PASSWORD:");
        String pass = scanner.next();


        boolean esAutenticado = false;


        for (int i = 0; i < usernames.length; i++) {
            esAutenticado=(usernames[i].equalsIgnoreCase(usuario)&& passwords[i].equals(pass))? true:esAutenticado;

            /*if ((usernames[i].equalsIgnoreCase(usuario) && passwords[i].equals(pass))) {
                esAutenticado = true;
            break;

            }*/
        }
        String mensaje = esAutenticado? "Bienvenido usuario ".concat(usuario).concat("!"):
                "Username o contraseña incorrecto!!\nLo sentimos, intenta otra vez";
        System.out.println("mensaje :" +mensaje);
           /* if (esAutenticado) {
                System.out.println(" bienvenido ".concat(usuario).concat("!"));

            } else {
                System.out.println("Usuario incorrecto, intenta otra vez");

            }*/

        }
    }

