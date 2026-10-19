package tema4.ejercicios;

public class ejercicio6 {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);    // false
        System.out.println(a || b);    // true
        System.out.println(!a);        // false
        System.out.println(!a || b);   // false
        System.out.println(a && !b);   // true

    }
}
