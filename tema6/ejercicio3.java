package tema6;

import java.util.Scanner;

public class ejercicio3 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu sueldo anual: ");
        double sueldo = sc.nextDouble();

        if (sueldo <= 12000) {
            System.out.println("Retencion: 0%");
        } else if (sueldo <= 25000) {
            System.out.println("Retencion: 10%");
        } else if (sueldo <= 40000) {
            System.out.println("Retencion: 20%");
        } else {
            System.out.println("Retencion: 30%");
        }
        sc.close();
    }
}
