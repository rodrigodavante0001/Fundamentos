package tema4.ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        String num1 = sc.nextLine();
        System.out.print("Segundo número: ");
        String num2 = sc.nextLine();

        
        int suma = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println("Suma: " + suma);

        
        System.out.println("Sin convertir: " + (num1 + num2));
        sc.close();
    }
}
