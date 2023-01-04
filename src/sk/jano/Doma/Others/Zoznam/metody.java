package sk.jano.Doma.Others.Zoznam;

import java.util.Scanner;
public class metody {

    public static Scanner input = new Scanner(System.in);
    public static String vmeno;
    public static String vymeno;
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int w = 0;


    public static void pridat() {
        System.out.printf("zadaj meno na pridatie");
        Zoznam.mena[a] = input.next();
        a++;
    }


    public static void vymazat() {
        System.out.printf("zadaj meno na vymazanie ");
        vmeno = input.next();
        while (true) {
            if (b > (1000 - 1)) {
                System.out.println("toto meno nemam v databaze \n \n \n");
                break;
            }

            if (Zoznam.mena[b].equals(vmeno)) {
                Zoznam.mena[b] = "";
                b = 0;
                System.out.printf("vymazane");
                break;
            } else {
                b++;
            }

        }

    }

    public static void vyhladat() {
        System.out.printf("zadaj meno ktore chces vyhladat");
        vymeno = input.next();
        while (w == 0) {
            if (c > (1000 - 1)) {
                c = 0;
                System.out.printf("toto meno v databaze nemam \n \n \n");
                w++;
            }
            if (vymeno.equals(Zoznam.mena[c])) {
                System.out.println(" toto meno" + Zoznam.mena[c] + " v databaze mam\n");
                break;
            } else {
                c++;
            }

        }
    }

    public static void ukazat() {
        for (int z = 0; z < a; z++) {
            System.out.println(Zoznam.mena[z]);
        }
    }
}
