package Ejercicio2_7;
import java.util.Scanner;
public class Produccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litros;
        double precioGalon,totalGalon,ganancia;
        System.out.print("Cantidad de litros producidos: ");
        litros = sc.nextInt();
        System.out.print("Precio de cada galon: ");
        precioGalon = sc.nextDouble();
        totalGalon = litros/3.785;
        ganancia = totalGalon*precioGalon;
        System.out.println("Ganancia total de la produccion: "+ganancia);
    }
}
