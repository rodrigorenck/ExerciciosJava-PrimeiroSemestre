package lista01; /** Faça um programa que leia as dimensões de um terreno (largura e comprimento) e a
dimensões da casa (largura e comprimento) construída nesse
mesmo terreno, o programa deve calcular e escrever a área livre existente
no terreno.
*/

import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        System.out.print("Informe a largura do terreno: ");
        double largTerreno = teclado.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        double comprTerreno = teclado.nextDouble();

        System.out.print("Informe a largura da casa: ");
        double largCasa = teclado.nextDouble();
        System.out.print("Informe o comprimento da casa: ");
        double comprCasa = teclado.nextDouble();

        double areaCasa = comprCasa*largCasa;
        double areaTerreno = comprTerreno*largTerreno;

        double areaLivre = areaTerreno - areaCasa;
        System.out.println("A área livre é " + areaLivre + " metros quadrados");
    }
}
