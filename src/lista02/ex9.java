package lista02; /**
 *  Escreva um programa que leia a temperatura da água e a escala em que
está expressa (use 1 para Celsius e 2 para Fahrenheit). O programa deve
escrever o estado corresponde à temperatura informada: sólido, líquido ou
gasoso
 */

 import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a temperatura da agua: ");
        int temp = sc.nextInt();

        System.out.println("Informe a escala utilizada");
        System.out.print("Digite [1] para Celsius e [2] para Fahrenheit: ");
        int escala = sc.nextInt();


        if(escala != 1 && escala != 2){
            do{
                System.out.println("Erro. Informe uma escala valida");
                System.out.print("Digite [1] para Celsius e [2] para Fahrenheit: ");
                escala = sc.nextInt();
            }while(escala != 1 && escala != 2);
        }if(escala==1){
            if(temp<=0){
                System.out.println("Temperatura menor ou igual a 0 Celsius: A agua esta em estado solido");
            }else if(temp>=100){
                System.out.println("Temperatura maior ou igual a 100 Celsius: A agua esta em estado gasoso");
            }else{
                System.out.println("Temperatura maior que 0 e menor que 100 Celsius: A agua esta em estado liquido");
            }
        }if(escala==2){
            if(temp<=32){
                System.out.println("Temperatura menor ou igual a 32 Fahrenheit: A agua esta em estado solido");
            }else if(temp>=212){
                System.out.println("Temperatura maior ou igual a 212 Fahrenheit: A agua esta em estado gasoso");
            }else{
                System.out.println("Temperatura maior que 0 e menor que 100 Celsiu: A agua esta em estado liquido");
            }
        }
    }
}
