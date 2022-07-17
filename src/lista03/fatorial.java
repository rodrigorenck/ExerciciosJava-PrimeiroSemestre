package lista03;

import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 1;
        int fat = 1;
        int num = 5;
    
        System.out.print("Quero saber o fatorial de: ");
        num = teclado.nextInt();


//usamos o do while para fazer a validação e ficar pedindo o valor ate que o usuario informe um valor dentro do intervalo solicitado!
        do{
            System.out.println("Erro. Informe um valor inteiro!");
            System.out.print("Quero saber o fatorial de: ");
            num = teclado.nextInt();
        }while(num<0);

        while(cont<=num){
            fat = cont*fat; 
            cont++;
        }
        //fatorial escala muito rapido, lembrando que o maximo/minimo do int é 2bi/-2bi
        System.out.println("A fatorial de " + num + " é igual a: " + fat);
    }
}
