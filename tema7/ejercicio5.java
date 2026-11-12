package tema7;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un código de idioma (es, en, fr): ");
        String codigo = sc.next();

        switch (codigo) {
            case "es":
                System.out.println("Hola");
                break;
            case "en":
                System.out.println("Hello");
                break;
            case "fr":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Idioma desconocido");
        }
        sc.close();  
    }
}
