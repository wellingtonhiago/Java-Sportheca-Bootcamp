package com.sportheca.banco;

public abstract class Conta {
    private final int agencia = 0001;
    private String titular;
    private double saldo;
    private String numeroConta;
    private String validade;
    private static int qtdContas;

    public Conta(){
        qtdContas++;
    }

    public Conta(String titular, int saldo, String numeroConta, String validade) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.validade = validade;
        qtdContas++;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getAgencia(){
        return agencia;
    }

    public abstract void depositar();

    public abstract void sacar();

    public abstract void transferir();

    public abstract void pagar();

    @Override
    public String toString() {
        return "------------------" +
                "\nagencia: " + agencia +
                "\ntitular: " + titular +
                "\nsaldo: " + saldo +
                "\nnumeroConta: " + numeroConta+
                "\nvalidade: " + validade;
    }
}
