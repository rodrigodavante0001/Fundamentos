package tema6;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Gratis");
        } else if (edad <= 12) {
            System.out.println("Precio: 0.50 euros");
        } else if (edad <= 64) {
            System.out.println("Precio: 1.20 euros");
        } else {
            System.out.println("Gratis");
        }
        sc.close();
    }
}

