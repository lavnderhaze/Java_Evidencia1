import java.util.Scanner;

public class CJAct7 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Números del 1 al 100 con bucle while:");
        // contador del 1 al 100 con while
        int contadorWhile = 1;
        while(contadorWhile <= 100){
            System.out.print(contadorWhile + " ");
            contadorWhile++;
        }

        System.out.println("\n\nNúmeros del 1 al 100 con bucle for:");
        // contador del 1 al 100 con for
        for (int contadorFor = 1; contadorFor <= 100; contadorFor++) {
            System.out.print(contadorFor + " ");
        }

        System.out.println("\n\nNúmeros divisibles entre 2 y 3 con bucle for y un if:");
        // impresión de números que sean divisibles entre 2 y 3
        for (int i = 0; i < 100; i++) {
            // verificación de si el residuo es 0, si es posible la división
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        // scanner para verificación si un número es igual o mayor a 0
        try (Scanner scan = new Scanner(System.in)) {
            int numero = 0;
            // do while con la verificación, hasta que se ingrese uno que cumpla
            do { 
                System.out.println("Introduzca un número para verificar si es mayor o igual a 0:");
                numero = scan.nextInt();
            } while (numero < 0);

            System.out.println("El número "+ numero +" es mayor o igual a 0");
        }

    }
}
