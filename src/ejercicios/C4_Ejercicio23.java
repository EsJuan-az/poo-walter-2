package ejercicios;

import java.util.Scanner;

public class C4_Ejercicio23 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el coheficiente de x²: ");
        double a = console.nextFloat();
        System.out.println("Ingrese el coheficiente de x: ");
        double b = console.nextFloat();
        System.out.println("Ingrese el coheficiente del término independiente: ");
        double c = console.nextFloat();
        double distriminante = Math.pow(b, 2) - 4 * a * c;
        String sol1, sol2;
        if(distriminante >= 0){
            // Dos soluciones reales
            sol1 = Double.toString(( -b + Math.sqrt(distriminante)) / (2 * a));
            sol2 = Double.toString(( -b - Math.sqrt(distriminante)) / (2 * a));
        }else{
            sol1 = (-b / (2 * a)) + " + " + (Math.sqrt(-distriminante) / (2 * a)) + "i";
            sol2 = (-b / (2 * a)) + " - " + (Math.sqrt(-distriminante) / (2 * a)) + "i";
        }
        System.out.println("Solución 1: " + sol1);
        System.out.println("Solución 2: " + sol2);

    }
}
