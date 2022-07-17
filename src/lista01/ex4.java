package lista01;

/*Faça um programa que leia o valor do raio, calcule e escreva a área de
uma esfera. A área de uma esfera é dada por a = 4πr2*/
import java.util.Scanner;
public class ex4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio, areaEsfera;
        System.out.print("\fInforme o valor do raio: ");
        raio = teclado.nextDouble();

        areaEsfera = 4*Math.PI*Math.pow(raio, 2);
        System.out.println("A area da esfera é " + areaEsfera);
    }
}