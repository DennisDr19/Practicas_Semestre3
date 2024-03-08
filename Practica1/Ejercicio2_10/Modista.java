package Ejercicio2_10;
import java.util.Scanner;
public class Modista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de metros que necesita: ");
        double metros = sc.nextFloat();
        double pulgadas=metros/0.0254;
        System.out.print("Cantidad de pulgadas deseadas: "+pulgadas+" pulgadas");

    }
}
