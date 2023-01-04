package sk.jano.Doma.Hacking.H2;

import sk.jano.Doma.Hacking.ZLOM;

import java.util.Scanner;

public class hack2 {

        static Scanner input = new Scanner (System.in);
        static String Heslo;
        static String tip;

    public static void main(String[] args) throws InterruptedException {
            System.out.printf("zadaj heslo");
            Heslo = input.next();
        int S1 = (int) System.currentTimeMillis();


           Zlom2.ZLAM(Heslo,tip);

int S2 = (int) System.currentTimeMillis();


int milisekundy = S2-S1;
double sekundy = milisekundy / 1000;
double minuty = sekundy / 60;




                System.out.println("trvalo to " + milisekundy + " milisekund co je " + sekundy + " sekund a " + minuty + " minut ");
            System.out.println("heslo je " + tip);



        }


}
