package figurasGeometricas;

/**
 * Esta clase define objetos de tipo Rombo con un lado y una diagonal como atributos.
 */
public class Rombo implements FiguraGeometrica{
    int diagonalMayor; // Atributo que define la diagonal mayor de un rombo
    int diagonalMenor; // Atributo que define la diagonal menor de un rombo

    /**
     * Constructor de la clase Rombo
     * @param diagonalMayor Parámetro que define la diagonal mayor de un rombo
     * @param diagonalMenor Parámetro que define la diagonal menor de un rombo
     */

    public Rombo(int diagonalMayor, int diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    /**
     * Método que calcula y devuelve el área de un rombo como la
     * multiplicación de las diagonales dividido entre 2
     * @return Área de un rombo
     */

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    /**
     * Método que calcula y devuelve el perímetro de un rombo
     * como 2 veces la raíz cuadrada de la suma de los cuadrados de las diagonales
     * @return Perímetro de un rombo
     */

    @Override
    public double calcularPerimetro() {
        return 2 * Math.sqrt(Math.pow(diagonalMayor, 2) + Math.pow(diagonalMenor, 2));
    }
}
