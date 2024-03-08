package Ejercicio2_11;
import java.util.Scanner;
public class Alberca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las medidas de la alberca");
        System.out.print("Largo: ");
        double largo = sc.nextDouble();
        System.out.print("Ancho: ");
        double ancho = sc.nextDouble();
        System.out.print("Alto: ");
        double alto = sc.nextDouble();
        double volumenTotal= alto*ancho*largo;
        System.out.print("Ingrese el costo por metro cubico: ");
        double costoxmetro= sc.nextDouble();
        System.out.println("Costo total de metros cubicos: $"+(volumenTotal*costoxmetro));

    }
}
