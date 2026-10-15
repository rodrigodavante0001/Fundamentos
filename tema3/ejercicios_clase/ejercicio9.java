package ejercicios_clase;
    
import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double CAMBIO = 166.386;

        System.out.print("Pesetas: ");
        double pesetas = sc.nextDouble();

        double euros = pesetas / CAMBIO;

        System.out.println("Euros: " + euros);
        sc.close();
    }
}
