package lista06Objetos.Ex19;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente(null, "f");
        System.out.println(paciente);

        Paciente paciente2 = new Paciente("Joana", "f");
        paciente2.setIdade(28);
        paciente2.setAltura(1.58);
        paciente2.setPeso(58);

        System.out.println(paciente2);

        System.out.println();
        System.out.println("O IMC de " + paciente2.getNome() + " eh " + paciente2.imc() );

        System.out.println("O peso ideal de " + paciente2.getNome() + " eh " + paciente2.pesoIdeal());

        int faixaRiscoPaciente2 = paciente2.faixaDeRisco();

        System.out.println("---------------------");

        System.out.println("FAIXA DE RISCO DE " + paciente2.getNome());
        switch(faixaRiscoPaciente2){
            case 1:
                System.out.println("abaixo do peso");
                break;
            case 2:
                System.out.println("normal");
                break;
            case 3:
                System.out.println("excesso de peso");
                break;
            case 4:
                System.out.println("obesidade");
                break;
            case 5:
                System.out.println("obesidade morbida");
        }




    }
}
