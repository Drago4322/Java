package com.mycompany.mavenproject1;

import java.util.Scanner;

public class CasoDetective {

    public static void main(String[] args) {

        System.out.println("Hola, Detective");

        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("====================================");
            System.out.println(" DESPACHO HOLMES & ASOCIADOS");
            System.out.println(" Caso #1: HIDDEN");
            System.out.println("===============================");

            System.out.print("¿Cual es tu nombre?: ");
            String nombre = teclado.nextLine();
           
            Scanner pc = new Scanner(System.in);
            System.out.print("¿Cual es tu edad?: ");
            int edad = pc.nextInt();
            boolean casoResuelto = false;

           
            if (edad >= 60) {
                System.out.println("Detective senior con experiencia");
            } else if (edad >= 18 && edad <= 59) {
                System.out.println("¡Bienvenido al equipo de detectives!");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("Puedes ser detective junior");
            } else if (edad > 0 && edad < 12) {
                System.out.println("Eres muy joven para ser detective");
            } else {
                System.out.println("Ingrese una edad válida");
            }
            while (edad>=12 && !casoResuelto){
                Scanner sc = new Scanner(System.in);
                System.out.print("¿Cuantas pistas encontraste? ");
                int pistas = sc.nextInt();
   
               
                if (pistas >= 5) {
                    System.out.println("¡Eres un detective EXPERTO!");
                    System.out.println("Puedes resolver el caso.");
                } else if (pistas >= 3) {
                    System.out.println("Buen trabajo, detective.");
                    System.out.println("Necesitas unas pistas más.");
                } else if (pistas >= 1) {
                    System.out.println("Vas por buen camino...");
                    System.out.println("¡Sigue investigando!");
                } else if (pistas == 0) {
                    System.out.println("¡No has encontrado nada!");
                    System.out.println("Revisa la escena del crimen");
                } else {
                    System.out.println("Ingresa un numero valido");
                }
                int opcion;

                do {
                    System.out.println("\n--- MENU ---");
                    System.out.println("1. Buscar pistas");
                    System.out.println("2. Interrogar sospechosos");
                    System.out.println("3. Resolver el caso");
                    System.out.print("Elige una opción: ");
   
                    opcion = teclado.nextInt();
                    teclado.nextLine();
   
                    switch (opcion) {
   
                        case 1:
                            System.out.println("Buscando pistas...");
   
                            String[] evidencias = {
                                "Huella digital en la ventana",
                                "Copa de vino con residuos",
                                "Nota rasgada en el escritorio",
                                "Cuchillo en la cocina"
                            };
   
                            int i = 0;
   
                            while (i < evidencias.length) {
                                pistas++;
                                System.out.println("Pista #" + pistas + ": " + evidencias[i]);
                                i++;
                            }
   
                            System.out.println("Total de pistas: " + pistas);
                            break;
   
                        case 2:
                            System.out.println("Interrogando...");
   
                            String[] sospechosos = {
                                "James Barnes",
                                "Aurelio Vasquez",
                                "Victoria Reyes",
                                "Bruno Quiroga"
                            };
   
                            for (int j = 0; j < sospechosos.length; j++) {
                                System.out.println("Interrogando a: " + sospechosos[j]);
                                System.out.println("-> Dice que es inocente...");
                            }
                            break;
   
                        case 3:
                            System.out.println("Resolviendo...");
   
                            if (pistas >= 3) {
                                System.out.println("Tienes suficientes pistas.");
                                System.out.println("El culpable es: Aurelio Vasquez");
                                System.out.println("¡Caso resuelto, detective " + nombre + "!");
                                casoResuelto = true;
   
                            } else if (pistas >= 1) {
                                System.out.println("Tienes " + pistas + " pista(s). Necesitas 3.");
                                System.out.println("¡Sigue investigando!");
   
                            } else {
                                System.out.println("No tienes ninguna pista.");
                                System.out.println("Ve a buscar pistas primero.");
                            }
                            break;
   
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
   
                } while (!casoResuelto);
            }
        }
    }
}
