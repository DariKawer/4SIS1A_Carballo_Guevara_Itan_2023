public class Cliente3 {

    private String name;
    private String NIP;
    private int saldo;
    private String numerocuenta1;
    private String numerocuenta2;

    public Cliente3() {
    }

    public Cliente3(String name, String numerocuenta1, String NIP, String numerocuenta2, int saldo) {
        super();
        this.name = name;
        this.numerocuenta1 = numerocuenta1;
        this.NIP = NIP;
        this.numerocuenta2 = numerocuenta2;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumerocuenta1() {
        return numerocuenta1;
    }

    public void setNumerocuenta1(String numerocuenta1) {
        this.numerocuenta1 = numerocuenta1;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNumerocuenta2() {
        return numerocuenta2;
    }

    public void setNumerocuenta2(String numerocuenta2) {
        this.numerocuenta2 = numerocuenta2;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
