package Ejercicio4_5;
import java.util.Scanner;
public class estaturaPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura=0,dato;
        int numPersonas=0;
        System.out.println("Ingrese una altura en metros (m)");
        dato= sc.nextDouble();
        while(dato>0){
            altura+=dato;
            System.out.println("ingrese otra altura");
            dato= sc.nextDouble();
            numPersonas++;
        }
        if(dato<=0){
            System.out.println("No se ingresaron personas");
            System.out.println("Promedio de las "+numPersonas+" estaturas ingresadas: "+(altura/numPersonas));
        }else{
            System.out.println("Promedio de estaturas: "+(altura/numPersonas));
        }
    }
}
