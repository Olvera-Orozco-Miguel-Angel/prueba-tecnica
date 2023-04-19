import java.util.HashMap;
import java.util.Map;
public class TotalxCaracter {
    public static void main(String[] michelangelo ){
    /*
        * 4.	Escribe una función que reciba una cadena de caracteres y devuelva el número de veces
        *  que aparece cada carácter en la cadena. Por ejemplo, si la cadena es "hola",
        *  la función debería devolver {"h": 1, "o": 1, "l": 1, "a": 1}.
        *
    */
     String palabra = "michelangelo";
     System.out.println("La palabra es "+palabra);
     char[]aux = palabra.toCharArray();
     Map<Character, Integer> mapa = new HashMap<>();

        for(int i = 0; i < aux.length ; i++){
            if( !(mapa.containsKey(aux[i]))){
                 mapa.put(aux[i] ,1 );
            }else{
                int frecuencia = mapa.get(aux[i]);
                mapa.put(aux[i], frecuencia+1);
            }
        }
        System.out.println(mapa);

        }

    }

