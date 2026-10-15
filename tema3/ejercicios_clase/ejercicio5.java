package ejercicios_clase;
    import java.util.Scanner;

    public class ejercicio5 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("Área: " + area);
        sc.close();
    }

}
