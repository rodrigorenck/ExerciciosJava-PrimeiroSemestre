package lista02;
/**Implemente um programa que leia o saldo médio de uma conta corrente,
calcule e escreve o seu limite conforme a tabela abaixo.
Saldo Médio Limite
menor que R$ 500,00 não há limite
de R$ 500,00 a R$ 1.000,00 8% do saldo médio
maior ou igual a R$ 1.000,00 15% do saldo médio
 * (É UMA TABELA ENTAO FICA RUIM DE LER POR AQUI)
 */


 import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o saldo médio: ");
        double saldo = sc.nextDouble();
        if(saldo<500){
            System.out.println("Não ha limite!");
        }else if(saldo<1000){
            System.out.println("Limite: " + saldo*0.08);
        }else{
            System.out.println("Limite: " + saldo*0.15);
        }
    }
}
