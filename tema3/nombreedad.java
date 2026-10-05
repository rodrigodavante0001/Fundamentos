import java.util.Scanner;

public class nombreedad {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre");
    String nombre = sc.nextLine();

    System.out.println("Edad: ");
    int edad = sc.nextInt();
    sc.nextLine();

    System.out.println("Dime tu inicial: ");
    char inicial = sc.nextLine().charAt(0);
    System.out.println("Hola, " + nombre + " tiene " + edad);

    System.out.println("Tu inicial es: " + inicial);

    }
}
