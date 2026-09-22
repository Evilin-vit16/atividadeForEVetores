package Atividade7;
import java.util.Scanner;
public class Radarvelocidade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vel = new int[10];
        int limite = 80;
        int acimaDoLimite = 0;
        int maiorVelocidade = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Velocidade do veiculo " + (i + 1) + ": ");
            vel[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {

            if (vel[i] > limite) {
                System.out.println("Veiculo " + (i + 1) + ": " + vel[i] + " km/h - ACIMA DO LIMITE");
                acimaDoLimite = acimaDoLimite + 1;
            } else {
                System.out.println("Veiculo " + (i + 1) + ": " + vel[i] + " km/h");
            }

            if (vel[i] > maiorVelocidade) {
                maiorVelocidade = vel[i];
            }
        }

        System.out.println("Total acima do limite: " + acimaDoLimite);
        System.out.println("Maior velocidade registrada: " + maiorVelocidade);
    }
}
