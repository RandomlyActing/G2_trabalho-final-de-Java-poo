package projetofinalpoo.classes;

import projetofinalpoo.enums.ValorMovimentacoes;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, String agencia, Gerente gerente) {
        super(cliente, agencia, gerente);
    }

    @Override
    public void saque(double valor) {
        if (valor < 0) {
            System.out.println("Valor negativo não autorizado.");
            return;
        }
        saldo = saldo - (valor + ValorMovimentacoes.SAQUE.getValorPorMovimentacao());
    }

    @Override
    public void deposito(double valor) {
        if (valor < 0) {
            System.out.println("Valor negativo não autorizado.");
            return;
        }
        saldo =  (saldo + valor) - ValorMovimentacoes.DEPOSITO.getValorPorMovimentacao();
    }

    @Override
    public void transferencia(Conta destino, double valor) {
        if (valor < 0) {
            System.out.println("Valor negativo não autorizado.");
            return;
        }
        subtrairSaldo(valor + ValorMovimentacoes.TRANSFERENCIA.getValorPorMovimentacao());
        destino.adicionarSaldo(valor);
    }

    public void adicionarSaldo(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void subtrairSaldo(double valor) {
        this.saldo = this.saldo - valor;
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("O saldo da sua conta é R$" + this.getSaldo());
    }
}
