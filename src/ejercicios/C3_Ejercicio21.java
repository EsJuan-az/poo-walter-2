package ejercicios;
import java.util.Scanner;

public class C3_Ejercicio21 {
    
    public static void main(String[] args) {
        double lado1, lado2, base, perim, semiper, altura, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Base del triangulo: ");
        base = entrada.nextDouble();
        System.out.println("Lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        perim = lado1+lado2+base;
        semiper = perimetro/2;
        altura = Math.sqrt(3) * base / 2;
        area = (base * altura ) / 2;
        System.out.println("Perimetro del triangulo: " + perim);
        System.out.println("Semiperimetro del triangulo: " + semiper);
        System.out.println("Area del triangulo: " + area);
          
    }
         
}


