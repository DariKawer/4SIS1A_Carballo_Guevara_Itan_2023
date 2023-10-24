public class Circulo extends Calculo {
    private double area, perimetro;

    public Circulo() {
    }

    public Circulo(double radio) {
        super(radio);
    }

    /*public void mostrarCirculo() {
        System.out.println("El radio del Circulo es: " + getRadio());
    }*/

    public void mostrarPerimetro() {
        try {
            if (getRadio() < 0) {
                throw new IllegalArgumentException("El radio del círculo no puede ser negativo");
            }
            perimetro = 2 * Math.PI * getRadio();
            System.out.println("El perímetro del círculo es: " + perimetro);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarArea() {
        try {
            if (getRadio() < 0) {
                throw new IllegalArgumentException("El radio del círculo no puede ser negativo");
            }
            area = Math.PI * Math.pow(getRadio(), 2);
            System.out.println("El área del círculo es: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
