package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Zadaj operáciu");
        String operation = input.next();
        System.out.printf("Zadaj počet");
        int pocet = input.nextInt();
        int[] number = new int[pocet];
        int suma = 0;
        switch (operation) {
             case "+":

                 for (int i = 0; i < pocet; i++) {

                     System.out.println("Zadaj " + (i + 1) + " cislo");
                     number[i] = input.nextInt();
                     suma = suma + number[i];
                 }
                 System.out.println(suma);
                 break;
             case "-":

                 for (int i = 0; i < pocet; i++) {

                     System.out.println("Zadaj " + (i + 1) + " cislo");
                     number[i] = input.nextInt();
                     suma = suma - number[i];
                 }
                 System.out.println(suma);
                 break;
            case "*":
                suma = 1;
                for (int i = 0; i < pocet; i++) {

                    System.out.println("Zadaj " + (i + 1) + " cislo");
                    number[i] = input.nextInt();
                    suma = suma * number[i];
                }
                System.out.println(suma);
                break;
            case "AVG":
                for (int i = 0;  i < pocet; i++) {
                    System.out.println("Zadaj " + (i + 1)  + " cislo");
                    number[i] = input.nextInt();
                    suma = number[i] + suma;

                }
                suma = suma / pocet;
                System.out.println(suma);
                break;
            case "Max.":
                for (int i = 0;  i < pocet; i++) {

                    System.out.println("Zadaj " + (i + 1)  + " cislo");
                    number[i] = input.nextInt();
                    if (suma < number[i]){
                        suma = number[i];
                    }else{
                        suma = suma;
                    }}

                suma = suma / pocet;
                System.out.println(suma);
                break;
             default:
                 System.out.printf("Nepoznám túto operáciu");

         }

}}
