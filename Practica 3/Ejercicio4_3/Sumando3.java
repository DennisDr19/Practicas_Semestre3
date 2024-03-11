package Ejercicio4_3;
import java.util.Scanner;
public class Sumando3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumas=0,num,i=1;
        System.out.println("Ingrese 10 numeros para sumarlos");
        do{
            System.out.print("Numero "+i+": ");
            num= sc.nextInt();
            sumas+=num;
            i++;
        }while(i<=10);
        System.out.println("La suma total es "+sumas);
    }
}
