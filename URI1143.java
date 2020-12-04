import java.util.Scanner;

public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N,X=1;

        N = teclado.nextInt();
        
        if (N>1 && N<1000){
            for(int count=1; count <=N; count++){
                System.out.println(X + " " + (X*X) + " " + (X*X*X));
                X+=1;
            }
        }
    }
}