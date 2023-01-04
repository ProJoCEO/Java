package sk.jano.Doma.ImageToLettersConverter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ImgToLetters {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<String> blackBox = new ArrayList<>();
        List<String> pixelsHEX = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        BufferedImage img = null;


        List<String> colors = new ArrayList<>();

        boolean smartSelect = true;
        boolean colors8 = true;


// getting pixels
//START


        String pathToImg;
        BufferedImage imag = null;
        System.out.printf("enter path to image");
        pathToImg = scanner.nextLine();

        System.out.printf("smartSelect? {true or false} \n");
        smartSelect = scanner.nextBoolean();
        System.out.printf("8 colors? (Else 27) {true or false} \n");
        colors8 = scanner.nextBoolean();
        scanner.nextLine();

        // saving image
        //START

        img = ImageIO.read(new File(pathToImg));
        blackBox.add("saving file succeeded");

        // saving image
        //END


        // resizing image
        //START

        img = resizeImage(img, 100, 55);

        // resizing image
        //END


        int width = img.getWidth();
        int height = img.getHeight();


        // adding pixels to pixelsHEX
        //START

        if (!smartSelect) {

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    try {
                        pixelsHEX.add((Integer.toHexString(img.getRGB(j, i))).substring(2));
                        blackBox.add("adding pixel " + j + " " + i + " succeeded");

                    } catch (Exception e) {
                        System.out.printf("adding pixels failed");
                        System.out.println(e);
                    }

                }

            }
        } else {


            String pixelHelp;
            int[] pixelRGB = new int[3];

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    try {

                        pixelHelp = (Integer.toHexString(img.getRGB(j, i))).substring(2);
                        pixelRGB = getRGB(pixelHelp);

                        if (colors8) {
                            for (int k = 0; k < 3; k++) {
                                if (pixelRGB[k] > 127.5) {

                                    pixelRGB[k] = 64;

                                } else {

                                    pixelRGB[k] = 192;

                                }
                            }
                        } else {

                            for (int k = 0; k < 3; k++) {
                                if (pixelRGB[k] > 170) {

                                    pixelRGB[k] = 212;

                                } else if (pixelRGB[k] > 85) {

                                    pixelRGB[k] = 127;

                                } else {

                                    pixelRGB[k] = 42;

                                }
                            }

                        }


                        pixelsHEX.add(String.format("#%02x%02x%02x", pixelRGB[0], pixelRGB[1], pixelRGB[2]));


                    } catch (Exception e) {
                    }
                }
            }
        }

        // adding pixels to pixelsHEX
        //END


// getting pixels
//END


// getting all colors
//START


        int[] helpRGB = new int[3];
        for (int i = 0; i < pixelsHEX.size(); i++) {
            if (!colors.contains(pixelsHEX.get(i))) {
                colors.add(pixelsHEX.get(i));
            }
        }


        // removing similar colors
        //START


        // removing similar colors
        //END


// getting all colors
//END


// setting letters corresponding with colors
// START

        for (int i = 0; i < colors.size(); i++) {
            System.out.printf("Set letter for the color " + colors.get(i) + "\n");
            letters.add(scanner.nextLine().charAt(0));
            blackBox.add(" added letter " + letters.get(i) + " for color " + colors.get(i));
        }

// setting letters corresponding with colors
// END


// writing image
//START

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                System.out.print(letters.get(colors.indexOf(pixelsHEX.get(i * width + j))));

            }

            System.out.print("\n");

        }


// writing image
//END

/*
        System.out.println(letters);

        System.out.printf("Do you want to show black box?");
        if (scanner.nextBoolean()) {
            System.out.println(blackBox);
        }
*/


    }

    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }

    public static int[] getRGB(final String rgb) {
        final int[] ret = new int[3];
        for (int i = 0; i < 3; i++) {
            ret[i] = Integer.parseInt(rgb.substring(i * 2, i * 2 + 2), 16);
        }
        return ret;
    }

}
