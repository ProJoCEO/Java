package sk.jano.Doma.Calculators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Eratestonovo_sito {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        int wantedPN;
        List<Integer> PrimeNumbers = new ArrayList<>();

        wantedPN = scan.nextInt();

        for (double i = 2.00; i < wantedPN + 1; i++) {
            numbers.add(i);
        }


        for (int c = 0; c < numbers.size(); c++) {
            double multiplier = numbers.get(c);
            PrimeNumbers.add((int) multiplier);

            for (int b = 0; b < numbers.size(); b++) {

                if (b < c) {

                } else {

                    if (isMultiple(numbers.get(b), multiplier) == true) {
                        numbers.remove(b);
                    }
                }
            }
        }

        System.out.println(numbers + "\n" + PrimeNumbers);

    }


    public static boolean isMultiple(Double number, double multiple) {
        Double result;

        boolean b;

        result = (number / multiple);

        if (result % 1 == 0) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

}
