import java.util.Scanner;

import java.util.Random;

public class Juego {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int total1 = 0;

        while (total1 < 4 || total1 > 500) {
            int velocidad1 = 0;
            while (velocidad1 < 1 || velocidad1 > 200) {
                System.out.println("Seleccione su velocidad (entre 1 y 200): ");
                velocidad1 = scan.nextInt();
                if (velocidad1 < 1 || velocidad1 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total1 = total1 + velocidad1;

            int ataque1 = 0;
            while (ataque1 < 1 || ataque1 > 200) {
                System.out.println("Seleccione su ataque (entre 1 y 200): ");
                ataque1 = scan.nextInt();
                if (ataque1 < 1 || ataque1 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total1 = total1 + ataque1;

            int defensa1 = 0;
            while (defensa1 < 1 || defensa1 > 200) {
                System.out.println("Seleccione su defensa (entre 1 y 200): ");
                defensa1 = scan.nextInt();
                if (defensa1 < 1 || defensa1 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total1 = total1 + defensa1;

            int vida1 = 0;
            while (vida1 < 1 || vida1 > 200) {
                System.out.println("Seleccione su vida (entre 1 y 200): ");
                vida1 = scan.nextInt();
                if (vida1 < 1 || vida1 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total1 = total1 + vida1;

            if (total1 < 4 || total1 > 500) {
                System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total1);
            }
         }

         System.out.println("¡Total aceptado! El total de puntos es: " + total1);

        //personaje2
        int total2 = 0;
        System.out.println("Ahora cree el personaje 2 ");
        while (total2 < 4 || total2 > 500) {
            int velocidad2 = 0;
            while (velocidad2 < 1 || velocidad2 > 200) {
                System.out.println("Seleccione su velocidad (entre 1 y 200): ");
                velocidad2 = scan.nextInt();
                if (velocidad2 < 1 || velocidad2 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total2 = total2 + velocidad2;

            int ataque2 = 0;
            while (ataque2 < 1 || ataque2 > 200) {
                System.out.println("Seleccione su ataque (entre 1 y 200): ");
                ataque2 = scan.nextInt();
                if (ataque2 < 1 || ataque2 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total2 = total2 + ataque2;

            int defensa2 = 0;
            while (defensa2 < 1 || defensa2 > 200) {
                System.out.println("Seleccione su defensa (entre 1 y 200): ");
                defensa2 = scan.nextInt();
                if (defensa2 < 1 || defensa2 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total2 = total2 + defensa2;

            int vida2 = 0;
            while (vida2 < 1 || vida2 > 200) {
                System.out.println("Seleccione su vida (entre 1 y 200): ");
                vida2 = scan.nextInt();
                if (vida2 < 1 || vida2 > 200) {
                    System.out.println("Los valores deben ser entre 1 y 200");
                }
            }
            total2 = total2 + vida2;

            if (total1 < 4 || total1 > 500) {
                System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total1);
            }
        }

        System.out.println("¡Total aceptado! El total de puntos es: " + total1);

    }

        }





