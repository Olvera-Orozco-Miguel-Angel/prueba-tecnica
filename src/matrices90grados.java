import java.util.Scanner;
import java.util.Random;
public class matrices90grados {
    public static void main(String[] args) {
        /*
        *
Generar una matriz NxM de forma dinámica donde los valores N y M
 son introducidos por el usuario.
Llenar esta matriz con valores aleatorios de entre 0 y 100.
Imprimir los valores de la matriz.
Generar una nueva matriz de MxN y generar la matriz transpuesta de la matriz de NxM (Girar 90 grados a la derecha)
Imprimir los valores de la matriz transpuesta.

        * */
       Scanner scanner = new Scanner (System.in);

        int n = 0;
        int m = 0;


        Random rand = new Random();
        System.out.println("Ingrese que son  las filas ");
        n = scanner.nextInt();
        System.out.println("Ingrese las columnas ");
        m = scanner.nextInt();
        int[][] matriz = new int[n][m];


        // Llenar la matriz con números aleatorios entre 0 y 99
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(101);
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int auxA= 1;
        int auxb = 0;
        int [][] aux = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            aux[auxb][m-auxA] = matriz[n][m];
                auxA--;
                auxb++;

            }
            auxA= 1;
            auxb = 1;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }
}
