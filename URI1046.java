import java.util.Scanner;

public class URI1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, hF, total;

        hI = teclado.nextInt();
        hF = teclado.nextInt();

        total = hF - hI;

        if (total <= 0){
            total = total + 24;
        }

        System.out.println("O JOGO DUROU " + total + " HORA(S)");
    }
}