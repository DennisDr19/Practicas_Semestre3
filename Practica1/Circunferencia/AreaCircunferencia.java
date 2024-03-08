//EJERCICIO2_4
package Circunferencia;
import java.util.Scanner;
public class AreaCircunferencia {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area del una circunferencia");
        System.out.print("Ingrese el radio de la circunferencia: ");
        float radio = sc.nextFloat();
        System.out.print("El area de la circunferencia es: "+(3.1416*(radio*radio)));

    }
}
