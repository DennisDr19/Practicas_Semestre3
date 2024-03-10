package Ejercicio3_9;
import java.util.Scanner;
public class Telefono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imp;
        double costo;
        System.out.println("¿Cuantos minutos duro la llamada?");
        double tiempo = sc.nextDouble();
        System.out.println("¿Es domingo, (1)si  (2)no?");
        int domingo= sc.nextInt();
        System.out.println("dia (1), noche (2)");
        int turno = sc.nextInt();
        if(tiempo<=5){
            costo=tiempo*1;
        } else if (tiempo<=8) {
            costo=(tiempo-5)*0.8+5;
        } else if (tiempo<=10) {
            costo =(tiempo-8)*0.7+7.4;
        } else {
            costo=(tiempo-10)*0.5+8.8;
        }
        if(domingo==1){
            imp=costo*0.05;
        } else if (turno==1) {
            imp=costo*0.15;
        }else {
            imp=costo*0.10;
        }
        System.out.println("Costo: "+costo);
        System.out.println("Impuesto: "+imp);
        System.out.println("Costo total: "+(costo+imp));

    }
}
