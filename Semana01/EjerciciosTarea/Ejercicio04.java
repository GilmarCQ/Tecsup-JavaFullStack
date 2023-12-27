package EjercicioTarea;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //  Ejercicio 04 => Factorial de un número
        int nBase = 1;
        int nFactorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor base para el factorial");
        nBase = sc.nextInt();
        for (int i = 1; i <= nBase; i++) {
            nFactorial *= i;
        }
        System.out.println("El factorial de " + nBase + " es " + nFactorial);
    }
}
