package lista04;

import java.util.Scanner;
public class Ex5 {

	public static double distanciaEuclidiana(double x1, double y1, double x2, double y2){
		//double distancia = Math.sqrt(((Math.pow((x1 - x2), 2) + Math.pow((y1-y2), 2))));
		double distancia = Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1-y2), 2)));
		return distancia;
	}
	
	public static double distanciaManhattan(double x1, double y1, double x2, double y2) {
		double distancia = Math.abs(x1- x2) + Math.abs(y1-y2);
		return distancia;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a coordenada 1");
		System.out.print("x1: ");
		double x1 = sc.nextDouble();
		System.out.print("y1: ");
		double y1 = sc.nextDouble();
		
		System.out.println("Informe a coordenada 2");
		System.out.print("x2: ");
		double x2 = sc.nextDouble();
		System.out.print("y2: ");
		double y2 = sc.nextDouble();
		
		double distManhatan = distanciaManhattan(x1, y1, x2, y2);
		
		double distEuclidiana = distanciaEuclidiana(x1, y1, x2, y2);
		
		System.out.println("Distancia Manhatan = " + distManhatan);
		
		System.out.println("Distancia Manhatan = " + distEuclidiana);
		
	}
	
}
