package lista03; /**
 * Escreva um programa que calcule a média aritmética das 3 notas dos
alunos de uma classe. O programa deverá ler, além das notas, a matricula
do aluno e deverá ser encerrado quando o código for igual a zero. O
programa deve escrever, ainda, a matricula e a média do melhor aluno.
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class ex30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        
        double soma = 0, media = 0, maior = 0;
        double n1, n2, n3;
//eu fiz a matricula ser uma string para mostrar a matricula inteira, por exemplo se eu coloco 0804 como matricula eu quero que o zero da frente apareça, mas sendo int ele ficaria 804!
        String matricula = null, maiorMatricula = null;
        int cont = 1;
        
        while(true){
            System.out.println("Aluno " + cont);
            System.out.print("Matricula (digite 0 para encerrar): ");
            matricula = str.nextLine();
            if(matricula.equals("0")){
                break;
            }else{
                System.out.print("Nota 1: ");
                n1 = teclado.nextDouble();
                while(n1>10 || n1<0){ //introduzimos esse while para fazer a pessoa repetir a nota caso escreva fora do intervalo
                    System.out.println("");
                    System.out.println("Erro. Nota fora do intervalo [0-10]!");
                    System.out.print("Nota 1: ");
                    n1 = teclado.nextDouble();
                }
                System.out.print("Nota 2: ");
                n2 = teclado.nextDouble();
                while(n2>10 || n2<0){
                    System.out.println("");
                    System.out.println("Erro. Nota fora do intervalo [0-10]!");
                    System.out.print("Nota 2: ");
                    n2 = teclado.nextDouble();
                }
                System.out.print("Nota 3: ");
                n3 = teclado.nextDouble();
                while(n3>10 || n3<0){
                    System.out.println("");
                    System.out.println("Erro. Nota fora do intervalo [0-10]!");
                    System.out.print("Nota 3: ");
                    n3 = teclado.nextDouble();
                }
                cont++;
                soma = n1+n2+n3;
                media = soma/3;
                if(media>maior){
                    maior = media;
                    maiorMatricula = matricula;
                }
                System.out.println("\f");
            }

        }
        
        /* O problema de fazer desse jeito é que quando a pessoa colocar 0 ele nao vai encerrar na hora, ele vai acabar pedindo as notas e soh depois terminar
        do{
            System.out.println("Aluno " + cont);
            System.out.print("Matricula (digite 0 para encerrar): ");
            matricula = teclado.nextInt();
            System.out.print("Nota 1: ");
            n1 = teclado.nextDouble();
            System.out.print("Nota 2: ");
            n2 = teclado.nextDouble();
            System.out.print("Nota 3: ");
            n3 = teclado.nextDouble();
            cont++;
            soma = n1+n2+n3;
            media = soma/3;
            if(media>maior){
                maior = media;
                maiorMatricula = matricula;
            }
            System.out.println("\f");
        }while(matricula != 0);
        */

        System.out.println("\fMelhor Aluno");
        System.out.println("--------------");
        System.out.println("Matricula: " + maiorMatricula);
        System.out.println("Media: " + deci.format(maior));
    }

}
