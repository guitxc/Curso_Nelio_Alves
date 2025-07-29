package lista_de_exercicios1;
import java.util.Scanner;
public class exercicio3 {
    public static void main (String[] args) {
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        Scanner sc = new Scanner(System.in);
        System.out.println("Veja a diferença de quatros numeros inteiros:");
        int A, B, C, D, diferenca;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diferenca = (A * B - C * D);
        System.out.println("A diferença é : " + diferenca);
        sc.close();
    }
}
