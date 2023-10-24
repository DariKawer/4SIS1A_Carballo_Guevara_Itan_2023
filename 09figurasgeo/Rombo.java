public class Rombo extends Calculo {
    private double area, perimetro;

    public Rombo() {
    }

    public Rombo(double diagonalm, double diagonaln, int lado) {
        super(diagonalm, diagonaln, lado);
    }

    public void mostrarPerimetro() {
        try {
            if (getLado() < 0 || getDiagonalM() < 0 || getDiagonalN() < 0) {
                throw new IllegalArgumentException("El lado, las diagonales M y N del rombo no pueden ser negativos");
            }
            perimetro = Math.pow(getLado(), 4);
            System.out.println("El perímetro del rombo es: " + perimetro);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarArea() {
        try {
            if (getDiagonalM() < 0 || getDiagonalN() < 0) {
                throw new IllegalArgumentException("Las diagonales M y N del rombo no pueden ser negativas");
            }
            area = (getDiagonalM() * getDiagonalN()) / 2;
            System.out.println("El área del rombo es: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
