public class Questao1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio Target :) - Estágio em Desenvolvimento - São Paulo");
        System.out.println("#### Questão 1 ####\n");
        
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("O valor da variável soma é " + soma);
    }
}
