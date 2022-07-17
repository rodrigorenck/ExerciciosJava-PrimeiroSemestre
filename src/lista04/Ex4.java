package lista04;

/**
 * Crie um programa que l� o tempo atual em hora, minuto e segundo, e o
escreve em segundos quanto tempo se passou desde que o dia come�ou.
Essa convers�o deve ser calculada por um m�todo.
 */

import java.util.Scanner;

public class Ex4 {

	//nao deve printar em metodo
	public static int passaSegundos(int hora, int minuto, int segundo){
		int segundosDia = 60*60*24;
		int tudoSegundos = 0;
		if((hora<0 || hora>=24) || (minuto<0 || minuto>=60) || (segundo<0 || segundo>=60) ) {
			System.out.println("Erro. Valores Invalidos");
			return tudoSegundos;
		}else {
			int convertendoSegundos = (hora * 3600) + (minuto*60) + segundo;
			tudoSegundos = segundosDia - convertendoSegundos;
			return convertendoSegundos;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora: ");
		int hora = sc.nextInt();
		
		System.out.print("Minuto: ");
		int minuto = sc.nextInt();
		
		System.out.print("Segundo: ");
		int segundo = sc.nextInt();
		
		int resultado = passaSegundos(hora, minuto, segundo);
		
		System.out.println("Passaram " + resultado + " segundos desde que o dia come�ou!");
	
		
	}
}
