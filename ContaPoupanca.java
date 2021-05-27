public class ContaPoupanca extends Conta {
    // Classe conta poupança: Herda a classe conta, e não adiciona atributos.

    // Métodos obrigatórios:

    // Aplica o valor de rendimento recebido por parâmetro ao saldo da conta
    public double calculaRendimento(double porcentagemRendimento) {
        double porcentagemNova = porcentagemRendimento / 100.0;
        return porcentagemNova * this.saldo;
        // --> rendimento anual de 2,45%, o que equivale a 0,20% ao mês
    }

    public ContaPoupanca(String numeroConta, String nomeCliente, String cPF, double saldo) {
        super(numeroConta, nomeCliente, cPF, saldo);
    }
}
