package al.androidfire;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printHeader();
        System.out.println(" \n \n 1) JSON Validator \n");
        System.out.println("CHOICE :- ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String CHOICE = scanner.next();

            switch (CHOICE) {

                case "1":

                    System.out.println("Enter your json text");

                    while (scanner.hasNext()) {
                      String a = scanner.next();
                        System.out.println("Do you want to include error y/n");

                        while (scanner.hasNext()) {
                            switch (scanner.next()) {
                                case "y":
                                    boolean is = JSON.isCorrectJSON(a,true);
                                    if (is) {
                                        System.out.println("Valid");
                                    }
                                    else {
                                        System.out.println("Not Valid");
                                    }
                                    System.exit(0);
                                    break;
                                case "n":
                                    boolean isS = JSON.isCorrectJSON(a,false);
                                    if (isS) {
                                        System.out.println("Valid");
                                    }
                                    else {
                                        System.out.println("Not Valid");
                                    }
                                    System.exit(0);

                                    break;
                                default:
                                    System.out.println("Something Went Wrong");
                                    System.exit(0);
                            }
                        }
                    }

                    break;
                default:
                    System.out.println("Something went wrong");

                    System.exit(0);
            }

        }
    }
    public static void printHeader() {
        System.out.println("\n             ++------++          " +
                "         +-+___________\n            / /      \\ \\  " +
                "                | |__________ |\n           / /     " +
                "   \\ \\                 | |\n          / /       " +
                "   \\ \\                | |_______\n         / /   " +
                "         \\ \\               |  _______|\n       " +
                " / / ============ \\ \\              | |\n       / / ===============\\ \\  " +
                "           | |\n      / /                  \\ \\        " +
                "    | |\n     / /                    \\ \\         " +
                "  | |\n    / /  " +
                "                    \\ \\          | |\n   ~ ~           " +
                "            ~ ~          ~ ~\n\n   A HUMAN BEING FROM INDIA TO THE WORLD");
    }
}
