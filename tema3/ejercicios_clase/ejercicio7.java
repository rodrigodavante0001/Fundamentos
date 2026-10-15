package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabajadas: ");
        double horas = sc.nextDouble();

        System.out.print("Precio por hora: ");
        double precioHora = sc.nextDouble();

        double salario = horas * precioHora;

        System.out.println("Salario semanal: " + salario + " euros");
        sc.close();
    }
}
