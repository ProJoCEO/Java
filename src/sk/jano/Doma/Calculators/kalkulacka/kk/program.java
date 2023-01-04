package kk;

import java.util.Scanner;

public class program {
    static int number2;
    static int number1;
    public static void main(String[] args) {
        System.out.println("Set first number");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();

        System.out.println("Set operation");
        char operation = input.next().charAt(0);

        System.out.println("Set second number");
        number2 = input.nextInt();

        if (operation == '+'){
            metody.plus();
        }
        if (operation == '-'){
            metody.minus();
        }
        if (operation == '*'){
            metody.krat();
        }
        if (operation == '/'){
            metody.delene();
        }
}}
