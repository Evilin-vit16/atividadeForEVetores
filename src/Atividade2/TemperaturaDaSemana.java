package Atividade2;

import java.util.Scanner;

public class TemperaturaDaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double [] temp = new double[7];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Qual a temperatura do dia " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();}

        for (int i = 0; i < 7; i++) {
            soma = soma + temp[i];
        }

        media= soma / 7;
        System.out.println("A média da temperatura da semana é de " + media + " C");
    }
}
