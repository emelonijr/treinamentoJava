import java.util.Scanner;

public class URI1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, N100, N50, N20, N10, N5, N2, N1;

        //entrada
        N = teclado.nextInt();
        
        //processamento
        N100 = N / 100;
        N50 = (N % 100) / 50;
        N20 = ((N % 100) % 50) / 20;
        N10 = (((N % 100) % 50) % 20) / 10;
        N5 = ((((N % 100) % 50) % 20) % 10) / 5;
        N2 = (((((N % 100) % 50) % 20) % 10) % 5) / 2;
        N1 = (((((N % 100) % 50) % 20) % 10) % 5) % 2;

        //saída
        System.out.println(N);
        System.out.println(N100 + " nota(s) de R$ 100,00");
        System.out.println(N50 + " nota(s) de R$ 50,00");
        System.out.println(N20 + " nota(s) de R$ 20,00");
        System.out.println(N10 + " nota(s) de R$ 10,00");
        System.out.println(N5 + " nota(s) de R$ 5,00");
        System.out.println(N2 + " nota(s) de R$ 2,00");
        System.out.println(N1 + " nota(s) de R$ 1,00");

    }
}