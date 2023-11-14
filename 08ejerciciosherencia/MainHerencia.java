import java.util.Scanner;

public class MainHerencia {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int op;

        //GATTTTTTTOS
        //Nombre, Raza, Alimento, Edad
        Gato gatito1 = new Gato("Whiskers", "Siamese", "Para gatos adultos", 4);
        Gato gatito2 = new Gato("Luna", "Persa", "Gourmet", 2);
        Gato gatito3 = new Gato("Simba", "Maine Coon", "De alta calidad", 3);

        //PERRRRRRROS
        //Nombre, Raza, Alimento, Edad, Pelaje
        Perro perrito1 = new Perro("Max", "Labrador Retriever", "Croquetas premium", 3, "Corto amarillo");
        Perro perrito2 = new Perro("Luna", "Pastor Alemán", "Comida casera", 5, "Largo negro y marrón");
        Perro perrito3 = new Perro("Coco", "Pomerania", "Comida seca especial para razas pequeñas", 1, "Largo naranja");

        //HAMMMMMSTER
        //Nombre, Raza, Alimento, Edad, Comportamiento
        Hamster hamstersito1 = new Hamster("Nibbles", "Sirio", "Semillas y pellets", 1, "Activo y juguetón");
        Hamster hamstersito2 = new Hamster("Whiskers", "Enano Ruso", "Pellets de hámster y frutas frescas", 2, "Tímido y nocturno");
        Hamster hamstersito3 = new Hamster("Peanut", "Roborovski", "Mezcla de semillas y verduras", 1, "Rápido y curioso");

        //CONEJJJJJOS
        //Nombre, Raza, Alimento, Edad, Salto
        Conejo conejito1 = new Conejo("Cottontail", "Holandés", "Heno y verduras frescas", 2, "Ágil y saltarín");
        Conejo conejito2 = new Conejo("Flopsy", "Lop Inglés", "Pellets de conejo y hortalizas", 3, "Adora saltar por el jardín");
        Conejo conejito3 = new Conejo("Thumper", "Belier", "Mezcla de heno y frutas", 1, "Hace saltos impresionantes durante el juego");

        //HURONNNNNES
        //Nombre, Raza, Alimento, Edad, Caza
        Huron huronsito1 = new Huron("Bandit", "Hurón de patas negras", "Especial para hurones", 2, "Excelente cazador de roedores");
        Huron huronsito2 = new Huron("Luna", "Hurón sable", "Comida seca para hurones", 1, "A menudo persigue juguetes simulando cazar");
        Huron huronsito3 = new Huron("Gizmo", "Hurón albino", "Comida fresca y pienso", 3, "Juega cazando pelotas y juguetes");

        System.out.println("==========================================");
        System.out.println("Elija uno de los animales: ");
        System.out.println("1. Gato");
        System.out.println("2. Perro");
        System.out.println("3. Hamster");
        System.out.println("4. Conejo");
        System.out.println("5. Huron");
        op = entrada.nextInt();

        switch (op) {
            case 1:
            System.out.println("==========================================");
            gatito1.mostrarGatos();
            System.out.println("==========================================");
            gatito2.mostrarGatos();
            System.out.println("==========================================");
            gatito3.mostrarGatos();
                break;
            case 2:
            System.out.println("==========================================");
            perrito1.mostrarPerros();
            System.out.println("==========================================");
            perrito2.mostrarPerros();
            System.out.println("==========================================");
            perrito3.mostrarPerros();
                break;
            case 3:
            System.out.println("==========================================");
            hamstersito1.mostrarHamsters();
            System.out.println("==========================================");
            hamstersito2.mostrarHamsters();
            System.out.println("==========================================");
            hamstersito3.mostrarHamsters();
                break;
            case 4:
            System.out.println("==========================================");
            conejito1.mostrarConejos();
            System.out.println("==========================================");
            conejito2.mostrarConejos();
            System.out.println("==========================================");
            conejito3.mostrarConejos();
                break;
            case 5:
            System.out.println("==========================================");
            huronsito1.mostrarHurones();
            System.out.println("==========================================");
            huronsito2.mostrarHurones();
            System.out.println("==========================================");
            huronsito3.mostrarHurones();
                break;
        
            default:
                System.out.println("Escoge la opcion correcta v:");
            break;
        }

        entrada.close();
    }
    
}