import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        System.out.println("Desafio Target :) - Estágio em Desenvolvimento - Ribeirão Preto");
        System.out.println("#### Busca ####\n");

        Scanner scanner = new Scanner(System.in);
        String texto = "Deus vai orientar o barco, mas você precisa remar.";

        System.out.println("Texto: " + texto);

        buscar(texto);

        scanner.close();
    }
    
    public static void buscar(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println("A letra 'a' ou 'A' foi encontrada " + count + " vez(es) no texto.");
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada no texto.");
        }
    }

}
