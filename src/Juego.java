import java.util.Scanner;
import java.util.Random;

import java.util.Random;

public class Juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n" +
                "██████╗░░█████╗░░██████╗░██╗███╗░░██╗░██████╗░  ███████╗██╗░██████╗████████╗░██████╗\n" +
                "██╔══██╗██╔══██╗██╔════╝░██║████╗░██║██╔════╝░  ██╔════╝██║██╔════╝╚══██╔══╝██╔════╝\n" +
                "██████╔╝███████║██║░░██╗░██║██╔██╗██║██║░░██╗░  █████╗░░██║╚█████╗░░░░██║░░░╚█████╗░\n" +
                "██╔══██╗██╔══██║██║░░╚██╗██║██║╚████║██║░░╚██╗  ██╔══╝░░██║░╚═══██╗░░░██║░░░░╚═══██╗\n" +
                "██║░░██║██║░░██║╚██████╔╝██║██║░╚███║╚██████╔╝  ██║░░░░░██║██████╔╝░░░██║░░░██████╔╝\n" +
                "╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░╚═╝╚═╝░░╚══╝░╚═════╝░  ╚═╝░░░░░╚═╝╚═════╝░░░░╚═╝░░░╚═════╝░");

        System.out.println("Vienvenido al juego, pulse enter para comenzar ");
        scan.nextLine();
        int pocion1 = 2;
        float total1 = 0;
        float velocidad1 = 0;
        float ataque1 = 0;
        float defensa1 = 0;
        float vida1 = 1;

        float total2 = 0;
        float velocidad2 = 0;
        float ataque2 = 0;
        float defensa2 = 0;
        float vida2 = 0;

        int pocion2 = 2;
        int cura = 50;

        int opccion = 0;

        while (opccion != 3) {
            System.out.println("Presione 1 para seleccionar los atributos de los personajes.\n" +
                    "Presione 2 para elegir personajes por defecto \n" +
                    "Presione 3 para comenzar el juego \n");
            opccion = scan.nextInt();

            switch (opccion) {
                case 1:
                    total1=0;
                    velocidad1 = 0;
                    ataque1 = 0;
                    defensa1 = 0;
                    vida1 = 0;

                    total2 = 0;
                    velocidad2 = 0;
                    ataque2 = 0;
                    defensa2 = 0;
                    vida2 = 0;
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

                        if (total1 < 4 || total1 > 500) {
                            System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total1);
                        }
                    }


                    System.out.println("¡Total aceptado! El total de puntos es: " + total1);
                    System.out.println("Ahora selecciona las estadisticas de tu rival: ");
                    //personaje2

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
                        total2 = total2 + vida2;

                        if (total2 < 4 || total2 > 500) {
                            System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total2);
                        }
                    }
                    System.out.println("¡Total aceptado! El total de puntos es: " + total2);

                    break;
                case 2:
                    System.out.println("Personaje 1: Thalrik, el Escudo Indomable\n" +
                            "Un guerrero de acero y honor, listo para proteger a sus aliados mientras aplasta a sus enemigos.\n" +
                            "Daño: 50\n" +
                            "Defensa: 130\n" +
                            "Vida: 130\n" +
                            "Velocidad: 140\n" +
                            "Descripción: Con su robusta defensa y fuerza imponente, Thalrik destaca como un muro infranqueable en el campo de batalla. " +
                            "Aunque lento, cada golpe suyo cuenta.");
                    System.out.println("                 ,#####,\n" +
                            "                 #_   _#\n" +
                            "                 |a` `a|\n" +
                            "                 |  u  |\n" +
                            "                 \\  =  /\n" +
                            "                 |\\___/|\n" +
                            "        ___ ____/:     :\\____ ___\n" +
                            "      .'   `.-===-\\   /-===-.`   '.\n" +
                            "     /      .-\"\"\"\"\"-.-\"\"\"\"\"-.      \\\n" +
                            "    /'             =:=             '\\\n" +
                            "  .'  ' .:    o   -=:=-   o    :. '  `.\n" +
                            "  (.'   /'. '-.....-'-.....-' .'\\   '.)\n" +
                            "  /' ._/   \".     --:--     .\"   \\_. '\\\n" +
                            " |  .'|      \".  ---:---  .\"      |'.  |\n" +
                            " |  : |       |  ---:---  |       | :  |\n" +
                            "  \\ : |       |_____._____|       | : /\n" +
                            "  /   (       |----|------|       )   \\\n" +
                            " /... .|      |    |      |      |. ...\\\n" +
                            "|::::/'' jgs /     |       \\     ''\\::::|\n" +
                            "'\"\"\"\"       /'    .L_      `\\       \"\"\"\"'\n" +
                            "           /'-.,__/` `\\__..-'\\\n" +
                            "          ;      /     \\      ;\n" +
                            "          :     /       \\     |\n" +
                            "          |    /         \\.   |\n" +
                            "          |`../           |  ,/\n" +
                            "          ( _ )           |  _)\n" +
                            "          |   |           |   |\n" +
                            "          |___|           \\___|\n" +
                            "          :===|            |==|\n" +
                            "           \\  /            |__|\n" +
                            "           /\\/\\           /\"\"\"`8.__\n" +
                            "           |oo|           \\__.//___)\n" +
                            "           |==|\n" +
                            "           \\__/");
                    System.out.println("Si desea este personaje pulse 1\n"+
                    "\n" +
                            "\n");



                    //personaje2
                    System.out.println("Personaje 2: Sylara, la Flecha Sombría\n" +
                            "Una arquera veloz y letal que acecha desde las sombras, eliminando a sus enemigos antes de que puedan reaccionar.\n" +
                            "Daño: 60\n" +
                            "Defensa: 110\n" +
                            "Vida: 140\n" +
                            "Velocidad: 130\n" +
                            "Descripción: Sylara combina rapidez y precisión para desgastar a sus enemigos desde la distancia. " +
                            "Su agilidad es su mejor defensa, pero es vulnerable en combates prolongados.");
                    System.out.println(" .-.\n" +
                            "          [.-''-.,\n" +
                            "          |  //`~\\)\n" +
                            "          (<| 0\\0|>_\n" +
                            "          \";\\  _\"/ \\\\_ _,\n" +
                            "         __\\|'._/_  \\ '='-,\n" +
                            "        /\\ \\    || )_///_\\>>\n" +
                            "       (  '._ T |\\ | _/),-'\n" +
                            "        '.   '._.-' /'/ |\n" +
                            "        | '._   _.'`-.._/\n" +
                            "        ,\\ / '-' |/\n" +
                            "        [_/\\-----j\n" +
                            "   _.--.__[_.--'_\\__\n" +
                            "  /         `--'    '---._\n" +
                            " /  '---.  -'. .'  _.--   '.\n" +
                            " \\_      '--.___ _;.-o     /\n" +
                            "   '.__ ___/______.__8----'\n" +
                            "     c-'----'");
                    System.out.println("si desea este personaje pulse 2\n" +
                            "\n" +
                            "\n");


                    //personaje3
                    System.out.println("Personaje 3: Kaelthor, el Sabio de las Llamas\n" +
                            "Un maestro del fuego arcano cuyo poder destructivo puede cambiar el curso de cualquier batalla.\n" +
                            "Daño: 70\n" +
                            "Defensa: 120\n" +
                            "Vida: 140\n" +
                            "Velocidad: 120\n" +
                            "Descripción: Kaelthor desata conjuros devastadores con un dominio absoluto del fuego. " +
                            "Su resistencia moderada le permite sostenerse lo suficiente para acabar con sus adversarios, pero no es el más rápido.");
                    System.out.println("                                                      ____\n" +
                            "                                                     /    `.\n" +
                            "                                                    /-----.|          ____\n" +
                            "                                                ___/___.---`--.__.---'    `--.\n" +
                            "                                  _______.-----'           __.--'             )\n" +
                            "                              ,--'---.______________..----'(  __         __.-'\n" +
                            "                                        `---.___,-.|(a (a) /-'  )___.---'\n" +
                            "                                                `-.>------<__.-'\n" +
                            "            ______                       _____..--'      //\n" +
                            "    __.----'      `---._                `._.--._______.-'/))\n" +
                            ",--'---.__              -_                  _.-(`-.____.'// \\\n" +
                            "          `-._            `---.________.---'    >\\      /<   \\\n" +
                            "              \\_             `--.___            \\ \\-__-/ /    \\\n" +
                            "                \\_                  `----._______\\ \\  / /__    \\\n" +
                            "                  \\                      /  |,-------'-'\\  `-.__\\\n" +
                            "                   \\                    (   ||            \\      )\n" +
                            "                    `\\                   \\  ||            /\\    /\n" +
                            "                      \\                   >-||  @)    @) /\\    /\n" +
                            "                      \\                  ((_||           \\ \\_.'|\n" +
                            "                       \\                    ||            `-'  |\n" +
                            "                       \\                    ||             /   |\n" +
                            "                        \\                   ||            (   '|\n" +
                            "                        \\                   ||  @)     @)  \\   |\n" +
                            "                         \\                  ||              \\  )\n" +
                            "                          `\\_               `|__         ____\\ |\n" +
                            "                             \\_               | ``----'''     \\|\n" +
                            "                               \\_              \\    .--___    |)\n" +
                            "                                 `-.__          \\   |     \\   |\n" +
                            "                                      `----.___  \\^/|      \\/\\|\n" +
                            "                                               `--\\ \\-._  / | |  \n" +
                            "                                                   \\ \\  `'  \\ \\\n" +
                            "                                            __...--'  )     (  `-._\n" +
                            "                                           (_        /       `.    `-.__\n" +
                            "                                             `--.__.'          `.       )\n" +
                            "                                                                 `.__.-'");
                    System.out.println("si desea este personaje pulse 3\n" +
                            "\n" +
                            "\n");

                    System.out.println("Elija el primer personaje:");
                    int personaje1= scan.nextInt();
                    System.out.println("Elija el segundo personaje:");
                    int personaje2= scan.nextInt();
                    if (personaje1==1){
                         velocidad1 = 140;
                         ataque1 = 50;
                         defensa1 = 130;
                         vida1 = 130;
                    } else if (personaje1==2) {
                        velocidad1 = 130;
                        ataque1 = 60;
                        defensa1 = 110;
                        vida1 = 140;
                    } else if (personaje1==3) {
                        velocidad1 = 120;
                        ataque1 = 70;
                        defensa1 = 120;
                        vida1 = 140;
                    }
                    //personaje 2
                    if (personaje2==1){
                        velocidad2 = 140;
                        ataque2 = 50;
                        defensa2 = 130;
                        vida2 = 130;
                    } else if (personaje2==2) {
                        velocidad2 = 130;
                        ataque2 = 60;
                        defensa2 = 110;
                        vida2 = 140;
                    } else if (personaje2==3) {
                        velocidad2 = 120;
                        ataque2 = 70;
                        defensa2 = 120;
                        vida2 = 140;
                    }


                    break;
                case 3:
                    System.out.println("¡La batalla ha comenzado!");
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
        float golpe = 0;
        float mitigacion = 0;
        int ronda=1;

        while (vida2 > 0 && vida1 > 0) {
            System.out.println("Ronda "+ronda);
            //Caso en el que el jugador 1 tengamas velocidad que el jugador 2

                int aleatorio = 0;
                if (velocidad1 > velocidad2) {

                    //jugador 1 empieza
                    System.out.println("TURNO DEL JUGADOR 1 ");
                    System.out.println("Para atque pulse 1, para curarse pulse 2");
                    System.out.println("Tienes " + vida1 + " de vida ");
                    accion = scan.nextInt();
                    switch (accion) {
                        case 1:
                            golpe = 0;
                            float randomNumber = 0.8f + random.nextFloat();
                            mitigacion = 0;
                            mitigacion = defensa2 / (defensa2 + 100);

                            if (randomNumber >= 1.5) {
                                golpe = (ataque1 * mitigacion) * randomNumber;
                                System.out.println("Has asestado un golpe critico de" + golpe);
                                vida2 = vida2 - golpe;
                                System.out.println("La vida del jugador 2 es de " + vida2+"\n" +
                                        "\n");
                            } else if (randomNumber >= 1.0) {
                                golpe = (ataque1 * mitigacion) * randomNumber;
                                System.out.println("Has asestado un golpe normal de " + golpe);
                                vida2 = vida2 - golpe;
                                System.out.println("La vida del jugador 2 es de " + vida2+"\n" +
                                        "\n");
                            } else {
                                golpe = (ataque1 * mitigacion) * randomNumber;
                                System.out.println("Has asestado un golpe debil de " + golpe);
                                vida2 = vida2 - golpe;
                                System.out.println("La vida del jugador 2 es de " + vida2+"\n" +
                                        "\n");
                            }

                            break;
                        case 2:
                            if (pocion1 != 0) {
                                vida1 = vida1 + cura;
                                System.out.println("Tu vida ha subido a " + vida1);
                                pocion1--;
                                System.out.println("Te quedan "+pocion1+" pociones\n" +
                                        "\n");
                            } else {
                                System.out.println("No te quedan pociones, has gastado tu turno\n" +
                                        "\n");
                            }

                            break;
                    }


                        //ahora ataca jugador 2

                    if (vida2>0) {
                        System.out.println("TURNO DEL JUGADOR 2 ");
                        System.out.println("Para atque pulse 1, para curarse pulse 2 ");
                        System.out.println("Tienes " + vida2 + " de vida ");
                        accion = scan.nextInt();
                        switch (accion) {
                            case 1:
                                golpe = 0;
                                float randomNumber = 0.8f + random.nextFloat();
                                mitigacion = 0;
                                mitigacion = defensa1 / (defensa1 + 100);
                                if (randomNumber >= 1.4) {
                                    golpe = (ataque2 * mitigacion) * randomNumber;
                                    System.out.println("Has asestado un golpe critico de " + golpe);
                                    vida1 = vida1 - golpe;
                                    System.out.println("La vida del jugador 1 es de " + vida1+"\n" +
                                            "\n");
                                } else if (randomNumber >= 1.0) {
                                    golpe = (ataque2 * mitigacion) * randomNumber;
                                    System.out.println("Has asestado un golpe normal de " + golpe);
                                    vida1 = vida1 - golpe;
                                    System.out.println("La vida del jugador 1 es de " + vida1+"\n" +
                                            "\n");
                                } else {
                                    golpe = (ataque2 * mitigacion) * randomNumber;
                                    System.out.println("Has asestado un golpe debil de " + golpe);
                                    vida1 = vida1 - golpe;
                                    System.out.println("La vida del jugador 1 es de " + vida1+"\n" +
                                            "\n");
                                }
                                break;
                            case 2:
                                if (pocion2 != 0) {
                                    vida2 = vida2 + cura;
                                    System.out.println("Tu vida ha subido a " + vida2);
                                    pocion2--;
                                    System.out.println("Te quedan "+pocion2+" pociones\n" +
                                            "\n");
                                } else {
                                    System.out.println("No te quedan pociones, has gastado tu turno \n" +
                                            "\n");
                                }

                                break;
                        }
                    }else {
                        System.out.println("el jugador 2 ha muerto ");
                    }
                    //jugador 2 tiene mas velocidad que jugador 1

                } else {

                    System.out.println("TURNO DEL JUGADOR 2 ");
                    System.out.println("Para atque pulse 1, para curarse pulse 2 ");
                    System.out.println("Tienes " + vida2 + " de vida ");
                    accion = scan.nextInt();
                    switch (accion) {
                        case 1:
                            golpe = 0;
                            float randomNumber = 0.8f + random.nextFloat();
                            mitigacion = 0;
                            mitigacion = defensa2 / (defensa2 + 100);
                            if (randomNumber >= 1.5) {
                                golpe = (ataque2 * mitigacion) * randomNumber;
                                System.out.println("Has asestado un golpe critico de " + golpe);
                                vida1 = vida1 - golpe;
                                System.out.println("La vida del jugador 1 es de " + vida1+"\n" +
                                        "\n");
                            }
                            else if (randomNumber>=1.0) {
                                golpe = (ataque2 * mitigacion) * randomNumber;
                                System.out.println("Has asestado un golpe normal de " + golpe);
                                vida1 = vida1 - golpe;
                                System.out.println("La vida del jugador 1 es de " + vida1+"\n" +
                                        "\n");
                            } else {
                                golpe = (ataque2 * mitigacion) * randomNumber;
                                System.out.println("Has asestado un golpe debil de " + golpe);
                                vida1 = vida1 - golpe;
                                System.out.println("La vida del jugador 1 es de " + vida1+"\n" +
                                        "\n");
                            }
                            break;
                        case 2:
                            if (pocion2 != 0) {
                                vida2 = vida2 + cura;
                                System.out.println("Tu vida ha subido a " + vida2);
                                pocion2--;
                                System.out.println("Te quedan "+pocion2+" pociones \n" +
                                        "\n");
                            } else {
                                System.out.println("No te quedan pociones, has gastado tu turno \n" +
                                        "\n");
                            }

                            break;
                    }
                    //ataca el jugador 1
                    if (vida1>0) {
                        System.out.println("TURNO DEL JUGADOR 1 ");
                        System.out.println("Para atque pulse 1, para curarse pulse 2 ");
                        System.out.println("Tienes " + vida1 + " de vida ");
                        accion = scan.nextInt();
                        switch (accion) {
                            case 1:
                                golpe = 0;
                                float randomNumber = 0.8f + random.nextFloat();
                                mitigacion = 0;
                                mitigacion = defensa2 / (defensa2 + 100);
                                if (randomNumber >= 1.5) {
                                    golpe = (ataque1 * mitigacion) * randomNumber;
                                    System.out.println("Has asestado un golpe critico de " + golpe);
                                    vida2 = vida2 - golpe;
                                    System.out.println("La vida del jugador 2 es de " + vida2+"\n" +
                                            "\n");
                                }
                                if (randomNumber>=1.0) {
                                    golpe = (ataque1 * mitigacion) * randomNumber;
                                    System.out.println("Has asestado un golpe normal de " + golpe);
                                    vida2 = vida2 - golpe;
                                    System.out.println("La vida del jugador 2 es de " + vida2+"\n" +
                                            "\n");
                                } else {
                                    golpe = (ataque1 * mitigacion) * randomNumber;
                                    System.out.println("Has asestado un golpe debil de " + golpe);
                                    vida2 = vida2 - golpe;
                                    System.out.println("La vida del jugador 2 es de " + vida2+"\n" +
                                            "\n");
                                }
                                break;
                            case 2:
                                if (pocion1 != 0) {
                                    vida1 = vida1 + cura;
                                    System.out.println("Tu vida ha subido a " + vida1);
                                    pocion1--;
                                    System.out.println("Te quedan "+pocion1+" pociones \n" +
                                            "\n");
                                } else {
                                    System.out.println("No te quedan pociones, has gastado tu turno \n" +
                                            "\n");
                                }

                                break;
                        }
                    }
                }

            ronda++;

        }
        if (vida1<=0){
            System.out.println("El jugador 1 ha muerto");
        } else if (vida2<=0) {
            System.out.println("El jugador 2 ha muerto");
        }
    }
}




