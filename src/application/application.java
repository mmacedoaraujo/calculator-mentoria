package application;

import utils.Utils;

import java.util.Scanner;

public class application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Utils utils = new Utils();
        String answer = "";
        System.out.println("Bem vindo à minha calculadora multi uso!\nPor favor escolha uma das opções abaixo:");
        System.out.println("1. Calculadora Padrão");
        System.out.println("2. Calculadora de IMC");
        System.out.println("3. Calculadora de Área");

        do {
            System.out.print("Digite sua resposta: ");
            answer = input.nextLine();
        } while (utils.regexMatcher("[4-9]+|[\\d]{2,}", answer));

        if (answer.contains("1")) {
            System.out.println("Você selecionou a opção: 1. Calculadora Padrão" +
                    "\nAgora selecione qual operação deseja realizar:");
            System.out.println("1. Soma");
            System.out.println("1. Subtração");
            System.out.println("1. Divisão");
            System.out.println("1. Multiplicação");
            System.out.println("1. Potenciação");
        }
        if (answer.contains("2")) {
            System.out.println("Você selecionou a opção: 2. Calculadora de IMC" +
                    "\nAgora selecione qual operação deseja realizar:");

        }
        if (answer.contains("3")) {
            System.out.println("Você selecionou a opção: 3. Calculadora de Área" +
                    "\nAgora selecione qual operação deseja realizar:");

        }


    }
}
