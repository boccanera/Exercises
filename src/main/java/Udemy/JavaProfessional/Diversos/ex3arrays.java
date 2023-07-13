package Udemy.JavaProfessional.Diversos;

import java.util.Arrays;

public class ex3arrays {

    public static void main(String[] args) {

        char[][] ticTacToe = new char[3][3];
        ticTacToe [0][0] = 'o';
        ticTacToe [0][1] = 'x';
        ticTacToe [0][2] = 'x';
        ticTacToe [1][0] = 'x';
        ticTacToe [1][1] = 'o';
        ticTacToe [1][2] = 'o';
        ticTacToe [2][0] = 'x';
        ticTacToe [2][1] = 'o';
        ticTacToe [2][2] = 'o';

//        System.out.print(Arrays.deepToString(ticTacToe));

        //best way to print in different lines with two dimensional arrays

        System.out.println(Arrays.deepToString(ticTacToe).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

//      exercise lesson above
        System.out.println(ticTacToe[2][2]);

    }
}
