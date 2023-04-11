import java.util.Random;
public class SumaNumeros {
    public static void main(String []michelangelo){

//        1.	Dado un arreglo de números enteros, escribe una función que determine si existe un par de elementos
//              en el arreglo cuya suma sea igual a un número dado.
//              La suma debe de realizarce mediante pares y entre los números del arreglo.
//              Por ejemplo el número que queremos buscar es "7" si el arreglo es [1, 2, 3, 4, 5]
//              el resultado sería 3 + 4 = 7 porque solo la suma de ese par da siete
//
// 10:10

        Random random = new Random();
        int [] array = new int [30];
        int aux = 0;
        aux = random.nextInt(10);
        System.out.println("We are looking two numbers that add up "+aux);
        for (int i = 0; i< array.length-1 ; i++) {
           array[i] = random.nextInt(10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i< array.length-1 ; i++) {

            System.out.print(
                    (array[i] + array[i+1]) == aux ? "True "+array[i]+" + "+array[i+1]+"= "+aux+" | " : ""
            );
        }




    }
}
