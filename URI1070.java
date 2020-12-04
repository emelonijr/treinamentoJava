import java.util.Scanner;

public class URI1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;

        X = teclado.nextInt();

        if (X%2 != 0){
            System.out.println(X);
            for(int count=1;count<=5;count++){
                X+=2;
                System.out.println(X);
            }
        }
        else{
            X++;
            System.out.println(X);
            for(int count=1;count<=5;count++){
                X+=2;
                System.out.println(X);
            }
        }
    }
}