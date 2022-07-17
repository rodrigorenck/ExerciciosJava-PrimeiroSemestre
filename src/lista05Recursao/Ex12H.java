package lista05Recursao;

import java.util.Scanner;

/*
Faça um programa que leia uma string e verifique se ela é palíndrome.
Palíndrome são aquelas palavras podem ser lidas tanto da esquerda para direita ou da direita para esquerda.
Exemplo: arara. Crie um método recursivo para verificar se a string é palíndrome.
 */
public class Ex12H {

//como fazer o metodo recursivo?
    static String palavraAoContrario;
    public static boolean palindrome(String palavra){ //problema se o usuario colocar um whitespace antes da palavra vai dar errado
        String minuscula = palavra.toLowerCase();
        String minusculaAoContrario = "";
        for(int i  = (minuscula.length() - 1); i>=0; i--){
            minusculaAoContrario += minuscula.charAt(i);
        }
        palavraAoContrario = minusculaAoContrario;
        if(minusculaAoContrario.equals(minuscula)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra;
        System.out.print("Informe uma String: ");
        palavra = sc.nextLine();


        if(palindrome(palavra)){
            System.out.println("A String " + palavra + " eh palindrome!");
        }else{
            System.out.println("A String " + palavra + " nao eh palindrome!");
        }

        System.out.println("A String ao contrario eh " + palavraAoContrario);
    }
}
