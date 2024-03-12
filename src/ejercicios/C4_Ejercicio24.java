package ejercicios;

import java.util.Scanner;

public class C4_Ejercicio24 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        float a = console.nextFloat();
        System.out.println("Ingrese el peso de la esfera B: ");
        float b = console.nextFloat();
        System.out.println("Ingrese el peso de la esfera C: ");
        float c = console.nextFloat();
        if( a > b ){
            if( a > c ){
                System.out.println("El mayor peso es A.");
            }else if( a < c ){
                System.out.println("El mayor peso es C.");
            }else{
                System.out.println("A y C empatan con el mayor peso.");
            }
        }else if( b > a ){
            if( b > c ){
                System.out.println("El mayor peso es B.");
            }else if( b < c ){
                System.out.println("El mayor peso es C.");
            }else{
                System.out.println("B y C empatan con el mayor peso.");
            }
        }else{
            if( b > c ){
                System.out.println("A y B empatan con el mayor peso.");
            }else if( b < c ){
                System.out.println("El mayor peso es C.");
            }else{
                System.out.println("Es un completo empate.");
            }
        }
    }
}
