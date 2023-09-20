/**Vamos a crear los 14 programas dentro de un menu de seleccion de la tarea, comprendido por:
 * 1.- Bono o descuento por edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- convertir temperaturas
 * 4.- Numero de positivos y negativos
 * 5.- Tienda
 * 6.- Area y Perimetro
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujitos
 * 10.- Figura hueca
 * 11.- Patrones
 * 12.- Diamante
 * 13.- Calculadora
 * 14.- Salir
 */
import java.util.Scanner;

public class EstructurasControl {
    public static void main (String[] args){
        /*
         * Para hacer una instancia:
         * 1-Identificar el tipo de objeto
         * 2-Nombrar al objeto
         * 3-crear objeto
         * 4-Ser un buen papu :v
         * se realiza para no tener valores "basura"
         */
        
        @SuppressWarnings("resource")//ayuda a ignorar la advertencia por una extension q tengo XDDD
        Scanner entrada = new Scanner(System.in); 
        //Crea una instancia del objeto de la entrada por defecto de la computadora para leer caracteres.

        /*int op, numbinario, total, catidadproducto, num1;
        float precio, resultado = 0, compra = 0;
        String binario = "";
        String nombreproducto;*/
        char letra;

        do {
            System.out.println("Escoge una de las opciones siguientes papu: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");
            System.out.println("3.- Conversiones de temperatura ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tienda ");
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujos de codigo ");
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");


            System.out.println("Deseas repetir el programa, escribe s para si");
            letra = entrada.next().charAt(0);
        } while (letra == 's' || letra == 'S');


    }
    
}