package lista02; /**
 * Iplemente um programa que leia um valor inteiro entre 1 e 7, correspondente ao dia da semana. O programa deve escrever o dia da semana por
extenso correspondente ao valor lido. Por exemplo, se o usuário escrever
1, o programa deve exibir Domingo.

 */

 import java.util.Scanner;
public class ex8 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um valor inteiro entre 1 e 7 para saber qual o dia da semana: ");
        int valor = sc.nextInt();


        if(valor>7 || valor<1){
            do{
                System.out.println("Erro. Valor fora do intervalo solicitado");
                System.out.print("Informe um valor inteiro entre 1 e 7 para saber qual o dia da semana: ");
                valor = sc.nextInt();
            }while(valor>7 || valor<1);
        }if(valor>0 && valor<8){
            switch(valor){
                case 1:
                    System.out.println("Domingo");
                 break;
                case 2:
                    System.out.println("Segunda");
                 break;
                case 3:
                    System.out.println("Terça");
                 break;
                case 4:
                    System.out.println("Quarta");
                 break;
                case 5:
                    System.out.println("Quinta");
                 break;
                case 6:
                    System.out.println("Sexta");
                 break;
                case 7:
                    System.out.println("Sabado");
                 break;
            }
        }
    }
}
