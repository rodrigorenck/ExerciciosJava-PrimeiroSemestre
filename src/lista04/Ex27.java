package lista04;

/*
 * Crie um programa que leia um valor inteiro e positivo (garanta), verique
 * e escreva se o valor lido é um número perfeito ou não. Números perfeitos
 * são aqueles cuja soma dos seus divisores (excluindo o próprio número como
 * divisor) corresponde ao próprio número. Exemplo de números perfeitos:
 * 6, 28, ... Por exemplo, o número 6 possui os divisores 1, 2 e 3, os quais
 * somados 1 + 2 + 3 = 6. Crie um método para vericar o número lido é
 * perfeito.
 */

import java.util.Scanner;

public class Ex27 {

    public static void numeroPerfeito(int valor) {
        int somaDivisores = 0;
        //nao se deve printar em metodo!
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == valor) {
            System.out.println("Eh um numero perfeito!");
        } else {
            System.out.println("Nao eh um numero perfeito!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        do {
            System.out.print("Informe um valor inteiro e positivo: ");
            valor = sc.nextInt();
        } while (valor < 0);

        numeroPerfeito(valor);


    }
}
