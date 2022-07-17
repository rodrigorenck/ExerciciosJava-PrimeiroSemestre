package lista02; /**
 * Elabore um programa que leia uma nota do intervalo [0; 10] (garanta isso),
verifique e escreva o conceito correspondente conforme a tabela abaixo:
nota conceito
9 a 10 A
7 a 8,9 B
5 a 6,9 C
3 a 4,9 D
abaixo de 3 E
(ISSO É UMA TABELA FICA MELHOR D LER NA LISTA)
 */

 import java.util.Scanner;
public class iex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Informe sua nota [0-10]: ");
        double nota = sc.nextDouble();

        if(nota>10 || nota<0){
            do{
                System.out.println("Erro. Nota fora do intervalo solicitado");
                System.out.print("Informe sua nota [0-10]: ");
                nota = sc.nextDouble();
            }while(nota>10 || nota<0);
        }if(nota>=0 && nota<=10){
            if(nota<3){
                System.out.println("Conceito: E");
            }else if(nota<=4.9){
                System.out.println("Conceito: D");
            }else if(nota<=6.9){
                System.out.println("Conceito: C");
            }else if(nota<=8.9){
                System.out.println("Conceito: B");
            }else{
                System.out.println("Conceito A");
            }
        }
    }
}
