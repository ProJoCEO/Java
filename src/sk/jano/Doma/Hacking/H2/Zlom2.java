package sk.jano.Doma.Hacking.H2;

import sk.jano.Doma.Hacking.hacker;

public class Zlom2 {



    public static String ZLAM(String heslo, String tip) {

        int [] i = new int[10];



        String[] abeceda = new String[44];
        abeceda[0] = "";
        abeceda[1] = "a";
        abeceda[2] = "b";
        abeceda[3] = "c";
        abeceda[4] = "d";
        abeceda[5] = "e";
        abeceda[6] = "f";
        abeceda[7] = "g";
        abeceda[8] = "h";
        abeceda[9] = "i";
        abeceda[10] = "j";
        abeceda[11] = "k";
        abeceda[12] = "l";
        abeceda[13] = "m";
        abeceda[14] = "n";
        abeceda[15] = "o";
        abeceda[16] = "p";
        abeceda[17] = "q";
        abeceda[18] = "r";
        abeceda[19] = "s";
        abeceda[20] = "t";
        abeceda[21] = "u";
        abeceda[22] = "v";
        abeceda[23] = "w";
        abeceda[24] = "x";
        abeceda[25] = "y";
        abeceda[26] = "z";
        abeceda[27] = "1";
        abeceda[28] = "2";
        abeceda[29] = "3";
        abeceda[30] = "4";
        abeceda[31] = "5";
        abeceda[32] = "6";
        abeceda[33] = "7";
        abeceda[34] = "8";
        abeceda[35] = "9";
        abeceda[36] = "0";
        abeceda[37] = "=";
        abeceda[38] = "+";
        abeceda[39] = "-";
        abeceda[40] = "*";
        abeceda[42] = "-";
        abeceda[43] = "+";
        for ( i[0] = 0; i[0] < 43; i[0]++) {
            for (i[1] = 0; i[1] < 43; i[1]++) {
                for (i[2] = 0; i[2] < 43; i[2]++) {
                   for (i[3] = 0; i[3] < 43; i[3]++) {
                       for (i[4] = 0; i[4] < 43; i[4]++) {
                           for (i[5] = 0; i[5] < 43; i[5]++) {
                               for (i[6] = 0; i[6] < 43; i[6]++) {
                                   for (i[7] = 0; i[7] < 43; i[7]++) {
                                       for (i[8] = 0; i[8] < 43; i[8] ++) {
                                            for (i [9] = 0; i [9] < 43; i[9] ++) {
                                                tip = abeceda[i[0]] + abeceda[i[1]] + abeceda[i[2]] + abeceda[i[3]] + abeceda[i[4]] + abeceda[i[5]] + abeceda[i[6]] + abeceda[i[7]] + abeceda[i[8]] + abeceda[i[9]];
                                                if (tip.equals(heslo)) {
                                                    break;
                                                }
                                            }
                                        }
                                        i[8] = 0;
                                    }
                                    i[7] = 0;
                                }
                                i[6] = 0;
                            }
                            i[5] = 0;
                        }
                        i[4] = 0;
                    }
                    i[3] = 0;
                }
                i[2] = 0;
            }
            i[1] = 0;
        }
        //fori dokazu rozlustit 10 znakov za 2884     1 000 000 000 000-roci


        return tip;
    }


}

