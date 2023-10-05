import java.util.*;

public class Ejerciciosarreglos {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    char letra;

    public void menu() {
        do {
            System.out.println("======================================================");
            System.out.println("Elige alguna de las siguientes opciones: ");
            System.out.println("1- Promedio de positivos y negativos");
            System.out.println("2- Promedio de pares");
            System.out.println("3- Calificaciones");
            System.out.println("4- Salir");
            opcion = entrada.nextInt();

            switch(opcion) {
                case 1:
                    Promposneg();
                break;
                case 2:
                    Prompares();
                break;
                case 3:
                    Calificaciones();
                break;
                case 4:
                    System.out.println("chau papu");
                    System.exit(0);
                break;
                default:
                    System.out.println("Elige una opcion pe");
                break;
            }
            System.out.println("======================================================");
            System.out.println("¿Deseas repetir el programa? (S/N)");
            letra = entrada.next().charAt(0);
        } while (letra == 'S' || letra == 's');
    }

    public void Promposneg() {
        /*
         * 1- Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array, 
         * posteriormente que calcule y muestre el promedio de los valores positivos y  de los negativos.
         */
        int arreglo[] = new int[10], contadorpos = 0, contadorneg = 0;
        double sumapos = 0, sumaneg = 0;
    
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("======================================================");
            System.out.println("Ingresa el valor del arreglo " + (i+1) + ":");
            arreglo[i] = entrada.nextInt();
    
            if (arreglo[i] > 0) {
                sumapos += arreglo[i];
                contadorpos++;
            } else {
                sumaneg += arreglo[i];
                contadorneg++;
            }
        }
    
        double promediopositivos = sumapos / contadorpos;
        double promedionegativos = sumaneg / contadorneg;
    
        System.out.println("======================================================");
        System.out.println("Promedio de los valores positivos: " + promediopositivos);
        System.out.println("Promedio de los valores negativos: " + promedionegativos);
    }

    public void Prompares() {
        /*
         * 2- Elabore un programa que lea 10 números enteros por teclado y los guarde en un array. 
         * Calcula y muestre el promedio de los números que estén en las posiciones pares del array. 
         *  
         * Considera la primera posición del array (posición 0) como par. 
         */
        int arreglo[] = new int[10];
        double sumapar = 0, contadorpar = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("======================================================");
            System.out.println("Ingresa el valor del arreglo " + (i+1) + ":");
            arreglo[i] = entrada.nextInt();

            if (i % 2 == 0) {
                sumapar += arreglo[i];
                contadorpar++;
            }
        }

        double promedioPares = sumapar / contadorpar;
        System.out.println("======================================================");
        System.out.println("El promedio de los números pares es: " + promedioPares);
    }

    public void Calificaciones() {
        /* 
         * 3- Realice un programa que permita leer 10 calificaciones de una asignatura 
         * y los guarde en un array para que muestre: 
         * Imprimir todas las calificaciones. 
         * Promedio de las calificaciones. 
         * La calificación más alta y la más baja. 
         * El número de calificaciones superiores al promedio. 
         * La cantidad de alumnos aprobados y reprobados. 
         */

        //MAX_VALUE y MIN_VALUE sirve para declarar como un valor maximo o minimo
        int arreglo[] = new int[10], aprobado = 0, reprobado = 0, calbaja = Integer.MAX_VALUE, calalta = Integer.MIN_VALUE;
        double sumacal = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("======================================================");
            System.out.println("Ingresa la calificacion " + (i + 1) + ":");
            arreglo[i] = entrada.nextInt();

            sumacal += arreglo[i];

            if (arreglo[i] > calalta) {
                calalta = arreglo[i];
            } 
            
            if (arreglo[i] < calbaja) {
                calbaja = arreglo[i];
            }

            if (arreglo[i] > 5) {
                aprobado++;
            } else {
                reprobado++;
            }
        }

        double promediocal = sumacal / arreglo.length;
        System.out.println("==============================================");
        System.out.println("Calificaciones:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i+1) + ".- " + arreglo[i]);
        }

        System.out.println("==================================================");
        System.out.println("El promedio de las calificaciones es: " + promediocal);

        System.out.println("==================================================");
        System.out.println("La calificacion mas alta es: " + calalta);
        System.out.println("La calificacion mas baja es: " + calbaja);

        System.out.println("==================================================");
        System.out.println("Cantidad de alumnos aprobados: " + aprobado);
        System.out.println("Cantidad de alumnos reprobados: " + reprobado);
    }

    public static void main(String[] args) {
        Ejerciciosarreglos obj = new Ejerciciosarreglos();
        obj.menu();
    }
    

}
