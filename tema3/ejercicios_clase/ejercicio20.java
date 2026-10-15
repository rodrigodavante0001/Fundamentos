package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una letra: ");

        char letra = sc.next().charAt(0);

        System.out.println("La letra es: " + letra);
    }
}
