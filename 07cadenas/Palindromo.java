import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la oración que deseas verificar como palíndromo: ");
        String frase = scanner.nextLine();
        scanner.close();

        boolean esPalindromo = true;
        int longitud = frase.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (frase.charAt(i) != frase.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println(frase + " es un PALÍNDROMO :-)");
        } else {
            System.out.println(frase + " NO es un PALÍNDROMO :-(");
        }
    }
}
