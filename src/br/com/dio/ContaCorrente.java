package br.com.dio;

public class ContaCorrente extends Conta {

   

    public ContaCorrente(Clientes cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimiInformacoesComuns();
    }


}
