
public class Cliente4 {

    private String name;
    private int[] carrocompras;
    private String numerocuenta;

    public Cliente4() {

    }

    public Cliente4(String name, int[] carrocompras, String numerocuenta) {
        super();
        this.name = name;
        this.carrocompras = carrocompras;
        this.numerocuenta = numerocuenta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getCarrocompras() {
        return carrocompras;
    }

    public void setCarrocompras(int[] carrocompras) {
        this.carrocompras = carrocompras;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

}
