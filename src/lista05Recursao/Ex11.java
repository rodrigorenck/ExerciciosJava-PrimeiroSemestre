package lista05Recursao;

import java.util.Scanner;

public class Ex11 {

    //sem recursao
    public static double soma(double val){
        double soma = 0;
        double divisor = 1;
        for(int i = 1; i<=val; i++){
            soma += i/divisor;
            divisor +=2;
        }
        return soma;
    }

    //com recursao
    public static double somaRecursao(double val){
        if(val == 1){
            return 1;
        }
        return somaRecursao(val-1) + val/(2*val -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double val;
        do {
            System.out.print("Informe um valor inteiro e positivo: ");
            val = sc.nextInt();
        } while (val <=0);

        System.out.println("Soma =  " + soma(val));
        System.out.println("Soma recursao =  " + somaRecursao(val));
    }
}
