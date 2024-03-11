package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ventasTotales;
        float salarioEmpleado;
        String salarioFormato;
        List<Integer> ventas = new ArrayList<Integer>();
        List<Float> salarios = new ArrayList<Float>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa el total de ventas del departamento " + (i + 1) + ": ");
            ventas.add(entrada.nextInt());
        }

        System.out.print("Ingresa el salario de los empleados: ");
        salarioEmpleado = entrada.nextFloat();
        for (int i = 0; i < 3; i++) {
            salarios.add(salarioEmpleado);
        }

        System.out.println("--------------------------------------");

        ventasTotales = ventas.get(0) + ventas.get(1) + ventas.get(2);

        for (int i = 0; i < 3; i++) {
            if (ventas.get(i) > ventasTotales * 0.33) {
                salarios.set(i, salarios.get(i) + (salarios.get(i) * 0.2f));
            }
        }

        for (int i = 0; i < 3; i++) {
            salarioFormato = String.format("$%,.2f", salarios.get(i));
            System.out.println("El salario del empleado del departamento " + (i + 1) + " es: " + salarioFormato);
        }

    }
}
