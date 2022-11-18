package org.example;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Jogo da advinhação, tente acertar um número de 0 a 7 gerado aleatoriamente pelo computador!\nVocê terá 3 chances, começando agora!");

        char continueGameOrNot = 's';

        guessingGame(continueGameOrNot, random, scan);

    }

    private static void guessingGame(char continueGameOrNot, Random random, Scanner scan) {
        while (continueGameOrNot == 's') {
            Integer guess = 0;
            int randomNumber = random.nextInt(7);
            System.out.println("\nEscolhendo o número...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Pronto, já escolhi, agora é com você e a sorte!");

            for (int i = 1; i <= 3; i++) {

                try {
                    System.out.println("\nDigite seu palpite: ");
                    guess = scan.nextInt();
                } catch (Exception ex) {
                    System.out.println("Algo deu errado, poderia digitar seu palpite novamente? ");
                    i--;
                    scan.next();
                    guess = 0;
                }


                if (guess == randomNumber && i == 1) {
                    System.out.println("Parabéns, você é uma pessoa muita sortuda, conseguiu  acertar de primeira!");
                    break;
                } else if (guess == randomNumber && i == 2) {
                    System.out.println("Parabéns, conseguiu  acertar na segunda tentativa!");
                    break;
                } else if (guess == randomNumber && i == 3) {
                    System.out.println("Parabéns, mas foi por pouco hein, mais sorte na próxima rodada!");
                    break;
                } else if (i == 3 && guess != randomNumber) {
                    System.out.println("\nQue pena, não foi dessa vez!");
                }


            }

            System.out.println("\nE aí, tá afim de jogar mais uma?! [s/n]");
            continueGameOrNot = scan.next().charAt(0);
            while (continueGameOrNot != 's' && continueGameOrNot != 'n') {

                System.out.println("Não entendi bem, poderia responder com [s/n] por gentileza? ");
                continueGameOrNot = scan.next().charAt(0);

                if (continueGameOrNot == 's') {
                    System.out.println("Que massa, vamo lá novamente!");
                } else {
                    System.out.println("Okay, nos vemos outro dia :(");
                }
            }
        }
    }
}