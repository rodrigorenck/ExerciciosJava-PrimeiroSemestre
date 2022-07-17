package lista03; /**
 * Escreva um programa que leia um número n que indica quantos valores
devem ser lidos a seguir. Para cada número lido, mostre o valor lido e o
fatorial deste valor
 */

 import java.util.Scanner;
public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos valores serão lidos: ");
        int valLidos = sc.nextInt();

        if(valLidos<0){
            do{
                System.out.println("Erro. O valor precisa ser positivo!");
                System.out.print("Informe quantos valores serão lidos: ");
                valLidos = sc.nextInt();
            }while(valLidos<0);
        }

        int cont = 1;
        int val;
        while(cont<=valLidos){
            System.out.print("Informe o " + cont + "o. valor: ");
            val = sc.nextInt();
            int cont2 = 1;
            int fat = 1;
            while(cont2<=val){
                fat = fat*cont2;
                cont2 ++;
            }
            cont++;
            System.out.println("O fatorial de " + val + " é: " + fat);
        }
    }
}
