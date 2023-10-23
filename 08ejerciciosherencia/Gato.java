public class Gato extends Description {

    public Gato() {
    }

    public Gato(String nombre, String raza, String alimento, int edad) {
        super(nombre, raza, alimento, edad);
    }

    public void mostrarGatos() {
        System.out.println("El nombre del gato es: " + getNombre() + "\n"
                + "La raza del gato es: " + getRaza() + "\n"
                + "Se alimenta de: " + getAlimento() + "\n"
                + "El gato tiene la edad de: " + getEdad() + " años" );
    }

}