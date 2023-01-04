package sk.jano.Doma.Others;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Try {


    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pix = Color.decode("#FFCCEE").getRGB();

        int r = (pix >> 16) & 0xFF;
        int g = (pix >> 8) & 0xFF;
        int b = pix & 0xFF;


        System.out.println(r + " " + g + " " + b);

    }

}

