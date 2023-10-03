import java.util.Scanner;

public class Ejercicios{
    Scanner entrada = new Scanner(System.in);
    char op;

    public void menu(){
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
            System.out.println("Gracias por jugar :3");
                break;
        }
    }

    public void Ejercicio1(){ //Calculadora
        //se le llaman metodos vacios porque no poseen argumentos y no son metodos 
        //o funciones que necesiten una entrada o salida de algun tipo de dato

        //calculadora
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

    public void Ejercicio2(){ //Convertidor de unidades
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

    public void Ejercicio3(){ //Cuadro mágico
        int n;
        System.out.println("Ingrese el valor de n: ");
               n = entrada.nextInt();
               for (int i = 1; i <= n; i++) { //Recorre cada cada columna
                  for (int j = 1; j <= n; j++) { //Recorre cada fila
                     if (i == 1 || i == n) { //Sólo toma las filas externas
                        System.out.print("*");
                     } else if (j == 1 || j == n) { //Sólo toma las columnas externas
                        System.out.print("*");
                     } else {
                        System.out.print(" ");      
                     }
                  }
                  System.out.println("");
               }
    }

    public void Ejercicio4(){
        int n;
        System.out.println("Ingrese el número de filas que desea imprimir: ");
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 == 0) {
                if (j == 1) {
                    System.out.print(" ");
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
                } else {
                System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Ejercicios obj = new Ejercicios();
        obj.menu();
    }
}