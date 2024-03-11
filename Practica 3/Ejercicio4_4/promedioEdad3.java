package Ejercicio4_4;
import java.util.Scanner;
public class promedioEdad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();
        int op,numAlumnos;
        do{
            System.out.println("Con cual metodo quiere realizar?");
            System.out.println("(1) Metodo WHILE");
            System.out.println("(2) Metodo DO-WHILE");
            System.out.println("(3) Metodo FOR");
            System.out.println("(4) Salir");
            System.out.print("Escojo la opcion --> ");
            op=sc.nextInt();
            if(op==4){continue;}
            System.out.println("De cuantos alumnos ingresara la edad?");
            numAlumnos=sc.nextInt();
            switch (op){
                case 1: met.WHILE(numAlumnos); break;
                case 2: met.DO_WHILE(numAlumnos); break;
                case 3: met.FOR(numAlumnos);
            }
        }while(op!=4);

        System.out.println("Gracias por probarlo");
    }
}
