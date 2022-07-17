package lista03; /**Implemente um programa que lê 50 valores inteiros e positivos, calcule e
escreva:
(a) a média dos valores;
(b) o maior deles;
(c) o menor deles;
(d) a quantidade de valores que estão no intervalo [0;10].
 */
import java.util.Scanner;
public class ex8{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int maior, menor, zeroDez;
        zeroDez = 0;
        maior = 0;
        menor = Integer.MAX_VALUE; // dessa maneira nos pegaremos o maior valor que uma Int pode ter
        int soma = 0;
        double media = 0;
        
        
        System.out.print("Quantos numeros voce quer trabalhar? ");
        int numeros = teclado.nextInt();


        int contador = 1;
        while(contador<=numeros){
            System.out.print("Digite um valor inteiro positivo: ");
            int val = teclado.nextInt();
            if(val<0){
                System.out.println("Erro. Valor fora do intervalo solicitado");
            }else{
                soma = soma + val; //soma += val;
                if(val>maior){
                    maior = val;
                }
                if(val<menor){
                    menor = val;
                }
                if(val>0 && val<11){
                    zeroDez++;
                }
                contador++;
            }
        }
        media = soma/(numeros-1);
        System.out.println("A media dos valores: " + media);
        System.out.println("O maior valor: " + maior);
        System.out.println("O menor valor: " + menor);
        System.out.println("Quantidade de valores entre 0 e 10: " + zeroDez);
    }
}