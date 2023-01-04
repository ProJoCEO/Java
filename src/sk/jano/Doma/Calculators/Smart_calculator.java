package sk.jano.Doma.Calculators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Smart_calculator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        try {


            List<Double> numbers = new ArrayList<>();
            List<String> operations = new ArrayList<>();
            double sum = 0;
            int i = 0;
            int a = 1;
            int p = 0;
            int w = 0;
            int m = 0;
            int opsize;
            int nmsize;
            String priklad;


            System.out.printf("Set an example");
            priklad = input.next();

            nmsize = priklad.length();

            // setting example's chars

            for (int b = 0; b < nmsize; b++) {

                switch (priklad.charAt(i)) {

                    // numbers


                    case '0':
                        sum = (sum * 10) + 0;
                        i++;
                        break;


                    case '1':
                        sum = (sum * 10) + 1;
                        i++;
                        break;


                    case '2':
                        sum = (sum * 10) + 2;
                        i++;
                        break;


                    case '3':
                        sum = (sum * 10) + 3;
                        i++;
                        break;


                    case '4':
                        sum = (sum * 10) + 4;
                        i++;
                        break;


                    case '5':
                        sum = (sum * 10) + 5;
                        i++;
                        break;


                    case '6':
                        sum = (sum * 10) + 6;
                        i++;
                        break;


                    case '7':
                        sum = (sum * 10) + 7;
                        i++;
                        break;


                    case '8':
                        sum = (sum * 10) + 8;
                        i++;
                        break;


                    case '9':
                        sum = (sum * 10) + 9;
                        i++;
                        break;

//                    case'.':
//                        sum = sum + (priklad.charAt(i + 1) / 10);
//                        i++;
//                        break;

//operations
                    case '+':
                        operations.add("+");
                        numbers.add(sum);
                        sum = 0;
                        i++;
                        break;


                    case '-':
                        operations.add("-");
                        numbers.add(sum);
                        sum = 0;
                        i++;
                        break;


                    case '*':
                        operations.add("*");
                        numbers.add(sum);
                        sum = 0;
                        i++;
                        break;


                    case '/':
                        operations.add("/");
                        numbers.add(sum);
                        sum = 0;
                        i++;
                        break;


                    case '(':
                        operations.add("(");
                        i++;
                        break;


                    case ')':
                        operations.add(")");
                        i++;
                        break;


                    default:
                        System.out.println("Something went wrong");
                        b = (nmsize + 1);
                        break;


                }

            }
            numbers.add(sum);
            sum = 0;


            // solving the example

            //Finding '*' and '/'

            for (int o = 0; o < (operations.size()); o++) {
                if (operations.get(o).equals("/")) {
                    numbers.set(o, numbers.get(o) / numbers.get(o + 1));
                    numbers.remove(o + 1);
                    operations.remove(o);
                }
                if (operations.get(o).equals("*")) {
                    numbers.set(o, numbers.get(o) * numbers.get(o + 1));
                    numbers.remove(o + 1);
                    operations.remove(o);
                }

                }


            sum = numbers.get(0);
            for (int op = 0; op < operations.size(); op++) {
                switch (operations.get(w)) {
                    case "+":
                        sum = sum + numbers.get((a));
                        a++;
                        w++;
                        break;

                    case "-":
                        sum = sum - numbers.get((a));
                        a++;
                        w++;
                        break;


                    case "*":
                        sum = sum * numbers.get((a));
                        a++;
                        w++;
                        break;


                    case "/":
                        sum = sum / numbers.get((a));
                        a++;
                        w++;
                        break;

                    default:
                        System.out.println("I don't know this operation");


                }

            }


            System.out.println(priklad + "=" + sum);
        } catch (Exception e) {
            System.out.println("Something went wrong \n Here is an exception: " + e);
        }
    }


}