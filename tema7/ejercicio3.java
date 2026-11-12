package tema7;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("1) Café 1,20 euros  2) Té 1,00 euro  3) Zumo 2,00 euros ; ");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Total: " + (1.20 * cantidad) + " euros");
                break;
            case 2:
                System.out.println("Total: " + (1.00 * cantidad) + " euros");
                break;
            case 3:
                System.out.println("Total: " + (2.00 * cantidad) + " euros");
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
