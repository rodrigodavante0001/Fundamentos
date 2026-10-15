package ejercicios_clase;
    
    import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Euros: ");
        double euros = sc.nextDouble();
        
        final double Cambio = 166.386;

        double pesetas = euros * Cambio;

        System.out.println("Pesetas: " + pesetas);
        sc.close();
    }
}
