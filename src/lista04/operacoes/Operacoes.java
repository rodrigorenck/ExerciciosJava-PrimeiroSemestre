package lista04.operacoes;

public class Operacoes {

    public static double maior3valores(double val1, double val2, double val3) {
        double maior = val1;
        if (val2 > maior) {
            maior = val2;
        }
        if (val3 > maior) {
            maior = val3;
            return maior;
        }
        return maior;
    }

    //caso insira dados invalidos retorna valor padrao -1!
    public static double area(double base, double altura) {
        double area;
        if (base <= 0 || altura <= 0) {
            area = -1;
            return area;
        } else {
            area = base * altura;
            return area;
        }
    }

    //caso insira dados invalidos retorna valor padrao -1!
    public static int passaSegundos(int hora, int minuto, int segundo) {
        int segundosDia = 60 * 60 * 24;
        int convertendoSegundos;
        if ((hora < 0 || hora >= 24) || (minuto < 0 || minuto >= 60) || (segundo < 0 || segundo >= 60)) {
            convertendoSegundos = -1;
            return convertendoSegundos;
        } else {
            convertendoSegundos = (hora * 3600) + (minuto * 60) + segundo;
            return convertendoSegundos;
        }
    }

    //nao precisa de verificacao
    public static double distanciaEuclidiana(double x1, double y1, double x2, double y2){
        //double distancia = Math.sqrt(((Math.pow((x1 - x2), 2) + Math.pow((y1-y2), 2))));
        double distancia = Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1-y2), 2)));
        return distancia;
    }

    //nao precisa de verificacao
    public static double distanciaManhattan(double x1, double y1, double x2, double y2) {
        double distancia = Math.abs(x1- x2) + Math.abs(y1-y2);
        return distancia;
    }

    //nao precisa de verificacao
    public static double conversaoCelcius(double valorFahrenheit){
        double celsius = 5.0/9 * (valorFahrenheit - 32);
        return celsius;
    }

    // caso insira dados invalidos retorna -1
    public static double pesoIdeal(double altura, int sexo) {
        double pesoIdeal;
        if((sexo != 1 && sexo != 2) || (altura<=0 || altura>3)){
            pesoIdeal = -1;
            return pesoIdeal;
        }
        if (sexo == 1) {
            pesoIdeal = 72.7 * altura - 58;
        } else  {
            pesoIdeal = 62.1 * altura - 44.7;
        }
        return pesoIdeal;
    }

    //FALTA: ex 12, ex27, ex43, ex44, ex45


    //exercicio12
    public static double aritmetica(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static double ponderada(double nota1, double nota2, double nota3) {
        double media = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / 10;
        return media;
    }

    public static double harmonica(double nota1, double nota2, double nota3) {
        // nao tenho certeza se a formula ta certa
        double media = 3 / (1 / nota1) + (1 / nota2) + (1 / nota3);

        return media;
    }

    //ex27
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

    //ex43
    public static double soma43(int n){
        double soma = 0;
        double denominador = 1;
        double divisor = 1;
        for (int i = 1; i <= n; i++) {
            soma = soma + denominador/divisor;
            denominador++;
            divisor += 2;
        }
        return soma;
    }

    //ex44
    public static double soma44(int n, double x){
        double soma = 0;
        int divisor = 1;
        int potencia = 1;
        for(int i = 1; i<=n; i++){
            soma = soma + Math.pow(x, potencia)/divisor;
            potencia++;
            divisor += 4;
        }

        return soma;
    }

    //ex45
    public static double soma45(int n, double x){
        double soma = 0;
        int potencia = 1;
        int divisor = 1;
        for(int i = 1; i<=n; i++){
            if(i%2 == 0){
                soma = soma - Math.pow(x, potencia)/divisor;
            }else{
                soma = soma + Math.pow(x, potencia)/divisor;
            }
            potencia += 2;
            divisor += 2;
        }
        return soma;
    }

    //fatorial iterativo
    public static double fatorial(int n){
        double fatorial = 1;
        for(int cont = 1; cont<=n; cont++){
            fatorial = fatorial*cont;
        }
        return fatorial;
    }

    //fatorial recursivo
    public static double fatorialRec(int n){
        if(n<=1){
            return 1;
        }
        return n*fatorialRec(n-1);
    }

    //ex2 lista recursao
    public static int somaRecursao2(int valor){
        if(valor == 0){
            return 0;
        }
        if(valor == 1){
            return 1;
        }
        return somaRecursao2(valor-1) + valor;
    }

    //ex7 lista recursao
    public static double somaRecursao7(int val){
        if(val == 0){
            return 0;
        }
        if(val == 1){
            return 1;
        }
        return somaRecursao7(val-1) + 1.0/val;
    }

    //ex11 lista recursao
    public static double somaRecursao11(double val){
        if(val == 1){
            return 1;
        }
        return somaRecursao11(val-1) + val/(2*val -1);
    }

}
