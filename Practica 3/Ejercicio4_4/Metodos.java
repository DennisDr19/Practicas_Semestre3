package Ejercicio4_4;
import java.util.Scanner;
public class Metodos {
    Scanner sc = new Scanner(System.in);
    private int i=1,edad,sumaEdad=0;
    public void WHILE(int numAlumnos){
        while(i<=numAlumnos){
            System.out.print("Edad del alumno "+i+": ");
            edad= sc.nextInt(); sumaEdad+=edad; i++;
        }
        System.out.println("EL promedio de la edad de los alumnos es: "+(sumaEdad/numAlumnos));
        System.out.println("-----------------------");sumaEdad=0;
    }

    public void DO_WHILE(int numAlumnos){
        do{
            System.out.print("Edad del alumno "+i+": ");
            edad= sc.nextInt(); sumaEdad+=edad; i++;
        }while(i<=numAlumnos);
        System.out.println("EL promedio de la edad de los alumnos es: "+(sumaEdad/numAlumnos));
        System.out.println("-----------------------");sumaEdad=0;
    }

    public void FOR(int numAlumnos){
        for(i=1;i<=numAlumnos;i++){
            System.out.print("Edad del alumno "+i+": ");
            edad= sc.nextInt(); sumaEdad+=edad;
        }
        System.out.println("EL promedio de la edad de los alumnos es: "+(sumaEdad/numAlumnos));
        System.out.println("-----------------------");sumaEdad=0;
    }
}
