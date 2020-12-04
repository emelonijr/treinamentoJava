import java.util.Scanner;

public class Leituras{
    public static void main(String args[]){
        Scanner teclado;    //declaro um componente do tipo scanner e chamo de teclado
        teclado = new Scanner(System.in); //esse componente irá ler dados do dispositivo

        int a;
        float b;
        double c;

        System.out.println("Por favor, digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Você digitou " + a);

        System.out.println("Agora digite um valor float");
        b = teclado.nextFloat();
        System.out.println("Você digitou " + b);

        System.out.println("Agora digite um valor double");
        c = teclado.nextFloat();
        System.out.println("Você digitou " + c);
    }
}