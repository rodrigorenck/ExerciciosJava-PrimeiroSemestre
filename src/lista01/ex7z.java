package lista01;/*
Construa um programa que leia dois valores inteiros e escreve na tela:
(a) a soma
(b) a diferença
(c) a média
(d) a distância (valor absoluto da diferença)
(e) o maior dos dois (use maior =a+b+|a−b|2).(f) o menor dos dois (use menor =a+b−|a−b|2)
-> Complementei o exercicio usando repeticao, e switch case! 
*/

import java.util.Scanner;
public class ex7z {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in); // scanner para lermos Strings
        int val1, val2;
        String cont;
        System.out.println("Informe dois valores inteiros: ");
        val1 = teclado.nextInt();
        val2 = teclado.nextInt();

        do{
            System.out.println("MENU DE OPÇÕES!");
            System.out.println("Digite [1] para a soma");
            System.out.println("Digite [2] para a diferença");
            System.out.println("Digite [3] para a média");
            System.out.println("Digite [4] para a distancia");
            System.out.println("Digite [5] para a maior");
            System.out.println("Digite [6] para a menor");
            System.out.print("Sua escolha: ");
            int resp = teclado.nextInt();
            switch(resp){
                case 1:
                    System.out.println(val1 + val2);
                 break;
                case 2:
                    System.out.println(val1 - val2);
                 break;
                case 3:
                    System.out.println((val1 + val2)/2);
                 break;
                case 4:
                    System.out.println(Math.abs(val1-val2)); //modulo
                 break;
                case 5:
                    if(val1>val2){
                        System.out.println(val1);
                    }else if (val2>val1){
                        System.out.println(val2);
                    }else{
                        System.out.println("Os valores sao iguais!");
                    }
                 break;
                case 6: 
                    if(val1<val2){
                        System.out.println(val1);
                    }else if(val2<val1){
                        System.out.println(val2);
                    }else{
                        System.out.println("Os valores sao iguais!");
                    }
                 break;
                default:
                    System.out.println("Erro. Informe uma opcao valida!");
            }
            System.out.println("Digite [s] para repetir ou [n] para sair");
            cont = sc.nextLine();
        }while(cont.equals("s"));
    }
}
