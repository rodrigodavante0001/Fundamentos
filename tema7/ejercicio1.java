package tema7;

import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (1 = rojo, 2 = amarillo, 3 = verde) : ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Para");
                break;
            case 2:
                System.out.println("Precaución");
                break;
            case 3:
                System.out.println("Pasa");
                break;
            default:
                System.out.println("Color no válido");
        }
        sc.close();
    }
}