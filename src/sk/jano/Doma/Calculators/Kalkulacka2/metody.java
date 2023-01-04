package sk.jano.Doma.Calculators.Kalkulacka2;

import java.util.Scanner;

public class metody {
    static  int vysledok;
   static int number1 = kalkulacka.number1;
   static int number2 = kalkulacka.number2;
    static Scanner input = new Scanner(System.in);

    public static void plus(){
        vysledok = number1 + number2;
        //System.out.println(number1 + " + " +number2 + " = " + number1 + number2);

    }static void minus (){
        vysledok = number1-number2;
        //System.out.println(number1 + " - " +number2 + " = " + (number1 - number2));

    }static void krat (){
        vysledok =number1*number2;
        //System.out.println(number1 + " * " +number2 + " = " + number1 * number2);

    }static void delene(){
        vysledok = number1/number2;
        //System.out.println(number1 + " / " +number2 + " = " + number1 / number2);

    }
}
