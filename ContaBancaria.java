public class ContaBancaria {
    // saldo privado para ninguém mudar direto
    private double saldo;

    // método pra ver o saldo
    public double getSaldo() {
        return this.saldo;
    }

    // método pra colocar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depositei: " + valor);
            System.out.println("Novo saldo: " + this.saldo);
        } else {
            System.out.println("Valor invalido!");
        }
    }

    // método pra tirar dinheiro
    public void sacar(double valor) {
        // verifica se tem saldo e se o valor é positivo
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " feito com sucesso");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor errado");
        }
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        
        System.out.println("--- Testando a conta ---");
        minhaConta.depositar(500);
        minhaConta.sacar(200);
        minhaConta.sacar(400); // aqui deve dar erro
        System.out.println("Saldo no final: " + minhaConta.getSaldo());
    }
}
