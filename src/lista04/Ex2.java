package lista04;


import java.util.Scanner;
public class Ex2 {

	public static double maior(double val1, double val2, double val3) {
		double maior = Double.MIN_VALUE;
		if(val1>maior) {
			maior = val1;
		}if(val2>maior) {
			maior = val2;
		}if(val3>maior) {
			maior = val3;
		}
		return maior;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double val1 = sc.nextDouble();
		System.out.print("Informe um valor: ");
		double val2 = sc.nextDouble();
		System.out.print("Informe um valor: ");
		double val3 = sc.nextDouble();
		
//		double maior = Double.MIN_VALUE;
//		if(val1>maior) {
//			maior = val1;
//		}if(val2>maior) {
//			maior = val2;
//		}if(val3>maior) {
//			maior = val3;
//		}
//		System.out.println("Maior = " + maior);
		
		double maior = maior(val1, val2, val3);
		
		System.out.println("Maior = " + maior);

		System.out.println("Teste");

	}
}
