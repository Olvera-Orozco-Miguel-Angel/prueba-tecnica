import java.util.ArrayList;
import java.util.Random;
import java.util.List;
public class partNumeros {
/*
*
4.	Dado un arreglo de números enteros, escribe una función que determine si existe un par de elementos en el arreglo
    cuya suma sea igual a un número dado. Por ejemplo, si el arreglo es [1, 2, 3, 4, 5] y el número es 7,
    el resultado debería ser True ya que 2 + 5 = 7.
     solo debe de mostrar la combinación una sola vez

    9:44
para este problema se utilizar la función de random para lograr
* */
    public static void main(String[] michelangelo) {
    Random random = new Random();
    int [] array = new int[10];
    int lookingNumber = 0;

    lookingNumber = random.nextInt(10);
        System.out.println("El número a buscar es "+lookingNumber);
        for ( int j = 0; j< array.length; j++){

                array[j] = random.nextInt(10);
            System.out.print (array[j]+" ");
        }
        System.out.println();
        System.out.println("Aquí se muestan las combinaciones  ");
   for ( int i = 0; i< array.length;i++){
        if (i<=lookingNumber) {
            for (int j = i; j < array.length - 1; j++) {

                if ( array[i] + array[j + 1] == lookingNumber) {
                    System.out.println("True " + array[i] + " " + " + " + array[j + 1]+" = "+lookingNumber);
                }

            }
        }
    }

    /* Otra manera de resolverlo más limpio  con el uso de listas y se realiza un proceso de filtrado al arreglo
    * donde solo se muestra el número una sola vez y con este se ralizan las demás combinaciones  */
        System.out.println();
        System.out.println("Vamos a subir la dificultad y hagamos que solo muestre una combinación ");
        List<Integer> lista = new ArrayList<>();
        for(int item : array ){

            if (! lista.contains(item)){
                lista.add(item);

            }

        }
        System.out.println("Imprimiendo la lista "+lista);
        for ( int i = 0; i< lista.size() ;i++){

                for (int j = i; j < lista.size() - 1; j++) {

                    if ( lista.get(i) + lista.get(j+1) == lookingNumber) {
                        System.out.println("True " + lista.get(i) + " " + " + " + lista.get(j+1) +" = "+lookingNumber);
                    }

                }

        }




    }
}
