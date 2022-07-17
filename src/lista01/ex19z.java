package lista01; /**
 * Na ginástica olímpica, a nota de um atleta é a soma das notas de duas
bancas de árbitros: banca A e banca B. A nota da banca A é a nota de
partida do atleta. A nota da banca B é calculada da seguinte forma:
(a) 6 juízes atribuem notas ao atleta;
(b) a nota mais baixa e a mais alta são descartadas;
(c) é feita a média das notas restantes.
Faça um programa que leia a nota da banca A e as notas dos 6 juízes.
O programa deve calcular e escrever a média da banca B e a nota final
do atleta. 
 */


import java.text.DecimalFormat; // usamos isso para limitar o numero de casas decimais que queremos mostrar
import java.util.Scanner;
public class ex19z {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00"); //criamos um objeto que nem o Scanner, e dentro do parenteses definimos quantas casas decimais queremos

        System.out.print("Nota da banca A: ");
        double notaA = teclado.nextDouble();

        double maior = 0, menor = Double.MAX_VALUE;
        double soma = 0;
        System.out.println("Notas banca B");
        for(int i = 1; i<=6; i++){
            System.out.print("Juiz " + i + ": ");
            double notaB = teclado.nextDouble();

            if(notaB>maior){
                maior = notaB;
            }
            if(notaB<menor){
                menor = notaB;
            }
            soma = soma + notaB;
        }
        double somaFinal = soma - maior - menor;
        double media = somaFinal/6;

        System.out.println("A media da Banca B é: " + deci.format(media)); //aqui usamos o objeto criado para limitar o numero de casas decimais
        double notaFinal = notaA + media;
        System.out.println("A nota final da atleta é: " + deci.format(notaFinal));
    }
}
