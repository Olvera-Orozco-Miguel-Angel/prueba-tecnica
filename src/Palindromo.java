import java.sql.SQLOutput;

public class Palindromo {
    public static void main(String []michelangelo){


      /*
         3.Escribe una función que determine si una cadena de caracteres es un palíndromo.
            Un palíndromo es una cadena que se lee igual de izquierda a derecha y de derecha a izquierda.
            Por ejemplo, "anita lava la tina" es un palíndromo.
            ojo
            oso
            Anita lava la tina
            Madam, in Eden I'm Adam

      */

        String cadena = "4564234)(/&%%''''Madam, in Eden I'm Adam316688";
        System.out.println("Palindromo a buscar '"+cadena+"'");
        cadena = cadena.replaceAll("[^a-zA-Z]","");
        cadena = (cadena.toLowerCase());



        int left = cadena.length()-1;
        int right = 0 ;
        boolean flat = true;
        while( right < cadena.length() ){

            if( (cadena.charAt(right)) == ((cadena.charAt(left))) ){
                right++;
                left--;
                if ( right> left ){
                    System.out.println("Sí es un palindromo ");
                    break;
                }
            }else{
                System.out.println("No es un palindromo");
                flat = false;
                break;
            }

        }
//      System.out.println(  flat == true ? "Es un palindromo " :"No es un palindromo" );


        /*
            for( char item :cadena.toCharArray()){
                System.out.println(item);

            }
        */


    }

}
