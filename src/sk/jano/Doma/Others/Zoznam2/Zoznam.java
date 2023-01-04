package sk.jano.Doma.Others.Zoznam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoznam {
    public static List<String> names = new ArrayList<>();

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name_for_add;
        String name_for_remove;
        String name_for_find;
        names.add("julia");
        names.add("martin");
        names.add("jano");
        names.add("bea");
        names.add("misko");
        names.add("dominika");
        for (int a = 0; a < 1; ) {
            System.out.println("\n\n\n What operation do you want to do?  They are 'add', 'remove', 'find', 'show' & also 'end'.");
            String operation = input.next();
            switch (operation) {
                case "add":
                    System.out.println("What word do you want to add?");
                    name_for_add = input.next();
                    names.add(name_for_add);
                    System.out.println("This word has added");
                    break;

                case "remove":
                    System.out.println("What word do you want to remove?");
                    name_for_remove = input.next();
                    names.remove(name_for_remove);
                    System.out.println("This word has removed");
                    break;

                case "find":
                    System.out.println("What word do you want to find?");
                    name_for_find = input.next();
                    if (names.contains(name_for_find)) {
                        System.out.println("I've got this word in my memory :) \n");
                    } else {
                        System.out.println("I've not got this word in my memory :( \n");
                    }
                    break;


                case "show":
                    System.out.println(names);
                    break;

                case "end":
                    a++;
                    break;

                default:
                    System.out.println("I don't now this operation"); operation = "";
            }
        }
    }
}

