//EJERCICIO2_3
package Rectangulo;
import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hallar area del rectangulo");
        System.out.print("Ingrese la base del rectangulo: ");
        float base=sc.nextInt();
        System.out.print("Ingrese el area del rectangulo");
        float alt=sc.nextInt();
        System.out.println("El area del rectangulo es: "+(base*alt));
    }
}
