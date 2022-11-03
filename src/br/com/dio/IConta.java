package br.com.dio;

public interface IConta {

     void sacar(double valor);

     void depositar(double valor);

     void tranferir(double valor, Conta contaDestino);

     void imprimirExtrato();

}