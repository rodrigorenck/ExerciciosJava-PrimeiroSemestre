package lista06Objetos.Ex10;

public class Main {

    public static void main(String[] args) {
        Horario horario = new Horario(16, 30, 50);

        horario.mostraHorario();

        Horario horario1 = new Horario(19, 26, 30);

        System.out.println(horario.diferencaHorarios(horario1));

        horario1.mostraHorario();
        System.out.println(horario.segundosParaOdiaAcabar());



    }
}
