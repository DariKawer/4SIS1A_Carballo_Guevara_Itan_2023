import java.util.Scanner;

public class Figuras {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int op, lado;
        double base, altura;
        char letra;

        do {
            System.out.println("==========================================");
            System.out.println("Elije la figura: ");
            System.out.println("1. Rectangulo");
            System.out.println("2. Circulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Rombo");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("========================");
                    System.out.println("Ingrese base: ");
                    base = entrada.nextDouble();
                    System.out.println("Ingrese altura: ");
                    altura = entrada.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("========================");
                    rectangulo.mostrarPerimetro();
                    System.out.println("========================");
                    rectangulo.mostrarArea();
                break;

                case 2:
                    System.out.println("========================");
                    System.out.println("Ingrese radio: ");
                    double radio = entrada.nextDouble();

                    Circulo circulo = new Circulo(radio);
                    System.out.println("========================");
                    circulo.mostrarPerimetro();
                    System.out.println("========================");
                    circulo.mostrarArea();

                break;

                case 3:
                    System.out.println("========================");
                    System.out.println("Ingrese base: ");
                    base = entrada.nextDouble();
                    System.out.println("Ingrese altura: ");
                    altura = entrada.nextDouble();
                    System.out.println("Ingrese lado: ");
                    lado = entrada.nextInt();

                    Triangulo triangulo = new Triangulo(lado, base, altura);
                    System.out.println("========================");
                    triangulo.mostrarPerimetro();
                    System.out.println("========================");
                    triangulo.mostrarArea();
                break;

                case 4:
                    System.out.println("========================");
                    System.out.println("Ingrese Diagonal Mayor: ");
                    double diagonalm = entrada.nextDouble();
                    System.out.println("Ingrese Diagonal Menor: ");
                    double diagonaln = entrada.nextDouble();
                    System.out.println("Ingrese lado: ");
                    lado = entrada.nextInt();

                    Rombo rombo = new Rombo(diagonalm, diagonaln, lado);
                    System.out.println("========================");
                    rombo.mostrarPerimetro();
                    System.out.println("========================");
                    rombo.mostrarArea();
                break;

                default:
                    System.out.println("Escoge la opcion correcta v:");
                break;
            }

            System.out.println("======================================");
            System.out.println("Deseas repetir el programa principal papu? (S/N)");
            letra = entrada.next().charAt(0);
        } while (letra == 'S' || letra == 's');
        entrada.close();
    }
}
/*
     * Deberán de realizar un programa utilizando 
     * herencia para el calculo de figuras geométricas
     * 
     * El programa debe de contar con rectángulo, circulo, 
     * triangulo, rombo, y deberán de calcular el perímetro 
     * y área, deben de integrar herencia, encapsulamiento, 
     * manejo de excepciones
     */
