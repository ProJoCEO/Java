package sk.jano.Doma.Others;

import java.util.Scanner;

public class RemoveLastChar {

   static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        String slovo;
        System.out.printf("zadaj slovo na orezanie");
        slovo = Input.next();

slovo = removeLastChar(slovo);

        System.out.println(slovo);


    }

    public static String removeLastChar(String slovo){
        String sl = "";

        for (int i = 0; i < (slovo.length() - 1); i++){
            sl = sl + slovo.charAt(i);
        }

        slovo = sl;

        return slovo;
    }

}
