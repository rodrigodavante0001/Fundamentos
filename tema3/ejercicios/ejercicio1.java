import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //crea un objeto escaner
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }
  

}