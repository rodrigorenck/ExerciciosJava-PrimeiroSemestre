package lista03; /**
 * Foi feita uma pesquisa entre os habitantes de uma região. 
 Foram coletados os dados de idade, sexo (1-masculino/2-feminino) e salário. 
Faça um programa que leia os dados necessário e informe:
(a) a média de salário do grupo;
(b) maior e menor idade do grupo;
(c) quantidade de mulheres com salário até R$3500,00.
Encerre a entrada de dados quando for digitada uma idade negativa.
 */
import java.util.Scanner;
public class ex27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int idade, sexo, maior1, maior2, quantMulher3500;
        maior1 = 0;
        maior2 = 0;
        quantMulher3500 = 0;
        double salario;
        double medSalario1, medSalario2;
        double somaSalario1, somaSalario2;
        somaSalario1 = 0;
        somaSalario2 = 0;
        medSalario1 = 0; //media de salario dos homens
        medSalario2 = 0; //media de salario das mulheres
        do{
            System.out.print("Informe sua idade [idade negativa encerra o loop]: ");
            idade = teclado.nextInt();
            if(idade<0 || idade>100){
                System.out.println();
            }else{
                System.out.print("Informe seu sexo [1] masculino e [2] feminino: ");
                sexo = teclado.nextInt();
                if(sexo != 1 && sexo != 2){
                    System.out.println("Erro. Digite um sexo valido!");
                }else{
                    System.out.print("Informe seu salario: ");
                    salario = teclado.nextDouble();
                    if(salario<0){
                        System.out.println("Erro. Digite um salario valido!");
                    }else{
                        if(sexo == 1){
                            somaSalario1 = somaSalario1 + salario;
                            if(idade>maior1){
                                maior1 = idade;
                            }
                            cont1++;
                        }else{
                            somaSalario2 = somaSalario2 + salario;
                            if(idade>maior2){
                                maior2 = idade;
                            }
                            if(salario<=3500){
                                quantMulher3500++;
                            }
                            cont2++;
                        }
                    }
                }
            }
        }while(idade>=0);
        medSalario1 = somaSalario1/cont1;
        medSalario2 = somaSalario2/cont2;
        System.out.println("\f");
        System.out.println("A media de salario dos homens [grupo 1]: " + medSalario1);
        System.out.println("A media de salario das mulheres [grupo 2]: " + medSalario2);
        System.out.println("A maior idade dos homens [grupo 1]: " + maior1);
        System.out.println("A maior idade das mulheres [grupo 2]: " + maior2);
        System.out.println("Quantidade de mulheres com salario ate 3500: " + quantMulher3500);
    }
}
