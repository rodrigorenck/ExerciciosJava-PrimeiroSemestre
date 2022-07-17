package lista02; /** Faça um programa que leia a altura de uma pessoa em metros e o seu
sexo (use 1 para feminino e 2 para masculino). A seguir, o programa deve
escrever o peso ideal dessa pessoa conforme descrito a seguir:
• Para homens, o peso ideal corresponde a 72.7 × altura − 58
• Para mulheres, use 62.1 × altura − 44.7
 */


import java.util.Scanner;
import java.text.DecimalFormat;
public class iex3{
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.print("Informe a sua altura em metros: ");
        double altura = in.nextDouble();
        double pesoIdeal = 0;

        //validacao da altura, com do while para repetir ate que um dado valido seja inserido
        if(altura<0 || altura>3){
            do{
                System.out.println("Erro. Valor fora do intervalo [0 - 3]!");
                System.out.print("Informe a sua altura em metros: ");
                altura = in.nextDouble();
            }while(altura<0 || altura>3);
        }if((altura>0) && (altura<3)){
            System.out.print("Informe seu sexo digite [1] para Feminino e [2] para Masculino: ");
            int sexo = in.nextInt();

            //validacao do sexo, com do while para repetir ate que um dado valido seja inserido
            if((sexo!=1) && (sexo!=2)){
                do{
                    System.out.print("Erro. Digite [1] Feminino e [2] Masculino: ");
                    sexo = in.nextInt();
                }while((sexo!=1) && (sexo!=2));
            }if(sexo == 1){
                pesoIdeal = 62.1 *altura - 44.7;
                System.out.println("Voce é uma mulher e seu peso ideal é: " + deci.format(pesoIdeal));
            }else if(sexo == 2){
                pesoIdeal = 72.7 *altura - 58;
                System.out.println("Voce é um homem e seu peso ideal é: " + deci.format(pesoIdeal));
            }
        }
  }  
}