package EjercicioTarea;

public class Ejercicio06 {
    public static void main(String[] args) {
        //  Ejercicio 06 => Cuadrado Perfecto
        short nLimit = 100;
        short nBase = 1;
        while((nBase * nBase) <= nLimit ) {
            System.out.println("El numero " + (nBase * nBase) + " es el cuadrado de " + nBase);
            nBase += 1;
        }
    }
}
