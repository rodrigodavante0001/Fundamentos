package tema4.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Primer número: ");
    int a = sc.nextInt();
    System.out.print("Segundo número: ");
    int b = sc.nextInt();
    System.out.println("La mitad es: "+ (double) (a + b) / 2);   
    sc.close();
    }
}
