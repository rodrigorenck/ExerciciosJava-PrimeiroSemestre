package lista02; /**
 * Implemente um programa que leia um valor inteiro e indique quantos
digitos esse valor possui.
 */
import java.util.Scanner;
public class iex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        
        int val;
        String resp;
        while(true){
            System.out.print("Digite um valor inteiro: ");
            val = in.nextInt();
            if(val>=0){
                if(val>=10000000){
                    System.out.println("Valor tem 9 digitos!");
                }else if(val>=10000000){
                    System.out.println("Valor tem 8 digitos!");
                }else if(val>=1000000){
                    System.out.println("Valor tem 7 digitos!");
                }else if(val>=100000){
                    System.out.println("Valor tem 6 digitos!");
                }else if(val>=10000){
                    System.out.println("Valor tem 5 digitos!");
                }else if(val>=1000){
                    System.out.println("Valor tem 4 digitos!");
                }else if(val>=100){
                    System.out.println("Valor tem 3 digitos!");
                }else if(val>=10){
                    System.out.println("Valor tem 2 digitos!");
                }else if(val>=0){
                    System.out.println("Valor tem 1 digito!");
                }
            }else{
                if(val<=-100000000){
                    System.out.println("Valor tem 9 digitos!");
                }else if(val<=-10000000){
                    System.out.println("Valor tem 8 digitos!");
                }else if(val<=-1000000){
                    System.out.println("Valor tem 7 digitos!");
                }else if(val<=-100000){
                    System.out.println("Valor tem 6 digitos!");
                }else if(val<=-10000){
                    System.out.println("Valor tem 5 digitos!");
                }else if(val<=-1000){
                    System.out.println("Valor tem 4 digitos!");
                }else if(val<=-100){
                    System.out.println("Valor tem 3 digitos!");
                }else if(val<=-10){
                    System.out.println("Valor tem 2 digitos!");
                }else{
                    System.out.println("Valor tem 1 digito!");
                } 
            }
            System.out.print("Digite [N] para encerrar o programa: ");
            resp = str.nextLine();
            if(resp. equalsIgnoreCase("N")){
                break;
            }
        }

    }
}
