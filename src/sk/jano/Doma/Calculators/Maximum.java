package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj pocet cisel");
        int pocet = input.nextInt();
        int maximum = 0;

        int [] number = new int [pocet];

        for (int i = 0;  i < pocet; i++) {

            System.out.println("Zadaj " + (i + 1)  + " cislo");
            number[i] = input.nextInt();
             if (maximum<number[i]){
                 maximum = number[i];
             }else{
                 maximum = maximum;
             }



        }System.out.println("maximum je " + maximum);

}}
