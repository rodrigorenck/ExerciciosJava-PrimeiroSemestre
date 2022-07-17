package lista01; /**
 * Implemente um programa que calcula o volume de uma garrafa. O casco
de uma garrafa aproxima-se a dois cilindros de raios r1 e r2 e de alturas
h1 e h2, unidos por um cone de altura h3. Solicite ao usuário os dados
necessários, calcule e escreva o volume da garrafa, sabendo que o volume
de um cilíndro é calculado por vcl = πr2h e que o volume de um cone é
dado por vcn = π
(r21+r1r2+r22)h3. (pesquisar no google porque nao eh bem assim)
 */

import java.util.Scanner;
 public class ex17{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cilindro1, cilindro2, cone, volumeGarrafa;
        double raio1, raio2, h1, h2, h3;

        System.out.println("Informe o r1 e o h1");
        System.out.print("Raio1: ");
        raio1 = teclado.nextDouble();
        System.out.print("Altura1: ");
        h1 = teclado.nextDouble();
        if((raio1>0) && (h1>0)){
            System.out.println("---------------");
            System.out.println("Informe o r2 e o h2");
            System.out.print("Raio2: ");
            raio2 = teclado.nextDouble();
            System.out.print("Altura2: ");
            h2 = teclado.nextDouble();
            if((raio2>0) && (h2>0)){
                System.out.println("---------------");
                System.out.print("Informe o h3 (altura do cone): ");
                h3 = teclado.nextDouble();

                cilindro1 = Math.PI*Math.pow(raio1, 2)*h1;
                cilindro2 = Math.PI*Math.pow(raio2, 2)*h2;
                cone = (Math.PI*(Math.pow(raio1, 2)+raio1 + raio2 + Math.pow(raio2, 2))*h3)/3;
                volumeGarrafa = cilindro1 + cilindro2 + cone;
                System.out.println("O volume da garrafa é: " + volumeGarrafa);
            }else{
                System.out.println("Erro. Dados invalidos");
            }
        }else{
            System.out.println("Erro. Dados invalidos");
        }
    }
}