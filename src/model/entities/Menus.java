package model.entities;

import com.sun.tools.javac.Main;
import utils.Utils;

import java.util.Scanner;

public class Menus {

    private RegularCalculator regularCalculator;
    Scanner input = new Scanner(System.in);

    private Utils utils = new Utils();

    public void mainMenu() {
        String mainMenuAnswer = "";
        System.out.println("Bem vindo à minha calculadora multi uso!\nPor favor escolha uma das opções abaixo:");
        System.out.println("1. Calculadora Padrão");
        System.out.println("2. Calculadora de IMC");
        System.out.println("3. Calculadora de Área");
        System.out.print("Digite sua escolha: ");
        mainMenuAnswer = input.nextLine();

        while (utils.regexMatcher("[4-9]+|[\\d]{2,}", mainMenuAnswer)) {
            System.out.print("Opção inválida, tente novamente: ");
            mainMenuAnswer = input.nextLine();
        }

        if (mainMenuAnswer.contains("1")) {
            regularCalculatorMenu();
        }
        if (mainMenuAnswer.contains("2")) {
            BMICalculatorMenu();
        }
        if (mainMenuAnswer.contains("3")) {
            AreaCalculatorMenu();
        }
    }

    public void regularCalculatorMenu() {
        String answer = "";
        System.out.println("Você escolheu: Calculadora Padrão\n" +
                "Agora escolha qual operação deseja realizar:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.println("5. Potenciação");
        System.out.println("6. Retornar ao menu principal");

        System.out.print("Digite sua escolha: ");
        answer = input.nextLine();

        while (utils.regexMatcher("[7-9]+|[\\d]{2,}", answer)) {
            System.out.print("Opção inválida, tente novamente: ");
            answer = input.nextLine();
        }

        if (answer.contains("1")) {
            System.out.println("Você escolheu a operação 1: Soma" +
                    "\nDeseja seguir em frente? [y/n]");
            String answerSubMenu = input.nextLine();

            System.out.print("Digite o primeiro valor a ser somado: ");
            double firstNumber = input.nextDouble();
            System.out.print("Digite o segundo valor a ser somado: ");
            double secondNumber = input.nextDouble();
        }
        if (answer.contains("2")) {

        }
        if (answer.contains("3")) {

        }
        if (answer.contains("4")) {

        }
        if (answer.contains("5")) {

        }
        if (answer.contains("6")) {
            answer = "";
            mainMenu();
        }
    }

    public void BMICalculatorMenu() {
        System.out.println("Calculadora IMC");
    }

    public void AreaCalculatorMenu() {
        System.out.println("Calculadora de área");
    }
}
