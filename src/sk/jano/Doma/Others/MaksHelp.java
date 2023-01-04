package sk.jano.Doma.Others;

public class MaksHelp {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;

        while(y < 100){
            x+=2;
            y+=x;
        }
        System.out.println(x);
    }
}
