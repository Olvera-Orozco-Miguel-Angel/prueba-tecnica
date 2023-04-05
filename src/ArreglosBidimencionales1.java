import java.util.Scanner;
public class ArreglosBidimencionales1 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int fila = 0 ;
        int columna = 0;



        System.out.println("Ingrese la cantiad de  Filas y columnas \n");
        fila = scanner.nextInt();
        columna = scanner.nextInt();
        int [][] arreglo = new  int [fila][columna];
        for (int i = 0; i < arreglo.length; i++){

            for (int j = 0; j < arreglo[0].length ; j++ ){

                System.out.print(" "+i+" "+j+"|");

            }
            System.out.println();
        }

    }


}