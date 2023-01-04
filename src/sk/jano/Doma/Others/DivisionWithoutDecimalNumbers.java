package sk.jano.Doma.Others;

public class DivisionWithoutDecimalNumbers {

    public static int antiDecDivision(int divided, int divider) {
        int result = 0;

        for (int i = 0; i < divided / divider; i++) {
            result++;
        }

        return result;
    }

}
