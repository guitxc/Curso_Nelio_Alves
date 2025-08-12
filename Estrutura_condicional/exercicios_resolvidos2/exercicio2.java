package Estrutura_condicional.exercicios_resolvidos2;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um número inteiro e veja se este número é par ou ímpar:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("PAR = " + num);
        } else {
            System.out.println("ÍMPAR = " + num);
        }

    }
}
