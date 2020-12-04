import java.util.Scanner;

public class URI1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, MEDIA;

        //entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        //processamento
        MEDIA = (A * 3.5 + B * 7.5) / 11;

        //saída
        System.out.printf("MEDIA = %.5f%n", MEDIA);


    }
}