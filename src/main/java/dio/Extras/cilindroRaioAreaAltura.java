package dio.Extras;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class cilindroRaioAreaAltura {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double V, D, R, area, altura;

//TODO: Complete os espaços em branco com uma possível solução para o desafio

        double pi = 3.14;
        while (leitor.hasNext()) {
            V = leitor.nextDouble();
            D = leitor.nextDouble();
            R = D / 2;

            boolean condicao = (1<=V&&V<=10000&&1<=D&&D<=100);
            if(condicao){
                area = pi * (R * R);
                altura = V /  (pi * R * R);
                System.out.println("ALTURA = " + df.format(altura));
                System.out.println("AREA = " + df.format(area));
            }

        }
    }
}

//1450.00
//25.00