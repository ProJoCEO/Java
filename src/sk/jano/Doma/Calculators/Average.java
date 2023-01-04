package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj pocet cisel");
        int pocet = input.nextInt();

        double suma = 0;
        double priemer;

        int [] n = new int [pocet];

        for (int i = 0;  i < pocet; i++) {
            System.out.println("Zadaj " + (i + 1)  + " cislo");
            n[i] = input.nextInt();
            suma = n[i] + suma;

        }
        priemer = suma / pocet;
        System.out.println(priemer);


    }

}
