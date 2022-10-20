package utils;

import java.util.Scanner;

public class Utils {

    public Utils() {
    }

    private static final Scanner input = new Scanner(System.in);

    public static Double readValue() {
        try {
            return input.nextDouble();
        } catch (Exception e) {
            System.out.println("Insert a valid number: ");
            input.next();
            return readValue();
        }
    }

    public static Integer readOption() {
        try {
            return input.nextInt();
        } catch (Exception e) {
            System.out.println("Insert a valid menu option: ");
            input.next();
            return readOption();
        }
    }
}
