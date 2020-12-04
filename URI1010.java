import java.util.Scanner;

public class URI1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod1, qtd1, cod2, qtd2;
        float valor1, valor2, TOTAL; 

        //entrada
        cod1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        valor1 = teclado.nextFloat();
        cod2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valor2 = teclado.nextFloat();

        //processamento
        TOTAL = (qtd1 * valor1 + qtd2 * valor2);

        //saída
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);


    }
}