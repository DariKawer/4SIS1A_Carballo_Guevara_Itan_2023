public class Cliente1 {

    private String name;
    private int saldo;

    public Cliente1() {

    }

    public Cliente1(String name, int saldo) {
        super();
        this.name = name;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
