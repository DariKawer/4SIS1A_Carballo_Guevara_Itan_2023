/* 
Vamos a crear un rpograma mediante el cual debamos tener un menu
de seleccion para elegir alguna de las 14 opciones siguientes:
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios 
3.- Convertir Temperaturas
4.- Numeero de positivos y negativos
5.- Tiendita
6.- Area y Perimetro
7.- Tabla
8.- Factorial
9.- Dibujitos
10.- Figura Hueca
11.- Patron 
12.- Diamante
13.- Calculadora
14.- Salir
*/

//se debe estructurar el tipo de dato acorde a su entrada
//si es entero obtenerlo como entero, si es char obtenerlo como caracter
import java.util.Scanner;

class EstructurasControl {
    public static void main(String[] args) {
        // para hacer una instancia
        //1.- Identificar el tipo de objeto
        // 2.- nombrar al objeto
        // 3.- crear al objeto
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        // entrada es el objeto que va a poder identificar si es int, double, float

        int opcion, numbinario, total, cantidadproducto, edad, numero, conpositivos = 0, connegativos = 0, acum = 0, num;
        float precio, resultado, compra = 0, temperatura;
        long factorial;
        double descuento = 0, C, F, K, R, base, altura, area, perimetro, radio, volumen;
        String nombreproducto, nombres = "", binario = "", respuesta, positivos = "", negativos = "";
        char letra;

        do {
            System.out.println("======================================");
            System.out.println("     Bienvenido al programa papu");
            System.out.println("======================================");
            System.out.println("Elije alguna opción deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");// el papu mayor
            System.out.println("3.- Convertir Temperaturas ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tiendita ");// el papu mayor
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");// el papu mayor
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujito ");// el papu mayor
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");
            System.out.println("======================================");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("======================================");
                    System.out.println("Ingresa tu edad papu: ");
                    edad = entrada.nextInt();

                    if (edad > 65) {
                        descuento = 0.4 * 100;
                        System.out.println("Tenes un descuento del " + descuento + "%.");
                    } else if (edad <= 21) {
                        System.out.println("Tus padres son socios? (Si/No)");
                        respuesta = entrada.next();

                        if (respuesta.equals("Si") || respuesta.equals("si")) {
                            descuento = 0.45 * 100;
                            System.out.println("Tenes un descuento del " + descuento + "%.");
                        } else if (respuesta.equals("No") || respuesta.equals("no")) {
                            descuento = 0.25 * 100;
                            System.out.println("Tenes un descuento del " + descuento + "%.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("=================================================================");
                    System.out.println("Ingrese un numero entero positivo que desee convertir a binario: ");
                    numbinario = entrada.nextInt();

                    if (numbinario > 0) {
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = " No se puede convertir un numero negativo, solo positivos ";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;

                case 3:
                    System.out.println("======================================");
                    System.out.println("Elije el tipo de temperatura papu:");
                    System.out.println("1- Celsius (°C)");
                    System.out.println("2- Fahrenheit (°F)");
                    System.out.println("3- Kelvin (K)");
                    System.out.println("4- Rankine (°R)");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("======================================");
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            F = (temperatura * 9 / 5) + 32;
                            System.out.println("Grados Fahrenheit: " + F + "°F");
                            K = temperatura + 273.15;
                            System.out.println("Grados Kelvin: " + K + "K");
                            R = (temperatura + 273.15) * 9 / 5;
                            System.out.println("Grados Rankine: " + R + "°R");
                            break;

                        case 2:
                            System.out.println("======================================");
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            C = (temperatura - 32) * 5 / 9;
                            System.out.println("Grados Celsius: " + C + "°C");
                            K = (temperatura + 459.67) * 5 / 9;
                            System.out.println("Grados Kelvin: " + K + "K");
                            R = temperatura * 9 / 5;
                            System.out.println("Grados Rankine: " + R + "°R");
                            break;

                        case 3:
                            System.out.println("======================================");
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            C = temperatura - 273.15;
                            System.out.println("Grados Celsius: " + C + "°C");
                            F = (temperatura * 9 / 5) - 459.67;
                            System.out.println("Grados Fahrenheit: " + F + "°F");
                            R = temperatura * 9 / 5;
                            System.out.println("Grados Rankine: " + R + "°R");
                            break;

                        case 4:
                            System.out.println("======================================");
                            System.out.println("Ingrese la temperatura: ");
                            temperatura = entrada.nextInt();

                            C = (temperatura - 491.57) / 1.8;
                            System.out.println("Grados Celsius: " + C + "°C");
                            F = temperatura - 459.67;
                            System.out.println("Grados Fahrenheit: " + F + "°F");
                            K = temperatura / 1.8;
                            System.out.println("Grados Kelvin: " + K + "K");
                            break;

                        default:
                            System.out.println("Ingrese la opcion correcta");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("========================================");
                    System.out.println("Cuantos numeros vas a ingresar?");
                    total = entrada.nextInt();

                    for (int i = 1; i <= total; i++) {
                        System.out.println("Ingrese el numero " + i + " : ");
                        numero = entrada.nextInt();

                        if (numero > 0) {
                            conpositivos++;
                            positivos += Integer.toString(numero) + "\n";
                        } else {
                            connegativos++;
                            negativos += Integer.toString(numero) + "\n";
                        }
                    }

                    System.out.println("========================================");
                    System.out.println("Numeros positivos en total: " + conpositivos);
                    System.out.println(positivos);
                    System.out.println("========================================");
                    System.out.println("Numeros negativos en total: " + connegativos);
                    System.out.println(negativos);
                    break;

                case 5:
                    System.out.println("========================================");
                    System.out.println("Bienvenido a la tiendita 'papu lovers' ");
                    System.out.println("========================================");
                    System.out.println("Por favor ingrese la cantidad de productos a comprar: ");
                    total = entrada.nextInt();

                    for (int i = 1; i <= total; i++) {
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio de este: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        resultado = precio * cantidadproducto;
                        compra += resultado; // compra = compra + resultado;
                        nombres += nombreproducto + "\n";
                    }

                    System.out.println("==============================================");
                    System.out.println("PRODUCTOS COMPRADOS:");
                    System.out.println(nombres);
                    System.out.println("====================");
                    System.out.println("TOTAL COMPRADO:");
                    System.out.println(compra + " pesos");
                    compra = 0;
                    break;

                case 6:
                    System.out.println("==============================================");
                    System.out.println("Seleccione una figura:");
                    System.out.println("1- Rectángulo");
                    System.out.println("2- Triángulo");
                    System.out.println("3- Esfera");
                    System.out.println("4- Cilindro");
                    opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("==============================================");
                            System.out.print("Ingrese la base del rectángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del rectángulo: ");
                            altura = entrada.nextDouble();

                            area = base * altura;
                            perimetro = 2 * (base + altura);

                            System.out.println("Área del rectángulo: " + area);
                            System.out.println("Perímetro del rectángulo: " + perimetro);
                            break;

                        case 2:
                            System.out.println("==============================================");
                            System.out.print("Ingrese la base del triángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            altura = entrada.nextDouble();

                            area = (base * altura) / 2;
                            perimetro = base * 3;

                            System.out.println("Área del triángulo: " + area);
                            System.out.println("Perímetro del triángulo: " + perimetro);
                            break;

                        case 3:
                            System.out.println("==============================================");
                            System.out.print("Ingrese el radio de la esfera: ");
                            radio = entrada.nextDouble();

                            volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

                            System.out.println("Volumen de la esfera: " + volumen);
                            break;

                        case 4:
                            System.out.println("==============================================");
                            System.out.print("Ingrese el radio de la base del cilindro: ");
                            radio = entrada.nextDouble();
                            System.out.print("Ingrese la altura del cilindro: ");
                            altura = entrada.nextDouble();

                            volumen = Math.PI * Math.pow(radio, 2) * altura;

                            System.out.println("Volumen del cilindro: " + volumen);
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                }
            break;

            case 7:
                System.out.println("==============================================");
                System.out.println("Ingrese la cantidad a mostrar: ");
                total  = entrada.nextInt();
                System.out.println("==============================================");
 
                for(int x=1; x <= total; x++) {
                    System.out.printf("| %6d | %7d  | %8d   | %10d   |\n", x, x * 10, x * 100, x * 1000);
                    //printf sirve para darle formato y sirve para hacer tablas ordenadas sin necesidad de tener que ir checando la anchura como en pseintzzzz
                }
            break;

            case 8:
                System.out.println("==============================================");
                System.out.println("Ingrese un numero no negativo: ");
                num  = entrada.nextInt();
                System.out.println("==============================================");

                if (num < 0) {
                    System.out.println("El numero debe ser no negativo");
                } else {
                    factorial = 1;
                    for (int x = 1; x <= num; x++) {
                        factorial = factorial * x;
                    }   
                    System.out.println("Factorial: " + factorial);
                }
            break;

            case 9:
                System.out.println("==============================================");
                System.out.println("Ingrese el total del lado (no mayor a 20): ");
                total = entrada.nextInt();
                System.out.println("==============================================");

                if (total <= 0) {
                    System.out.println("El tamaño del lado debe ser mayor que 0.");
                } else if (total > 20) {
                    System.out.println("El tamaño del lado debe ser menor o igual a 20.");
                } else {
                    for (int i = 1; i <= total; i++) {
                        for (int j = 1; j <= total; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                
            break;

            case 10:
                System.out.println("==============================================");
                System.out.println("Ingrese el total del lado (no mayor a 20): ");
                total = entrada.nextInt();
                System.out.println("==============================================");

                if (total <= 0) {
                    System.out.println("El tamaño del lado debe ser mayor que 0.");
                } else if (total > 20) {
                    System.out.println("El tamaño del lado debe ser menor o igual a 20.");
                } else {
                    for (int i = 1; i <= total; i++) {
                        for (int j = 1; j <= total; j++) {
                            /*
                             * Como es el mismo codigo es necesario agregar un if que cheque linea por linea lo siguiente
                             * Se checa primero que i se compare a 1 sino
                             * Se checa que i se compare a total sino
                             * Se checa que j se compare a 1 sino
                             * Se checa que j se compare a total
                             * y sino imprime espacio
                             * 
                             * ejemplo iniciamos 5 
                             * 1 == 1, 1 == 5, 1 == 1, 1 == 5
                             * Como hay dos comparaciones que si son correctas se imprime "* " hasta el total
                             * pero si va por ejemplo en la linea 2, 3 y 4
                             * 3 == 1, 3 == 5, 3 == 1, 3 == 5
                             * Ninguna comparacion es correcta es decir que 2, 3 y 4 no es igual a 1 o al total
                             * Por lo tanto se imprime " "
                             */
                            if (i == 1 || i == total || j == 1 || j == total) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                }
            break;

            case 11:
                //SU PROGRAMA SOLO PUEDE USAR (“ ”), (“* ”), (“\N) 
                System.out.println("==============================================");
                System.out.println("Ingrese la cantidad a imprimir: ");
                total = entrada.nextInt();
                System.out.println("==============================================");

                for (int i = 1; i <= total; i++) {
                    if (i % 2 == 1) {
                        for (int j = 1; j <= 8; j++) {
                            System.out.print("* ");
                        }
                    } else {
                        System.out.print(" ");
                        for (int j = 1; j <= 8; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                }

            break;

            case 12:
                System.out.println("==============================================");
                System.out.println("Ingrese la cantidad a imprimir: ");
                total = entrada.nextInt();
                System.out.println("==============================================");

                for (int i = 1; i <= total; i++) {//i = 1 hasta que llegue a total para el bucle y termina
                    for (int j = 1; j <= total - i; j++) {//La cantidad de "0" disminuye a medida que i aumenta es decir que si pongo 20 (imprimira 19 "0")
                        System.out.print(" ");//"0"
                        //Aqui no se pone println para respetar la continuidad de la impresion
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {//La cantidad de "1" aumenta a medida que i aumenta es decir que si pongo 20(imprimira  39 "1")
                        System.out.print("*");//"1"
                        //Aqui se hace lo mismo se respeta la continuidad
                    }
                    System.out.println(/*Aca no se pone " " ya que no es necesario pq es salto de linea */);// y ya al terminar el bucle osea despues de poner "0" y "1" se va a la siguiente linea hasta que termine
                }

                //entonces para completarlo tendria que ser lo mismo pero ahora en lugar de i++ seria i--
                for (int i = total - 1; i >= 1; i--) {//Empieza desde el total para despues disminuir para no verse feo en el total se resta una linea para verse bien el rombo e ira en descendencia y termina hasta que sea i sea igual a 1
                    for (int j = 1; j <= total - i; j++) {//aca es todo lo contrario; La cantidad de "0" aumenta a medida que i disminuye
                        System.out.print(" ");//"0"
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {//La cantidad de "1" disminuye a medida que i aumenta
                        System.out.print("*");//"1"
                    }
                    System.out.println();
                }
            break;

            case 13:
            /*
             * DESARROLLE UN ALGORITMO QUE PERMITA EL DESARROLLO DE UNA CALCULADORA CONVENCIONAL 
             * CON SUMA RESTA MULTIPLICACIÓN Y DIVISIÓN, DEBERÁ UN INCLUIR UN MENU DE ENTRADA A 
             * LAS OPERACIONES Y QUE PERMITA ELEGIR ENTRE OTRA OPERACIÓN O SALIR DEL PROGRAMA.
             * (PUEDE UTILIZAR LIBRERÍA SWING CON OPCION JOPTIONPANE INVESTIGACIÓN)  
             */

            break;

            case 14:
                System.out.println("Saliendo del programa papu.");
                System.exit(0);
            break;

            default:
                System.out.println("Elija una opcion valida papu malo");
            break;
        }

        System.out.println("======================================");
        System.out.println("Deseas repetir el programa papu? (S/N)");
        letra = entrada.next().charAt(0);

    } while (letra == 'S' || letra == 's');
}
}