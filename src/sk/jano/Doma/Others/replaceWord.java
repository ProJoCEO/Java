package sk.jano.Doma.Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class replaceWord {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        String help = "";
        String find;
        String replace;
        List<String> words = new ArrayList<>();

        System.out.printf("Set text");
        text = scan.nextLine();

        System.out.printf("Set word you want to find");
        find = scan.nextLine();

        System.out.printf("Set word that yu want to put there");
        replace = scan.nextLine();

        for (int i =0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                for (int a = 0; a < i; a++){
                    help = help.concat(valueOf(text.charAt(a)));
                }
                words.add(help);
                help = "";
            }
        }

        for (int i = 0; i < words.size(); i++){
            if (words.get(i) == find){
               words.add(i, replace);
                words.remove(i+1);

            }
        }

        System.out.println(words);

    }
}
