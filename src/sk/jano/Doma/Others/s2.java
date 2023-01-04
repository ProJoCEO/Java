package sk.jano.Doma.Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> moje = new ArrayList<>();
        String potiahnutaKarta = "";
        int pocetKarietNaTahanie = 0;
        int kartyVHre = 32;
        int w = 0;
        List<String> mojeKarty = new ArrayList<>();
        String vychadzajucaKarta;
        String dalsiaKartaVStrede;
        List<String> kartyVStrede = new ArrayList<>();
        boolean somNaTahu = false;
        boolean jeToMoje;
        boolean b = false;


        for (int i = 0; i < 8; i++) {
            moje.add(new ArrayList<String>());
        }


        for (int i = 0; i < 4; i++) {
            System.out.printf("zadaj moju " + (i + 1) + ". kartu");
            potiahnutaKarta = scan.nextLine();
            switch (potiahnutaKarta.charAt(potiahnutaKarta.length() - 1)) {
                case '7':
                    moje.get(0).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;
                case '8':
                    moje.get(1).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;

                case '9':
                    moje.get(2).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;


                case '0':
                    moje.get(3).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;

                case '1':
                    moje.get(4).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;

                case '2':
                    moje.get(5).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;
                case '3':
                    moje.get(6).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;
                case '4':
                    moje.get(7).add(potiahnutaKarta);
                    mojeKarty.add(potiahnutaKarta);
                    break;
                default:
                    System.out.println("Nepoznam tuto kartu");
                    i--;
                    break;


            }


        }


        System.out.printf("som na tahu?");
        while (w == 0) {
            try {
                somNaTahu = scan.nextBoolean();
                w++;
            } catch (Exception e) {
                System.out.printf("este raz plz");
            }
        }


        while (kartyVHre != 0) {
            if (somNaTahu) {

                for (int i = 4; i > 0; i--) {
                    for (int a = 0; a < 8; a++) {
                        if (moje.get(a).size() == i) {
                            for (int c = 0; c < i; c++) {
                                System.out.println(moje.get(a).get(0));

                                mojeKarty.remove(moje.get(a).get(0));

                                vychadzajucaKarta = moje.get(a).get(0);
                                System.out.printf("zadaj kartu supera");
                                jeToMoje = true;
                                dalsiaKartaVStrede = scan.next();
                                kartyVStrede.add(dalsiaKartaVStrede);

                                if (dalsiaKartaVStrede.equals(vychadzajucaKarta)) {
                                    jeToMoje = false;
                                } else {
                                    jeToMoje = true;
                                }

                                if (kartyVStrede.contains("cerven10") || kartyVStrede.contains("zelen10") || kartyVStrede.contains("gula10") || kartyVStrede.contains("zalud10") && !jeToMoje) {
                                    if (i > c) {
                                        System.out.printf("berie");
                                        break;
                                    } else {
                                        if (moje.get(0).size() > 0) {
                                            for (int d = 0; d < moje.get(0).size(); d++) {
                                                System.out.print(moje.get(0).get(d));
                                                mojeKarty.remove(moje.get(0).get(d));
                                                jeToMoje = true;
                                            }
                                        }
                                    }
                                }


                                moje.get(a).remove(0);
                            }

                            pocetKarietNaTahanie = 4 - mojeKarty.size();
                            a = 8;
                            i = 0;
                        }
                    }
                }

                for (int i = 0; i < pocetKarietNaTahanie; i++) {
                    System.out.printf("zadaj " + (i + 1) + ". potiahnutu kartu");
                    potiahnutaKarta = scan.next();

                    switch (potiahnutaKarta.charAt(potiahnutaKarta.length() - 1)) {
                        case '7' -> moje.get(0).add(potiahnutaKarta);
                        case '8' -> moje.get(1).add(potiahnutaKarta);
                        case '9' -> moje.get(2).add(potiahnutaKarta);
                        case '0' -> moje.get(3).add(potiahnutaKarta);
                        case '1' -> moje.get(4).add(potiahnutaKarta);
                        case '2' -> moje.get(5).add(potiahnutaKarta);
                        case '3' -> moje.get(6).add(potiahnutaKarta);
                        case '4' -> moje.get(7).add(potiahnutaKarta);
                        default -> System.out.printf("Nepoznam tuto kartu");
                    }
                }
                System.out.printf("zadaj kolko kariet poslo");
                int abcd = scan.nextInt();
                kartyVHre = kartyVHre - abcd;
                somNaTahu = false;
            }
            if (!somNaTahu) {
                jeToMoje = false;
                System.out.println("zadaj vychadzajucu kartu");
                vychadzajucaKarta = scan.next();

                for (int i = 0; i < 4; i++) {
                    if (mojeKarty.get(i).charAt(mojeKarty.get(i).length() - 1) == vychadzajucaKarta.charAt(vychadzajucaKarta.length() - 1)) {
                        b = true;
                        System.out.println(mojeKarty.get(i));
                        System.out.printf("ide dalej alebo nie?");
                        if (scan.nextBoolean()){b = false;}
                        if (!scan.nextBoolean()) {

                        }
                    }
                }

                if (!b){
                    System.out.println(mojeKarty.get(0));

                }

            }


        }


    }


}
