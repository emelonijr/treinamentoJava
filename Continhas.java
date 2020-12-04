public class Continhas{
    public static void main(String args[]){
        int a,b,c;
        
        a = 11;
        b = 4;
        c = a + b;

        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subtração = " + c);

        c = a * b;
        System.out.println("Valor da multiplicação = " + c);
        
        c = a / b;
        System.out.println("Valor da divisão = " + c);

        c = a % b;
        System.out.println("Valor do resto da divisão = " + c);

        float f;
        f = (float)a/b;
        System.out.println("Valor da divisão quebrada = " + f);
    }
}