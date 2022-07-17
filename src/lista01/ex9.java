package lista01;/*Faça um programa que lê a altura de uma pessoa em metros e a escreve
em centímetros e em milímetros
*/

import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double altura = teclado.nextDouble();

        double cent = altura*100;
        double mili = altura*1000;

        System.out.println("Altura em cm: " + (int)cent + "\n" + "Altura em mm: " + (int)mili);

    }
}
