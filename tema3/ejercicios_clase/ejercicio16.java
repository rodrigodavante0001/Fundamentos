package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.println("En 5 años tendrás: " + (edad + 5));
        sc.close();
    }
}
