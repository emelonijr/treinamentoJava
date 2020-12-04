import java.util.Scanner;

public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float sal;

        sal = teclado.nextFloat();

        //0 - 400.00 :: 15%
        if (sal >= 0 && sal <=400){
            System.out.printf("Novo salario: %.2f%n", sal * 1.15);
            System.out.printf("Reajuste ganho: %.2f%n", sal * 0.15);
            System.out.println("Em percentual: 15 %");
        }

        //400.01 - 800.00 :: 12%
        else if (sal > 400 && sal <=800){
            System.out.printf("Novo salario: %.2f%n", sal * 1.12);
            System.out.printf("Reajuste ganho: %.2f%n", sal * 0.12);
            System.out.println("Em percentual: 12 %");
        }    
        
        //800.01 - 1200.00 :: 10%
        else if (sal > 800 && sal <=1200){
            System.out.printf("Novo salario: %.2f%n", sal * 1.1);
            System.out.printf("Reajuste ganho: %.2f%n", sal * 0.1);
            System.out.println("Em percentual: 10 %");
        }  

        //1200.01 - 2000.00 :: 7%
        else if (sal > 1200 && sal <=2000){
            System.out.printf("Novo salario: %.2f%n", sal * 1.07);
            System.out.printf("Reajuste ganho: %.2f%n", sal * 0.07);
            System.out.println("Em percentual: 7 %");
        }  
                
        //Acima de 2000.00 :: 4%
        else if (sal > 2000){
            System.out.printf("Novo salario: %.2f%n", sal * 1.04);
            System.out.printf("Reajuste ganho: %.2f%n", sal * 0.04);
            System.out.println("Em percentual: 4 %");
        }  


    }
}