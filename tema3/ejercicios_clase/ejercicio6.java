package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("La base es: ");
        double base = sc.nextDouble();

        System.out.print("La altura es: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área es: " + area);
        sc.close();
    }
    
}
