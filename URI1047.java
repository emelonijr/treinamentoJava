import java.util.Scanner;

public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, hF, mI, mF, tempoI, tempoF, total, totalH=0, totalM=0;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        tempoI = hI * 60 + mI;
        tempoF = hF * 60 + mF;
                
        total = tempoF - tempoI;

        if (total <= 0){
            total = total + 1440;
        }

        totalH = total / 60;
        totalM = total % 60;
        System.out.println("O JOGO DUROU " + totalH + " HORA(S) E " + totalM +  " MINUTO(S)");
    }
}