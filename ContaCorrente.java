public class ContaCorrente extends ContaBancaria { 

    public ContaCorrente(String titularInicial, double saldoInicial, int idade) {
        super();
    }

    private double limiteChequeEspecial;

    public ContaCorrente(String titularInicial, double saldoInicial, int idade, double limiteChequeEspecial) {
        super();
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

@Override
public void sacar(double valor) {
    double valorTotalComTaxa = valor + 2;

    if (valor > 0 && valorTotalComTaxa <= (getSaldo() + limiteChequeEspecial)) {
        super.sacar(valorTotalComTaxa);
        System.out.println("Taxa de R$ 2,00 aplicada com sucesso.");

        if (valorTotalComTaxa > (getSaldo() + 2)) { 
            System.out.println("Aviso: Você utilizou parte do seu limite de Cheque Especial.");
        }

    } else {
        
        System.out.println("Saque negado: Limite insuficiente (Saldo + Cheque Especial).");
    }
}
    public static void main(String[] args) {
        // testando a criacao de conta corrente com o construtor
        ContaCorrente contaCorrente = new ContaCorrente("Maycon", 500.0, 20, 200.0);
        
        contaCorrente.depositar(200.0);
        contaCorrente.sacar(800.0); // utilizando cheque especial
        
        System.out.println("Saldo final: " + contaCorrente.getSaldo());
    }
 }