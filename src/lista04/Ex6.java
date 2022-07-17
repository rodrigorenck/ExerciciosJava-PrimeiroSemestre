package lista04;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex6 {

	//como fazer a verificacao de numero negativo dentro do metodo
	public static double conversaoCelcius(double valorFahrenheit){
		double celsius = 5.0/9 * (valorFahrenheit - 32);
		return celsius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		int cont = 1;
		double valor;
		
		while(cont<=30) {
			System.out.print("Informe o valor em Fahrenheit: ");
			valor = sc.nextDouble();
			double celsius = conversaoCelcius(valor);
			System.out.println("Temperatura em Celsius = " + deci.format(celsius));
			cont++;
		}
		
		System.out.println("");
	}
}
