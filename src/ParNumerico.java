import java.util.Scanner;
public class ParNumerico {
    public static void main(String []michelangelo){
//8:55
        /*
        1.	Dado un arreglo de números enteros, encuentra el par de elementos consecutivos cuya suma sea la mayor
        posible.
        Por ejemplo, si el arreglo es [1, 2, 3, 4, 5], el resultado debería ser (4,5).1.
        * */

        int [] array = {1,3,7,8,8,1,2,20,7,11};
        int suma = 0;
        int a =0;
        int b =  0;
        for(int i = 0; i < (array.length)-1 ; i++ ){

            if (array[i]+array[i+1] >= suma ){
                suma = array[i]+array[i+1];
                 a = array[i];
                 b = array[i+1];
            }


        }
        System.out.println("La suma grande de "+a+" y "+b+" = "+suma);

    }
}
