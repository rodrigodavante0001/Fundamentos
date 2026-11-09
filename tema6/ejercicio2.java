package tema6;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad <= 11) {
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Mayor");
        }
        sc.close();
    }
}
