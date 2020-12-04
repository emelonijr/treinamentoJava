import java.util.Scanner;

public class URI1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, A, D, M;

        //entrada 
        N = teclado.nextInt();

        //processamento
        A = N / 365;
        M = (N % 365) / 30;
        D = (N % 365) % 30;

        //saída
        System.out.println(A + " ano(s)");
        System.out.println(M + " mes(es)");
        System.out.println(D + " dia(s)");


    }
}