public class Huron extends Description {
    private String caza;

    public Huron() {
    }

    public Huron(String nombre, String raza, String alimento, int edad, String caza) {
        super(nombre, raza, alimento, edad);
        this.caza = caza;
    }

    public void setCaza(String caza) {
        this.caza = caza;
    }

    public String getCaza() {
        return caza;
    }

    public void mostrarHurones() {
        System.out.println("El nombre del huron es: " + getNombre() + "\n"
                + "La raza del huron es: " + getRaza() + "\n"
                + "Se alimenta de: " + getAlimento() + "\n"
                + "El huron tiene la edad de: " + getEdad() + " años \n"
                + "Caza: " + caza);
    }

}