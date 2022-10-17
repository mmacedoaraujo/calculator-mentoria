package model.entities;

import utils.Utils;

import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);
    private final Utils utils = new Utils();

    public void mainMenu() {
        String mainMenuAnswer;
        System.out.println("Bem vindo à minha calculadora multi uso!\nPor favor escolha uma das opções abaixo:");
        System.out.println("1. Calculadora Padrão");
        System.out.println("2. Calculadora de IMC");
        System.out.println("3. Calculadora de Área");
        System.out.println();
        System.out.print("Digite sua escolha: ");
        mainMenuAnswer = input.nextLine();

        mainMenuAnswer = utils.whileValidatorExclamationOption("^[1-3]{1}", mainMenuAnswer);

        if (mainMenuAnswer.contains("1")) {
            System.out.println();
            regularCalculatorMenu();
        }
        if (mainMenuAnswer.contains("2")) {
            System.out.println();
            BMICalculatorMenu();
        }
        if (mainMenuAnswer.contains("3")) {
            System.out.println();
            AreaCalculatorMenu();
        }
    }

    public void regularCalculatorMenu() {
        Double result = 0.0;
        String answer = "";
        System.out.println("Você escolheu: Calculadora Padrão");
        System.out.print("Deseja continuar[y/n]? ");
        answer = input.nextLine();
        answer = utils.whileValidatorExclamationOption("^[y]{1}|^[n]{1}", answer);
        System.out.println();
        if (answer.toLowerCase().contains("y")) {
            System.out.println("Agora escolha qual operação deseja realizar:");
            System.out.println();
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("5. Potenciação");
            System.out.println("6. Retornar ao menu principal");
            System.out.println();

            System.out.print("Digite sua escolha: ");
            answer = input.nextLine();

            answer = utils.whileValidator("[0]|[7-9]+|[\\d]{2,}|[A-Za-z]|[\\s]", answer);
            System.out.println();

            if (answer.contains("1")) {
                result = regularCalculatorOperationConstructorMethod("Soma", "1");
            }
            if (answer.contains("2")) {
                result = regularCalculatorOperationConstructorMethod("Subtração", "2");
            }
            if (answer.contains("3")) {
                result = regularCalculatorOperationConstructorMethod("Divisão", "3");
            }
            if (answer.contains("4")) {
                result = regularCalculatorOperationConstructorMethod("Multiplicação", "4");
            }
            if (answer.contains("5")) {
                result = regularCalculatorOperationConstructorMethod("Potenciação", "5");
            }
            if (answer.contains("6")) {
                answer = "";
                mainMenu();
            }

            System.out.println("Resultado: " + result);
            System.out.println();
            System.out.print("1. Voltar para Calculadora Básica ou 2. Voltar para o menu principal? ");
            input.nextLine();
            System.out.println();
            String finalOperationAnswer = input.nextLine();
            utils.whileValidator("[0]|[3-9]+|[\\d]{2,}|[A-Za-z]|[\\s]", finalOperationAnswer);

            if (finalOperationAnswer.contains("1")) {
                regularCalculatorMenu();
            }
            if (finalOperationAnswer.contains("2")) {
                mainMenu();
            }

        } else {
            mainMenu();
        }
        System.out.println();
    }

    public void BMICalculatorMenu() {
        System.out.println("Calculadora IMC");
    }

    public void AreaCalculatorMenu() {
        System.out.println("Calculadora de área");
    }

    public Double regularCalculatorOperationConstructorMethod(String operation, String answer) {
        Double result = 0.0;
        System.out.printf("Você escolheu a operação: %s", operation);
        System.out.println();
        System.out.print("Digite o primeiro valor: ");
        double firstNumber = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double secondNumber = input.nextDouble();

        RegularCalculator regularCalculator = new RegularCalculator(firstNumber, secondNumber);
        switch (answer) {
            case "1":
                result = regularCalculator.sum();
                break;
            case "2":
                result = regularCalculator.subtraction();
                break;
            case "3":
                result = regularCalculator.division();
                break;
            case "4":
                result = regularCalculator.multiply();
                break;
            case "5":
                result = regularCalculator.power();
                break;
        }
        return result;
    }
}
