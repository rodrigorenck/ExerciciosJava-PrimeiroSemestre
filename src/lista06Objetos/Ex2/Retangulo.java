package lista06Objetos.Ex2;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if(base<=0 || altura<=0){
            throw new IllegalArgumentException("Base e altura tem que ser valores maiores que 0");
        }
        if (base == altura) {
            throw new IllegalArgumentException("Retangulo nao pode ter lados iguais");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return this.base * this.altura;
    }

    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public double getComprimentoDiagonal(){
        return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
