package ejercicios_clase;
    import java.util.Scanner;

    public class ejercicio5 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la base: ");
        int base = sc.nextInt();

        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();

        int area = base * altura;

        System.out.println("El área es : " + area);
        sc.close();
    }

}
