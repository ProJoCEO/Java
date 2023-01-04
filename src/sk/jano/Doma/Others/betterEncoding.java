package sk.jano.Doma.Others;

import java.util.ArrayList;
import java.util.List;

public class betterEncoding {

    public static void main(String[] args) {

    }


    public static String Encoding(String wordToEncode, String code1, String code2, String code3) {
        String encodedWord = "";
        String helpString = "";
        List<String> binaryOfEveryChar = new ArrayList<>();

        for (int i = 0; i < wordToEncode.length(); i++) {
        binaryOfEveryChar.add(Integer.toBinaryString(wordToEncode.charAt(i)));
        }

        for (int i = 0; i < binaryOfEveryChar.size(); i++){
            for (int j = 0; j < 8; j++){
                
            }
        }

        return encodedWord;
    }
}
