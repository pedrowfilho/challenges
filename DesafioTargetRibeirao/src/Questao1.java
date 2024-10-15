<<<<<<< HEAD
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        System.out.println("Desafio Target :) - Estágio em Desenvolvimento - Ribeirão Preto");
        System.out.println("#### Fibonacci ####\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (eFibonacci(num)) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean eFibonacci(int numero){
        int f0 = 0;
        int f1 = 1;

        for(int i = 2; ; i++){
            int aux = f0 + f1;
            if(aux == numero){
                return true;
            }
            if(aux > numero){
                return false;
            }
            f0 = f1;
            f1 = aux;
        }
    }
}
=======
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        System.out.println("Desafio Target :) - Estágio em Desenvolvimento - Ribeirão Preto");
        System.out.println("#### Fibonacci ####\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (eFibonacci(num)) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean eFibonacci(int numero){
        int f0 = 0;
        int f1 = 1;

        for(int i = 2; ; i++){
            int aux = f0 + f1;
            if(aux == numero){
                return true;
            }
            if(aux > numero){
                return false;
            }
            f0 = f1;
            f1 = aux;
        }
    }
}
>>>>>>> b6705379ff8dfe824885de3f3b1bbb1566417cb2
