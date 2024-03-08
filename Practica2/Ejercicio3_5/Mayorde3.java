package Ejercicio3_5;
import java.util.Scanner;
public class Mayorde3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros para saber cual es el mayor");
        System.out.print("Numero uno: ");
        int num1 = sc.nextInt();
        System.out.print("Numero dos: ");
        int num2 = sc.nextInt();
        System.out.print("Numero tres: ");
        int num3 = sc.nextInt();
        if(num1>num2){
            if(num1>num3){System.out.println("El numero mayor es: "+num1);}
            else{System.out.println("El numero mayor es: "+num3);}
        }else{
            if(num2>num3){System.out.println("El numero mayor es: "+num2);}
            else{System.out.println("El numero mayor es: "+num3);}
        }
    }
}
