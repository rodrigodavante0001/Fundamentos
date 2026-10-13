    import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
    }

}
