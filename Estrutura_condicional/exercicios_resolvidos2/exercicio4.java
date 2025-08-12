package Estrutura_condicional.exercicios_resolvidos2;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora de inicio do jogo e a final e veja quantas horas voce jogou");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if (num1 == 0 || num2 == 0) {
            System.out.println("Você jogou 24 horas");
        } else {
            int duracao;
            if (num1 < num2) {
                duracao = num2 - num1;
            } else {
                duracao = 24 - num1 + num2;
            }
            System.out.println("Você jogou " + duracao + " horas");
        }
    }
}
