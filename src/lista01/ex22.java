package lista01;
/**
 * Uma casa de espetáculos teatrais precisa de um programa que calcula
o valor do ingresso. Faça um programa que leia o custo total do espetáculo 
(esse valor total é a soma dos gastos com: elenco, técnicos, local
da apresentação, ...) e o número de poltronas existentes no teatro. O
programa deve solicitar ainda ao usuário: percentual de lucro desejado,
percentual mínimo de ocupação esperado (das poltronas do teatro) em
cada espetáculo e quantidade de espetáculos que será realizada. Com
base nesses dados, o programa deve calcular e escrever o valor do ingresso.
 */

 //nao tenho certeza que esta certo
 import java.util.Scanner;
public class ex22 {
    //objetivo = calcular o valor do ingresso
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Custo total do espetaculo: ");
        double custoTotal = teclado.nextDouble(); 

        System.out.print("Numero de poltronas existentes no teatro: ");
        int poltronasTeatro = teclado.nextInt();

        System.out.print("Percentual de lucro desejado: ");
        double lucroDesejado = teclado.nextDouble();
        double lucroCerto = lucroDesejado/100;

        System.out.print("Percentual minimo de ocupação esperado: ");
        int ocupacaoEsperada = teclado.nextInt();

        System.out.print("Quantidade de espetaculos: ");
        int quantEspetaculos = teclado.nextInt();

        double valIngresso = (custoTotal + custoTotal*lucroCerto)/poltronasTeatro;

        System.out.println("O valor do ingresso sera: " + valIngresso);

    }
}
