import java.util.Scanner;

public class Ejerciciosclases {
    Scanner entrada = new Scanner(System.in);
    char op;
    int total;

    public void menu() {
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("a. Calculadora");
        System.out.println("b. Conversión de unidades");
        System.out.println("c. Crear cuadro mágico");
        System.out.println("d. Desplazamiento de un cuadrito");
        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
                Ejercicio1(); //Calculadora
            break;

            case 'b':
                Ejercicio2(); //Convertidor de unidades
            break;

            case 'c':
                Ejercicio3(); //Cuadro mágico
            break;

            case 'd':
                Ejercicio4(); //Dezplazamiento de un cuadrito
            break;
        
            default:
                System.out.println("Chaos papu");
            break;
        }
    }

    public void Ejercicio1() {
        //se le llaman metodos vacios porque no poseen argumentos y no son metodos 
        //o funciones que necesiten una entrada o salida de algun tipo de dato

        double num1 = 0.00, num2, suma = 0.00, multi = 1.00, div = 1.00;
        char operacion;

        System.out.println("Selecciona la operacion que deseas realizar:");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicación");
        System.out.println("c.- División");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a': //Suma y Resta
                //vamos a sumar o restar tantos numeros como desee el usuario
                //cuando coloque 0 la operacion termina
                System.out.println("Para detener la suma o resta, ingrese el 0");
                
                do{
                    System.out.println("Escriba el numero que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    //suma = suma + num1;
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + suma);
            break;

            case 'b': //Multiplicación
                System.out.println("Para detener la multiplicacion, ingrese el 0");
                
                do{    
                    System.out.println("Escriba el numero que desee multiplicar: ");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        multi *= num1;
                        //multi = multi * num1;
                    }
                                  
                    
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + multi);
            break;

            case 'c': //División
                System.out.println("Para detener la división, ingrese el 0");
                System.out.println("Escriba el numerador: ");
                    num1 = entrada.nextDouble();
                    div = num1;
                do{    
                    System.out.println("Escriba el denominador: ");
                    num2 = entrada.nextDouble();
                    if(num2 != 0){
                        div /= num2;
                        System.out.println("div: " + div); //Imprime el resultado de cada división
                    }             
                }while(num2 != 0);
                System.out.println("El resultado de la operacion es: " + div); //Imprime el valor final de la operación
            break;

            default:
                System.out.println("opcion no valida, ayos UwU/");
            break;
        }
    }

    public void Ejercicio2() { //Convertidor de unidades
        double metros = 0.00, kg = 0.00,cm = 100, lb = 2.2046, yardas = 1.0936, millas = 0.0006, plg = 0.0254, gramos = 1000, ms, kh;
        double conversion1,conversion2;
        System.out.println("Selecciona la cantidad que deseas convertir: ");
        System.out.println("a. Metros a Centímetros y Pulgadas");
        System.out.println("b. Kilogramos a libras y  gramos");
        System.out.println("c. m/s a km/hr");
        System.out.println("d. Metros a yardas y millas");
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a': //Metros a centimetros y pulgadas
                System.out.println("Ingresa los metros que deseas transformar: ");
                metros = entrada.nextDouble();
                conversion1 = metros * cm;
                conversion2 = metros * plg;
                System.out.println(metros + " Metros = " + conversion1 + " Centímetros = " + conversion2 + " Pulgadas = ");
            break;

            case 'b': //Kg a libras y gramos
                System.out.println("Ingresa los kilogramos que deseas transformar: ");
                kg = entrada.nextDouble();
                conversion1 = kg * gramos;
                conversion2 = kg * lb;
                System.out.println(kg + " Kilogramos = " + conversion1 + " Gramos = " + conversion2 + " Libras = ");
            break;

            case 'c': //m/s a km/hr
                System.out.println("Ingrese los metros por segundo que desea convertir: ");
                ms = entrada.nextDouble();
                kh = ms * 3600 / 1000;
                System.out.println(ms + " m/s = " + kh + " km/hr");
            break;

            case 'd': //Metros a yardas y millas
                System.out.println("Ingresa los metros que deseas transformar: ");
                metros = entrada.nextDouble();
                conversion1 = metros * yardas;
                conversion2 = metros * millas;
                System.out.println(metros + " Metros = " + conversion1 + " Yardas = " + conversion2 + " millas = ");
            break;
        
            default:
                System.out.println("Opción no válida");
            break;
        }
    }

    public void Ejercicio3() { //Cuadro mágico
        System.out.println("Ingrese el total del lado: ");
        int total = entrada.nextInt();
    
        for (int i = 1; i <= total; i++) {
            for (int j = 1; j <= total; j++) {
                if (i == 1 || i == total || j == 1 || j == total) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  
                }
            }
            System.out.println();
        }
    }    

    public void Ejercicio4() { //Desplazamiento con un cuadrito magico
                System.out.println("Ingrese la cantidad a imprimir: ");
                total = entrada.nextInt();

                for (int i = 1; i <= total; i++) {
                    if (i % 2 == 1) {
                        for (int j = 1; j <= 1; j++) {
                            System.out.print("*********** ");
                        }
                    } else {
                        System.out.print(" ");
                        for (int j = 1; j <= 1; j++) {
                            System.out.print("*********** ");
                        }
                    }
                    System.out.print("\n");
                }
    }

    public static void main(String[] args) {
        Ejerciciosclases obj = new Ejerciciosclases();
        obj.menu();
    }
}