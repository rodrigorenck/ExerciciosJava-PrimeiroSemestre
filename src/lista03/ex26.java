package lista03; /**Em uma eleição presidencial existem quatro candidatos. Os votos são
informados através de códigos. Os dados utilizados para a contagem dos
votos obedecem a seguinte codificação:
• 1,2,3,4 = voto para os respectivos candidatos;
• 0 = voto branco;
• qualquer valor diferente de 0 a 4 = voto nulo;
Elabore um programa que leia o código do candidado em um voto. Calcule
e escreva:
• total de votos para cada candidato;
• total de votos nulos;
• total de votos em branco;
Como finalizador do conjunto de votos, utilize valores negativos
 * 
 */
import java.util.Scanner;
public class ex26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cand1, cand2, cand3, cand4, branco, nulo;
        cand1 = 0;
        cand2 = 0;
        cand3 = 0;
        cand4 = 0;
        branco = 0;
        nulo = 0; 
        int resp = 10;
        while(resp>=0){ //aqui eu poderia colocar um while(true) e dai dar um break quando a pessoa escrever negativo
            if(resp>=0){
                System.out.println("MENU DE OPÇÕES - ELEIÇÕES ");
                System.out.println("Digite [1] para o Candidato 1");
                System.out.println("Digite [2] para o Candidato 2");
                System.out.println("Digite [3] para o Candidato 3");
                System.out.println("Digite [4] para o Candidato 4");
                System.out.println("Digite [0] para voto branco");
                System.out.println("Digite qualquer outro valor para voto nulo");
                System.out.println("Valor negativo finaliza o programa");
                System.out.print("Sua resposta: ");
                resp = teclado.nextInt();
                
                switch(resp){
                    case 0:
                        branco++;
                     break;
                    case 1:
                        cand1++;
                     break;
                    case 2:
                        cand2++;
                     break;
                    case 3:
                        cand3++;
                     break;
                    case 4:
                        cand4++;
                     break;
                    default:
                        nulo++;
                }
            }
        }
        System.out.println("\f");
        System.out.println("TOTAL DE VOTOS");
        System.out.println("---------------");
        System.out.println("Candidato 1: " + cand1);
        System.out.println("Candidato 2: " + cand2);
        System.out.println("Candidato 3: " + cand3);
        System.out.println("Candidato 4: " + cand4);
        System.out.println("Branco: " + branco);
        System.out.println("Nulo: " + nulo);

    }
}
