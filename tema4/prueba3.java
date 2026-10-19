package tema4;

public class prueba3 {
    
    public static void main(String[] args) {
        int edad = 15;
        boolean vaConAdulto = true;
        boolean tieneEntrada = false;

        boolean puedeEntrar = edad >= 18 || vaConAdulto;
        boolean puedeSentarse = puedeEntrar && tieneEntrada;

        System.out.println("Puede entrar: " + puedeEntrar);
        System.out.println("Puede sentarse: " + puedeSentarse);
        System.out.println("No tiene entrada: " + !tieneEntrada);
    }
}
    
/*Puede entrar: true
Puede sentarse: false
No tiene entrada: true
puedeEntrar: 15 >= 18 es false, pero vaConAdulto es true; con || basta una, así que true.
puedeSentarse: && necesita las dos; tieneEntrada es false, así que false.
!tieneEntrada invierte false y da true.
Si vaConAdulto fuera false: false || false da false, y puedeEntrar y puedeSentarse serían false.*/  

