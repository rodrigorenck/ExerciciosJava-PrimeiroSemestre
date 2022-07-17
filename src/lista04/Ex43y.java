package lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex43y {

    public static double soma(int n){
        double soma = 0;
        double denominador = 1;
        double divisor = 1;
        for (int i = 1; i <= n; i++) {
            soma = soma + denominador/divisor;
            denominador++;
            divisor += 2;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        int n;
        do {
            System.out.print("Informe um valor inteiro e positivo: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.println("Soma = " + deci.format(soma(n)));




    }
}
