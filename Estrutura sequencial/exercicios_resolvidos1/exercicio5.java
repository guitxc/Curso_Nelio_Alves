package exercicios_resolvidos1;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
        // valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        // Calcule e mostre o valor a ser pago.

        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valorPeca1, valorPeca2, total;
        codPeca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        codPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        total = (valorPeca1 * numPeca1) + (valorPeca2 * numPeca2);

        System.out.println("O valor total a ser pago sera de $ " + total);

        sc.close();
    }
}
