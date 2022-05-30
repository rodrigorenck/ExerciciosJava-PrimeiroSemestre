package lista06Objetos.Ex10;

public class Horario {
    private final int hora;
    private final int minuto;
    private final int segundo;

    public Horario(int hora, int minuto, int segundo){
        if((hora>=24 || hora<0) || (minuto>=60 || minuto<0) || (segundo>=60 || segundo<0)){
            throw new IllegalArgumentException("Horario invalido");
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostraHorario(){
        System.out.println(hora + "h " + minuto + "min " + segundo + "seg");
    }

    public int paraSegundos(){
        return hora*3600 + minuto*60 + segundo;
    }
    public int paraMinutos(){
        return hora*60 + minuto;
    }

    public int segundosParaOdiaAcabar(){
        int segundosNoDia = 24*3600;
        return segundosNoDia - paraSegundos();
    }

    public int diferencaHorarios(Horario horario2){
        return Math.abs(this.paraSegundos() - horario2.paraSegundos());
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}
