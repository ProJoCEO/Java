package sk.jano.Doma.Others;

import java.util.Scanner;

public class Replace {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String text;
        char find;
        char replace;

        System.out.printf("Set the text");
         text = scan.nextLine();

        System.out.printf("Set what do you want to find");
        String i1 = scan.next();
        find = i1.charAt(0);

        System.out.printf("Set what do you wont to replace");
        String i2 = scan.next();
        replace = i2.charAt(0);

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == find){
text = replace_one_char(text, i, replace);
            }
        }

        System.out.println(text);
    }

    public static String replace_one_char(String text, int indexOfChar, char replace){

        char textChar[] = new char[text.length()];


        for (int i = 0; i < textChar.length; i++){
            textChar[i] = text.charAt(i);
        }
text = "";
        textChar[indexOfChar] = replace;

        for (int a = 0; a < textChar.length; a++){
            text = text.concat(Character.toString(textChar[a]));
        }

        return text;
    }

}
