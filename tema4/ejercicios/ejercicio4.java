package tema4.ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Letra: ");
    char letra = sc.nextLine().charAt(0);
    System.out.println("Codigo: " + (int) letra);            
    System.out.println((char) (letra + 1));     
    sc.close();
    }
}
