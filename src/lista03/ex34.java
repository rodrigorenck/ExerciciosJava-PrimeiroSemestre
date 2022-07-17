package lista03; /**
 *  Faça um programa que lê um número não determinado de valores para m,
todos inteiros e positivos, um de cada vez. Se m for par, verificar quantos
divisores possui e escrever esta informação. Se m for ímpar e menor do
que 10 calcular e escrever o fatorial de m. Se m for ímpar e maior ou igual
a 10 calcular e escrever a soma dos inteiros de 1 até m.
 */

 import java.util.Scanner;

import javax.xml.bind.Validator;
public class ex34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m = 10;
        int cont = 1;

        while(cont<=m){
            System.out.print("Informe um valor inteiro positivo: ");
            int val = teclado.nextInt();
            if(val<0){
                do{
                    System.out.println("Erro. O valor precisa ser positivo!");
                    System.out.print("Informe um valor inteiro positivo: ");
                    val = teclado.nextInt();
                }while(val<0);
            }
            if(val%2 == 0){
                int divisor = 1;
                int quant = 0;
                while(divisor<=val){
                    if(val%divisor == 0){
                        quant++;
                    }
                    divisor++;
                }
            }else if((val%2 != 0) && (val<10)){
                int fat = 1;
                int cont2 = 1;
                while(cont<=val){
                    fat = fat*cont2;
                    cont2++;
                }
           // }else if(){ //se val for impar e maior ou igual a 10 calcular e escrever a soma dos inteiros de 1 ate val

            //}
            cont++;
        }
    }
}
