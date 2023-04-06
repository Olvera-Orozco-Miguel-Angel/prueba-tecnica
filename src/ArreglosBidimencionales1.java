import java.util.Random;
import java.util.Scanner;

public class ArreglosBidimencionales1 {
    public static void main(String []args){
        // This script was created to traverse the array showing the file and column
        Scanner scanner = new Scanner(System.in);
        int fila = 0 ;
        int columna = 0;
        Random rand = new Random();



        System.out.println("Ingrese la cantiad de  Filas y columnas \n");
        fila = scanner.nextInt();
        columna = scanner.nextInt();
        int [][] arreglo = new  int [fila][columna];
        for (int i = 0; i < arreglo.length; i++){

            for (int j = 0; j < arreglo[0].length ; j++ ){
                    arreglo[i][j] =  rand.nextInt(101);

            }
            System.out.println();
        }
        System.out.println("Aquí se imprime la matriz como normaalmente se haría ");
        for (int i = 0; i < arreglo.length ;  i++ ){
            for(int j = 0; j < arreglo[0].length   ;j++ ){

                System.out.print(arreglo[i][j]+"|");

            }
            System.out.println();
        }

        System.out.println("Aquí se imprime la matriz de manera vertical ");
        for (int i = 0; i< arreglo[0].length  ; i++ ){
            for(int j = 0; j < arreglo.length  ;j++ ){

                System.out.print(arreglo[j][i]+"|");

            }
            System.out.println();
        }


    }


}