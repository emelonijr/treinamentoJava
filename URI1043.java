import java.util.Scanner;

public class URI1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A, B, C, res;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        if ((A + B > C) && (B + C > A) && (A + C > B)){
            res = A + B + C;
            System.out.printf("Perimetro = %.1f%n", res);
        }
        else {
            res = (A + B) * C / 2;
            System.out.printf("Area = %.1f%n", res);
        }
    }
}