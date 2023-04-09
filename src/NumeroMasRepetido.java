import java.util.ArrayList;
public class NumeroMasRepetido {
    public static void main(String []michelangelo){

        /*
        9:47
        2.	Dado un string que representa una lista de números separados por comas,
        escribe una función que encuentre el número que aparece con mayor
        frecuencia en la lista. Por ejemplo, si el string es "1,2,3,4,5,1,1,1,2,2,3,3,3,3,3",
        el resultado debería ser 3.

        */
        String characters = "1,5,6,7,90,32,1,2,3,4,5,6,66,4,4,42,1,1,1";
        String contenedor="";
        ArrayList<Integer> aux = new  ArrayList<Integer>();


        for(char caracter : characters.toCharArray() ){

            if( !( caracter == ',') ){
               contenedor += caracter;

            }else {
                Integer.parseInt(contenedor);

                contenedor = "";

            }


        }


     /*   for( int char : characters ){


        }*/


    }
}
