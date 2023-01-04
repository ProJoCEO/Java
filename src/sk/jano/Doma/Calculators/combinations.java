package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class combinations {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int chars;
        int places;
        long combinations;
        long idk = 1;

        System.out.printf("how many chars do you want to combine?");
        chars = input.nextShort();



        System.out.printf("how many places do you want to combine");
        places = input.nextInt();



        for (int i = 0; i < places; i++) {
            idk = (idk * chars);
        }
        combinations = idk;


        System.out.println("number of combinations is " + combinations);

    }
}
