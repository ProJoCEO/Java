package sk.jano.Doma.Calculators;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Double.parseDouble;
public class MethodSolve__and_upgrading {

    public static void main(String[] args) {
        String example;
    }

    public static double normalSolve(List<Double> numbers, List<String> operations) {
        double result = 0;
        double helper = 0;
        operations.add("=");

        for (int i = 0; i < operations.size()-1;) {
            if (operations.get(i).equals("*")) {
                helper = numbers.get(i) * numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);
            }else if (operations.get(i).equals("/")) {
                helper = numbers.get(i) / numbers.get(i + 1);
                numbers.remove(i);
                numbers.set(i, helper);
                operations.remove(i);
            }else{i++;}
        }

        for (int i = 0; i < operations.size()-1;){
            if (operations.get(i).equals("+")){
                helper = numbers.get(i) + numbers.get(i+1);
                numbers.remove(i);
                numbers.set(i,helper);
                operations.remove(i);
            }

            if (operations.get(i).equals("-") ){
                helper = numbers.get(i) - numbers.get(i+1);
                numbers.remove(i);
                numbers.set(i,helper);
                operations.remove(i);
            }

            if (operations.get(i).equals("%")){
                helper = ((numbers.get(i)/100) * numbers.get(i+1));
                numbers.remove(i);
                numbers.set(i,helper);
                operations.remove(i);

            }
        }

        result = numbers.get(0);

        return result;
    }

    public static double solve(String example){
        double result = 0;
        String SNumbers = "";
        List<Double> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        double helper = 0;

        for (int i = 0; i < example.length(); i++){
            switch (example.charAt(i)){

                case '0':
                    SNumbers = SNumbers.concat("0");
                    break;

                case '1':
                    SNumbers = SNumbers.concat("1");
                    break;

                case '2':
                    SNumbers = SNumbers.concat("2");
                    break;

                case '3':
                    SNumbers = SNumbers.concat("3");
                    break;

                case '4':
                    SNumbers = SNumbers.concat("4");
                    break;

                case '5':
                    SNumbers = SNumbers.concat("5");
                    break;

                case '6':
                    SNumbers = SNumbers.concat("6");
                    break;

                case '7':
                    SNumbers = SNumbers.concat("7");
                    break;

                case '8':
                    SNumbers = SNumbers.concat("8");
                    break;

                case '9':
                    SNumbers = SNumbers.concat("9");
                    break;

                case '+':
                    numbers.add(parseDouble(SNumbers));
                    operations.add("+");
                    SNumbers = "";
                    break;

                case '-':
                    numbers.add(parseDouble(SNumbers));
                    operations.add("-");
                    SNumbers = "";
                    break;

                case '*':
                    numbers.add(parseDouble(SNumbers));
                    operations.add("*");
                    SNumbers = "";
                    break;

                case '/':
                    numbers.add(parseDouble(SNumbers));
                    operations.add("/");
                    SNumbers = "";
                    break;

                    

            }
        }

        return result;
    }

public static double solve2(String example){
        double result = 0;

        

        return result;}

}




