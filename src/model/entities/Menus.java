package model.entities;

import utils.Utils;

import java.util.Scanner;

public class Menus {

    private String answer;
    private RegularCalculator regularCalculator;
    Scanner input = new Scanner(System.in);

    private Utils utils = new Utils();

    public String MainMenu() {

        System.out.println("Bem vindo à minha calculadora multi uso!\nPor favor escolha uma das opções abaixo:");
        System.out.println("1. Calculadora Padrão");
        System.out.println("2. Calculadora de IMC");
        System.out.println("3. Calculadora de Área");
        System.out.print("Digite sua escolha: ");
        answer = input.nextLine();

        while (utils.regexMatcher("[4-9]+|[\\d]{2,}", answer)) {
            System.out.print("Opção inválida, tente novamente: ");
            answer = input.nextLine();
        }
        return answer;
    }

    public void regularCalculatorMenu() {
        System.out.println("Calculadora Padrão");
    }

    public void BMICalculatorMenu() {
        System.out.println("Calculadora IMC");
    }

    public void AreaCalculatorMenu() {
        System.out.println("Calculadora de área");
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
