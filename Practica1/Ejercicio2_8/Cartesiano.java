package Ejercicio2_8;
import java.util.Scanner;
public class Cartesiano {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese valores de (X1,Y1)");
        System.out.print("X1: ");
        float X1=sc.nextFloat();
        System.out.print("Y1: ");
        float Y1=sc.nextFloat();
        System.out.println("Ingrese valores de (X2,Y2)");
        System.out.print("X2: ");
        float X2=sc.nextFloat();
        System.out.print("Y2: ");
        float Y2=sc.nextFloat();
        double X = X2-X1;
        double Y = Y2-Y1;
        double distancia = Math.sqrt((X*X)+(Y*Y));
        System.out.println("La distancia entre los puntos es: "+distancia);

    }
}
