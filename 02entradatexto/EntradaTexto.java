import java.util.Scanner;

public class EntradaTexto {
    
    public static void main(String[] args) {
        String nombre, op;
        int edad, nacimiento, mes, mesc;
        

        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre papu:");
        nombre = entrada.next();

        System.out.println("Ingresa tu edad papu:");
        edad = entrada.nextInt();

        System.out.println("Dime el numero de tu mes de cumpleaños papu: (1/12)");
        mes = entrada.nextInt();

        if (mes >= 12 || mes < 0) {
            System.out.println("No es un mes correcto");
        } else {
            System.out.println("Ya cumpliste años papu? (S/N)");
            op = entrada.next();

            if (op == "S" || op == "s" || op == "Si" || op == "si") {
                nacimiento = 2023 - edad;
                mesc = 12 - mes;
                System.out.println("============================================");
                System.out.println("Tu nombre es " + nombre + " bienvenido papugod");
                System.out.println("Te faltan: " + mesc + " meses para cumplir " + (edad+1));
                System.out.println("Naciste el año: " + nacimiento);
                System.out.println("============================================");
            } else {
                nacimiento = 2023 - edad - 1;
                mesc = 12 - mes;
                System.out.println("============================================");
                System.out.println("Tu nombre es " + nombre + " bienvenido papugod");
                System.out.println("Te faltan: " + mesc + " meses para cumplir " + (edad+1));
                System.out.println("Naciste el año: " + nacimiento);
                System.out.println("============================================");
            }
        }


    }
}
