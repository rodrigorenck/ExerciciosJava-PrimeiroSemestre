package lista03; /**
 * A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e número de filhos. 
 * A prefeitura deseja saber:
(a) média do salário da população;
(b) média do número de filhos;
(c) maior salário;
(d) percentual de pessoas com salário até R$2000,00.
Faça um programa que leia os dados necessários e escreva os itens mencionados. O final da leitura de dados se dará com a entrada de um salário
negativo. (Use while)
->FALTA DAR ERRO COM O NUMERO DE FILHOS NEGATIVOS
 */
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int quantFilhos = 0;
        double salario = 0;
        double maior = 0;
        int mediaFilhos = 0;
        double mediaSalario = 0;
        double somaSalario = 0;
        int pessoasDoisMil = 0;
        int somaFilhos = 0;
        int cont = 0;
        while(salario>=0){
            System.out.print("Informe o salário [negativo finalizara o programa]: ");
            salario = teclado.nextDouble();

            somaSalario = somaSalario + salario;

            if(salario>0){
            System.out.print("Informe o numero de filhos: ");
            quantFilhos = teclado.nextInt();

            somaFilhos = somaFilhos + quantFilhos;
            if(salario>maior){
                maior = salario;
            }
            if(salario<2000){
                pessoasDoisMil++;
            }
            cont++; //essa variavel é para saber quantas vezes vamos rodar
            }
        }
        
        mediaSalario = somaSalario/cont;
        System.out.println("[a] média do salario da população: " + mediaSalario);

        mediaFilhos = somaFilhos/cont;
        System.out.println("[b] média de filhos da populacao: " + mediaFilhos);

        System.out.println("[c] o maior salario foi: " + maior);

        double porcentagemDoisMil = (pessoasDoisMil/cont)*100;
        System.out.println("[d] percentual de pessoas com salario ate $2000: " + porcentagemDoisMil + "%");


    }
}
