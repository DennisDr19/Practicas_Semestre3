package Ejercicio3_3;
import java.util.Scanner;

public class CostoLapi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuatos lapices va a comprar?");
        int lapiz = sc.nextInt();
        if(lapiz <= 0){System.out.println("Ingrese un numero mayor a 0");
            do{
                lapiz = sc.nextInt();
            }while(lapiz<=0);
        }
        System.out.println("Lapices a comprar: "+lapiz);
        if(lapiz<1000){System.out.println("Costo de total: C"+(lapiz*0.9));}
        else{System.out.println("Costo total: C"+(lapiz*0.85));}}

}
