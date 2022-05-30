package lista06Objetos.Ex1;

public class Esfera {
    private double raio;


    public Esfera(double raio){
        this.raio = raio;
    }


    public double volume(){
        return 4.0*Math.PI*Math.pow(this.raio, 3)/3;
    }

    public double area(){
        return 4*Math.PI*Math.pow(this.raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
