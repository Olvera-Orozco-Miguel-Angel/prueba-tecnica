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
        System.out.println("Ingrese las filas ");
        n = scanner.nextInt();
        System.out.println("Ingrese las columnas ");
        m = scanner.nextInt();
        int[][] matriz = new int[n][m];


        // Llenar la matriz con números aleatorios entre 0 y 100
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(101);
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length ; j++) {
                System.out.print(matriz[i][j] + "| ");
            }
            System.out.println();

        }

        int auxA= n-1;
        int [][] aux = new int[m][n];

        for (int i = 0; i <  matriz[0].length; i++) {
            for (int j = 0 ; j < matriz.length ; j++) {
                aux[i][auxA] = matriz[j][i];
                auxA--;
            }
            auxA=n-1;

        }

        /*Arreglo donde se muestra el arreglo invertido noventa grados */
        System.out.println("Este es el oficional mami que tu quiere que ");
        for (int i = 0; i< aux.length ;i++){

            for (int j = 0; j< aux[0].length  ; j++){
                System.out.print(aux[i][j]+" |");

            }
            System.out.println();
        }

    }
}
