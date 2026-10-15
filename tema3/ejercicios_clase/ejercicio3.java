package ejercicios_clase;
    import java.util.Scanner;

    public class ejercicio3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma es: " + suma);
        sc.close();
    }

}
