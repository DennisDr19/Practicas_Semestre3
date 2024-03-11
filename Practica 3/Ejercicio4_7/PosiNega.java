package Ejercicio4_7;
import java.util.Scanner;
public class PosiNega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0,neg=0,cero=0;
        System.out.println("Cuantos numeros ingresara?");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Ingrese el numero "+(i+1)+": ");
            int dato = sc.nextInt();
            if(dato>0){pos++;}
            else if(dato<0){neg++;}
            else{cero++;}
        }
        System.out.println("Numero ingresados "+num);
        System.out.println("Numeros mayores a 0: "+pos);
        System.out.println("Numeros menores a 0: "+neg);
        System.out.println("Numeros iguales a 0: "+cero);
    }
}
