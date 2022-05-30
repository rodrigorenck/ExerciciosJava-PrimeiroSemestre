package lista06Objetos.Ex3;

public class Sinaleira {
    //Ao instanciar uma sinaleira seu estado inicial sera verde
    private String estado = "verde";

    public void trocaDeEstado(){
        if(this.estado.equals("verde")){
            this.estado = "amarelo";
        }else if(this.estado.equals("amarelo")){
            this.estado = "vermelho";
        }else{
            this.estado = "verde";
        }
    }
    public void mostraEstado(){
        System.out.println(this.estado);
    }
}
