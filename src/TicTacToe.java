import java.util.Scanner;
public class TicTacToe {
    public static void main(String [] michelangelo ){
        Scanner scanner = new Scanner(System.in);
        //Character [][]  array = new Character [3][3];
        int option = 0;
        char symbol = 'x';
        int jugador = 1;
        int [][]  aux =


        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       Character [][]  array =
                {
                        {'1','2','3'},
                        {'4','5','6'},
                        {'7','8','9'}
                };
        System.out.println("This tha menu is, Enter the position to know tha place you put the x / o");
        for(  int[] item : aux ){
            for (int item2:item){
                System.out.print(item2+" |");
            }
            System.out.println();

        }
        System.out.println("--------------------------------------------------------");

    for ( int t = 1 ; t<=7; t++ ) {
        System.out.println("jugador "+jugador+" ingrese posición , toca "+symbol );
        option = scanner.nextInt();
        switch (option) {
            case 1:
                array[0][0] = symbol;
                break;
            case 2:
                array[0][1] = symbol;
                break;
            case 3:
                array[0][2] = symbol;
                break;
            case 4:
                array[1][0] = symbol;
                break;
            case 5:
                array[1][1] = symbol;
                break;
            case 6:
                array[1][2] = symbol;
                break;
            case 7:
                array[2][0] = symbol;
                break;
            case 8:
                array[2][1] = symbol;
                break;
            case 9:
                array[2][2] = symbol;
                break;
            default:
                System.out.println("Option not allowed");
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                System.out.println("El ganador es "+jugador +" -> "+ array[i][0]);
                System.exit(1);
            }
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                System.out.println("El ganador es "+jugador +" -> "+array[0][i]);
                System.exit(1);
            }


        }// aquí termina el primer for


        if (array[0][0] == array[1][1] &&  array[1][1] == array[2][2] ) {
            System.out.println("El ganador es "+jugador +" -> "+ array[0][0]);
            System.out.println(array);
            System.exit(1);

        }
        if (array[0][2] == array[1][1] &&  array[1][1] == array[2][0]  ) {
            System.out.println("El ganador es "+jugador +" -> "+array[1][1]);


            System.exit(1);

        }
        jugador = jugador == 1 ? 2 : 1;
        symbol  = symbol == 'x' ? 'o' : 'x';


        for(Character[] item:array){
            for (Character elemento :item){
                System.out.print(elemento+" |");
            }
            System.out.println();
        }
    }
        System.out.println(" None won, it's a tie");

       }

    }