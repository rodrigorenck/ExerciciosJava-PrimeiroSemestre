package lista01; /**
 * Implemente um programa que leia o horário de um evento qualquer ocorrido durante o dia. 
 * Considerando que o horário é representado em hora,minuto e segundo, o programa deve:
(a) converter esse horário para segundos e escrever tal informação na
tela.
(b) escrever na tela quantos segundos faltam para o dia acabar.
 */
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o horario do evento [horas minutos e segundos]: ");
        int horas = in.nextInt();
        int minutos = in.nextInt();
        int segundos = in.nextInt();

        int apenasSegundos = segundos + minutos*60 + horas*3600;

        System.out.println("O horario do evento em segundos é " + apenasSegundos);
        int segundosDia = 24*3600;
        System.out.println("Faltam "+ (segundosDia-apenasSegundos) + " segundos para o dia acabar!" );
    }
}
