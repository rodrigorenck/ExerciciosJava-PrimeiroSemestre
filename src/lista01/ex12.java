package lista01; /**
 *  Faça um programa que leia uma quantia inteira em R$ e decompõe essa
quantia na menor quantidade de notas de 100, 50, 20, 10, 5, 2 e 1. Por
exemplo, se o usuário informar R$ 236 como entrada, o programa deve
exibir:
• 2 nota(s) de 100
• 0 nota(s) de 50
• 1 nota(s) de 20
• 1 nota(s) de 10
• 1 nota(s) de 5
• 0 nota(s) de 2
• 1 moeda(s) de 1
 */
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int val;
        System.out.print("Informe uma quantia inteira de $: ");
        val = in.nextInt();

        int cem, cinq, vint, dez, cinc, dois, um, resto;

        cem = val/100;
        resto = val%100;
        cinq = resto/50;
        resto = val%100%50;
        vint = resto/20;
        resto = val%100%50%20;
        dez = resto/10;
        resto = val%100%50%20%10;
        cinc = resto/5;
        resto = val%100%50%20%10%5;
        dois = resto/2;
        resto = val%100%50%20%10%5%2;
        um = resto;

        System.out.println(cem + " nota(s) de 100");
        System.out.println(cinq + " nota(s) de 50");
        System.out.println(vint + " nota(s) de 20");
        System.out.println(dez + " nota(s) de 10");
        System.out.println(cinc + " nota(s) de 5");
        System.out.println(dois + " nota(s) de 2");
        System.out.println(um + " moeda(s) de 1");


    }
}
