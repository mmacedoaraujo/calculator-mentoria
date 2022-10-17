package utils;

import model.entities.Menus;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static Scanner input = new Scanner(System.in);


    public String whileValidator(String pattern, String matcher) {
        while (regexValidator(pattern, matcher)) {
            System.out.print("Opção inválida, tente novamente: ");
            matcher = input.nextLine();
        }
        return matcher;
    }

    public String whileValidatorExclamationOption(String pattern, String matcher) {
        while (!regexValidator(pattern, matcher)) {
            System.out.print("Opção inválida, tente novamente: ");
            matcher = input.nextLine();
        }
        return matcher;
    }

    public Boolean regexValidator(String pattern, String matcher) {
        Matcher m = Pattern.compile(pattern).matcher(matcher);
        return m.find();
    }
}
