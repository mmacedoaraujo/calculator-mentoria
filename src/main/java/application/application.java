package application;

import model.utils.Menus;

import java.util.Locale;

public class application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Menus menus = new Menus();

        menus.mainMenu();


    }
}
