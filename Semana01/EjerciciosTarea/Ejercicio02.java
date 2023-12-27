package EjercicioTarea;

public class Ejercicio02 {
    public static void main(String[] args) {
        //  Ejercicio 02 => Suma de números impares
        short nLimit = 100;
        int nSuma = 0;

        for (int i = 1; i <= nLimit; i++) {
            if (i % 2 == 1) {
                nSuma += i;
            }
        }
        System.out.println("La suma total de los " + nLimit + " número es => " + nSuma );
    }
}
