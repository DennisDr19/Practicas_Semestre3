package Ejercicio3_11;
import java.util.Scanner;
public class MenuHamb {
    public static void main(String[] args) {
        int burger,cantidad,op,opPago;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("------Menu------");
            System.out.println("Hamburguesa simple (1): $20");
            System.out.println("Hamburguesa doble (2): $25");
            System.out.println("Hamburguesa triple (3): $28");
            System.out.println("Salir (4)");
            System.out.print("Elijo la opcion --> ");
            op= sc.nextInt();
            while (!(op >= 1 && op <= 4)) {
                System.out.println("Escoja una opcion entre 1 y 4");
                op= sc.nextInt();
            }
            if(op==1){burger=20;}
            else if(op==2){burger=25;}
            else{burger=28;}
            if(op==1||op==2||op==3){
                System.out.print("¿Cuantas hamburguesa va a comprar: ");
                cantidad = sc.nextInt();
                do{
                    System.out.println("---Menu de pago---");
                    System.out.println("Pago con moneda (1)");
                    System.out.println("Pago con tarjeta (2)");
                    System.out.println("Atras (3)");
                    System.out.println("Elijo la opcion --> ");
                    opPago = sc.nextInt();
                    if(opPago==1){
                        System.out.println("Total del pago: "+(cantidad*burger));
                    }
                    else{
                        System.out.println("Total del pago: "+(cantidad*burger)*1.05);
                    }

                }while(opPago!=3);
            }
        }while(op!=4);
        System.out.println("Gracias por su compra :)");
    }
}
