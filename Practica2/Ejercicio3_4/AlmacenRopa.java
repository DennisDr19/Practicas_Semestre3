package Ejercicio3_4;
import java.util.Scanner;

public class AlmacenRopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto cuesta el traje que desea comprar?");
        System.out.print("Bs.");
        double costo= sc.nextDouble();
        if(costo <= 0){
            do{
                System.out.println("Ingrese un numero mayor a 0");
                System.out.print("Bs.");
                costo = sc.nextDouble();
            }while(costo<=0);
        }
        if(costo<=2500){
            System.out.println("Precio final c/descuento: Bs."+(costo-(costo*0.08)));
            System.out.println("Descuento total recibido: Bs."+(costo*0.08));
        }else{
            System.out.println("Precio final c/descuento: Bs."+(costo-(costo*0.15)));
            System.out.println("Descuento total recibido: Bs."+(costo*0.15));
        }
    }
}
