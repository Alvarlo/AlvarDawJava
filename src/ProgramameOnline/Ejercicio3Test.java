package ProgramameOnline;
import java.util.Scanner;
public class Ejercicio3Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                // Pedir el número de votaciones a procesar
                System.out.println("Introduce el número de votaciones (0 para terminar):");
                int num = Integer.parseInt(sc.nextLine().trim());

                if (num == 0) {
                    break;
                }

                String ganadorInfantil = "";
                String ganadorAdulto = "";
                int maxVotosInfantil = 0;
                int maxVotosAdulto = 0;
                boolean empateInfantil = false;
                boolean empateAdulto = false;

                for (int i = 0; i < num; i++) {
                    String ninot = sc.nextLine().trim();
                    boolean esInfantil = esInfantil(ninot);

                    if (esInfantil) {
                        int votos = contarVotos(ninot, sc, num);
                        if (votos > maxVotosInfantil) {
                            maxVotosInfantil = votos;
                            ganadorInfantil = ninot;
                            empateInfantil = false;
                        } else if (votos == maxVotosInfantil) {
                            empateInfantil = true;
                        }
                    } else {
                        int votos = contarVotos(ninot, sc, num);
                        if (votos > maxVotosAdulto) {
                            maxVotosAdulto = votos;
                            ganadorAdulto = ninot;
                            empateAdulto = false;
                        } else if (votos == maxVotosAdulto) {
                            empateAdulto = true;
                        }
                    }
                }

                // Determinar los ganadores
                if (empateInfantil) {
                    ganadorInfantil = "empate";
                }
                if (empateAdulto) {
                    ganadorAdulto = "EMPATE";
                }

                // Imprimir los resultados de los ganadores
                System.out.println(ganadorInfantil + " " + ganadorAdulto);
            }

            sc.close();
        }

        private static boolean esInfantil(String palabra) {
            for (int i = 0; i < palabra.length(); i++) {
                if (!Character.isLowerCase(palabra.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        private static int contarVotos(String ninot, Scanner sc, int num) {
            int contador = 0;
            for (int i = 0; i < num; i++) {
                if (ninot.equals(sc.nextLine().trim())) {
                    contador++;
                }
            }
            return contador;
        }
    }

