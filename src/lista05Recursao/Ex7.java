package lista05Recursao;

import java.util.Scanner;

public class Ex7 {

    //sem recursao
    public static double soma(int val){
        double soma = 0;
        for(int i = 1; i<=val; i++){
            soma += 1.0/i;
        }
        return soma;
    }

    //com recursao
    public static double somaRecursao(int val){
        if(val == 0){
            return 0;
        }
        if(val == 1){
            return 1;
        }
        return somaRecursao(val-1) + 1.0/val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        do {
            System.out.print("Informe um valor inteiro e positivo: ");
            val = sc.nextInt();
        }while(val<0);
        System.out.println("Soma = " + soma(val));
        System.out.println("Soma recursao = " + somaRecursao(val));
    }
}
