package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Área: " + area);
    }
    sc.close();
}
