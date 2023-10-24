public class Triangulo extends Calculo {
    private double area, perimetro;

    public Triangulo() {
    }

    public Triangulo(int lado, double base, double altura) {
        super(lado, base, altura);
    }

    /*public void mostrarTriangulo() {
        System.out.println("La base del triangulo es: " + getBase());
    }*/

    public void mostrarPerimetro() {
        try {
            if (getLado() < 0 || getBase() < 0 || getAltura() < 0) {
                throw new IllegalArgumentException("El lado, la base y la altura del triángulo no pueden ser negativos");
            }
            perimetro = Math.pow(getLado(), 3);
            System.out.println("El perímetro del triángulo es: " + perimetro);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarArea() {
        try {
            if (getBase() < 0 || getAltura() < 0) {
                throw new IllegalArgumentException("La base y la altura del triángulo no pueden ser negativas");
            }
            area = (getBase() * getAltura()) / 2;
            System.out.println("El área del triángulo es: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
