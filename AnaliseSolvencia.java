public class AnaliseSolvencia {
    public static void main(String[] args) {
        // Dados para análise
        double rendaMensal = 4000.0;
        double valorEmprestimo = 20000.0;
        int prazoMeses = 24;

        // Regra de Negócio: Parcela não pode exceder 30% da renda
        double valorParcela = valorEmprestimo / prazoMeses;
        double limiteParcela = rendaMensal * 0.3;

        System.out.println("--- Sistema de Análise de Solvência ---");
        System.out.println("Renda Mensal: R$ " + rendaMensal);
        System.out.println("Valor da Parcela: R$ " + String.format("%.2f", valorParcela));
        System.out.println("Limite Permitido (30%): R$ " + limiteParcela);
        System.out.println("---------------------------------------");

        if (valorParcela <= limiteParcela) {
            System.out.println("RESULTADO: EMPRÉSTIMO APROVADO");
        } else {
            System.out.println("RESULTADO: EMPRÉSTIMO NEGADO");
            System.out.println("Motivo: Parcela excede o limite de 30% da renda.");
        }
        
        System.out.println("---------------------------------------");
    }
}
