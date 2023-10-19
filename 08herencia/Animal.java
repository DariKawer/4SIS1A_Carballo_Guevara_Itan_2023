
//vamos a crear una tienda de mascotas de adopcion

public class Animal {
    
    /*
     * Principio de encapsulamiento 
     * es podeer restringir el acceso a los datos, vamos a poder agrupar en una clase 
     * el acceso a los diferentes atributos y metodos u objetos de clase, para que n
     * puedan ser modificados desde otro lugar
    */

    //defdinir las variables
    private String nombre, raza, tipo_alimento;
    private int edad;

    //sedebe crea el constructor, el constructor nos srive para poder declarar
    //las existencias de una clase, para poder inicalizar las variables, para crear
    //instancias de una clase

    public Animal(){
        //este es un constructor por defecto
    }
    
    //cuando existe una construccion del objeto, de acuerdo a las necesidades
    //por parte usuario necesita utilizar la sobrecsarga de los metodos
    //en este cargo la sobrecarga del constructor

    //metodo para restringir la mascota
    //los parametros del registro
    public Animal(String nombre, String raza, String tipo_alimento, int edad){
        //ero como son privados los atributos, debemos de tenrer una forma de acceso
        //la palabra reservada this, nos sirve para poder acceder a los atributos
        //privados
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    //para poder modificar los valores de la asginacion, es necesario utilizar
    //los metodos getter and setter
    //get --- obtener --- recibir
    //set --- asignar --- enviar

    //metodos get y set por cada vriable
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

    public String getTipo_Alimento(){
        return tipo_alimento;
    }

    public void setTipo_Alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //para poder aplicar la herencia a una clase, se utiliza la palabra reservada
//extends


public class Michi extends Animal {

    //como puede heredar todas las caracteristas de la clase padre

    private int num_vidas;

    public Michi(){

    }

    //aplico la sobrecarga 
    public Michi(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        //y para poder acceder a la clase padre se utiliza la palabra reservada super
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    
    //get y set
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public int getNum_vidas(){
        return num_vidas;
    }

    public void mostrarMichi(){
        System.out.println("El nombre del michi es : " + getNombre() + "\n"
                        + "La raza del michi es : " + getRaza() + "\n"
                        + "Se alimenta de : " + getTipo_Alimento() + "\n"
                        + "El michi tiene la edad de : " + getEdad() + "\n"
                        + "Las vidas del michi son : " + num_vidas + "\n");
    }
    
}
}