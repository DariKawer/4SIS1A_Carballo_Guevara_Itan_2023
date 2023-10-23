public class Hamster extends Description {
    private String comportamiento;

    public Hamster() {
    }

    public Hamster(String nombre, String raza, String alimento, int edad, String comportamiento) {
        super(nombre, raza, alimento, edad);
        this.comportamiento = comportamiento;
    }

    public void setComporamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void mostrarHamsters() {
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
                + "La raza del hamster es: " + getRaza() + "\n"
                + "Se alimenta de: " + getAlimento() + "\n"
                + "El hamster tiene la edad de: " + getEdad() + " años \n"
                + "Comportamiento: " + comportamiento);
    }

}