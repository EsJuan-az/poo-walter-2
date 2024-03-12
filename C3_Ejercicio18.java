package actividad.pkg2;
import java.util.Scanner;

public class C3_Ejercicio18 {
        
    public static void main(String[] args) {
        double codem, horasm, valorh, retencionf, sneto, sbruto; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del empleado: ");
        codem = entrada.nextDouble();
        System.out.println("Ingrese el nombre del empleado: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        horasm = entrada.nextDouble();
        System.out.println("Ingrese el valor por hora trabajada: ");
        valorh = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        retencionf = entrada.nextDouble();
        sbruto = horasm * valorh;
        sneto = sbruto + (sbruto*retencionf/100); 
        System.out.println("El empleado " + name + " con codigo " + codem + " tiene un salario bruto de $" + sbruto + " y un salario neto de $" + sneto);
        
    }

}
