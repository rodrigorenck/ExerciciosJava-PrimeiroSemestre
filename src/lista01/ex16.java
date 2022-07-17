package lista01; /**
 * Faça um programa que leia a quantidade e a altura dos degraus de uma
escada. A seguir, o programa deve solicitar a altura do usuário e a altura
que essa pessoa deseja atingir ao usar a escada. A partir desses dados, o
programa deve informar quantos degraus a pessoa deve subir para atingir
a altura desejada. O programa deve informar também a altura máxima
que essa pessoa pode atingir se subir todos os degraus da escada.
 */

import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de degraus da escada: ");
        int quantDegraus = teclado.nextInt();
        System.out.print("Altura dos degraus em cm: ");
        int alturaDegraus = teclado.nextInt();

        int alturaEscada = quantDegraus*alturaDegraus;

        System.out.print("Altura do usuario em cm: ");
        int alturaU = teclado.nextInt();
        System.out.print("Altura que deseja atingir ao usar a escada em cm: ");
        int alturaDesejada = teclado.nextInt();

        int degrausAlturaDesejada = (alturaDesejada-alturaU)/alturaDegraus;
        
        int alturaMaxima = alturaEscada + alturaU;

        System.out.println("Quantidade de degraus para chegar na altura desejada: " + degrausAlturaDesejada);
        System.out.println("Altura maxima possivel: " + alturaMaxima);



    }
}
