package lista03; /**
 * Escreva um programa que leia uma quantidade desconhecida de números.
A seguir, o programa deve contar e escrever a quantidade de valores pertencentes aos seguintes intervalos: 
[0;25], [26;50], [51;75] e [76;100]. A entrada de dados deve terminar quando for lido um número negativo. 
Ao final o programa deve exibir ainda a quantidade de valores lidos.
 */

import java.util.Scanner;
public class ex31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0, cont = 0;
        int num;
        System.out.println("Informe numeros aleatorios [numero negativo encerra o programa]!");
        while(true){
            System.out.print("Numero: ");
            num = teclado.nextInt();
            if(num<0){
                break;
            }

            if(num<=25){
                intervalo1++;
            }else if(num<=50){
                intervalo2++;
            }else if(num<=75){
                intervalo3++;
            }else if(num<=100){
                intervalo4++;
            }
            cont++;
        }
        System.out.println(intervalo1 + " valores pertencentes ao intervalo [0;25]");
        System.out.println(intervalo2 + " valores pertencentes ao intervalo [26;50]");
        System.out.println(intervalo3 + " valores pertencentes ao intervalo [51;75]");
        System.out.println(intervalo4 + " valores pertencentes ao intervalo [76;100]");
        System.out.println("Total de valores lidos: " + cont);
    }
}
