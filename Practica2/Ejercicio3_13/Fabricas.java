package Ejercicio3_13;
import java.util.Scanner;
public class Fabricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave;
        double precioVenta,costoProduccion,materiaPrima,manoObra,gastoFabricacion;
        System.out.println("¿Cúanto es el costo de la materia prima?");
        materiaPrima = sc.nextDouble();
        while(materiaPrima<=0){
            System.out.println("Ingrese un valor mayor a 0");
            materiaPrima = sc.nextDouble();
        }
        System.out.println("¿Cual es la clave del producto?");
        clave = sc.nextInt();
        while(!(clave>0 && clave<=6)){
            System.out.println("Ingrese un valor entre 1 y 6");
            clave = sc.nextInt();
        }

        if(clave==3||clave==4){manoObra=materiaPrima*0.75;}
        else if(clave==1||clave==5){manoObra=materiaPrima*0.80;}
        else{manoObra=materiaPrima*0.85;}

        if(clave==2||clave==5){gastoFabricacion=materiaPrima*0.30;}
        else if(clave==3||clave==6){gastoFabricacion=materiaPrima*0.35;}
        else{gastoFabricacion=materiaPrima*0.28;}

        costoProduccion=materiaPrima+gastoFabricacion+manoObra;
        precioVenta=costoProduccion*1.45;

        System.out.println("Costo de produccion: "+costoProduccion);
        System.out.println("Precio de venta: "+precioVenta);
    }
}
