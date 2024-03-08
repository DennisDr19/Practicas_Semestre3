package Ejercicio3_10;
import java.util.Scanner;
public class Autobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tipoBus;
        double distancia;
        int numPers;

        System.out.print("Cuantas personas viajaran? ");
        numPers = sc.nextInt();
        System.out.print("Que tipo de bus tomaran? 'A' o 'B' o 'C': ");
        tipoBus = sc.next().charAt(0);
        System.out.println("Cuantos kilometros recorrera? ");
        distancia = sc.nextDouble();
        if(numPers>=20){
            if(tipoBus == 'A'){
                System.out.println("Costo del viaje: "+(2*numPers*distancia));
                System.out.println("Costo por persona: $2");
            }
            if(tipoBus == 'B'){
                System.out.println("Costo del viaje: "+(2.5*numPers*distancia));
                System.out.println("Costo por persona: $2.5");
            }
            if(tipoBus == 'C'){
                System.out.println("Costo del viaje: "+(3*distancia*numPers));
                System.out.println("Costo por persona: $3");
            }
        }else{
            if(tipoBus == 'A'){
                System.out.println("Costo del viaje: "+(2*distancia));
                System.out.println("Costo por persona: $2");
            }
            if(tipoBus == 'B'){
                System.out.println("Costo del viaje: "+(2.5*distancia));
                System.out.println("Costo por persona: $2.5");
            }
            if(tipoBus == 'C'){
                System.out.println("Costo del viaje: "+(3*distancia));
                System.out.println("Costo por persona: $3");
            }
        }
    }
}
