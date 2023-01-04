package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class SimpleCalculator {


    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        int numbers[] = new int[3];
        int a = 0;
        int sum = 0;
        String operation = "";
        System.out.printf("Zadaj priklad");
        String priklad = input.next();

        for (int i = 0; i < priklad.length(); i++) {
            switch (priklad.charAt(i)) {

                case '0':
                    numbers[a] = (numbers[a] * 10) + 0;
                    break;

                case '1':
                    numbers[a] =(numbers[a] * 10) + 1;
                    break;

                case '2':
                    numbers[a] = (numbers[a] * 10) + 2;
                    break;

                case '3':
                    numbers[a] = (numbers[a] * 10) + 3;
                    break;

                case '4':
                    numbers[a] = (numbers[a] * 10) + 4;
                    break;

                case '5':
                    numbers[a] = (numbers[a] * 10) + 5;
                    break;

                case '6':
                    numbers[a] = (numbers[a] * 10) + 6;
                    break;

                case '7':
                    numbers[a] = (numbers[a] * 10) + 7;
                    break;

                case '8':
                    numbers[a] = (numbers[a] * 10) + 8;
                    break;
                case '9':
                    numbers[a] = (numbers[a] * 10) + 9;
                    break;

                case '+':
                    operation = "+";
                    a++;
                    break;

                case '-':
                    operation = "-";
                    a++;
                    break;

                case '*':
                    operation = "*";
                    a++;
                    break;

                case '/':
                    operation = "/";
                    a++;
                    break;


            }
        }

        switch (operation) {
            case "+":
                sum = numbers[0] + numbers[1];
                break;

            case "-":
                sum = numbers[0] - numbers[1];
                break;

            case "*":
                sum = numbers[0] * numbers[1];
                break;

            case "/":
                sum = numbers[0] / numbers[1];
                break;
        }

        System.out.println( "result is " + sum);
    }
}
