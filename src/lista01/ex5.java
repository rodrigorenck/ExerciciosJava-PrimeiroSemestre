package lista01;/*Implemente um programa que leia um valor n, calcule e escreva n^2, n^3 e n^4*/
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double val;
        System.out.print("Informe um valor: ");
        val = teclado.nextDouble();

        System.out.println(val + " elevado a 2: " + Math.pow(val,2));
        System.out.println(val + " elevado a 3: " + Math.pow(val,3));
        System.out.println(val + " elevado a 4: " + Math.pow(val,4));
    }
}
