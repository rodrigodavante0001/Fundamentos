package ejercicios_clase;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double CAMBIO = 1.10;

        System.out.print("Euros: ");
        double euros = sc.nextDouble();

        double dolares = euros * CAMBIO;

        System.out.println("Dólares: " + dolares);
        sc.close();
    }
}
