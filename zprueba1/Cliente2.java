public class Cliente2 {

    private String name;
    private String celular;
    private int saldo;
    private String numerocuenta1;
    private String numerocuenta2;

    public Cliente2() {

    }

    public Cliente2(String name, String celular, int saldo, String numerocuenta1, String numerocuenta2) {
        super();
        this.name = name;
        this.celular = celular;
        this.saldo = saldo;
        this.numerocuenta1 = numerocuenta1;
        this.numerocuenta2 = numerocuenta2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCel() {
        return celular;
    }

    public void setCel(String celular) {
        this.celular = celular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNumerocuenta1() {
        return numerocuenta1;
    }

    public void setNumerocuenta1(String numerocuenta1) {
        this.numerocuenta1 = numerocuenta1;
    }

    public String getNumerocuenta2() {
        return numerocuenta2;
    }

    public void setNumerocuenta2(String numerocuenta2) {
        this.numerocuenta2 = numerocuenta2;
    }

}
