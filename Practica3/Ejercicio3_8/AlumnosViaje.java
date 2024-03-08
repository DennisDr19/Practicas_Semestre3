package Ejercicio3_8;
import java.util.Scanner;
public class AlumnosViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto alumnos iran al viaje?");
        int cobroAlumno=0;
        int alumnos = sc.nextInt();
        if(alumnos >= 100){
            cobroAlumno=65;
        }else if(alumnos >= 50){
            cobroAlumno=70;
        }else if(alumnos>=30){
            cobroAlumno=95;
        }else if(alumnos>=1){
            cobroAlumno=4000/alumnos;
        }
        System.out.print("El monto a pagar x estudiante es: $"+cobroAlumno);
    }
}
