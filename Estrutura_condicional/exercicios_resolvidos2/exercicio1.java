package Estrutura_condicional.exercicios_resolvidos2;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro e veja é positivo e negativo:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("POSITIVO = " + num);
        } else {
            System.out.println("NEGATIVO = " + num);
        }

    }
}
