package application;

import model.entities.Menus;
import utils.Utils;

import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        Menus menus = new Menus();

        String main = menus.MainMenu();
        if (main.contains("1")) {
            menus.regularCalculatorMenu();
        }
        if (main.contains("2")) {
            menus.BMICalculatorMenu();
        }
        if (main.contains("3")) {
            menus.AreaCalculatorMenu();
        }





    }
}
