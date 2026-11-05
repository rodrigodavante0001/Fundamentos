package tema5;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Edad: ");
            int edad = sc.nextInt();
    
            if (edad >= 18) {
                System.out.println("Puedes entrar");
            } else {
                System.out.println("No puedes entrar");
            }
        sc.close();      
        }
      
}
