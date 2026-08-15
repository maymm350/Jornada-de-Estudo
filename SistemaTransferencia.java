public class SistemaTransferencia {
    public static void main(String[] args) {
        // criando as contas
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        // colocando um saldo inicial pra testar
        c1.depositar(1000.0);
        
        System.out.println("Saldo da C1 antes: " + c1.getSaldo());
        System.out.println("Saldo da C2 antes: " + c2.getSaldo());

        // a logica que voce fez
        c1.sacar(150.0);
        c2.depositar(150.0);

        System.out.println("Saldo da C1 depois: " + c1.getSaldo());
        System.out.println("Saldo da C2 depois: " + c2.getSaldo());
    }
}
