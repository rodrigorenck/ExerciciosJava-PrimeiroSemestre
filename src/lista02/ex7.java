package lista02; /**Implemente um programa que determina o preço de venda dos produtos
de uma loja conforme o preço de custo desses produtos. O programa deve
ler o preço de custo e calcular o valor de venda conforme a tabela abaixo.
preço unitário de custo preço de venda
valor abaixo de R$ 10,00 lucro de 70%
de R$ 10,00 a menos de R$ 30,00 lucro de 50%
de R$ 30,00 a menos de R$ 50,00 lucro de 40%
valor acima ou igual a R$ 50,00 lucro de 30%
(É UMA TABELA ENTAO FICA UM POUCO RUIM DE VISUALIZAR POR AQUI)
 * 
 */

 import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o preço de custo: ");
        double custo = in.nextDouble();

        if(custo<0){
            System.out.println("Erro. Valor não pode ser negativo!");
        }else{
            if(custo<10){
                System.out.println("Preço de venda para ter lucro de 70%: " + (custo + (custo*0.7)));
            }else if(custo<30){
                System.out.println("Preço de venda para ter lucro de 50%: " + (custo + (custo*0.5)));
            }else if(custo<50){
                System.out.println("Preço de venda para ter lucro de 40%: " + (custo + (custo*0.4)));
            }else{
                System.out.println("Preço de venda para ter lucro de 30%: " + (custo + (custo*0.3)));
            }
        }

    }
}
