package sk.jano.Doma.HelpForAndroid;

public class EncodingMethod {

    public static void main(String[] args) {

        System.out.println(decodingVoid("0011", "bini"));


    }

    public static String encodingVoid(String code, String messageToEncode){
        String encodedMessage = "";
        int charHex = 0;


        for (int i = 0; i < messageToEncode.length(); i++){
            charHex = messageToEncode.charAt(i);

            switch (code.charAt(i)){
                case '0':
                    charHex++;
                    break;

                case '1':
                    charHex--;
                    break;
            }

            encodedMessage = encodedMessage.concat(Character.toString((char)charHex));
        }

    return encodedMessage;}
    public static String decodingVoid(String code, String messageToDecode){
        String decodedMessage = "";
        int charHex = 0;

        for (int i = 0; i < messageToDecode.length(); i++){
            charHex = messageToDecode.charAt(i);

            switch (code.charAt(i)){

                case '0':
                    charHex--;
                    break;

                case '1':
                    charHex++;
                    break;
            }
            decodedMessage = decodedMessage.concat(Character.toString((char)charHex));
        }

        return decodedMessage;
    }

}
