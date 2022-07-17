package lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex44 {

    public static double soma(int n, double x){
        double soma = 0;
        int divisor = 1;
        int potencia = 1;
        for(int i = 1; i<=n; i++){
            soma = soma + Math.pow(x, potencia)/divisor;
            potencia++;
            divisor += 4;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        int n;
        do{
            System.out.print("Informe um numero inteiro e positivo: ");
            n = sc.nextInt(); //n é a quantidade de elementos
        }while(n<0);

        System.out.print("Informe um valor real x: ");
        double x = sc.nextDouble();

        System.out.println("Soma = " + deci.format(soma(n, x)));

    }
}
