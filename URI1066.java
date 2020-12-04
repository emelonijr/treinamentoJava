import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor,par=0,impar=0,neg=0,pos=0;

        for(int cont=1;cont<=5;cont++){
            valor = teclado.nextInt();
            
            if (valor < 0){
                neg++;
            }
            else if (valor > 0){
                pos++;
            }
            if (valor%2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }
}