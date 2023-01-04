package sk.jano.Doma.Calculators;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class BinaryTranslator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();

        String s = scanner.nextLine();

        System.out.println(toBinary(10));

    }

    public static String toBinary(int Decimal) {

        String result = "";

        int binary[] = new int[40];
        int index = 0;
        while (Decimal > 0) {
            binary[index++] = Decimal % 2;
            Decimal = Decimal / 2;
        }

        for (int i = 0; i < binary.length; i++) {
            result = result.concat(valueOf(binary[i]));
        }
    return result;}

    public static String translateFromBinary(String s) {
        String result = "";
        List<String> CharsInBinary = new ArrayList<>();

        for (int i = 0; i < s.length() / 8; i++) {
            CharsInBinary.add("");
        }

        for (int i = 0; i < s.length() / 8; i++) {
            for (int b = 0; b < 8; b++) {
                CharsInBinary.set(i, CharsInBinary.get(i).concat(valueOf(s.charAt(((i) * 8) + b))));
            }
        }


        for (int i = 0; i < CharsInBinary.size(); i++) {
            result = result.concat(valueOf((char) fromBinary(CharsInBinary.get(i))));
        }


        return result;
    }





    public static int fromBinary(String binaryNumber) {

        List<Character> binariesHelp = new ArrayList<>();
        List<Character> binaries = new ArrayList<>();
        List<Integer> binariesPower = new ArrayList<>();
        int result = 0;


        for (int i = 0; i < binaryNumber.length(); i++) {
            binariesHelp.add(binaryNumber.charAt(i));
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            binaries.add(binariesHelp.get(binariesHelp.size() - (i + 1)));
        }

        binariesPower.addAll(fillPowers(binaryNumber.length(), 2));

        for (int i = 0; i < binaryNumber.length(); i++) {
            switch (binaries.get(i)) {

                case '0':
                    break;

                case '1':
                    result = result + binariesPower.get(i);
                    break;

                default:
                    System.out.println("You entered illegal binary number");

            }
        }


        return result;
    }

    public static List<Integer> fillPowers(int lastPower, int powerOf) {
        List<Integer> result = new ArrayList<>();
        int b = 1;

        for (int i = 0; i < lastPower; i++) {
            result.add(b);
            b = b * powerOf;
        }

        return result;
    }

}
