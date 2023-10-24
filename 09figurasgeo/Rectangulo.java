public class Rectangulo extends Calculo {
    private double area, perimetro;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    /*public void mostrarRectangulo() {
        System.out.println("La base del rectangulo es: " + getBase() + "\n"
                        + "La altura del rectangulo es: " + getAltura());
    }*/

    public void mostrarPerimetro() {
        try {
            if (getBase() < 0 || getAltura() < 0) {
                throw new IllegalArgumentException("La base y la altura del rectángulo no pueden ser negativas");
            }
            perimetro = 2 * (getBase() + getAltura());
            System.out.println("El perímetro del rectángulo es: " + perimetro);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarArea() {
        try {
            if (getBase() < 0 || getAltura() < 0) {
                throw new IllegalArgumentException("La base y la altura del rectángulo no pueden ser negativas");
            }
            area = getBase() * getAltura();
            System.out.println("El área del rectángulo es: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
