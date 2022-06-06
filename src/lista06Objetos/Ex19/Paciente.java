package lista06Objetos.Ex19;

public class Paciente {
    private String nome;
    private String sexo;
    private double peso;
    private double altura;
    private int idade;

    //usaremos como padrao Desconhecido e m caso o usuario coloque um valor invalido!
    public Paciente(String nome, String sexo) {
        String sexoMin = sexo.toLowerCase();
        if (nome == null) {
            this.nome = "Desconhecido";
        }else{
            this.nome = nome;
        }
        if (sexoMin != "f" && sexoMin != "m") {
            this.sexo = "m";
        }else{
            this.sexo = sexo;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    //usaremos 0 como valor padrao caso o parametro seja um valor fora do intervalo
    public void setPeso(double peso) {
        if(peso<0 || peso>150){
            this.peso = 0;
            return;
        }
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    //usaremos 0 como valor padrao caso o parametro seja um valor fora do intervalo
    public void setAltura(double altura) {
        if(altura<0 || altura>2.5){
            this.altura = 0;
            return;
        }
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setIdade(int idade) {
        if(idade<0 || idade>120){
            this.idade = 0;
        }else{
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "[NOME]:" + nome + " - [SEXO]:" + sexo + " - [PESO]:" + peso + " - [ALTURA]:" + altura + " - [IDADE]:" + idade;
    }

    public double imc(){
        return peso/Math.pow(altura, 2);
    }

    public double pesoIdeal(){
        if(sexo.equals("m")){
            return 72.7 * altura - 58;
        }else{
            return 62.1 * altura - 44.7;
        }
    }

    public int faixaDeRisco(){
        if(this.imc()<20){
            return 1;
        }else if(this.imc()<25){
            return 2;
        }else if(this.imc()<30){
            return 3;
        }else if(this.imc()<35){
            return 4;
        }else{
            return 5;
        }
    }



}