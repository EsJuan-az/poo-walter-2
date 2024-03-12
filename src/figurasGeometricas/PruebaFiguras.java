package figurasGeometricas;

/**
 * Esta clase prueba diferentes acciones realizadas en diversas figuras geométricas.
 * @version 1.2/2020
 */
public class PruebaFiguras {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado,
     * un triángulo rectángulo, un rombo y un trapecio. Para cada una de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String args[]) {
        FiguraGeometrica figura1 = new Circulo(2);
        FiguraGeometrica figura2 = new Rectangulo(1, 2);
        FiguraGeometrica figura3 = new Cuadrado(3);
        FiguraGeometrica figura4 = new TrianguloRectangulo(3, 5);
        FiguraGeometrica figura5 = new Rombo(6, 4);
        FiguraGeometrica figura6 = new Trapecio(8, 4, 5);

        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();

        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();

        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        System.out.println();

        System.out.println("El área del rombo es = " + figura5.calcularArea());
        System.out.println("El perímetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println();

        System.out.println("El área del trapecio es = " + figura6.calcularArea());
        System.out.println("El perímetro del trapecio es = " + figura6.calcularPerimetro());
    }
}