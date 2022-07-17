package lista01; /**
 * Faça um programa que leia a capacidade (em litros) do tanque de um
carro, o seu consumo médio (km/litro) e a distância (em km) que esse
carro precisa percorrer. O programa deve calcular e escrever tantas vezes
será necessário parar para abastecer para que o carro consiga percorrer a
distância informada.
 */

 import java.util.Scanner;
public class ex20z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Capacidade do tanque (litros): ");
        double tanque = sc.nextDouble();
        System.out.print("Consumo médio (km/litro): ");
        double consumoMedio = sc.nextDouble();
        System.out.print("Distancia (km): ");
        double distancia = sc.nextDouble();


        //quantos litros custa essa distancia
        double paradas = (distancia/consumoMedio)/tanque;

        //utilizamos o Math.Ceil aqui pos caso de um numero quebrado queremos arredondar para cima, ja que nao existe meia parada.
        //Math.ceil(x) retorna o menor numeiro inteiro maior ou igual a "x"
        System.out.println("Quantidade de paradas para abastecer: " + Math.ceil(paradas));
    }
}
