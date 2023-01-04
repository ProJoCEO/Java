package sk.jano.Doma.Calculators;

import java.util.Scanner;

public class Percents {

  static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int value;
        int valueOfPercents;
        double result;

        System.out.printf("set the value");
        value = scan.nextInt();

        System.out.printf("set how many percents do you want from the value");
        valueOfPercents = scan.nextInt();

        result = percents(value,valueOfPercents);

        System.out.println(result);

    }

    public static double percents(double value, double percents){
        double result = 0;
        double onePercentOfValue = value/100;
        result = onePercentOfValue*percents;
    return result;}

}
