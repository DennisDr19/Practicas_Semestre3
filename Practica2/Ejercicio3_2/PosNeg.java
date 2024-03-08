package Ejercicio3_2;
import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es negativo");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("El numero ingresado es positivo");
        }else{
            System.out.println("El numero ingresado es negativo");
        }
    }
}
