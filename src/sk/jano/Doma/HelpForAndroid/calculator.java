package sk.jano.Doma.HelpForAndroid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(solveAdvanced("3!^2"));

    }


    public static double solveAdvanced(String example) {

        double result = 0;
        String SNumber = "";

        List<Double> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();


        for (int i = 0; i < example.length(); i++) {
            switch (example.charAt(i)) {

                case '+':
                    if (SNumber.length() == 0) {

                        operations.add("+");

                    } else {
                        numbers.add(Double.parseDouble(SNumber));
                        operations.add("+");
                        SNumber = "";
                    }
                    break;

                case '-':
                    if (SNumber.length() == 0) {

                        operations.add("-");

                    } else {
                        numbers.add(Double.parseDouble(SNumber));
                        operations.add("-");
                        SNumber = "";
                    }

                    break;

                case '*':
                    if (SNumber.length() == 0) {

                        operations.add("*");

                    } else {
                        numbers.add(Double.parseDouble(SNumber));
                        operations.add("*");
                        SNumber = "";
                    }

                    break;

                case '/':
                    if (SNumber.length() == 0) {

                        operations.add("/");

                    } else {
                        numbers.add(Double.parseDouble(SNumber));
                        operations.add("/");
                        SNumber = "";
                    }

                case '!':
                    if (SNumber.length() == 0) {
                        operations.add("!");
                    } else {
                        numbers.add(Double.parseDouble(SNumber));
                        operations.add("!");
                        SNumber = "";
                    }
                    break;

                case 'n':
                    SNumber = "-";
                    break;

                case '^':
                    if (SNumber.length() == 0) {

                        operations.add("^");

                    } else {
                        numbers.add(Double.parseDouble(SNumber));
                        operations.add("^");
                        SNumber = "";
                    }
                    break;

                default:
                    SNumber = SNumber.concat(String.valueOf(example.charAt(i)));


            }
        }

        if (SNumber.length() != 0) {
            numbers.add(Double.parseDouble(SNumber));
        }


        result = solve2(numbers, operations);

        return result;
    }

    public static double solve2(List<Double> numbers, List<String> operations) {
        double result = 0;
        int a = 0;

        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i).equals("!")) {
                numbers.set(i, factorial(numbers.get(i)));
                operations.remove(i);
                i--;
            } else if (operations.get(i).equals("^")) {
                numbers.set(i, xPoweredByY(numbers.get(i), numbers.get(i + 1)));
                numbers.remove(i + 1);
                operations.remove(i);
                i--;
            }

        }

        for (int i = 0; i < operations.size(); i++) {

            if (operations.get(i).equals("*")) {
                numbers.set(i, numbers.get(i) * numbers.get(i + 1));
                numbers.remove(i + 1);
                operations.remove(i);
                i--;
            } else if (operations.get(i).equals("/")) {
                numbers.set(i, numbers.get(i) / numbers.get(i + 1));
                numbers.remove(i + 1);
                operations.remove(i);
                i--;
            }

        }

        for (int i = 0; i < operations.size(); i++) {

            if (operations.get(i).equals("+")) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                operations.remove(i);
                i--;
            } else if (operations.get(i).equals("-")) {
                numbers.set(i, numbers.get(i) - numbers.get(i + 1));
                numbers.remove(i + 1);
                operations.remove(i);
                i--;
            }

        }

        result = numbers.get(0);

        return result;
    }

    public static double factorial(double number) {
        double result = 1;

        for (int i = 0; i < number; i++) {
            result = result * (i + 1);
        }

        return result;
    }

    public static double xPoweredByY(double x, double y) {
        double result = 1;

        for (int i = 0; i < y; i++) {
            result = result * x;
        }

        return result;
    }

}

