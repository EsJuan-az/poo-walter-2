package actividad.pkg2;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        double a, b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero A: ");
        a = entrada.nextDouble(); 
        System.out.println("Ingrese un numero B: ");
        b = entrada.nextDouble(); 
        if (a > b) {
            System.out.println(a + " es mayor que " + b);           
        }
        else if (a == b){
            System.out.println(a + " es igual a " + b);
        }
        else{
            System.out.println(a + " es menor que  " + b);
        }
    
    }

}

