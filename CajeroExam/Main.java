import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cajero cajero1 = new Cajero("Dora");
        Cajero cajero2 = new Cajero("Maria");

        // incializamos el tiempo
        long initialTime = System.currentTimeMillis();

        int saldo = ThreadLocalRandom.current().nextInt(8000, 15001);

        // Cliente1(String name, int saldo)
        System.out.println("========================================");
        System.out.println("Ingrese nombre Cliente 1:");
        String namecliente1 = entrada.next();

        Cliente1 cliente1 = new Cliente1(namecliente1, saldo);
        cajero1.procesarCliente1(cliente1, initialTime);

        // Cliente2(String name, int celular, int saldo, int numerocuenta1, int
        // numerocuenta2)
        System.out.println("========================================");
        System.out.println("Ingrese nombre Cliente 2:");
        String namecliente2 = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese celular Cliente 2:");
        String celular = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese numero de Cuenta 1:");
        String numerocuenta1 = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese numero de cuenta 2:");
        String numerocuenta2 = entrada.next();
        entrada.nextLine();

        Cliente2 cliente2 = new Cliente2(namecliente2, celular, saldo, numerocuenta1, numerocuenta2);
        cajero2.procesarCliente2(cliente2, initialTime);

        // Cliente3(String name, String numerocuenta1, String NIP, String numerocuenta2,
        // int saldo)
        System.out.println("========================================");
        System.out.println("Ingrese nombre Cliente 3:");
        String namecliente3 = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese numero de cuenta 1:");
        String numerocuenta01 = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese NIP:");
        String NIP = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese numero de cuenta 2:");
        String numerocuenta02 = entrada.next();
        entrada.nextLine();

        Cliente3 cliente3 = new Cliente3(namecliente3, numerocuenta01, NIP, numerocuenta02, saldo);
        cajero1.procesarCliente3(cliente3, initialTime);

        // Cliente4(String name, int[] carrocompras, String numerocuenta)
        System.out.println("========================================");
        System.out.println("Ingrese nombre Cliente 4:");
        String namecliente4 = entrada.next();
        entrada.nextLine();
        System.out.println("========================================");
        System.out.println("Ingrese numero de cuenta:");
        String numerocuenta = entrada.next();
        entrada.nextLine();

        Cliente4 cliente4 = new Cliente4(namecliente4, new int[] { 2, 5, 3, 5, 6 }, numerocuenta);
        cajero2.procesarCliente4(cliente4, initialTime);

    }
}
