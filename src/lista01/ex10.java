package lista01;//Construa um programa que lê o tempo de um evento em segundos e o
//escreve decomposto em horas, minutos e segundos
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo;
        System.out.print("Informe o tempo em segundos: ");
        tempo = sc.nextInt();

        int horas = tempo/3600;
        int minutos = (tempo%3600)/60;
        int segundos = ((tempo%3600)%60);

        System.out.println(horas + "h " + minutos + "min " + segundos + "seg");
    }
}
