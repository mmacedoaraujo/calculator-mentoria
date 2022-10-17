package model.entities;

import utils.Utils;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.*;

public class Menus {
    Scanner input = new Scanner(System.in);
    private Utils utils = new Utils();

    public void mainMenu() {
        String mainMenuAnswer = "";
        System.out.println("Bem vindo à minha calculadora multi uso!\nPor favor escolha uma das opções abaixo:");
        System.out.println("1. Calculadora Padrão");
        System.out.println("2. Calculadora de IMC");
        System.out.println("3. Calculadora de Área");
        System.out.println();
        System.out.print("Digite sua escolha: ");
        mainMenuAnswer = input.nextLine();

        while (utils.regexValidator("[0]|[4-9]+|[\\d]{2,}", mainMenuAnswer)) {
            System.out.print("Opção inválida, tente novamente: ");
            mainMenuAnswer = input.nextLine();
        }

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
        String answer = "";
        System.out.println("Você escolheu: Calculadora Padrão");
        System.out.print("Deseja continuar[y/n]? ");
        answer = input.nextLine();
        utils.whileValidatorExclamationOption("^[y]{1}|^[n]{1}", answer);
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

            utils.whileValidator("[0]|[7-9]+|[\\d]{2,}", answer);
            System.out.println();

            if (answer.contains("1")) {
                System.out.print("Você escolheu a operação 1: Soma" +
                        "\nDeseja seguir em frente[y/n]? ");
                String answerSubMenu = input.nextLine();
                utils.whileValidatorExclamationOption("^[y]{1}|^[n]{1}", answerSubMenu);
                System.out.println();

                if (answerSubMenu.toLowerCase().contains("y")) {
                    System.out.print("Digite o primeiro valor a ser somado: ");
                    double firstNumber = input.nextDouble();

                    System.out.print("Digite o segundo valor a ser somado: ");
                    double secondNumber = input.nextDouble();

                    RegularCalculator regularCalculator = new RegularCalculator(firstNumber, secondNumber);
                    Double sumResult = regularCalculator.sum();

                    System.out.println("Resultado: " + sumResult);
                    System.out.println();
                    System.out.print("1. Voltar para Calculadora Básica ou 2. Voltar para o menu principal? ");
                    input.nextLine();
                    System.out.println();
                    String finalOperationAnswer = input.nextLine();
                    utils.whileValidator("[0]|[3-9]+|[\\d]{2,}", finalOperationAnswer);

                    if (finalOperationAnswer.contains("1")) {
                        regularCalculatorMenu();
                    }
                    if (finalOperationAnswer.contains("2")) {
                        mainMenu();
                    }

                } else {
                    regularCalculatorMenu();
                }
                System.out.println();
            }
            if (answer.contains("2")) {
                System.out.print("Você escolheu a operação 2: Subtração" +
                        "\nDeseja seguir em frente[y/n]? ");
                String answerSubMenu = input.nextLine();
                utils.whileValidatorExclamationOption("^[y]{1}|^[n]{1}", answerSubMenu);
                System.out.println();

                if (answerSubMenu.toLowerCase().contains("y")) {
                    System.out.print("Digite o primeiro valor: ");
                    double firstNumber = input.nextDouble();

                    System.out.print("Digite o segundo valor: ");
                    double secondNumber = input.nextDouble();

                    RegularCalculator regularCalculator = new RegularCalculator(firstNumber, secondNumber);
                    Double subtractionResult = regularCalculator.subtraction();

                    System.out.println("Resultado: " + subtractionResult);
                    System.out.println();
                    System.out.print("1. Voltar para Calculadora Básica ou 2. Voltar para o menu principal? ");
                    input.nextLine();
                    System.out.println();
                    String finalOperationAnswer = input.nextLine();
                    utils.whileValidator("[0]|[3-9]+|[\\d]{2,}", finalOperationAnswer);

                    if (finalOperationAnswer.contains("1")) {
                        regularCalculatorMenu();
                    }
                    if (finalOperationAnswer.contains("2")) {
                        mainMenu();
                    }

                } else {
                    regularCalculatorMenu();
                }
                System.out.println();

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
        } else {
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
