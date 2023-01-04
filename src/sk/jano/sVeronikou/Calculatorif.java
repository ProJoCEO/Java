package sk.jano.sVeronikou;

import java.util.Scanner;

public class Calculatorif {
    public static void main(String[] args) {
        System.out.println("Set first number");
        Scanner input = new Scanner(System.in);
        double number1;
        number1 = input.nextInt();

        System.out.println("Set operation");
        char operation = input.next().charAt(0);


        System.out.println("Set second number");
        double number2;
        number2 = input.nextInt();

        double vysledok = 0;

        if (operation == '+') {
            vysledok = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + vysledok);

        }else{ if (operation == '-') {
            vysledok = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + vysledok);
        }else{
            if (operation == '*') {
                vysledok = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + vysledok);
            }else {if (operation == '/') {
                vysledok = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + vysledok);
            }else{
                System.out.println("I don't know this operation");
            }}}


        }
    }
}
