package lista05Recursao;

import java.util.Scanner;

/*
Faça um programa que leia uma string e substitua as vogais acentuadas pela vogais correspondentes sem acento.
Crie um método recursivo para fazer essa substituição.
Para simplificar sua implementação considere apenas o acento agudo.
Exemplo: "ótimo" deve se tornar "otimo".
 */
public class Ex13H {

    //tentei fazer e falhei miseravelmente
//    public static String removeAcento(String palavra){
//        String minuscula = palavra.toLowerCase();
//        String minusculaSemAcento = "";
//        for(int i = 0; i<minuscula.length(); i++){
//            if(minuscula.charAt(i) == 'á'){
//                minuscula.replaceAll("á", "a");
//                System.out.println(minuscula);
//            }
//        }
//        return minuscula;
//    }

    public static String semAcento(String palavra) {
        String minuscula = palavra.toLowerCase();
        minuscula = minuscula.replaceAll("[á]", "a");
        minuscula = minuscula.replaceAll("[é]", "e");
        minuscula = minuscula.replaceAll("[í]", "i");
        minuscula = minuscula.replaceAll("[ó]", "o");
        minuscula = minuscula.replaceAll("[ú]", "u");
        return minuscula;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra;
        System.out.print("Informe uma String para remover acento: ");
        palavra = sc.nextLine();

        System.out.println(semAcento(palavra));


    }
}
