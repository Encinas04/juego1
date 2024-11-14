import java.util.Scanner;
import java.util.Random;

import java.util.Random;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random=new Random();
        int total1 = 0;
        System.out.println("\n" +
                "██████╗░░█████╗░░██████╗░██╗███╗░░██╗░██████╗░  ███████╗██╗░██████╗████████╗░██████╗\n" +
                "██╔══██╗██╔══██╗██╔════╝░██║████╗░██║██╔════╝░  ██╔════╝██║██╔════╝╚══██╔══╝██╔════╝\n" +
                "██████╔╝███████║██║░░██╗░██║██╔██╗██║██║░░██╗░  █████╗░░██║╚█████╗░░░░██║░░░╚█████╗░\n" +
                "██╔══██╗██╔══██║██║░░╚██╗██║██║╚████║██║░░╚██╗  ██╔══╝░░██║░╚═══██╗░░░██║░░░░╚═══██╗\n" +
                "██║░░██║██║░░██║╚██████╔╝██║██║░╚███║╚██████╔╝  ██║░░░░░██║██████╔╝░░░██║░░░██████╔╝\n" +
                "╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░  ╚═╝░░░░░╚═╝╚═════╝░░░░╚═╝░░░╚═════╝░");

        System.out.println("Vienvenido al juego, pulse enter para comenzar ");
        scan.nextLine();
        int pocion1=2;
        int velocidad1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int vida1 = 0;
        int critico1 = 0;

        int velocidad2 = 0;
        int ataque2 = 0;
        int defensa2 = 0;
        int vida2 = 0;
        int critico2 = 0;

        int pocion2=2;
        int cura=50;

        int opccion=0;

        while (opccion != 3) {
            System.out.println("Presione 1 para seleccionar los atributos de los personajes.\n" +
                    "Presione 2 para elegir personajes por defecto \n" +
                    "Presione 3 para comenzar el juego \n");
           opccion = scan.nextInt();

            switch (opccion) {
                case 1:
                    System.out.println("Empezemos con el primer personaje: ");
                    while (total1 < 4 || total1 > 500) {

                        while (velocidad1 < 1 || velocidad1 > 200) {
                            System.out.println("Seleccione su velocidad (entre 1 y 200): ");
                            velocidad1 = scan.nextInt();
                            if (velocidad1 < 1 || velocidad1 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }

                        total1 = total1 + velocidad1;


                        while (ataque1 < 1 || ataque1 > 200) {
                            System.out.println("Seleccione su ataque (entre 1 y 200): ");
                            ataque1 = scan.nextInt();
                            if (ataque1 < 1 || ataque1 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total1 = total1 + ataque1;


                        while (defensa1 < 1 || defensa1 > 200) {
                            System.out.println("Seleccione su defensa (entre 1 y 200): ");
                            defensa1 = scan.nextInt();
                            if (defensa1 < 1 || defensa1 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total1 = total1 + defensa1;


                        while (vida1 < 1 || vida1 > 200) {
                            System.out.println("Seleccione su vida (entre 1 y 200): ");
                            vida1 = scan.nextInt();
                            if (vida1 < 1 || vida1 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total1 = total1 + vida1;
                        while (critico1 < 1 || critico1 > 200) {
                            System.out.println("Seleccione su critico (entre 1 y 200): ");
                            critico1 = scan.nextInt();
                            if (critico1 < 1 || critico1 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total1 = total1 + critico1;

                        if (total1 < 4 || total1 > 500) {
                            System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total1);
                        }
                    }


                    System.out.println("¡Total aceptado! El total de puntos es: " + total1);
                    System.out.println("Ahora selecciona las estadisticas e tu rival: ");
                    //personaje2
                    int total2 = 0;
                    while (total2 < 4 || total2 > 500) {

                        while (velocidad2 < 1 || velocidad2 > 200) {
                            System.out.println("Seleccione su velocidad (entre 1 y 200): ");
                            velocidad2 = scan.nextInt();
                            if (velocidad2 < 1 || velocidad2 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total2 = total2 + velocidad2;


                        while (ataque2 < 1 || ataque2 > 200) {
                            System.out.println("Seleccione su ataque (entre 1 y 200): ");
                            ataque2 = scan.nextInt();
                            if (ataque2 < 1 || ataque2 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total2 = total2 + ataque2;


                        while (defensa2 < 1 || defensa2 > 200) {
                            System.out.println("Seleccione su defensa (entre 1 y 200): ");
                            defensa2 = scan.nextInt();
                            if (defensa2 < 1 || defensa2 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total2 = total2 + defensa2;


                        while (vida2 < 1 || vida2 > 200) {
                            System.out.println("Seleccione su vida (entre 1 y 200): ");
                            vida2 = scan.nextInt();
                            if (vida2 < 1 || vida2 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total1 = total1 + vida2;
                        while (critico2 < 1 || critico2 > 200) {
                            System.out.println("Seleccione su critico (entre 1 y 200): ");
                            critico2 = scan.nextInt();
                            if (critico2 < 1 || critico2 > 200) {
                                System.out.println("Los valores deben ser entre 1 y 200");
                            }
                        }
                        total2 = total2 + critico2;

                        if (total2 < 4 || total2 > 500) {
                            System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total2);
                        }
                    }
                    System.out.println("¡Total aceptado! El total de puntos es: " + total2);

                    break;
                case 2:
                    System.out.println("Si");
                    break;
                case 3:
                    System.out.println("Empieza la batalla!!");
                    System.out.println("─────────────────────────────▄██▄\n" +
                            "─────────────────────────────▀███\n" +
                            "────────────────────────────────█\n" +
                            "───────────────▄▄▄▄▄────────────█\n" +
                            "──────────────▀▄────▀▄──────────█\n" +
                            "──────────▄▀▀▀▄─█▄▄▄▄█▄▄─▄▀▀▀▄──█\n" +
                            "─────────█──▄──█────────█───▄─█─█\n" +
                            "─────────▀▄───▄▀────────▀▄───▄▀─█\n" +
                            "──────────█▀▀▀────────────▀▀▀─█─█\n" +
                            "──────────█───────────────────█─█\n" +
                            "▄▀▄▄▀▄────█──▄█▀█▀█▀█▀█▀█▄────█─█\n" +
                            "█▒▒▒▒█────█──█████████████▄───█─█\n" +
                            "█▒▒▒▒█────█──██████████████▄──█─█\n" +
                            "█▒▒▒▒█────█───██████████████▄─█─█\n" +
                            "█▒▒▒▒█────█────██████████████─█─█\n" +
                            "█▒▒▒▒█────█───██████████████▀─█─█\n" +
                            "█▒▒▒▒█───██───██████████████──█─█\n" +
                            "▀████▀──██▀█──█████████████▀──█▄█\n" +
                            "──██───██──▀█──█▄█▄█▄█▄█▄█▀──▄█▀\n" +
                            "──██──██────▀█─────────────▄▀▓█\n" +
                            "──██─██──────▀█▀▄▄▄▄▄▄▄▄▄▀▀▓▓▓█\n" +
                            "──████────────█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                            "──███─────────█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                            "──██──────────█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                            "──██──────────█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                            "──██─────────▐█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                            "──██────────▐█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                            "──██───────▐█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▌\n" +
                            "──██──────▐█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▌\n" +
                            "──██─────▐█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▌\n" +
                            "──██────▐█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▌\n");

                    break;
            }
        }

        int accion = 0;

        while (vida2 >0 && vida1 >0) {
            int aleatorio=0;
            if (velocidad1 > velocidad2) {
                //jugador 1 empieza
                System.out.println("COMIENZA EL JUGADOR 1");
                System.out.println("Para atque pulse 1, para curarse pulse 2");
                System.out.println("Tienes "+vida1+" de vida ");
                accion= scan.nextInt();
                switch(accion){
                    case 1:
                       vida2=vida2-ataque1;
                        System.out.println("La vida del jugador 2 es de "+vida2);

                        break;
                      case 2:
                          if (pocion1!=0){
                              vida1=vida1+cura;
                              System.out.println("Tu vida ha subido a "+vida1);
                          }else{
                              System.out.println("No te quedan pociones, has gastado tu turno");
                          }

                        break;
                }
                System.out.println("Turno del jugador 2 ");
                System.out.println("Para atque pulse 1, para curarse pulse 2");
                System.out.println("Tienes "+vida2+" de vida ");
                accion= scan.nextInt();
                switch(accion){
                    case 1:
                        vida1=vida1-ataque2;
                        System.out.println("La vida del jugador 1 es de "+vida1);

                        break;
                    case 2:
                        if (pocion1!=0){
                            vida2=vida2+cura;
                            System.out.println("Tu vida ha subido a "+vida2);
                        }else{
                            System.out.println("No te quedan pociones, has gastado tu turno");
                        }

                        break;
                }
            }else{
                //Jugador 2 empieza
                System.out.println("COMIENZA EL JUGADOR 2");
                System.out.println("Para atque pulse 1, para curarse pulse 2");
                System.out.println("Tienes "+vida2+" de vida ");
                accion= scan.nextInt();
                switch(accion){
                    case 1:
                        vida1=vida1-ataque2;
                        System.out.println("La vida del jugador 1 es de "+vida1);

                        break;
                    case 2:
                        if (pocion1!=0){
                            vida2=vida2+cura;
                            System.out.println("Tu vida ha subido a "+vida2);
                        }else{
                            System.out.println("No te quedan pociones, has gastado tu turno");
                        }

                        break;
                }
                System.out.println("Turno del jugador 1 ");
                System.out.println("Para atque pulse 1, para curarse pulse 2");
                System.out.println("Tienes "+vida1+" de vida ");
                accion= scan.nextInt();
                switch(accion){
                    case 1:
                        vida2=vida2-ataque1;
                        System.out.println("La vida del jugador 1 es de "+vida1);

                        break;
                    case 2:
                        if (pocion1!=0){
                            vida1=vida1+cura;
                            System.out.println("Tu vida ha subido a "+vida1);
                        }else{
                            System.out.println("No te quedan pociones, has gastado tu turno");
                        }

                        break;
                }
            }
        }


    }
}





