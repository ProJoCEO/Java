package sk.jano.Doma.Calculators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eratestonovo_sito2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int zadana_hodnota = scan.nextInt();
        List<Integer> cisla = new ArrayList<>();
        List<Integer> prvocisla = new ArrayList<>();
        List<Integer> nasobky = new ArrayList<>();

        for (int a = 2; a < zadana_hodnota + 2; a++) {
            cisla.add(a);
        }

        for (int i = 0; i < zadana_hodnota - 2; i++) {
            if (nasobky.contains(cisla.get(i))) {
            } else {
                prvocisla.add(cisla.get(i));
                for (int j = 2; j < zadana_hodnota; j++) {
                    nasobky.add(cisla.get(i) * j);
                }
            }
        }

        System.out.println(prvocisla);
    }

}
