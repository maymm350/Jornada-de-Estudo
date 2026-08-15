public class ContaBancaria {
    private String titular;
    private double saldo;

    // construtor com regra de idade minima
    public ContaBancaria(String titularInicial, double saldoInicial, int idade) {
        if (idade >= 18) {
            this.titular = titularInicial;
            this.saldo = saldoInicial;
            System.out.println("Conta criada para " + titularInicial + " com saldo inicial de " + saldoInicial);
        } else {
            System.out.println("Erro: idade abaixo do limite para abertura de conta.");
        }
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado: " + valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        } else {
            System.out.println("Saque negado: saldo insuficiente ou valor inválido.");
        }
    }

    public static void main(String[] args) {
        // testando a criacao de conta com o construtor
        ContaBancaria conta = new ContaBancaria("Maycon", 500.0, 20);
        
        conta.depositar(200.0);
        conta.sacar(150.0);
        
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
