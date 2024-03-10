package Ejercicio3_12;
import java.util.Scanner;
public class Consultorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCita;
        double costoCita, totalTratamiento;
        double primCitas = 200;
        double segCitas = 150;
        double terCitas = 100;
        double masCitas = 50;

        System.out.println("¿Qué número de cita es esta?");
        numCita=sc.nextInt();
        while(!(numCita>0)){
            System.out.println("Ingrese un numero mayor a 0");
            numCita=sc.nextInt();
        }
        if(numCita<=3){
            costoCita=primCitas;
            totalTratamiento=(costoCita*numCita);
            System.out.println("Costo de la cita: "+costoCita);
            System.out.println("Costo total del tratamiento: "+totalTratamiento);
        }else if(numCita<=5){
            costoCita=segCitas;
            totalTratamiento=(numCita-3)*costoCita+600;
            System.out.println("Costo de la cita: "+costoCita);
            System.out.println("Costo total del tratamiento: "+totalTratamiento);
        }else if(numCita<=8){
            costoCita=terCitas;
            totalTratamiento=(numCita-5)*costoCita+900;
            System.out.println("Costo de la cita: "+costoCita);
            System.out.println("Costo total del tratamiento: "+totalTratamiento);
        }else{
            costoCita=masCitas;
            totalTratamiento=(numCita-8)*costoCita+1000;
            System.out.println("Costo de la cita: "+costoCita);
            System.out.println("Costo total del tratamiento: "+totalTratamiento);
        }
    }
}
