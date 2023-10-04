import java.util.*;

public class EntradaTexto {
    public static void main(String[] args) {
        String nombre;
        

        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre papu:");
        nombre = entrada.next();

        System.out.println("Tu nombre es " + nombre + ", bienvenido papugod");


    }
}
