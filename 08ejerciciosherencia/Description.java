public class Description {

    private String nombre, raza, alimento;
    private int edad;

    public Description(){
    }
    
    public Description(String nombre, String raza, String alimento, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getAlimento(){
        return alimento;
    }

    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}