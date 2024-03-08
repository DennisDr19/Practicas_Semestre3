package Ejercicio3_1;
import java.util.Scanner;
public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dosnumeros para saber cual es el mayor");
        System.out.print("Primer numero: ");
        int num1= sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2= sc.nextInt();
        if(num1>num2){
            System.out.println("El numero mayor es el numero " +num1);
        }else{
            System.out.println("El numero mayor es el numero " +num2);
        }
    }
}
