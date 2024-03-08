//EJERCICIO2_6
package TerrenoConoHelado;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float H,R;
        System.out.print("Ingrese el radio del circulo: ");
        R = sc.nextFloat();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        H = sc.nextFloat();
        double C = Math.sqrt((H*H)-(R*R));
        double AT=(2*C*R)/2;
        double AC = (3.1416*R*R)/2;
        double Area=AT+AC;
        System.out.println("EL area es de: "+Area);
    }

}
