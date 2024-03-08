package Ejercicio3_7;
import java.util.Scanner;
public class Uvas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos de la entrega de uva");
        System.out.print("Precio del kilo de uva: ");
        double precio = sc.nextDouble();
        char tipo;
        do {
            System.out.print("Seleccione un tipo de uva 'A' ó 'B': ");
            tipo = sc.next().charAt(0);
        }while (tipo != 'A' && tipo != 'B');

        int tam;
        do{
            System.out.println("Seleccione una tamaño de uva '1' ó '2': ");
            tam = sc.nextInt();
        }while(tam != 1 && tam != 2);

        System.out.print("¿Cuántos kilos de uva entregará? (Los kilos tienen q ser mayor a 0): ");
        double kilos;
        do{
            kilos = sc.nextDouble();
        }while(kilos<=0);

        if(tipo == 'A'){
            if(tam == 1){precio+=0.2;}
            else{precio+=0.3;}
        }else{
            if(tam == 1){precio-=0.3;}
            else{precio-=0.5;}
        }
        precio*=kilos;
        if (precio<=0){System.out.print("Usted tiene perdida con este precio de: $"+precio);}
        else{System.out.print("Usted tiene una ganancia de: $"+precio);}
    }
}
