package sk.jano.sVeronikou;

import java.util.Scanner;

public class vykreslovanie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String j = "*";

        System.out.printf("Kolko chces trojuholnikov?");
        int trojuholniky = input.nextInt();

        System.out.printf("z kolkych hviezdiciek chces trojuholniky");
        int pocet = input.nextInt();

        for (int a = 0; a < trojuholniky; a++)//pocet trojuholniov
        {
        for (int i = 0; i < pocet; i++)//pocet riadkov
             {

            for (int l = pocet; l > i; l--)//pocet hviezdiciek
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
          //  j = j + "*";
        }
    }
}}
