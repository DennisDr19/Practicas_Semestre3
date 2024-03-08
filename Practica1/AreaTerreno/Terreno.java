//EJERCICIO2_5
package AreaTerreno;
import java.util.Scanner;
public class Terreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valores del terreno");
        System.out.print("Ingrese valores de A:");
        float A = sc.nextFloat();
        System.out.print("Ingrese valores de B:");
        float B = sc.nextFloat();
        System.out.print("Ingrese valores de C:");
        float C = sc.nextFloat();
        if(C==A){
            do{
                System.out.println("C tiene que ser menor a A, ingrese otro valor");
                C = sc.nextFloat();
            }while(C==A);

        }
        float T= (B*(A-C))/2;
        float R= B*C;
        float total=T+R;
        System.out.println("Area del triangulo es: "+T);
        System.out.println("Area del rectangulo: "+C);
        System.out.println("Area total del terreno: "+total);


    }
}
