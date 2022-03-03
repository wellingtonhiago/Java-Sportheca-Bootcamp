package com.sportheca.banco;

public class ContaCorrente extends Conta{
    private boolean contaEspecial = false;
    private double limite = 1000;

    public ContaCorrente() {
    }

    public ContaCorrente(String titular, int saldo, String numeroConta, String validade) {
        super(titular, saldo, numeroConta, validade);
    }

    public boolean isContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public void depositar(int deposito) {
        setSaldo(getSaldo() + deposito);

    }

    @Override
    public void sacar(int saque) {
        setSaldo(getSaldo() - saque);
    }

    @Override
    public void transferir() {

    }

    @Override
    public void pagar() {

    }

    @Override
    public String toString() {
        return "----------ContaCorrente---------" +
                "\ncontaEspecial: " + contaEspecial +
                "\nlimite: " + limite +
                "\nagencia: " + getAgencia() +
                "\ntitular: " + getTitular() +
                "\nsaldo: " + getSaldo() +
                "\nnumeroConta: " + getNumeroConta()+
                "\nvalidade: " + getValidade();

    }
}
