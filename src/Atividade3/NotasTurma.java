package Atividade3;

import java.util.Scanner;

public class NotasTurma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int apvds = 0;
        int rep = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Nota dos alunos " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 6) {
                apvds = apvds + 1;
            } else {
                rep = rep + 1;
            }
        }
        System.out.println();
        System.out.println("Aprovados: " + apvds);
        System.out.println("Reprovados: " + rep);
    }

}
