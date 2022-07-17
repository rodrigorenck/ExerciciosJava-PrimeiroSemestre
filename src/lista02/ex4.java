package lista02; /**
 * Faça um programa que leia um valor real e escreva se o valor lido é zero,
positivo, negativo, pequeno (se o seu módulo for menor que 1) e/ou grande
(se for maior que 1 milhão)
 */

import java.util.Scanner;
public class ex4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;
        System.out.print("Informe um valor real: ");
        valor = sc.nextDouble();

        if(valor == 0){
            System.out.println("Valor lido é ZERO");
        }if(valor<0){
            System.out.println("Valor é NEGATIVO");
        }if(valor>0 && valor>1){
            System.out.println("Valor é POSITIVO");
        }if(Math.abs(valor)<1){
            System.out.println("Valor PEQUENO");
        }if(Math.abs(valor)>1000000){
            System.out.println("Valor GRANDE");
        }
    }   
}
