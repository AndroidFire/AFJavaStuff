package al.androidfire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printHeader();
        System.out.println(" \n \n 1) JSON Validator " +
                "\n 2) Check Divisibility" +
                "\n 3) Hex \n");
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
                case "2":
                    System.out.println("Enter a desired number");

                    while (scanner.hasNext()) {

                        int a = scanner.nextInt();
                        System.out.println( "Enter number to be divided with" );

                        while (scanner.hasNext() ) {
                            int b = scanner.nextInt();
                            if (Math.checkDisability(a,b)) {
                                System.out.println("Your number "+a+" which is divisible by "+b);
                            }else {
                                System.out.println("Your number "+a+" which is not divisible by "+b);
                            }
                            System.exit(0);

                        }
                    }

                    break;
                case "3":
                    System.out.println("Enter algorithm");

                    while (scanner.hasNext()) {

                        System.out.println(" 1) String to Hex \n 2) Hex to String");

                        String codes = scanner.next();

                        while (scanner.hasNext() ) {

                            switch (scanner.next()) {
                                case "1":
                                    System.out.println("Result is below \n");
                                    System.out.println(Hex.toHexString(codes));
                                    break;
                                case "2":

                                    System.out.println("Result is below \n");
                                    System.out.println(Hex.fromHexString(codes));

                                    break;
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
