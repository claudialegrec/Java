package recursion;

import java.util.Scanner;

public class MatrizRecursiva {

    public static void main(String[] Args) {

        int filas;
        int columnas;

        Matrixita mi_matriz = new Matrixita();
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite el número de filas: ");
        filas = leer.nextInt();

        System.out.println("Digite el número de columnas: ");
        columnas = leer.nextInt();

        mi_matriz.llenar_matriz(0, 0, filas, columnas);

        System.out.println("-Matríz-");
        mi_matriz.mostrar_matriz(0, 0, filas, columnas);

        System.out.println("El menor dato de la matríz: ");
        mi_matriz.mostrar_menor_matriz(0, 0, filas, columnas, 0, 0);
    }

}
