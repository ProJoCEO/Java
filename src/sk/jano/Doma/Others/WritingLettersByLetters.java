package sk.jano.Doma.Others;

import java.util.ArrayList;
import java.util.List;

public class WritingLettersByLetters {
    public static void main(String[] args) {
        String text = "AH JEJE";
        char letterWanted = '0';
        List<String[]> Letters = new ArrayList<>();

        System.out.print(writeLettersFromLetters(Letters, text, letterWanted));


    }
    public static String[] letterSpace() {
        String letter[] = new String[7];

        letter[0] = "00000";
        letter[1] = "00000";
        letter[2] = "00000";
        letter[3] = "00000";
        letter[4] = "00000";
        letter[5] = "00000";
        letter[6] = "00000";

        return letter;}
    public static String[] letterA() {
        String letterA[] = new String[7];
        letterA[0] = "00100";
        letterA[1] = "00100";
        letterA[2] = "01010";
        letterA[3] = "01010";
        letterA[4] = "11111";
        letterA[5] = "10001";
        letterA[6] = "10001";


        return letterA;
    }
    public static String[] letterB() {
        String letterB[] = new String[7];

        letterB[0] = "11110";
        letterB[1] = "10001";
        letterB[2] = "10001";
        letterB[3] = "11110";
        letterB[4] = "10001";
        letterB[5] = "10001";
        letterB[6] = "11110";

        return letterB;
    }
    public static String[] letterC() {
        String letterC[] = new String[7];

        letterC[0] = "00100";
        letterC[1] = "01010";
        letterC[2] = "10001";
        letterC[3] = "10000";
        letterC[4] = "10001";
        letterC[5] = "01010";
        letterC[6] = "00100";

        return letterC;
    }
    public static String[] letterD() {
        String letterD[] = new String[7];

        letterD[0] = "11100";
        letterD[1] = "10010";
        letterD[2] = "10001";
        letterD[3] = "10001";
        letterD[4] = "10001";
        letterD[5] = "10010";
        letterD[6] = "11100";

        return letterD;
    }
    public static String[] letterE() {
        String letter[] = new String[7];

        letter[0] = "11111";
        letter[1] = "10000";
        letter[2] = "10000";
        letter[3] = "11100";
        letter[4] = "10000";
        letter[5] = "10000";
        letter[6] = "11111";

        return letter;
    }
    public static String[] letterF() {
        String letter[] = new String[7];

        letter[0] = "11111";
        letter[1] = "10000";
        letter[2] = "10000";
        letter[3] = "11100";
        letter[4] = "10000";
        letter[5] = "10000";
        letter[6] = "10000";

        return letter;}
    public static String[] letterG() {
        String letter[] = new String[7];

        letter[0] = "01110";
        letter[1] = "10001";
        letter[2] = "10000";
        letter[3] = "10111";
        letter[4] = "10001";
        letter[5] = "10001";
        letter[6] = "01110";

        return letter;}
    public static String[] letterH() {
        String letter[] = new String[7];

        letter[0] = "10001";
        letter[1] = "10001";
        letter[2] = "10001";
        letter[3] = "11111";
        letter[4] = "10001";
        letter[5] = "10001";
        letter[6] = "10001";

        return letter;}
    public static String[] letterI() {
        String letter[] = new String[7];

        letter[0] = "11111";
        letter[1] = "00100";
        letter[2] = "00100";
        letter[3] = "00100";
        letter[4] = "00100";
        letter[5] = "00100";
        letter[6] = "11111";

        return letter;}
    public static String[] letterJ() {
        String letter[] = new String[7];

        letter[0] = "11111";
        letter[1] = "00001";
        letter[2] = "00001";
        letter[3] = "00001";
        letter[4] = "00001";
        letter[5] = "10010";
        letter[6] = "01100";

        return letter;}
    public static String[] letterK() {
        String letter[] = new String[7];

        letter[0] = "10001";
        letter[1] = "10010";
        letter[2] = "10100";
        letter[3] = "11000";
        letter[4] = "10100";
        letter[5] = "10010";
        letter[6] = "10001";

        return letter;}
    public static String[] letterL() {
        String letter[] = new String[7];

        letter[0] = "10000";
        letter[1] = "10000";
        letter[2] = "10000";
        letter[3] = "10000";
        letter[4] = "10000";
        letter[5] = "10000";
        letter[6] = "11111";

        return letter;}



    public static String writeLettersFromLetters(List<String[]> Letters, String text, char letterWanted) {

        Letters.add(letterA());
        Letters.add(letterB());
        Letters.add(letterC());
        Letters.add(letterD());
        Letters.add(letterE());
        Letters.add(letterF());
        Letters.add(letterG());
        Letters.add(letterH());
        Letters.add(letterI());
        Letters.add(letterJ());
        Letters.add(letterK());
        Letters.add(letterL());



        String finalText = "";
        int iHelper;
        String sHelper = "";


        for (int a = 0; a < 7; a++) {
            for (int i = 0; i < text.length(); i++) {
                iHelper = Integer.valueOf(text.charAt(i)) - 65;
                if (iHelper == -33) {
                    finalText = finalText.concat(fromBinToString(letterSpace()[a], letterWanted)) + "   ";
                }else{
                finalText = finalText.concat(fromBinToString(Letters.get(iHelper)[a], letterWanted)) + "   ";
                }

            }
            finalText = finalText.concat("\n");
        }

        return finalText;
    }

    public static String fromBinToString(String binCode, char letterWanted) {
        String row = "";

        for (int i = 0; i < binCode.length(); i++) {
            if (binCode.charAt(i) == '1') {
                row = row.concat(String.valueOf(letterWanted));
            } else {
                row = row.concat(" ");
            }
        }

        return row;
    }

}
