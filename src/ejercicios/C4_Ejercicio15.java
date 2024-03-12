package ejercicios;
import java.util.Scanner;
public class C4_Ejercicio15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Hay cuatro esperas A, B, C, D.\n Tres de igual peso y una con distinto.");
        System.out.println("Ingrese el peso de la esfera A: ");
        float a = console.nextFloat();
        System.out.println("Ingrese el peso de la esfera B: ");
        float b = console.nextFloat();
        System.out.println("Ingrese el peso de la esfera C: ");
        float c = console.nextFloat();
        System.out.println("Ingrese el peso de la esfera D: ");
        float d = console.nextFloat();
        float diferente;
        float tipico;
        if(a == b && b == c && c != d){
            // D es el valor distinto.
            System.out.println("D es la esfera con peso atípico...");
            tipico = a;
            diferente = d;

        }else if(a == b && b == d && d !=  c){
            //C es el valor distinto.
            System.out.println("C es la esfera con peso atípico...");
            tipico = a;
            diferente = c;
        }else if(a == d && d == c && c != b){
            //B es el valor distinto.
            System.out.println("B es la esfera con peso atípico...");
            tipico = a;
            diferente = b;
        }else if(b == c && c == d && d != a){
            //A es el valor distinto.
            System.out.println("A es la esfera con peso atípico...");
            tipico = b;
            diferente = a;
        }else {
            System.out.println("Los datos no cumplen con los criterios.");
            return;
        }

        if(diferente > tipico){
            System.out.println("Su peso es mayor.");
        }else{
            System.out.println("Su peso es menor.");
        }


    }
}
