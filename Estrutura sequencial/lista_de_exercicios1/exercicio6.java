package lista_de_exercicios1;
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres valores de ponto flutuante: ");
        double A, B, C, areaTri, areaCir, areaTra, areaQua, areaRet, pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        areaTri = (A * C) / 2;
        areaCir = pi * (C * C);
        areaTra = ((A + B) * C ) / 2;
        areaQua = B * B;
        areaRet = A * B;
        System.out.println(areaTri);
        System.out.println(areaCir);
        System.out.println(areaTra);
        System.out.println(areaQua);
        System.out.println(areaRet);
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
        //mostre:  
        //a) a área do triângulo retângulo que tem A por base e C por altura.  
        //b) a área do círculo de raio C. (pi = 3.14159)  
        //c) a área do trapézio que tem A e B por bases e C por altura.  
        //d) a área do quadrado que tem lado B.  
        //e) a área do retângulo que tem lados A e B.
        sc.close();
    }
}
