package lista01; /**Implemente um programa que lê um (único) valor inteiro de 4 dígitos. A
seguir, esse programa deve escrever um inteiro que corresponde ao valor
lido na ordem inversa. (Exemplo: 1234 → 4321)*/

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        System.out.print("Informe um valor inteiro de quatros digitos: ");
        val = sc.nextInt();

        if((val>=10000) || (val<=999)){
            System.out.println("Erro valor fora do intervalo.");
        }else{
            int mil = val/1000;
            int cent = val%1000/100;
            int dez = val%1000%100/10;
            int uni = val%1000%100%10;

            //int valInverso = uni + dez + cent + mil; 
            System.out.print("Valor lido na ordem inversa : ");
            System.out.print(uni);
            System.out.print(dez);
            System.out.print(cent);
            System.out.print(mil);
        }
    }
}
