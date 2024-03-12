package ejercicios;

import java.util.Scanner;

public class C4_Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float horasTrabajadas, valorHora, salario;
        String nombre, salarioFormato;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextFloat();

        System.out.print("Ingrese el valor de la hora de trabajo: ");
        valorHora = entrada.nextFloat();

        if (horasTrabajadas > 40) {
            if (horasTrabajadas - 40 <= 8) {
                salario = (40 * valorHora) + ((horasTrabajadas - 40) * (valorHora * 2));
            } else {
                salario = (40 * valorHora) + (8 * (valorHora * 2)) + ((horasTrabajadas - 48) * (valorHora * 3));
            }
        } else {
            salario = horasTrabajadas * valorHora;
        }
        System.out.println("--------------------------------------");

        salarioFormato = String.format("$%,.2f", salario);
        System.out.println("El salario de " + nombre + " es: " + salarioFormato);
    }
}
