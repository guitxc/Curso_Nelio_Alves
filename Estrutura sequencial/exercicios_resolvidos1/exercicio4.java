package exercicios_resolvidos1;
import java.util.Scanner;
public class exercicio4 {
    public static void main (String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
        //decimais
        Scanner sc = new Scanner(System.in);
        int numFuncionario; 
        double horaTrabalhadas, valorAReceber, valorPorHora;
        System.out.println("Digite seu numero, qunatas horas voce trabalhou e valor que voce recebe por hora");
        numFuncionario = sc.nextInt();
        horaTrabalhadas = sc.nextDouble();
        valorPorHora = sc.nextDouble();

        valorAReceber = horaTrabalhadas * valorPorHora;

        System.out.printf("Seu numero é : %d, e voce ira receber $ %.2f%n", numFuncionario, valorAReceber);

        
        sc.close();
    }
}
