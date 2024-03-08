package Ejercicio2_9;
import java.util.Scanner;
public class SueldoTrabajador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas,pagoxHora,sueldo;
        System.out.print("Ingrese las horas trabajadas: ");
        horas=sc.nextDouble();
        System.out.print("Ingrese el pago por hora: ");
        pagoxHora=sc.nextDouble();
        sueldo = pagoxHora*horas;
        System.out.println("Su sueldo corresponde a: $"+sueldo);
    }
}
