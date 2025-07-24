package lista_de_exercicios1;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
//     Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros e veja a a soma:");
        int num1, num2, resultado;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        resultado = num1 + num2;
        System.out.println("A soma dos dois numeros é : " + resultado);
        sc.close();
    }
}
