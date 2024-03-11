package Ejercicio4_6;
import java.util.Scanner;
public class ahorroBanco {
    public static void main(String[] args) {
        int mes; double ahorroMensual=0,deposito;
        Scanner sc = new Scanner(System.in);
        for(mes=1;mes<=12;mes++){
            System.out.print("Cuanto dinero depositara el mes "+mes+": ");
            deposito=sc.nextDouble();
            ahorroMensual+=deposito;
            if(mes==12){System.out.println("Dinero ahorrado este año: "+ahorroMensual);}
            else{System.out.println("Dinero ahorrado este mes: "+ahorroMensual);}
        }

    }
}
