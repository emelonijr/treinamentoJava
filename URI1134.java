import java.util.Scanner;

public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int comb,contA=0,contG=0,contD=0;

        do{
            comb = teclado.nextInt();
            switch (comb){
                case 1:
                    contA++;
                    break;
                case 2:
                    contG++;
                    break;
                case 3:
                    contD++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + contA);
                    System.out.println("Gasolina: " + contG);
                    System.out.println("Diesel: " + contD);
                    break;
                default:
            }
        }
        while(comb != 4);
    }
}