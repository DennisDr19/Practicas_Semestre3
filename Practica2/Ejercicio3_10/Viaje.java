package Ejercicio3_10;
import  java.util.Scanner;
public class Viaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costokm = 0;
        System.out.println("Que tipo de bus usara? (A) o (B) o (C)");
        char tipoBus=sc.next().charAt(0);
        System.out.println("Cuantos kilometros es el viaje?");
        double km = sc.nextDouble();
        System.out.println("Cuantas personas van?");
        int numPer= sc.nextInt();
        if(numPer<20){
            numPer=20;
        }else {
            if(tipoBus=='A'){
                costokm =2;
            } else if (tipoBus=='B') {
                costokm = 2.5;
            } else{
                costokm=3;
            }
        }
        double total =numPer*costokm*km;
        double costoPers=total/numPer;

        System.out.println("Total: "+total);
        System.out.println("Costo x persona: "+costoPers);
    }
}
