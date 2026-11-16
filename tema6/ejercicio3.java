package tema6;

import java.util.Scanner;

public class ejercicio3 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu sueldo anual: ");
        int sueldo = sc.nextInt();
        int retencion;

        if (sueldo <= 12000) {
            retencion = 0;
        } else if (sueldo <= 25000) {
            retencion =10;
        } else if (sueldo <= 40000) {
            retencion =20;
        } else {
            retencion = 30;
        }
        System.out.println("La retencion es: " + retencion + "%");
        sc.close();
    }
    
    
}
