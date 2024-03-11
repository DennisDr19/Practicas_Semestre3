package Ejercicio4_2;
import java.util.Scanner;
public class Sumando2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros para sumarlos");
        int num,sumas=0;
        for(int i=1;i<=10;i++){
            System.out.print("Numero "+i+": ");
            num= sc.nextInt();
            sumas+=num;
        }
        System.out.println("La suma total es "+sumas);
    }
}
