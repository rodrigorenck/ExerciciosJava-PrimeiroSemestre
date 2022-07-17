package lista01;
/** Um robô precisa percorrer um piso revestido com cerâmidas pretas e brancas. 
 * Crie um programa que recebe como entrada a linha e a coluna (ver
imagem abaixo) correspondente a cada cerâmica do piso e escreve 0 quando
a cerâmica tem cor preta e 1 quando a cerâmica tem cor branca
 * 
 */
import java.util.Scanner;
public class ex13z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;
        System.out.print("Informe a linha [1 a 4]: ");
        linha = sc.nextInt();
        System.out.print("Informe a coluna [1 a 4]: ");
        coluna = sc.nextInt();

        if((linha<=0 || linha>4) || (coluna<=0 || coluna>4)){
            System.out.println("Erro. Digite valores dentro do intervalo solicitado");
        }else{
            if(linha == 1){
                if(coluna%2 == 0){
                    System.out.println("1 - Ceramica branca");
                }else{
                    System.out.println("0 - Ceramica preta");
                }
            }else if(linha == 2){
                if(coluna%2 == 0){
                    System.out.println("0 - Ceramica preta");
                }else{
                    System.out.println("1 - Ceramica branca");
                }
            }else if(linha == 3){
                if(coluna%2 == 0){
                    System.out.println("1 - Ceramica branca");
                }else{
                    System.out.println("0 - Ceramica preta");
                }        
            }else{
                if (coluna == 2){
                    System.out.println("0 - Ceramica preta");
                }else{
                    System.out.println("1 - Ceramica branca");
                }
            }
        }
    }
}

