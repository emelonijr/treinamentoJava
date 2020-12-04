import java.util.Scanner;

public class URI1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, horas, minutos, segundos;

        //entrada 
        N = teclado.nextInt();

        //processamento
        horas = N / 3600;
        minutos = (N % 3600) / 60;
        segundos = (N % 3600) % 60;

        //saída
        System.out.println(horas + ":" + minutos + ":" + segundos);


    }
}