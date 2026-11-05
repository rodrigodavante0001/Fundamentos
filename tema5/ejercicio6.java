package tema5;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        if (nota >= 5) {
            System.out.println("Aprobado con un " + nota + " gg next");
        } else {
            System.out.println("Suspenso con un " + nota + " haber estudia tontooo");
        }
    sc.close();
    }
}
