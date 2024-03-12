package ejercicios;
import java.util.Scanner;
public class C4_Ejercicio22 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = console.next();
        System.out.println("Ingrese el salario básico por hora: ");
        float salario_hora = console.nextFloat();
        System.out.println("Ingrese el número de horas trabajadas: ");
        int horas = console.nextInt();

        float salarioCompleto = horas * salario_hora;
        StringBuilder sb = new StringBuilder();
        sb.append("EMPLEADO: ").append(nombre);
        if(salarioCompleto > 450000){
            sb.append("\nSU SALARIO ES DE: $").append(salarioCompleto)
                    .append(".");
        }
        System.out.println(sb);
    }
}
