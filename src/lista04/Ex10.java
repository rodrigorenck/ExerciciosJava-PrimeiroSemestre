package lista04;

import java.util.Scanner;

public class Ex10 {

	// como eu fiz a verificacao no main, eu sei que aqui so vai entrar dados bons (sexo == 1 ou sexo == 2)
	public static double pesoIdeal(double altura, int sexo) {
		double pesoIdeal;
		if (sexo == 1) {
			pesoIdeal = 72.7 * altura - 58;
		} else {
			pesoIdeal = 62.1 * altura - 44.7;
		}
		return pesoIdeal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double altura;
		// teria como eu fazer essa verificacao dentro do metodo?
		do {
			System.out.print("Informe sua altura: ");
			altura = sc.nextDouble();
		} while (altura < 0.5 || altura > 2.5);

		int sexo;
		// teria como eu fazer essa verificacao dentro do metodo?
		do {
			System.out.print("Informe seu sexo: ");
			sexo = sc.nextInt();
		} while (sexo != 1 && sexo != 2);
		
		double pesoIdeal = pesoIdeal(altura, sexo);
		
		System.out.println("Seu peso ideal eh: " + pesoIdeal);

	}
}
