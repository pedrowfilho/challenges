<<<<<<< HEAD
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        System.out.println("Desafio Target :) - Estágio em Desenvolvimento - Ribeirão Preto");
        System.out.println("#### Fibonacci ####\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a qtd. de termos da sequência de Fibonacci: ");
        int qtdTermos = scanner.nextInt();
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        imprimeSequencia(qtdTermos);

        if (ehFibonacci(num)) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean ehFibonacci(int numero) {
        int f0 = 0;
        int f1 = 1;

        for (int i = 2; ; i++) {
            int aux = f0 + f1;
            if (aux == numero) {
                return true;
            }
            if (aux > numero) {
                return false;
            }
            f0 = f1;
            f1 = aux;
        }
    }

    public static void imprimeSequencia(int termos){
        //int tam = 10;
        int f0 = 0;
        int f1 = 1;

        System.out.println("Sequência de Fibonacci até " + termos + " termos:");

        for (int i = 1; i <= termos; i++) {
            System.out.print(f0 + " ");

            int aux = f0 + f1;
            f0 = f1;
            f1 = aux;
        }
    }
}
=======
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        System.out.println("Desafio Target :) - Estágio em Desenvolvimento - Ribeirão Preto");
        System.out.println("#### Fibonacci ####\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a qtd. de termos da sequência de Fibonacci: ");
        int qtdTermos = scanner.nextInt();
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        imprimeSequencia(qtdTermos);

        if (ehFibonacci(num)) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean ehFibonacci(int numero) {
        int f0 = 0;
        int f1 = 1;

        for (int i = 2; ; i++) {
            int aux = f0 + f1;
            if (aux == numero) {
                return true;
            }
            if (aux > numero) {
                return false;
            }
            f0 = f1;
            f1 = aux;
        }
    }

    public static void imprimeSequencia(int termos){
        //int tam = 10;
        int f0 = 0;
        int f1 = 1;

        System.out.println("Sequência de Fibonacci até " + termos + " termos:");

        for (int i = 1; i <= termos; i++) {
            System.out.print(f0 + " ");

            int aux = f0 + f1;
            f0 = f1;
            f1 = aux;
        }
    }
}
>>>>>>> b6705379ff8dfe824885de3f3b1bbb1566417cb2
