public class Questao3 {
    public static void main(String[] args) {
        double[] faturamento = {
                2217416.64, 2453766.98, 0.0, 0.0, 2613961.34, 2674266.12,
                4288922.58, 462511.74, 1119147.22, 0.0, 0.0, 384748.22,
                37378.38, 2654266.12, 19849.53 
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamento.length; i++) {
            double valor = faturamento[i];

            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }
}
