package sk.jano.Doma.HelpForAndroid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LengthUnitsCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String helper = "";
        List<Double> values = new ArrayList<>();
        List<String> units = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        List<Double> numbersInMcm = new ArrayList<>();
        String example = "";
        String resultUnit = "";


        System.out.printf("set the example (km, m, dm, cm, mm, mcm(micrometer))");
        example = scanner.next();
        for (int i = 0; i < example.length(); i++) {
            switch (example.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                case ',':
                    helper = helper.concat(String.valueOf(example.charAt(i)));
                    break;

                case 'm':
                case 'c':
                case 'd':
                case 'k':

                    if (!helper.equals("mc") && !helper.equals(String.valueOf('m')) && !helper.equals(String.valueOf('c')) && !helper.equals(String.valueOf('d')) && !helper.equals(String.valueOf('k'))) {
                        values.add(Double.valueOf(helper));
                        helper = "";
                    }
                    helper = helper.concat(String.valueOf(example.charAt(i)));
                    break;

                case '+':
                case '-':
                    operations.add(String.valueOf(example.charAt(i)));
                    units.add(helper);
                    helper = "";
                    break;

                case '=':
                        for(i = i; i < example.length()-i; i++){
                            helper = helper.concat(String.valueOf(example.charAt(i)));
                        }
                    break;

                default:
                    System.out.printf("Something went wrong");


            }
        }
        units.add(helper);

        System.out.println("\n" + values + "\n" + units + "\n" + operations + "\n" + resultUnit);

        numbersInMcm = AllToMcm(values, units);

        System.out.println("\n \n \n  result is " + solve(numbersInMcm, operations));

    }

    public static List<Double> AllToMcm (List<Double> values,List<String> units){
        List<Double> numbersInMcm = new ArrayList<>();


        for (int i = 0; i < values.size(); i++) {
            switch (units.get(i)) {
                case "mcm":
                    numbersInMcm.add(values.get(i));
                    break;

                case "mm":
                    numbersInMcm.add(values.get(i) * 1000);
                    break;

                case "cm":
                    numbersInMcm.add(values.get(i) * 10000);
                    break;

                case "dm":
                    numbersInMcm.add(values.get(i) * 100000);
                    break;

                case "m":
                    numbersInMcm.add(values.get(i) * 1000000);
                    break;

                case "km":
                    numbersInMcm.add(values.get(i) * 1000000000);
                    break;
            }
        }
        return numbersInMcm;
    }
//    public static double AllToMcm(List<Double> values, List<String> operations, List<String> units) {
//        double result = 0;
//        List<Double> numbersInMcm = new ArrayList<>();
//
//
//        for (int i = 0; i < values.size(); i++) {
//            switch (units.get(i)) {
//                case "mcm":
//                    numbersInMcm.add(values.get(i));
//                    break;
//
//                case "mm":
//                    numbersInMcm.add(values.get(i) * 1000);
//                    break;
//
//                case "cm":
//                    numbersInMcm.add(values.get(i) * 10000);
//                    break;
//
//                case "dm":
//                    numbersInMcm.add(values.get(i) * 100000);
//                    break;
//
//                case "m":
//                    numbersInMcm.add(values.get(i) * 1000000);
//                    break;
//
//                case "km":
//                    numbersInMcm.add(values.get(i) * 1000000000);
//                    break;
//            }
//        }
//
//        result = solve(numbersInMcm, operations);
//
//        return result;
//    }
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
