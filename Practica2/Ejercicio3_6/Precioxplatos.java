package Ejercicio3_6;
import java.util.Scanner;
public class Precioxplatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas personas comeran comeran?");
        int personas = sc.nextInt();
        if(personas <= 0){
            do{
                System.out.println("Ingrese un numero mayor a 0");
                personas = sc.nextInt();
            }while(personas<=0);
        }
        if(personas <= 200){
            System.out.println("El costo total de los platos es: Bs."+(personas*95));
        }else if(personas <= 300){
            System.out.println("El costo total de los platos es: Bs."+(personas*85));
        }else{System.out.println("El costo total de los platos es: Bs."+(personas*75));}
    }
}
