package Ejercicio3_15;
import java.util.Scanner;
public class tarjetasCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoTarjeta;
        System.out.println("Bonos de Tarjetas de Credito");
        System.out.println("¿Cuantas tarjetas de credito tiene?");
        int cantTarjetas = sc.nextInt();
        if(cantTarjetas>1){
            System.out.println("Ingrese el tipo de tarjeta de mayor valor que tenga");
            System.out.println("---Tipos de tarjetas---");
            System.out.println("Tipo 1      (1)");
            System.out.println("Tipo 2      (2)");
            System.out.println("Tipo 3      (3)");
            System.out.println("Tipo Otros  (4)");
            System.out.print("Tipo de tarjeta: ");
            tipoTarjeta= sc.nextInt();
            System.out.println("¿Cual es su limite actual de su tarjeta de credito?");
            double limite = sc.nextDouble();
            while(limite<=0){
                System.out.println("El limite deber ser mayor a 0");
                System.out.println("Ingrese un limite nuevamente");
                limite= sc.nextDouble();
            }
            if(tipoTarjeta==1){
                System.out.println("Aumento de credito recibido: 25%");
                System.out.println("Nuevo limite de credito: "+(limite*1.25));
            }
            if(tipoTarjeta==2){
                System.out.println("Aumento de credito recibido: 35%");
                System.out.println("Nuevo limite de credito: "+(limite*1.35));
            }
            if(tipoTarjeta==3){
                System.out.println("Aumento de credito recibido: 40%");
                System.out.println("Nuevo limite de credito: "+(limite*1.40));
            }
            if(tipoTarjeta==4){
                System.out.println("Aumento de credito recibido: 50%");
                System.out.println("Nuevo limite de credito: "+(limite*1.50));
            }
        }else{
            System.out.println("Ingrese el tipo de tarjeta de mayor valor que tenga");
            System.out.println("---Tipos de tarjetas---");
            System.out.println("Tipo 1      (1)");
            System.out.println("Tipo 2      (2)");
            System.out.println("Tipo 3      (3)");
            System.out.println("Tipo Otros  (4)");
            System.out.print("Tipo de tarjeta: ");
            tipoTarjeta= sc.nextInt();
            System.out.println("¿Cual es su limite actual de su tarjeta de credito?");
            double limite = sc.nextDouble();
            while(limite<=0){
                System.out.println("El limite deber ser mayor a 0");
                System.out.println("Ingrese un limite nuevamente");
                limite= sc.nextDouble();
            }
            if(tipoTarjeta==1){
                System.out.println("Aumento de credito recibido: 25%");
                System.out.println("Nuevo limite de credito: "+(limite*1.25));
            }
            if(tipoTarjeta==2){
                System.out.println("Aumento de credito recibido: 35%");
                System.out.println("Nuevo limite de credito: "+(limite*1.35));
            }
            if(tipoTarjeta==3){
                System.out.println("Aumento de credito recibido: 40%");
                System.out.println("Nuevo limite de credito: "+(limite*1.40));
            }
            if(tipoTarjeta==4){
                System.out.println("Aumento de credito recibido: 50%");
                System.out.println("Nuevo limite de credito: "+(limite*1.50));
            }
        }
    }
}
