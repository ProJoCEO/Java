package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class SimpleCalculator2 {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        double numbers[] = new double[3];
        int a = 0;
        double sum = 0;
        double suma = 0;
        int c = 0;
        int d = 0;
        String operation[] = new String[2];
        operation[1] = "ujuju";
        System.out.printf("Zadaj priklad");
        String priklad = input.next();
        int chars = priklad.length();
        for (int i = 0; i < priklad.length(); i++) {
            switch (priklad.charAt(i)) {


                case '0':
                    numbers[a] = (numbers[a] * 10) + 0;
                    break;

                case '1':
                    numbers[a] = (numbers[a] * 10) + 1;
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
                    operation[c] = "+";
                    a++;
                    c++;
                    break;

                case '-':
                    operation[c] = "-";
                    a++;
                    c++;
                    break;

                case '*':
                    operation[c] = "*";
                    a++;
                    c++;
                    break;

                case '/':
                    operation[c] = "/";
                    a++;
                    c++;
                    break;

            }
        }

        sum = numbers[0];


      if(operation[1].equals("/")){
            sum = (numbers[1] / numbers[2]);
            switch (operation[0]) {
                case "+":
                    sum = sum + numbers[0];
                    break;

                case "-":
                    sum = sum - numbers[0];
                    break;

                case "*":
                    sum = sum * numbers[0];
                    break;

                case "/":
                    sum = sum / numbers[0];
                    break;

                default:
                    System.out.printf("dal si iba jednu operaciu \n");
            }
        } else{
            if (operation[1].equals("*")) {
                sum = numbers[1] * numbers[2];
                switch (operation[0]) {
                    case "+":
                        sum = sum + numbers[0];
                        break;

                    case "-":
                        sum = sum - numbers[0];
                        break;

                    case "*":
                        sum = sum * numbers[0];
                        break;

                    case "/":
                        sum = sum / numbers[0];
                        break;

                    default:
                        System.out.printf("dal si iba jednu operaciu \n");
                }
            } else {
                for (int b = 0; b < 2; b++)

                    switch (operation[b]) {

                        case "+":
                            sum = sum + numbers[b + 1];
                            break;

                        case "-":
                            sum = sum - numbers[b + 1];
                            break;

                        case "*":
                            sum = sum * numbers[b + 1];
                            break;

                        case "/":
                            sum = sum / numbers[b + 1];
                            break;

                        default:
                            System.out.printf("dal si iba jednu operaciu \n");
                    }
            }
        }


        System.out.println("vysledok  je " + sum);
    }
}

