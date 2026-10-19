package tema4.ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        String text1 = sc.nextLine();
        System.out.print("Segundo número: ");
        String text2 = sc.nextLine();

        
        int suma = Integer.parseInt(text1) + Integer.parseInt(text2);
        System.out.println("Suma convirtiendo: " + suma);

        
        System.out.println("Sin convertir: " + (text1 + text2));
        sc.close();
    }
}
