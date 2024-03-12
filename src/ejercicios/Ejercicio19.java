package actividad.pkg2;
import java.util.Scanner;

public class Ejercicio19 {
    
     public static void main(String[] args) {
         double lado, perim, altura, area;
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese el lado del triangulo: ");
         lado = entrada.nextDouble();
         perim = 3 * lado; 
         altura = Math.sqrt(3) * lado / 2;
         area = (lado * altura ) / 2;
         System.out.println("Perimetro del triangulo: " + perim);
         System.out.println("Altura del triangulo: " + altura);
         System.out.println("Area del triangulo: " + area);
       
     }
}
