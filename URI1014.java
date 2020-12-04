import java.util.Scanner;

public class URI1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;
        float Y, CONSUMO;
  

        //entrada
        X = teclado.nextInt();
        Y = teclado.nextFloat();
        
        //processamento
        CONSUMO = X / Y;

        //saída
        System.out.printf("%.3f km/l%n", CONSUMO);
        

    }
}