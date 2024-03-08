//EJERCICIO2_2
package PromedioUniv;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float nota;
        float total=0;
        for(int i=1;i<=4;i++){
            System.out.println("Ingrese la calificación del parcial "+i+" (entre 0 y 100)");
            nota=sc.nextFloat();
            if(!(nota>=0 && nota<=100)){
                System.out.println("LA nota debe estar en el rango 0-100, ingrese otra nota");
                nota=sc.nextFloat();
            }
            total+=nota;
        }
        System.out.println("Nota final es: "+(total/4)+"/100");
    }
}
