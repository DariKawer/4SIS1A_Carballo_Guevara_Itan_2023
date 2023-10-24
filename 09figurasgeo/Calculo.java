public class Calculo {
    private double base, altura, radio, diagonalm, diagonaln;
    private int lado;

    public Calculo() {
    }

    //RECTANGULO
    public Calculo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //CIRCULO
    public Calculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //TRIANGULO
    public Calculo(int lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;

    }

    //ROMBO
    public Calculo(double diagonalm, double diagonaln, int lado) {
        this.diagonalm = diagonalm;
        this.diagonaln = diagonaln;
        this.lado = lado;
    }

    public double getDiagonalM() {
        return diagonalm;
    }

    public void setDiagonalM(double diagonalm) {
        this.diagonalm = diagonalm;
    }

    public double getDiagonalN() {
        return diagonaln;
    }

    public void setDiagonalN(double diagonaln) {
        this.diagonaln = diagonaln;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
