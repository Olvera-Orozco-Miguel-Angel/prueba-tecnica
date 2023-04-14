public class Anagrama {
    public static void main(String [] michelangelo){
        /*
         2.	Escribe una función que determine si una cadena de caracteres es un anagrama de otra cadena.
        Dos cadenas son anagramas si contienen los mismos caracteres pero en un orden diferente.
        por ejemplo, "roma" y "amor" son anagramas.
        6:36
        ordenarlas y comparar si son iguales
        agraparción de caracteres osea la frecuencia
        tomar una palabra y acomadar con base a la otra
        que tome una palabra y realice un proceso de busqueda
 */
       String cadena1 = "Escultor";
       String cadena2 = "Ulcetros";
       cadena1 = cadena1.replaceAll("[^a-zA-Z]","").toLowerCase();
       cadena2 = cadena2.replaceAll("[^a-zA-Z]","").toLowerCase();
       String aux2 = "";
       char[] aux = cadena2.toCharArray();
       for (int i = 0; i< cadena1.length() ; i++){
            for (int j = 0; j< aux.length ; j++){
            if (cadena1.charAt(i) == aux[j] ){
                aux2 +=  aux[j] ;
                aux[j] = ' ';
                break;
            }
            System.out.println("No es  un anagrama");
            System.exit(0);
        }
    }
        //String nuevacadena = new String(aux);
        if ( cadena1.equals(aux2) ){
            System.out.println("Es un Anagrama");
        }else{
            System.out.println("No es un anagrama");
        }
    }
}
