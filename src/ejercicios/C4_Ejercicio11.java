package ejercicios;

import java.util.Scanner;

public class C4_Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1,numero2,numero3;

        System.out.print("Ingresa el número 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingresa el número 2: ");
        numero2 = entrada.nextInt();

        System.out.print("Ingresa el número 3: ");
        numero3 = entrada.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El número " + numero1 + " es el mayor");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El número " + numero2 + " es el mayor");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El número " + numero3 + " es el mayor");
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
