package lista03; /**
 * Faça um programa que leia dois valores inteiros e positivos ’a’ e ’b’. A
seguir, o programa deve escrever a soma dos pares entre ’a’ e ’b’ (inclusive
 */

import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor 'a': ");
        int a = teclado.nextInt();
        System.out.print("Informe o valor 'b': ");
        int b = teclado.nextInt();
        int contador = 0;
        int somaPares = 0;
        int val = a;
        int val2 = b;
        if(a<0 || b<0){
            System.out.println("Erro. Valor fora do intervalo solicitado");
        }else{
            if(a<b){
                while(contador<=Math.abs(a-b)){
                    if(val%2 == 0){
                        somaPares = somaPares + val;
                    }
                    val = val + 1;
                    contador++;
                }
            }else{ //se o valor de b for menor que o de a 
                while(contador<=Math.abs(a-b)){
                    if(val2%2 == 0){
                        somaPares = somaPares + val2;
                    }
                    val2 = val2 + 1;
                    contador++;
                }
            }
        }
        System.out.println("A soma dos Valores Pares entre [" + a + " - " + b + "] é " + somaPares);
    }
}
