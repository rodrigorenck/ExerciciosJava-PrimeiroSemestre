package lista04;

import java.util.Scanner;

//ex27 sem printar nos metodos!
public class Ex27melhorado {

    public static boolean numeroPerfeito(int val){
        double somaDivisores= 0;
        for(double i = 1.0; i<val; i++){
            if(val%i == 0){
                somaDivisores += i;
            }
        }
        if(somaDivisores == val){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;
        do{
            System.out.print("Informe um valor inteiro e positivo: ");
            val = sc.nextInt();
        }while(val<=0);

        if(numeroPerfeito(val)){
            System.out.println("Numero " + val + " eh perfeito");
        }
        System.out.println(numeroPerfeito(val));

    }
}
