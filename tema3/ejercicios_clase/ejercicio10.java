package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.print("Base imponible: ");
        double baseImponible = sc.nextDouble();

        double total = baseImponible * (1 + IVA);

        System.out.println("Total factura: " + total + " euros");
        sc.close();
    }
}