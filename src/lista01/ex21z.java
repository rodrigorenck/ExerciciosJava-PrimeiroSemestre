package lista01; /**
 * Uma empresa de bolinhas de gude precisa de um programa que calcula
a quantidade de caixas necessárias para embalar as bolinhas. A empresa
trabalha com caixas cuja capacidade é de 100 bolinhas. Faça um programa
que leia a quantidade de bolinhas, calcule e escreva a quantidade de caixas
necessárias para embalar as bolinhas.
 */

import java.util.Scanner;
public class ex21z {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de bolinhas: ");
        int bolinhas = teclado.nextInt();

        //usamos o Math ceil para caso der um numero quebrado de caixas, por exemplo, 1.2 caixas nos automaticamente arredondaremos pra cima e ficaria 2 caixas.
        int quantCaixas = (int) Math.ceil(bolinhas/100.0);
    
        System.out.println("A quantidade de caixas necessarias é: " + quantCaixas);
    }
}
