import java.util.Scanner; // importación del scanner

public class CalculadoraAct8 {

    // método para leer y validar que la entrada sea un número flotante
    public static float leerNumero(Scanner scan) {
        // mientras no sea un float, bucle while
        while (!scan.hasNextFloat()) {
            System.out.println("La entrada no es válida. Ingresa un número válido:");
            scan.next(); // descartamos la entrada inválida
        }
        return scan.nextFloat();
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        // declaración de variables
        float num1;
        float num2;
        float resultado;
        int eleccion;
        boolean yn = false;
        
        // do para correr el programa al menos una vez
        do { 
            // MENÚ
            System.out.println("Elige la operación que desees realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Múltiplicación");
            System.out.println("4. División");
            System.out.println("5. Elevación al cuadrado");
            
            // lectura de que operación desea realizar
            eleccion = scan.nextInt();

            // switch de las operaciones
            switch (eleccion) {
                
                // SUMA
                case 1 -> {
                    System.out.println("Ingrese el primer número:");
                    num1 = leerNumero(scan);
                    System.out.println("Ingrese el segundo número:");
                    num2 = leerNumero(scan);
                        
                    resultado = num1 + num2;
                        
                    System.out.println("El resultado de la operación es: "+ resultado);
                }
                
                //RESTA
                case 2 -> {
                    System.out.println("Ingrese el primer número:");
                    num1 = leerNumero(scan);
                    System.out.println("Ingrese el segundo número:");
                    num2 = leerNumero(scan);
                        
                    resultado = num1 - num2;
                        
                    System.out.println("El resultado de la operación es: "+ resultado);
                }
        
                // MULTIPLICACIÓN
                case 3 -> {
                    System.out.println("Ingrese el primer número:");
                    num1 = leerNumero(scan);
                    System.out.println("Ingrese el segundo número:");
                    num2 = leerNumero(scan);
                        
                    resultado = num1 * num2;
                        
                    System.out.println("El resultado de la operación es: "+ resultado);
                }
        
                // DIVISIÓN
                case 4 -> {
                    System.out.println("Ingrese el primer número:");
                    num1 = leerNumero(scan);
                    System.out.println("Ingrese el segundo número:");
                    num2 = leerNumero(scan);
                        
                    resultado = num1 / num2;
                        
                    System.out.println("El resultado de la operación es: "+ resultado);
                }
        
                // ELEVACIÓN AL CUADRADO
                case 5 -> {
                    System.out.println("Ingrese el número a elevar:");
                    num1 = leerNumero(scan);
                        
                    resultado = num1 * num1;
                        
                    System.out.println("El resultado de la operación es: "+ resultado);
                }
        
                // DEFAULT
                default -> throw new AssertionError();
            }

                
            // pregunta si desea repetir el programa
            System.out.println("¿Te gustaría realizar otra operación? (ingresa 1 para SI, 2 para NO)");
            eleccion = scan.nextInt();

            // bucle while mientras se ingrese algo distinto de si o no (1 o 2)
            while(eleccion != 1 && eleccion !=2){
                System.out.println("La entrada no es válida. Ingresa 1 para SI, 2 para NO");
                eleccion = scan.nextInt();
            }

            // true o false del booleano para ver si se repite o no
            if (eleccion == 1) {
                yn = true;
            } else if (eleccion == 2){
                yn = false;
            } 
            
        } while (yn);
        
        // adiós
        System.out.println("FIN DEL PROGRAMA :)");

    }
}
