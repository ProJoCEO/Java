package sk.jano.Doma.HelpForAndroid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartCalculator2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        String example = "";
        double helper = 0;
        double helper2 = 0;
        int a = 1;

        System.out.printf("set the example");
        example = input.next();

        for (int i = 0; i < example.length(); i++) {
            switch (example.charAt(i)) {

                case '0':
                    helper = 10 * helper + 0;
                    break;
                case '1':
                    helper = 10 * helper + 1;
                    break;
                case '2':
                    helper = 10 * helper + 2;
                    break;
                case '3':
                    helper = 10 * helper + 3;
                    break;
                case '4':
                    helper = 10 * helper + 4;
                    break;
                case '5':
                    helper = 10 * helper + 5;
                    break;
                case '6':
                    helper = 10 * helper + 6;
                    break;
                case '7':
                    helper = 10 * helper + 7;
                    break;
                case '8':
                    helper = 10 * helper + 8;
                    break;
                case '9':
                    helper = 10 * helper + 9;
                    break;
                case '.':
                    i++;
                    while (example.charAt(i) != '+' && example.charAt(i) != '-' && example.charAt(i) != '*' && example.charAt(i) != '/') {
                        helper2 = helper2 + (Double.parseDouble(String.valueOf(example.charAt(i))) / (a * 10));

                        a = a * 10;
                        i++;
                    }
                    helper = helper + helper2;
                    i++;
                    break;

                case '+':
                    numbers.add(helper);
                    helper = 0;
                    operations.add("+");
                    break;

                case '-':
                    numbers.add(helper);
                    helper = 0;
                    operations.add("-");
                    break;

                case '*':
                    numbers.add(helper);
                    helper = 0;
                    operations.add("*");
                    break;

                case '/':
                    numbers.add(helper);
                    helper = 0;
                    operations.add("/");
                    break;

                case '%':
                    numbers.add(helper);
                    helper = 0;
                    operations.add("%");
                    break;

                default:
                    System.out.printf("IDK this operation (:");
            }
        }

        numbers.add(helper);

        System.out.println(solve(numbers, operations));

    }

    public static double solve(List<Double> numbers, List<String> operations) {
        double result = 0;
        double helper = 0;
        operations.add("=");

        for (int i = 0; i < operations.size() - 1; ) {
            if (operations.get(i).equals("*")) {
                helper = numbers.get(i) * numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);
            } else if (operations.get(i).equals("/")) {
                helper = numbers.get(i) / numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);
            } else {
                i++;
            }
        }

        for (int i = 0; i < operations.size() - 1; ) {
            if (operations.get(i).equals("+")) {
                helper = numbers.get(i) + numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);
            }

            if (operations.get(i).equals("-")) {
                helper = numbers.get(i) - numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);
            }

            if (operations.get(i).equals("%")) {
                helper = ((numbers.get(i) / 100) * numbers.get(i + 1));
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);

            }
        }

        result = numbers.get(0);

        return result;
    }

}