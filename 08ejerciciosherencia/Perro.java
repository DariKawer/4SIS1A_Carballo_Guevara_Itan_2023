public class Perro extends Description {
    private String pelaje;

    public Perro() {
    }

    public Perro(String nombre, String raza, String alimento, int edad, String pelaje) {
        super(nombre, raza, alimento, edad);
        this.pelaje = pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void mostrarPerros() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
                + "La raza del perro es: " + getRaza() + "\n"
                + "Se alimenta de: " + getAlimento() + "\n"
                + "El perrito tiene la edad de: " + getEdad() + " años \n"
                + "Tipo de pelaje: " + pelaje);
    }

}