package br.com.dio;

public class Main {
    public static void main(String[] args) {
        Clientes Joana = new Clientes();
        Joana.setNome("Joana");

        Conta corrente = new ContaCorrente(Joana);
        Conta poupanca = new ContaPoupanca(Joana);
        
        corrente.depositar(100);
        corrente.tranferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
