package dio.exLoops;

import java.util.Scanner;

public class stopIf0 {

//ask for the name and age, stops if 0 is the input of the name.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("idade: ");
            idade = scan.nextInt();
        }




    }
}
