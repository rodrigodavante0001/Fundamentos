package tema5;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double DESCUENTO = 0.10;

        System.out.print("Importe de la compra: ");
        double importe = sc.nextDouble();

        if (importe > 100) {
            double total = importe - importe * DESCUENTO;
            System.out.println("Total a pagar: " + total + " euros");
        } else {
            System.out.println("Total a pagar: " + importe + " euros");
        }
    sc.close();
    }
}
