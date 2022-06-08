package lista06Objetos.Ex18;

public class Numero {
    int valor;

    //valor padrao para caso nao respeite a condicao sera 1000;
    public Numero(int valor){
        if(valor<1000 || valor>9999){
            this.valor = 1000;
        }else{
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        return "Numero: " + this.valor;
    }

    public boolean verificaCaracteristica(){
        int doisPrimeiros = valor/100;
        int doisUltimos = valor%100;
        int soma = doisPrimeiros + doisUltimos;
        double condicao = Math.pow(soma, 2);

        if(this.valor != condicao){
            return false;
        }
        return true;
    }

    public boolean capicua(){
        String valInicial = Integer.toString(valor);
        String valAoContrario = "";
        for(int i = (valInicial.length() - 1); i>=0; i--) {
            valAoContrario += valInicial.charAt(i);
        }
        Integer val = Integer.parseInt(valAoContrario);
        if(this.valor != val){
            return false;
        }else{
            return true;
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
