package Ejercicio3_9;
import java.util.Scanner;
public class Llamadas {
    public static void main(String[] args) {
        double costo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia de la semana realizo la llamada? ");
        int dia;
        do{
            System.out.println("seleccione entre 1 y 7 correspondiente al dia");
            dia = sc.nextInt();
        }while(!(dia>=1 && dia <=7));
        System.out.println("La llamada fue en el dia (1) o en la noche (2): ");
        int turno;
        do{
            System.out.println("Selecione opcion '1' ó '2'");
            turno = sc.nextInt();
        }while(turno != 1 && turno !=2);
        System.out.print("Cuanto tiempo estuvo en llamada?: ");
        double tiempo;
        do{
            tiempo = sc.nextDouble();
            System.out.println("tiempo tiene que ser mayor a 0");
        }while(tiempo<=0);

        if(tiempo<=5){
            costo= tiempo *1;
        }else if(tiempo <=8){
            costo=(tiempo-5)*0.8+5;
        }else if(tiempo <= 10){
            costo=(tiempo-8)*0.7+7.4;
        }else{
            costo=(tiempo-10)*0.5+8.8;
        }
        double impuesto = costo;
        if(dia==1||dia==2||dia==3||dia==4||dia==5||dia==6){
            if(turno==1){impuesto*=0.15;}
            else{impuesto*=0.10;}
        }else{
            impuesto*=0.05;
        }
        System.out.println("Detalle de pago");
        System.out.println("Costo: "+costo);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Total: "+(costo+impuesto));
    }
}
