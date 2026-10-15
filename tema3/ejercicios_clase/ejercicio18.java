package ejercicios_clase;

    import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SEGUNDOS_MINUTO = 60;

        System.out.print("Minutos: ");
        int minutos = sc.nextInt();

        int segundos = minutos * SEGUNDOS_MINUTO;

        System.out.println("Segundos: " + segundos);
        sc.close();
    }
}
