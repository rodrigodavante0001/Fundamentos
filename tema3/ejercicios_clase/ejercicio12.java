package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double DESCUENTO = 0.10;

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        double precioFinal = precio * (1 - DESCUENTO);

        System.out.println("Precio final: " + precioFinal + " euros");
    }
}
