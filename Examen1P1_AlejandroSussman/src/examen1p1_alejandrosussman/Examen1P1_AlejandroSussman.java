/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_alejandrosussman;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Examen1P1_AlejandroSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("*****MENU*****");
        System.out.println("Ingrese una opcion");
        System.out.println("1. Fight or Flight!");
        System.out.println("2. Tri Fuerza");
        int opcion_m = read.nextInt();
        switch (opcion_m) {
            case 1:
                System.out.println("Bienvenido a Fight or Flight");
                System.out.println("Ingrese su maestria");
                System.out.println("1. Principiante(0% de probabilidad de incremento de daño)");
                System.out.println("2. Intermedio (5% de probabilidad de incremento de daño) ");
                System.out.println("3. Experto (15% de probabilidad de incremento de daño)");
                int maestria = read.nextInt();
                switch (maestria) {
                    case 1:
                        int bala = 25;
                        int zhealth = 25;
                        int distance = rand.nextInt(16) + 15;
                        String continuar = "S";

                        while (continuar.toUpperCase().equals("S") && zhealth > 0) {
                            System.out.println("El zombie esta a: " + distance);
                            System.out.println("");
                            System.out.println("El jugador cuenta con esta cantidad de balas: " + bala);
                            System.out.println("");
                            int prob = rand.nextInt(100);
                            if (prob <= 65) {
                                int hit = rand.nextInt(7);
                                zhealth = zhealth - hit;
                                if (zhealth < 0) {
                                    zhealth = 0;
                                }
                                System.out.println("Hit! El tiro ha reducido la vida del zombie por un total de: " + hit);
                                System.out.println("");

                            } else {
                                System.out.println("Has fallado el tiro!");
                                int posicion = rand.nextInt(3) + 2;
                                distance = distance - posicion;
                                if (distance < 0) {
                                    distance = 0;
                                }
                            }
                            bala = bala - 1;
                            System.out.println("Vida restante del zombie: " + zhealth);
                            System.out.println("El zombie se enceuntra a esta cantidad de metros: " + distance);

                            System.out.println("");

                            if (bala == 0) {
                                System.out.println("GAME OVER te quedaste sin balas!");
                                break;
                            } else if (zhealth == 0) {
                                System.out.println("YOU WIN! Has derrotado al zombie");

                                break;
                            } else if (distance == 0) {
                                System.out.println("GAME OVER! El zombie te ha alcanzado, la distancia esta en 0!");

                                break;
                            }

                            System.out.println("Deseas pasar a la siguiente ronda[s/n]?: ");
                            read.nextLine();
                            continuar = read.nextLine();
                        }
                    case 2:
                        int bala1 = 25;
                        int zhealth1 = 25;
                        int distance1 = rand.nextInt(16) + 15;
                        String continuar1 = "S";

                        while (continuar1.toUpperCase().equals("S") && zhealth1 > 0) {
                            System.out.println("El zombie esta a: " + distance1);
                            System.out.println("");
                            System.out.println("El jugador cuenta con esta cantidad de balas: " + bala1);
                            System.out.println("");
                            int prob1 = rand.nextInt(100);
                            if (prob1 <= 70) {
                                int hit1 = rand.nextInt(7);
                                zhealth1 = zhealth1 - hit1;
                                if (zhealth1 < 0) {
                                    zhealth1 = 0;
                                }
                                System.out.println("Hit! El tiro ha reducido la vida del zombie por un total de: " + hit1);
                                System.out.println("");

                            } else {
                                System.out.println("Has fallado el tiro!");
                                int posicion1 = rand.nextInt(3) + 2;
                                distance1 = distance1 - posicion1;
                                if (distance1 < 0) {
                                    distance1 = 0;
                                }
                            }
                            bala1 = bala1 - 1;
                            System.out.println("Vida restante del zombie: " + zhealth1);
                            System.out.println("El zombie se enceuntra a esta cantidad de metros: " + distance1);

                            System.out.println("");

                            if (bala1 == 0) {
                                System.out.println("GAME OVER te quedaste sin balas!");
                                break;
                            } else if (zhealth1 == 0) {
                                System.out.println("YOU WIN! Has derrotado al zombie");

                                break;
                            } else if (distance1 == 0) {
                                System.out.println("GAME OVER! El zombie te ha alcanzado, la distancia esta en 0!");

                                break;
                            }

                            System.out.println("Deseas pasar a la siguiente ronda[s/n]?: ");
                            read.nextLine();
                            continuar1 = read.nextLine();
                        }
                    case 3:
                        int bala2 = 25;
                        int zhealth2 = 25;
                        int distance2 = rand.nextInt(16) + 15;
                        String continuar2 = "S";

                        while (continuar2.toUpperCase().equals("S") && zhealth2 > 0) {
                            System.out.println("El zombie esta a: " + distance2);
                            System.out.println("");
                            System.out.println("El jugador cuenta con esta cantidad de balas: " + bala2);
                            System.out.println("");
                            int prob2 = rand.nextInt(100);
                            if (prob2 <= 65) {
                                int hit2 = rand.nextInt(7);
                                zhealth2 = zhealth2 - hit2;
                                if (zhealth2 < 0) {
                                    zhealth2 = 0;
                                }
                                System.out.println("Hit! El tiro ha reducido la vida del zombie por un total de: " + hit2);
                                System.out.println("");

                            } else {
                                System.out.println("Has fallado el tiro!");
                                int posicion2 = rand.nextInt(3) + 2;
                                distance2 = distance2 - posicion2;
                                if (distance2 < 0) {
                                    distance2 = 0;
                                }
                            }
                            bala2 = bala2 - 1;
                            System.out.println("Vida restante del zombie: " + zhealth2);
                            System.out.println("El zombie se enceuntra a esta cantidad de metros: " + distance2);

                            System.out.println("");

                            if (bala2 == 0) {
                                System.out.println("GAME OVER te quedaste sin balas!");
                                break;
                            } else if (zhealth2 == 0) {
                                System.out.println("YOU WIN! Has derrotado al zombie");

                                break;
                            } else if (distance2 == 0) {
                                System.out.println("GAME OVER! El zombie te ha alcanzado, la distancia esta en 0!");

                                break;
                            }

                            System.out.println("Deseas pasar a la siguiente ronda[s/n]?: ");
                            read.nextLine();
                            continuar2 = read.nextLine();
                        }

                }
                break;
            case 2:
                triFuerza();
                break;
            default:
                System.out.println("Solo puede ingresar 1 y 2");
        }
    }

    public static void triFuerza() {
        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido a Tri Fuerza");
        System.out.println("Ingrese un tamano para el triangulo: ");
        int num = read.nextInt();

        while (num < 20 && num % 2 == 1) {
            System.out.println("Ingrese un tamano para el triangulo: ");
            num = read.nextInt();
        }

        int mitad = num / 2;
        int cuarto = mitad / 2;
        int filas = (num - 1) / 2;
        int ctl = 0;

        for (int i = 0; i <= filas; i++) {
            for (int j = 0; j < num; j++) {
                if (j < (mitad - i) || j > (mitad + i)) {
                    System.out.print(" ");
                } else {
                    if (i < cuarto) {
                        System.out.print("*");
                    } else {

                        if (j < (cuarto + ctl) || j > (cuarto - ctl)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        
                    }
                }
            }
            System.out.println("");
            if (i >= cuarto)
                ctl++;
            
        }
    }

}
