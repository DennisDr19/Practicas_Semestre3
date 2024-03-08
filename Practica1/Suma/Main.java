// EJERCICIO2_1
package Suma;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Suma de dos números");
        System.out.println("Ingrese el nùmero A: ");
        a = sc.nextInt();
        System.out.println("Ingrese el nùmero B: ");
        b = sc.nextInt();
        System.out.println("La suma de A+B es: "+(a+b));

    }
}
