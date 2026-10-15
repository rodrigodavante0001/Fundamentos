package ejercicios_clase;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("El radio es: ");
        double radio = sc.nextDouble();

        double area = PI * (radio * radio);

        System.out.println("El área es: " + area);
        sc.close();
    }
}
