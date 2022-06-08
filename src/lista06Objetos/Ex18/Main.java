package lista06Objetos.Ex18;

public class Main {


    public static void main(String[] args) {


        Numero num = new Numero(6446);

        if(num.verificaCaracteristica()){
            System.out.println("O numero possui a mesma caracteristica do 3025");
        }else{
            System.out.println("O numero nao possui essa caracteristica");
        }


        if(num.capicua()){
            System.out.println("Numero eh capicua");
        }else{
            System.out.println("NUNCA que esse numero eh capicua");
        }


    }
}
