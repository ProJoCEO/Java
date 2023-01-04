package sk.jano.Doma.Calculators;

import sk.jano.Doma.HelpForAndroid.SmartCalculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorNewMethod {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String example = scan.next();
        String SNumbers = "";
        List<Double> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();

        for (int i = 0; i < example.length();i++){
            if (example.charAt(i) == '.'||example.charAt(i) == '0'||example.charAt(i) == '1'||example.charAt(i) == '2'||example.charAt(i) == '3'||example.charAt(i) == '4'||example.charAt(i) == '5'||example.charAt(i) == '6'||example.charAt(i) == '7'||example.charAt(i) == '8'||example.charAt(i) == '9'){
                SNumbers = SNumbers.concat(String.valueOf(example.charAt(i)));
           }else if(example.charAt(i) == 'm'){
                SNumbers = SNumbers.concat("-");
            }else{
                numbers.add(Double.parseDouble(SNumbers));
                operations.add(String.valueOf(example.charAt(i)));
                SNumbers = "";
            }


        }

        numbers.add(Double.parseDouble(SNumbers));

        System.out.println(SmartCalculator2.solve(numbers,operations));
    }
}
