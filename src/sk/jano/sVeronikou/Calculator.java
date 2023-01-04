package sk.jano.sVeronikou;

import java.util.Scanner;

class Calculator {
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
        switch(operation){
            case '+':
                vysledok = number1 + number2;
                System.out.println(number1 + " + "  + number2 +" = " + vysledok);
                break;

            case '-':
                vysledok = number1 - number2;
                System.out.println(number1 + " - "  + number2 +" = " + vysledok);
                break;

            case '*':
                vysledok = number1 * number2;
                System.out.println(number1 + " * "  + number2 +" = " + vysledok);
                break;
            case '/':
                vysledok = number1 / number2;
                System.out.println(number1 + " / "  + number2 +" = " + vysledok);
                break;
            case 'p':
                vysledok = (number1 + number2) / 2;
                System.out.println(vysledok);
                break;



            default:
                System.out.println("I don't know this operation");
        }





    }
}
