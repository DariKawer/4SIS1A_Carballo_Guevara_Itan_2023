import java.util.Scanner;

public class Figuras {
    double lado, altura, area, perimetro, base, lado1, lado2;
    int opcion;
    char letra;

    Scanner entrada = new Scanner(System.in);

    public void menu() {
        //vamos hacer un programa para calcular area y perimetro de las figuras
        do{
            System.out.println("=======================================================");
            System.out.println("Bienvenido al programa de calculo de areas y perimetros");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Rectangulo");
            System.out.println("3.- Triangulo");
            System.out.println("4.- Salir");
            opcion = entrada.nextInt();
            System.out.println("======================================================");

            switch(opcion) {
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
                    System.out.println("Chaos");
                    System.exit(0);
                break;

                default:
                    System.out.println("Elegi la opcion correcta papu");
                break;
            }
            System.out.println("==============================================");
            System.out.println("Deseas repetir el programa digita (S/N)");
            letra = entrada.next().charAt(0);
        }while(letra == 'S' || letra == 's');
    }

    public void calcularCuadrado() {
        try{
            System.out.println("Ingresa el valor del lado del cuadrado");
            
            lado = entrada.nextDouble();
            perimetro = lado*4;
            area = lado*lado;
            System.out.println("======================================================");
            System.out.println("El perimetro es de: " + perimetro + " El area es de: " + area);
        }catch(Exception e){
            //manejar el error
            System.out.println("======================================================");
            System.out.println("Ingresa solo numeros");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularRectangulo() {
        try {
            System.out.println("Ingresa el valor de la base del rectangulo");
            base = entrada.nextDouble();

            System.out.println("Ingrsese el valor de la altura del rectangulo");
            altura = entrada.nextDouble();

            perimetro = 2 * (base + altura);
            area = base * altura;
            
            System.out.println("======================================================");
            System.out.println("El perimetro es de: " + perimetro + " El area es de: " + area);
        }catch(Exception e){
            System.out.println("======================================================");
            System.out.println("Ingrese solo numeros");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularTriangulo() {
        try {
            System.out.println("Ingresa el valor de un lado del triangulo");
            lado = entrada.nextDouble();

            System.out.println("Ingrsese el valor del segundo lado del triangulo");
            lado1 = entrada.nextDouble();

            System.out.println("Ingrese el valor del tercer lado del triangulo");
            lado2 = entrada.nextDouble();

            perimetro = lado + lado1 +lado2;
            area = 0.5 * lado * lado;
            
            System.out.println("======================================================");
            System.out.println("El perimetro es de: " + perimetro + " El area es de: " + area);
        }catch(Exception e){
            System.out.println("======================================================");
            System.out.println("Ingrese solo numeros");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Figuras obj = new Figuras();
        obj.menu();
    }
    
}