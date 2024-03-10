package Ejercicio3_8;
import java.util.Scanner;
public class AutosBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos asistiran al viaje?");
        int numAlumnos = sc.nextInt();
        double costoAlumno=0;
        if(numAlumnos>=100){
            costoAlumno=65;
        } else if (numAlumnos>=50) {
            costoAlumno=70;
        } else if (numAlumnos>=30) {
            costoAlumno=95;
        }else if (numAlumnos>=1){
            costoAlumno= numAlumnos / 4000.00;
        }
        System.out.println("Pago por alumno para el viaje: "+costoAlumno+"$");
        System.out.println("Total reunido: "+(costoAlumno*numAlumnos)+"$");
        System.out.println("Pago por el viaje: 4000$");
    }
}
