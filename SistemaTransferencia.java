public class SistemaTransferencia {
    public static void main(String[] args) {
      
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

      
        c1.depositar(1000.0);
        
        System.out.println("Saldo da C1 antes: " + c1.getSaldo());
        System.out.println("Saldo da C2 antes: " + c2.getSaldo());

        
        c1.sacar(150.0);
        c2.depositar(150.0);

        System.out.println("Saldo da C1 depois: " + c1.getSaldo());
        System.out.println("Saldo da C2 depois: " + c2.getSaldo());
    }
}
