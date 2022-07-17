package lista04;

import java.util.Scanner;

public class Ex12 {

	public static double aritmetica(double nota1, double nota2, double nota3) {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public static double ponderada(double nota1, double nota2, double nota3) {
		double media = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / 10;
		return media;
	}

	public static double harmonica(double nota1, double nota2, double nota3) {
		// nao tenho certeza se a formula ta certa
		double media = 3 / (1 / nota1) + (1 / nota2) + (1 / nota3);

		return media;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int resp;
		double nota1, nota2, nota3;

		System.out.println("INFORME AS NOTAS [0 - 10]");
		// teria um jeito melhor de verificar as notas do que fazer um do while para
		// cada? -> sim da pra fazer um metodo leNota
		do {
			System.out.print("Nota 1: ");
			nota1 = sc.nextDouble();
		} while (nota1 < 0 || nota1 > 10);
		do {
			System.out.print("Nota 2: ");
			nota2 = sc.nextDouble();
		} while (nota2 < 0 || nota2 > 10);
		do {
			System.out.print("Nota 3: ");
			nota3 = sc.nextDouble();
		} while (nota3 < 0 || nota3 > 10);

		do {
			System.out.println();
			System.out.println("CALCULA MEDIAS");
			System.out.println("Digite [1] para Aritmetica");
			System.out.println("Digite [2] para Ponderada (pesos: 3, 3, 4)");
			System.out.println("Digite [3] para Harmonica");
			System.out.print("Sua resposta: ");
			resp = sc.nextInt();

			switch (resp) {
			case 1:
				double mediaAritmetica = aritmetica(nota1, nota2, nota3);
				System.out.println("Media aritmetica = " + mediaAritmetica);
				break;
			case 2:
				double mediaPonderada = ponderada(nota1, nota2, nota3);
				System.out.println("Media ponderada = " + mediaPonderada);
				break;
			case 3:
				double mediaHarmonica = harmonica(nota1, nota2, nota3);
				System.out.println("Media harmonica = " + mediaHarmonica);
			}
		} while (resp != 1 && resp != 2 && resp != 3);
	}
}
