import java.util.concurrent.ThreadLocalRandom;

public class Cajero {
    private String name;

    public Cajero() {

    }

    public Cajero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // cliente1
    public void procesarCliente1(Cliente1 cliente1, long timeStamp) {
        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name);
        System.out.println("El cliente: " + cliente1.getName());
        System.out.println("Saldo disponible: $" + cliente1.getSaldo() + " pesos");
        System.out.println("Comienza en el tiempo : " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
        System.out.println("=============================================");

        this.esperarXsegundos(8000);
        int deposito = ThreadLocalRandom.current().nextInt(2000, 10001);
        System.out.println(cliente1.getName() + " ha depositado " + deposito + " pesos");
        cliente1.setSaldo(cliente1.getSaldo() + deposito);
        System.out.println("Saldo: $" + cliente1.getSaldo() + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(8000);

        int luz = ThreadLocalRandom.current().nextInt(200, 501);
        int agua = ThreadLocalRandom.current().nextInt(300, 801);
        System.out.println(
                cliente1.getName() + " con el dinero depositado paga la Luz ( $" + luz + " ) y Agua ( $" + agua + " )");
        cliente1.setSaldo(cliente1.getSaldo() - (luz + agua));
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(10000);

        System.out
                .println(cliente1.getName() + " consulta saldo disponible \nSaldo disponible: " + cliente1.getSaldo()
                        + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(7000);

        int montoRetiro = ThreadLocalRandom.current().nextInt(2000, 5001);
        System.out.println(cliente1.getName() + " decide extraer " + montoRetiro + " y su saldo es de "
                + (cliente1.getSaldo() - montoRetiro) + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(8000);

        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name + " ha terminado de atender a " + cliente1.getName()
                + "\nEn el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
    }

    // cliente2
    public void procesarCliente2(Cliente2 cliente2, long timeStamp) {
        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name);
        System.out.println("El cliente: " + cliente2.getName());
        System.out.println("Saldo disponible: $" + cliente2.getSaldo() + " pesos");
        System.out.println("Comienza en el tiempo : " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
        System.out.println("=============================================");

        this.esperarXsegundos(8000);
        int recarga = ThreadLocalRandom.current().nextInt(10, 101);
        System.out.println(cliente2.getName() + " ha recargado " + recarga + " pesos al celular " + cliente2.getCel());
        cliente2.setSaldo(cliente2.getSaldo() - recarga);
        System.out.println("Saldo: $" + cliente2.getSaldo() + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(10000);

        String[] consulta = {
                "no hay movimientos recientes.",
                "han habido movimientos recientes.",
        };
        int consrandom = ThreadLocalRandom.current().nextInt(consulta.length);
        String movimientos = consulta[consrandom];
        System.out.println(cliente2.getName() + " ha consultado movimientos y " + movimientos);
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(5000);

        int mover = ThreadLocalRandom.current().nextInt(200, 2001);
        System.out.println(
                cliente2.getName() + " ha decidido mover $" + mover + " pesos a su cuenta "
                        + cliente2.getNumerocuenta1());
        cliente2.setSaldo(cliente2.getSaldo() - mover);
        System.out.println("Saldo: $" + cliente2.getSaldo() + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(8000);

        int enviar = ThreadLocalRandom.current().nextInt(500, 3001);
        System.out.println(cliente2.getName() + " ha enviado $" + enviar + " pesos a su amigo cuya cuenta es "
                + cliente2.getNumerocuenta2());
        cliente2.setSaldo(cliente2.getSaldo() - enviar);
        System.out.println("Saldo: $" + cliente2.getSaldo() + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(9000);

        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name + " ha terminado de atender a " + cliente2.getName()
                + "\nEn el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
    }

    // cliente3
    public void procesarCliente3(Cliente3 cliente3, long timeStamp) {
        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name);
        System.out.println("El cliente: " + cliente3.getName());
        System.out.println("Saldo disponible: $" + cliente3.getSaldo() + " pesos");
        System.out.println("Comienza en el tiempo : " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
        System.out.println("=============================================");

        this.esperarXsegundos(8000);
        System.out.println(
                cliente3.getName() + " ha decidido cerrar la cuenta con numero " + cliente3.getNumerocuenta1());
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(9000);

        System.out.println(
                cliente3.getName() + " ha decidido cambiar NIP (" + cliente3.getNIP() + ") de la cuenta con numero "
                        + cliente3.getNumerocuenta2());
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(9000);

        int montoRetiro = ThreadLocalRandom.current().nextInt(200, 501);
        System.out.println(cliente3.getName() + " ha decidido pedir prestado $" + montoRetiro + " pesos al OXXO");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(8000);

        System.out.println(cliente3.getName() + " ha decidido comprar Tarjeta de XBOX con la cuenta con numero "
                + cliente3.getNumerocuenta2());
        cliente3.setSaldo(cliente3.getSaldo() - 300);
        System.out.println("Saldo: $" + cliente3.getSaldo() + " pesos");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(8000);

        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name + " ha terminado de atender a " + cliente3.getName()
                + "\nEn el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
    }

    // cliente4
    public void procesarCliente4(Cliente4 cliente4, long timeStamp) {
        System.out.println("=============================================");
        System.out.println("La cajera: " + this.name);
        System.out.println("El cliente: " + cliente4.getName());
        System.out.println("Comienza en el tiempo : " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
        System.out.println("=============================================");

        for (int i = 0; i < cliente4.getCarrocompras().length; i++) {
            this.esperarXsegundos(cliente4.getCarrocompras()[i] * 1000);
            System.out.println("Procesando el producto: " + (i + 1) + " Tiempo: ( "
                    + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos.");
        }
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(3000);

        int montoRetiro = ThreadLocalRandom.current().nextInt(200, 601);
        int dolares = montoRetiro * 17;
        System.out.println(cliente4.getName() + " decide extraer $" + montoRetiro + " dolares");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(5000);

        int luz = ThreadLocalRandom.current().nextInt(20, 61);
        int luzdolar = luz * 17;
        System.out.println(cliente4.getName() + " ha decidido pagar $" + luzdolar
                + " de la luz con los dolares y ahora tiene $" + (dolares - luzdolar) + " dolares");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(6000);

        int enviar = ThreadLocalRandom.current().nextInt(50, 101);
        System.out.println(cliente4.getName() + " ha enviado $" + enviar + " dolares a su amigo cuya cuenta es "
                + cliente4.getNumerocuenta());
        System.out.println("Dolares sobrados: $" + dolares + " dolares");
        System.out.println(
                " Tiempo: ( " + (System.currentTimeMillis() - timeStamp) / 1000 + " ) segundos, procesando...");
        this.esperarXsegundos(7000);

        System.out.println("========================================");
        System.out.println("La cajera: " + this.name + " ha terminado de atender a " + cliente4.getName()
                + "\nEn el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos.");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
