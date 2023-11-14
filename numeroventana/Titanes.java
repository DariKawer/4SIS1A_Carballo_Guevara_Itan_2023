public class Titanes {
    
    private String pedrito;
    private String titan;
    
    public Titanes(){
    
    }

    public Titanes(String pedrito) {
        this.pedrito = pedrito;
    }

    public String getpedrito() {
        return pedrito;
    }

    public void setpedrito(String pedrito) {
        this.pedrito = pedrito;
    }

    //vamos a crear los metodos de la calculadora
    public String titan(){
        //System.out.println(num1);
        //System.out.println(num2);
        pedrito = "hola soy titan uno";
        titan = pedrito;
        return (titan);
    }
    
    public static void main(String[] args) {
        Titanes titan = new Titanes();
        titan.titan();
    }
}
