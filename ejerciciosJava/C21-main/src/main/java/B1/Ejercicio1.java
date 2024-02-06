package B1;

//Calculadora

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ingresar dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        // Realizar las operaciones
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        // Verifica si el segundo número es diferente de cero
        if (numero2 != 0) {
            System.out.println("División: " + ((float) numero1 / numero2));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        // Cerrar el scanner
        scanner.close();
    }
}

