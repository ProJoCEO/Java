package sk.jano.Doma.Calculators;


import java.util.Scanner;

public class CCCCAAAALLLLCCCCUUUUTTTTOOOORRRR {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String operation;
        int numbers;
        long combinations = 1;
        double sum = 0;
        int chars;
        int places;

        System.out.printf("What operation do you want to do? The operations are '+' '-' '*' '/' 'COMB' 'AVG' & 'MAX' \n");
        operation = input.next();


       if (operation.equals("COMB")) {
            System.out.printf("How many chars do you want to combine?");
            chars = input.nextInt();

            System.out.printf("How many places do you want to combine?");
             places = input.nextInt();

            for (int i = 0; i < places; i++) {
                combinations = (combinations * chars);
            }
            System.out.printf("I found " + combinations + "combinations");
      } else {

            System.out.printf("How many numbers do you want to use");
            numbers = input.nextInt();
            int i[] = new int[numbers];


            for (int a = 0; a < numbers; a++) {
                System.out.printf("Set " + (a + 1) + ". number");
                i[a] = input.nextInt();
            }


            switch (operation) {
                case "+":
                    for (int b = 0; b < numbers; b++) {
                        sum = (sum + i[b]);
                    }
                    break;

                case "-":
                    sum = i[0];
                    for (int c = 0; c < numbers; c++) {
                        sum = (sum - i[c]);
                    }
                    break;

                case "*":
                    sum = i[0];
                    for (int d = 0; d < numbers; d++) {
                        sum = (sum * i[d]);
                    }
                    break;

                case "/":
                    sum = i[0];
                    for (int e = 0; e < numbers; e++) {
                        sum = (sum / i[e]);
                    }
                    break;

                case "AVG":
                    sum = 0;
                    for (int f = 0; f < numbers; f++) {
                        sum = (sum + i[f]);
                    }
                    sum = (sum / numbers);
                    break;


                case "MAX":
                    sum = i[0];
                    for (int g = 0; g < numbers; g++) {
                        if (sum < i[g]) {
                            sum = i[g];
                        }
                    }
                    break;


                default:
                    System.out.printf("I do not know this operation, so ");
            }

            System.out.printf("result is " + sum);
        }
    }
}
