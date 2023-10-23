public class Conejo extends Description {
    private String habilidad;

    public Conejo() {
    }

    public Conejo(String nombre, String raza, String alimento, int edad, String habilidad) {
        super(nombre, raza, alimento, edad);
        this.habilidad = habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void mostrarConejos() {
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                + "La raza del conejo es: " + getRaza() + "\n"
                + "Se alimenta de: " + getAlimento() + "\n"
                + "El conejo tiene la edad de: " + getEdad() + " años \n"
                + "Habilidad: " + habilidad);
    }

}