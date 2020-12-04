import java.util.Scanner;

public class URI1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int T, V;
        float D;
  

        //entrada
        T = teclado.nextInt();
        V = teclado.nextInt();
        
        //processamento
        D = (float)T * V / 12;

        //saída
        System.out.printf("%.3f%n", D);
        

    }
}