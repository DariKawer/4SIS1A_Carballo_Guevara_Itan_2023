import java.util.*;

public class Figuras {
    double lado, altura, area, perimetro, base, ladoA, ladoB, ladoC;
    int opcion;
    char letra;

    Scanner entrada = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("=======================================================");
            System.out.println("Elija una opción deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Rectángulo");
            System.out.println("3.- Triángulo");
            System.out.println("4.- Salir");
            opcion = entrada.nextInt();
            System.out.println("======================================================");

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;

                case 2:
                    calcularRectangulo();
                    break;

                case 3:
                    calcularTriangulo();
                    break;

                case 4:
                    System.out.println("chau papu");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Elige una opcion pe");
                    break;
            }

            System.out.println("======================================================");
            System.out.println("¿Deseas repetir el programa? (S/N)");
            letra = entrada.next().charAt(0);
        } while (letra == 'S' || letra == 's');
    }

    public void calcularCuadrado() {
        System.out.println("Ingresa el valor del lado del cuadrado");
        lado = entrada.nextDouble();
        perimetro = lado * 4;
        area = lado * lado;
        System.out.println("======================================================");
        System.out.println("El perímetro es de: " + perimetro + " El área es de: " + area);
    }

    public void calcularRectangulo() {
        System.out.println("Ingresa el valor de la base del rectángulo");
        base = entrada.nextDouble();

        System.out.println("Ingresa el valor de la altura del rectángulo");
        altura = entrada.nextDouble();

        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println("======================================================");
        System.out.println("El perímetro es de: " + perimetro + " El área es de: " + area);
    }

    public void calcularTriangulo() {
        System.out.println("Ingresa el valor del primer lado del triángulo");
        ladoA = entrada.nextDouble();

        System.out.println("Ingresa el valor del segundo lado del triángulo");
        ladoB = entrada.nextDouble();

        System.out.println("Ingresa el valor del tercer lado del triángulo");
        ladoC = entrada.nextDouble();

        perimetro = ladoA + ladoB + ladoC;
        area = 0.5 * ladoA * ladoB;

        System.out.println("======================================================");
        System.out.println("El perímetro es de: " + perimetro + " El área es de: " + area);
    }

    public static void main(String[] args) {
        Figuras obj = new Figuras();
        obj.menu();
    }
}
