package tema6;

import java.util.Scanner;

public class ejercicio4 {
public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);

        System.out.print("¿Eres socio? (s/n): ");
        String socio = sc.next();

        System.out.print("¿Pagas en efectivo? (s/n): ");
        String efectivo = sc.next();

        int descuento = 0;

        if (socio.equals("s")) {
            descuento = descuento + 5;
        }

        if (efectivo.equals("s")) {
            descuento = descuento + 2;
        }

        System.out.println("Descuento total: " + descuento + "%");
        sc.close();
    }
    
} 

