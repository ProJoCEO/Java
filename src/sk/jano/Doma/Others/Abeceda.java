package sk.jano.Doma.Others;

import java.util.Arrays;
import java.util.Scanner;

public class Abeceda{
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("zadaj pocet slov");
        int pocet = input.nextInt();
        String[] slovo = new String[pocet];
        for (int i = 0;  i < pocet; i++) {
            System.out.println("Zadaj " + (i+1) + " slovo");
            slovo[i] = input.next(); }
        Arrays.sort(slovo);
        System.out.println(Arrays.toString(slovo));

    }
}
