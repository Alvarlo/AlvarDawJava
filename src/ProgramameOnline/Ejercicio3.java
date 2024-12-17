package ProgramameOnline;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String numInsertado = sc.nextLine();
            int num = Integer.parseInt(numInsertado);
            String resultado = "";
            String votacionInfantil = "";
            String votacionAdulto = "";
            String voto = "";
            boolean esInfantil = true;
            boolean esAdulto = true;
            while (num >= 1 && num <= 1000) {
                for (int i = 0; i < num; i++) {
                    voto = sc.nextLine(); // PROBLEMA: ¿Cómo indicar que termina la cadena cuando hay un espacio?
                    if (voto.length() <= 20) {
                        for (int j = 0; j < voto.length(); j++) {
                            if (!(voto.charAt(j) >= 'a' && voto.charAt(j) <= 'z')) {
                                esInfantil = false;
                            } else {
                                esAdulto = false;
                            }
                        }
                        if (esAdulto) {
                            votacionAdulto += voto + " ";

                        } else if (esInfantil) {
                            votacionInfantil += voto + " ";
                        }
                    }
                }
                numInsertado = sc.nextLine();
                num = Integer.parseInt(numInsertado);
            }
            System.out.println(votacionAdulto);
            System.out.println(votacionInfantil);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
