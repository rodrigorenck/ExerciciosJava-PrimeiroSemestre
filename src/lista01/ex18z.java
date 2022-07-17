package lista01; /**
 * Construa um programa que calcula o digito verificador de uma conta corrente de 3 dígitos. 
 * Para isso, inicialmente o programa deve solicitar ao
usuário o número dessa conta. O programa deve, então, calcular o dígito
verificador da seguinte forma:
(a) Soma o número da conta com um valor que corresponde ao número
na ordem inversa. (Ex: para numero = 235, o valor na ordem inversa
é 532. Faça 235 + 532 = 767)
(b) Multiplica cada dígito do valor encontrado em (a) pela sua posição e
soma os valores encontrados. (Ex:7x1 + 6x2 + 7x3 = 40)
(c) O último dígito do valor encontrado em (b) é o dígito verificador
(Ex:40 → 0).
O programa, o final da execução, deve escrever a conta e o seu digito
verificador (Exemplo: 235.0).
 */

import java.util.Scanner;
public class ex18z {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inform a sua conta corrente [3 digitos]: ");
        int conta = teclado.nextInt();

        if((conta<100)|| (conta>999)){
            System.out.println("Erro. Dados incorretos");
        }else{
            //primeiro precisamos pegar o numero inverso da conta corrente! 235 -> 532
            int centena = conta/100;
            int dezena = (conta%100)/10;
            int unidade = (conta%100)%10;

            //aqui nos transformamos os numeros em Strings para junta-los, se a gente nao tivesse feito isso a gente iria acabar somando ao inves de concatenar
            String inv = Integer.toString(unidade)+  Integer.toString(dezena) +  Integer.toString(centena);
            //System.out.println(inv); aqui eu printei o inverso pra ver se tava dando certo

            int realInv = Integer.valueOf(inv); //utilizamos isso para transformar a String inv de volta em inteiro

            //segundo precisamos somar o valor da conta com seu inverso, e descobrir qual numero esta em cada posicao;
            int soma = conta + realInv;
            int pos1 = soma/100;
            int pos2 = soma%100/10;
            int pos3 = soma%100%10;

            // agora multiplicamos cada digito do valor encontrado por sua posicao e depois somamos
            int soma2 = (pos1*1) + (pos2*2) + (pos3*3);

            // aqui nos pegamos o ultimo valor da soma (que eh o digito verificador que estamos procurando)
            int ultimoDigito = soma2%10;
            System.out.println("Sua conta: " + conta);
            System.out.println("Seu digito verificador: " + ultimoDigito);

        }
    }
}
