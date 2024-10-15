public class Questao4 {
    public static void main(String[] args) {
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double total = sp + rj + mg + es + outros;
        System.out.println("Faturamento total mensal: " + total);
        
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", calculaPercentual(sp, total));
        System.out.printf("RJ: %.2f%%\n", calculaPercentual(rj, total));
        System.out.printf("MG: %.2f%%\n", calculaPercentual(mg, total));
        System.out.printf("ES: %.2f%%\n", calculaPercentual(es, total));
        System.out.printf("Outros: %.2f%%\n", calculaPercentual(outros, total));
    }

    public static double calculaPercentual(double ftrEstado, double ftrTotal){
        double percentual = (ftrEstado / ftrTotal) * 100;
        return percentual;
    }
    
}
