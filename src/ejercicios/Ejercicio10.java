package actividad.pkg2;
import java.util.Scanner;

public class Ejercicio10 { 
    
    public static void main(String[] args) {
        double ninsc, patrimonio, estrato, pmatricula; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su numero de inscripcion: ");
        ninsc = entrada.nextDouble();
        System.out.println("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Ingrese su patrimonio: ");
        patrimonio = entrada.nextDouble();
        System.out.println("Ingrese su estrato: ");
        estrato = entrada.nextDouble();
        pmatricula = 50000;
        if ((patrimonio > 2000000) && (estrato>3)){
            pmatricula = 0.03 * patrimonio + pmatricula;       
    }
        System.out.println("El estudiante con numero de inscripcion " + ninsc + " y nombre " + name + " debe pagar: $" + pmatricula);
        
    }
}

  
