package lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex45 {

    public static double soma(int n, double x){
        double soma = 0;
        int potencia = 1;
        int divisor = 1;
        for(int i = 1; i<=n; i++){
            if(i%2 == 0){
                soma = soma - Math.pow(x, potencia)/divisor;
            }else{
                soma = soma + Math.pow(x, potencia)/divisor;
            }
            potencia += 2;
            divisor += 2;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        int n;
        do{
            System.out.print("Informe um numero inteiro e positivo (quantidade de elementos): ");
            n = sc.nextInt();
        }while(n<0);

        System.out.print("Informe um valor real: ");
        double x = sc.nextDouble();

        System.out.println("Soma = " + deci.format(soma(n, x)));

    }
}
