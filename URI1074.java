import java.util.Scanner;

public class URI1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N,X;

        N = teclado.nextInt();

        if (N<10000){
            for(int count=1;count<=N;count++){
                X = teclado.nextInt();
                if (X>-10000000 && X<10000000){
                    if (X == 0){
                        System.out.println("NULL");
                    }
                    else{
                        if (X%2 == 0){
                            if (X < 0){
                                System.out.println("EVEN NEGATIVE");
                            }
                            else{
                                System.out.println("EVEN POSITIVE");
                            }
                        }
                        else{
                            if (X < 0){
                                System.out.println("ODD NEGATIVE");
                            }
                            else{
                                System.out.println("ODD POSITIVE");
                            }
                        }
                    }
                }
            }
        }

    }
}