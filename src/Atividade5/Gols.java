package Atividade5;

import java.util.Scanner;

public class Gols {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] gols = new int[8];
        int maiorGols = 0;
        int jogador = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Jogador " + (i + 1) + " fez quantos gols: ");
            gols [i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + gols[i] + " gols");
        }

        for (int i = 0; i < 8; i++) {
            if (gols[i] > maiorGols) {
                maiorGols = gols[i];
                jogador = i + 1;
            }
        }

        System.out.println("Maior quantidade de gols: " + maiorGols);
        System.out.println("Jogador que mais marcou: Jogador " + jogador);

    }

}
