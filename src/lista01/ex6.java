package lista01;/*. Faça um programa que converte de Fahrenheit para graus Celsius. O
programa deve ler um valor em Fahrenheit, converter e escrever o valor
correspondente em Celsius. Para realizar a conversão use a fórmula c =5/9(f − 32).*/
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double far, cel;
        System.out.print("\f Informe a temperatura em Fahrenheit: ");
        far = teclado.nextInt();

        cel = 5/9.0*(far - 32);

        System.out.println("A temperatura em Celsius é " + (int)cel);

    }
}
