package lista_de_exercicios1;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
        // casas decimais conforme exemplos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo e veja a area dele: ");
        double pi = 3.14159, raio, area;
        raio = sc.nextDouble();
        area = pi * (Math.pow(raio, 2.0));
        System.out.printf("A area do seu circulo é : %.2f%n", area);


        


        sc.close();
    }
}
