package sk.jano.Doma.Calculators.Kalkulacka2;

import java.util.Scanner;

public class kalkulacka {
   public static int number1 = 0;
    public static int number2 = 0;
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int w = 0;
        int a = 0;
        int i = 0;
        int chary;

        String operation = "";
        String operation2 = "";
        System.out.printf("zadaj priklad");
        String celypriklad = input.next();
        chary = celypriklad.length();

        while ( w == 0){

            switch (celypriklad.charAt(i)){

                case	  '0'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '1' 	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '2'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '3'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '4'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '5'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '6'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '7'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '8'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;
                case	  '9'	: a =Character.getNumericValue(celypriklad.charAt(i));  number1 =( (number1 * 10) + a); i++; break;

                case	'-'	:operation = "-"; w++; i++; break;
                case	'+'	:operation = "+"; w++; i++; break;
                case	'*'	:operation = "*"; w++; i++; break;
                case	'/'	:operation = "/"; w++; i++; break;
                case    'A': operation = "AVG"; i++; i++; break;
                case    'M': operation = "MAX"; i++; i++; break;
                default:
                    System.out.print("I don't know this operation" + celypriklad.charAt(i));


            }
        }w = 0;
        while ( w == 0){
            if (i == chary){
             w++;
            }else{
            switch (celypriklad.charAt(i)){

                case     '0'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '1'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '2'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '3'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '4'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '5'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '6'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '7'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '8'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;
                case     '9'  : a =Character.getNumericValue(celypriklad.charAt(i));  number2 =( (number2 * 10) + a); i++; break;

                default:
                    System.out.print("I don't know this operation" + celypriklad.charAt(i)); w++;


            }
        }}

switch (operation){
    case   "+"  : metody.plus();  break;
    case   "-"  : metody.minus();  break;
    case   "/"  : metody.delene();  break;
    case   "*"  : metody.krat();  break;
    //case   "AVG"  : metody.AVG;  break;
    //case   "MAX"  : metody.MAX;  break;

}


        System.out.println(number1 + operation + number2 + '=' + metody.vysledok);



    }
}
