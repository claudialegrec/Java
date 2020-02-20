package recursion;

import java.util.Scanner;

public class Matrixita {

    private int[][] matriz = {{2, 4, 4}, {6, 6, 9}, {8, 10, 12}};

    int sw = 0;
    int sw1 = 0;

    public void llenar_matriz(int i, int j, int filas, int columnas) {
        Scanner teclado = new Scanner(System.in);

        if (sw == 0) {
            if (i < filas) {

                if (j < columnas) {

                    System.out.println("Digite número de posicion " + " " + i + " " + j);
                    matriz[i][j] = teclado.nextInt(); // la puta madreeeeeeee >.< 

                    llenar_matriz(i, j + 1, filas, columnas);

                }

                if (j == columnas) {

                    llenar_matriz(i + 1, 0, filas, columnas);
                }
            } else {
                System.out.println("Matriz llenada satisfactoriamente.");
                sw = 1;
            }
        }

    }

    public void mostrar_matriz(int i, int j, int filas, int columnas) {

        if (sw1 == 0) {
            if (i < filas) {

                if (j < columnas) {
                    System.out.println("- " + i + " " + j);
                    System.out.println(matriz[i][j]);
                    llenar_matriz(i, j + 1, filas, columnas);
                }

                if (j == columnas) {
                    System.out.println("-----------------------------------");
                    llenar_matriz(i + 1, 0, filas, columnas);

                }
            } else {
                sw1 = 1;
            }
        }

    }

    public void mostrar_menor_matriz(int i, int j, int filas, int columnas, int i1, int j1) {
        int menor;

        if (i < filas) {

            if (j < columnas) {
                System.out.println("- " + i + " " + j);
                if (matriz[i][j] < matriz[i1][j1]) {
                    menor = matriz[i][j];

                } else {
                    menor = matriz[i1][j1];
                }
                llenar_matriz(i, j + 1, filas, columnas);
            }

            llenar_matriz(i + 1, 0, filas, columnas);
        }

    }

}
