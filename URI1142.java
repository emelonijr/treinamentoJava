import java.util.Scanner;

public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N,X=0;

        N = teclado.nextInt();

        if (N>0){
            for(int count=1; count <=N; count++){
                System.out.println((X+=1) + " " + (X+=1) + " " + (X+=1) + " PUM");
                X+=1;
            }
        }
        

    }
}