package Ejercicio4_1;
import java.util.Scanner;
public class Sumando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros para sumarlos");
        int i=1,num,sumas=0;
        while(i<=10){
            System.out.print("Numero "+i+": ");
            num= sc.nextInt();
            sumas+=num;
            i++;
        }
        System.out.println("La suma total es "+sumas);
    }
}
