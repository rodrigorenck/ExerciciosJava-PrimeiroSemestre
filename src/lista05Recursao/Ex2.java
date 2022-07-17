package lista05Recursao;

import java.util.Scanner;

public class Ex2 {

    // metodo sem recursao
    public static int soma(int valor){
        int soma = 0;
        for(int i = 1; i<=valor; i++){
            soma += i;
        }
        return soma;
    }

    // metodo recursivo
    public static int somaRecursao(int valor){
        if(valor == 0){
            return 0;
        }
        if(valor == 1){
            return 1;
        }
        return somaRecursao(valor-1) + valor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int val;
        do{
            System.out.print("Informe um valor inteiro e positivo: ");
            val = sc.nextInt();
        }while(val<0);

        System.out.println("A soma do valor eh: " + soma(val));

        System.out.println("A soma do valor eh: " + somaRecursao(val));
    }
}
