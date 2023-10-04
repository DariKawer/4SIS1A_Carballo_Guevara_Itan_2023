import java.util.*;

public class Entradachar {
    public static void main(String[] args) {
        char letra;
        System.out.print("Ingresa una palabra: ");
        
        @SuppressWarnings("resource")//ayuda a ignorar la advertencia por una extension q tengo XDDD
        Scanner entrada = new Scanner(System.in);

        letra = entrada.next().charAt(0);
        System.out.println("La primer letra de tu palabra es " + letra);
    }
}