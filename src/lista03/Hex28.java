package lista03; /**
 * Faça um programa que calcule e escreva a combinação e o arranjo de um
conjunto de tamanho n em subconjuntos de p elementos.
 */

import java.util.Scanner;
public class Hex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho do conjunto: ");
        int n = sc.nextInt();

        do{
            System.out.println("Erro valor fora do intervalo!");
            System.out.print("Informe o tamanho do conjunto: ");
            n = sc.nextInt();
        }while(n<0);

            System.out.print("Informe um valor positivo para o subconjunto: ");
            int p = sc.nextInt();

        do{
            System.out.println("Erro valor fora do intervalo!");
            System.out.print("Informe um valor positivo para o subconjunto: ");
            p = sc.nextInt();
        }while(n<0);

        int cont = 1;
        while(cont<=p){
            
        }




    
        

    }
}
