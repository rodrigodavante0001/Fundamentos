package ejercicios_clase;
    
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double CAMBIO = 166.386;

        System.out.print("Euros: ");
        double euros = sc.nextDouble();

        double pesetas = euros * CAMBIO;

        System.out.println("Pesetas: " + pesetas);
        sc.close();
    }
}
