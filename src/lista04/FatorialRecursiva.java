package lista04;

public class FatorialRecursiva {

    //metodos que invokam ele mesmo -> metodos recursivos!
    //nesse caso o iterativo é melhor
    public static double fatorialRec(int n){
        if(n<=1){
            return 1;
        }
        return n*fatorialRec(n-1);
    }

    //fatorial iterativo
    public static double fatorial(int n){
        double fatorial = 1;
        for(int cont = 1; cont<=n; cont++){
            fatorial = fatorial*cont;
        }
        return fatorial;
    }

//    public static double potenciaRec(int x, int y){
//        double potencia = 0;
//        if(n==0){
//            potencia = 1;
//            return potencia;
//        }
//        if(n==1){
//            potencia = n;
//            return potencia;
//        }
//        return n * potenciaRec();
//    }

    public static void main(String[] args) {


        System.out.println(fatorialRec(4));
        System.out.println(fatorial(4));
    }
}
