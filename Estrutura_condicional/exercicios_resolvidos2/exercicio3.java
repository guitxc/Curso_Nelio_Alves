package Estrutura_condicional.exercicios_resolvidos2;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros e veja se eles são multiplos");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}
