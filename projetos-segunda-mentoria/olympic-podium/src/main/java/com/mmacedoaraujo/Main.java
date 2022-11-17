package com.mmacedoaraujo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Athlete> athleteList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Prova de arremesso de dardos, etapa de registro do resultado de cada participante.");

        registerAthleteData(scan, athleteList);

        List<Athlete> podiumList = podium(athleteList);
        podiumAnnouncement(podiumList);


    }

    private static void registerAthleteData(Scanner scan, List<Athlete> list) {

        for (int i = 1; i <= 10; i++) {
            try {
                Athlete athlete = new Athlete();
                System.out.print("Digite o nome do Atleta " + i + ": ");
                String name = scan.nextLine();
                System.out.print("Digite o país do Atleta " + i + ": ");
                String country = scan.nextLine();
                System.out.print("Digite o resultado(em metros) do Atleta " + i + ": ");
                Integer throwDistance = Integer.valueOf(scan.nextLine());
                athlete.setName(name);
                athlete.setCountry(country);
                athlete.setThrowDistance(throwDistance);
                list.add(athlete);
            } catch (Exception ex) {
                System.out.println("Entrada inválida, por favor digite novamente: ");
                i--;
            }
        }

    }

    private static List<Athlete> podium(List<Athlete> athleteList) {
        List<Athlete> podiumList = new ArrayList<>();
        athleteList.sort((o1, o2) -> o1.getThrowDistance().compareTo(o2.getThrowDistance()));
        Collections.reverse(athleteList);
        podiumList.add(athleteList.get(0));
        podiumList.add(athleteList.get(1));
        podiumList.add(athleteList.get(2));
        return podiumList;
    }

    private static void podiumAnnouncement(List<Athlete> podiumList) {
        for (int i = 0; i < 3; i++) {
            String medal = "";
            switch (i) {
                case 0:
                    medal = "Ouro: ";
                    break;
                case 1:
                    medal = "Prata: ";
                    break;
                case 2:
                    medal = "Bronze: ";
                    break;
            }
            System.out.println(medal + podiumList.get(i).getName() + " - " + podiumList.get(i).getCountry() + " Resultado: " + podiumList.get(i).getThrowDistance() + "m ");
        }
    }

}