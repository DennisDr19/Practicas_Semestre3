package Ejercicio3_14;

import java.util.Scanner;
public class Paqueteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costoEnvio=0;
        System.out.println("¿Cuántos kilos pesa su paquete?");
        double peso=sc.nextDouble();

        while(peso<=0) {
            System.out.println("Ingrese un peso mayor a 0Kgs");
            peso=sc.nextDouble();
            if(peso>5){
                System.out.println("Ingrese un peso menor  o igual a 5Kgs");
                peso=sc.nextDouble();
            }
        }
        System.out.println("Seleccione a donde enviar el paquete");
        int op;
        do{
            System.out.println("(1) America del Norte");
            System.out.println("(2) America del Central");
            System.out.println("(3) America del Sur");
            System.out.println("(4) Europa");
            System.out.println("(5) Asia");
            System.out.println("(6) Cancelar envio");
            System.out.print("---> ");
            op = sc.nextInt();
            switch(op){
                case 1: costoEnvio=(peso*1000)*11; op=6; break;
                case 2: costoEnvio=(peso*1000)*10; op=6; break;
                case 3: costoEnvio=(peso*1000)*12; op=6; break;
                case 4: costoEnvio=(peso*1000)*24; op=6; break;
                case 5: costoEnvio=(peso*1000)*27; op=6; break;
            }

        }while(op!=6);
        System.out.println("Costo total del envio: "+costoEnvio);
    }
}
