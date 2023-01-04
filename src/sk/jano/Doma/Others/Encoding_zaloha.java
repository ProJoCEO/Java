package sk.jano.Doma.Others;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Encoding_zaloha {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String word = "";
        String code = "";
        String wordc = "";
        int operation;
int w = 0;
        while (w == 0) {
            System.out.printf("Chces sifrovat, odsifrovat alebo skoncit?(1, 2 a 3)");
            operation = input.nextInt();

            if (operation == (1)) {  //sifrovat
                System.out.printf("Aky text chces zasifrovat?");
                word = input.next();
                int chars[] = new int[word.length()];

                for (int i = 0; i < word.length(); i++) {
                    code = (code.concat(valueOf((int) (Math.random() * 2))));
                    chars[i] = word.charAt(i);
                }


                for (int i = 0; i < code.length(); i++) {
                    if (code.charAt(i) == '0') {
                        chars[i]--;
                    } else {
                        chars[i]++;
                    }
                }

 {

                    for (int i = 0; i < code.length(); i++){
                        wordc = (wordc.concat(Character.toString((char) chars[i])));

                }}
                System.out.println(wordc + "\n" + code);

word = "";
wordc = "";
            }

            if (operation == (2)){
                System.out.printf("zadaj spravu");
                wordc = input.next();

                System.out.printf("zadaj kod");
                code = input.next();

                int indexes[] = new int[wordc.length()];

                for (int i = 0; i < wordc.length(); i++) {
                    indexes[i] = wordc.charAt(i);
                }
                for (int i = 0; i < wordc.length(); i++) {
                    if (code.charAt(i) == '0') {
                        indexes[i]++;
                    } else {
                        indexes[i]--;
                    }
                }
                for (int i = 0; i < wordc.length(); i++) {
                    word = (word + Character.toString((char) indexes[i]));
                }

                System.out.println(word);
word ="";
wordc = "";
            }
            if (operation == (3)){
                w++;
            }
        }
    }
}