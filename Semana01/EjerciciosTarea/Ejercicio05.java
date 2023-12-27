package EjercicioTarea;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        //  Ejercicio 05 => Suma de dígitos
        int nBase = 0;
        int nBaseInicial = 0;
        int nResiduo = 0;
        int nSuma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        nBaseInicial = nBase = sc.nextInt();
        do {
            nResiduo = nBase % 10;
            nSuma += nResiduo;
            nBase = nBase / 10;
        } while (nBase % 10 > 0);
        System.out.println("La suma de los digitos de " + nBaseInicial + " es " + nSuma);
    }
}
