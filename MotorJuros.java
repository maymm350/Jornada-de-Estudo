public class MotorJuros {
    public static void main(String[] args) {
        // Variáveis simulando dados de um cliente para análise de crédito
        int idade = 25;
        double renda = 3500.0;

        System.out.println("--- Sistema de Análise de Crédito e Risco ---");
        System.out.println("Idade do Cliente: " + idade);
        System.out.println("Renda Mensal: R$ " + renda);
        System.out.print("Status da Taxa: ");

        // Lógica de negócio desenvolvida para classificação de risco
        if (idade >= 18 && renda > 5000) {
            System.out.println("Juros Categoria A (Baixos)");
        } else if (idade >= 18 && renda >= 2000) {
            System.out.println("Juros Categoria B (Médios)");
        } else {
            System.out.println("Solicitação Recusada");
        }
        
        System.out.println("------------------------------------------");
    }
}
