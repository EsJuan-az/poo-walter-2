package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valorCompra;

        String bolita, valorCompraFormato;

        System.out.print("Ingresa el valor de la compra: ");
        valorCompra = entrada.nextFloat();

        System.out.print("Ingresa el color de la bolita: ");
        bolita = entrada.next();

        System.out.println("--------------------------------------");

        switch (bolita.toLowerCase()) {
            case "blanca":
                break;
            case "verde":
                valorCompra -= (valorCompra * 0.1f);
                break;
            case "amarilla":
                valorCompra -= (valorCompra * 0.25f);
                break;
            case "azul":
                valorCompra -= (valorCompra * 0.5f);
                break;
            case "roja":
                valorCompra = 0;
                break;
        }

        valorCompraFormato = String.format("$%,.2f", valorCompra);
        System.out.println("El valor de la compra es: " + valorCompraFormato);
    }
}
