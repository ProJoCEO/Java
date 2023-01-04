package sk.jano.Doma.Others.Zoznam;

import java.util.Scanner;

public class Zoznam {

    public static Scanner input = new Scanner(System.in);
    public static String mena[] = new String[1000];
    static int w = 0;


    public static void main(String[] args) {
//        mena[0] = "julia";
//        mena[1] = "martin";
//        mena[2] = "bea";
//        mena[3] = "misko";
//        mena[4] = "dominika";
//        mena[5] = "jano";
        Scanner input = new Scanner(System.in);
        String operacia;

        while (w == 0) {
            System.out.println("aku operaciu chces spravit? moznosti su 'pridat' + 'vymazat' + 'vyhladat' + 'ukazat'(ukaze vsetky mena v databaze) a sokncit skoncim");
            operacia = input.next();
            switch (operacia) {
                case "pridat":
                    metody.pridat();
                    break;

                case "vymazat":
                    metody.vymazat();
                    break;

                case "vyhladat":
                    metody.vyhladat();
                    break;

                case "ukazat":
                    metody.ukazat();
                    break;

                case "skoncit":
                    w++;
                    break;

                default:
                    System.out.println("tuto operaciu nepoznam");
                    operacia = "";
            }
        }
    }
}
