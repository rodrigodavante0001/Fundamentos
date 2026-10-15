package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.println("El doble de " + numero + " es " + (numero * 2));
        System.out.println("El triple es " + (numero * 3));
        sc.close();
    }
}
