package lista04;

import java.util.Scanner;

public class Ex3 {

    // nao se deve printar em metodo!!
    public static double area(double base, double altura) {
        double area = 0;
        if (base <= 0 || altura <= 0) {
            System.out.println("Erro. Valores nao podem ser negativos");
            return area;
        } else {
            area = base * altura;
            return area;
        }
    }

    public static double areaLivre(double areaTerreno, double areaCasa) {
        double areaLivre = 0;
        if (areaCasa > areaTerreno) {
            System.out.println("Erro. Area da casa nao pode ser maior que area do terreno");
            return areaLivre;
        } else {
            areaLivre = areaTerreno - areaCasa;
            return areaLivre;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CASA");
        System.out.print("Largura: ");
        double largCasa = sc.nextDouble();
        System.out.print("Comprimento: ");
        double comprCasa = sc.nextDouble();
        double areaCasa = area(largCasa, comprCasa);
        System.out.println("Area = " + areaCasa);
        System.out.println();


        System.out.println("TERRENO");
        System.out.print("Largura: ");
        double largTerreno = sc.nextDouble();
        System.out.print("Comprimento: ");
        double comprTerreno = sc.nextDouble();
        double areaTerreno = area(largTerreno, comprTerreno);
        System.out.println("Area = " + areaTerreno);
        System.out.println();

        System.out.println("AREA LIVRE");
        double areaLivre = areaLivre(areaTerreno, areaCasa);
        System.out.println("Area = " + areaLivre);

    }
}
