public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345-6");
        ContaPoupanca contaPoupanca = new ContaPoupanca("65432-1");

        contaCorrente.depositar(1000.00);
        contaCorrente.sacar(200.00);
        contaCorrente.transferir(300.00, contaPoupanca);

        contaPoupanca.depositar(500.00);
        contaPoupanca.sacar(100.00);
    }
}