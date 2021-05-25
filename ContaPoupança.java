public class ContaPoupança extends Conta {

   // Classe conta poupança: Herda a classe conta, e não adiciona atributos.
   
   //Métodos obrigatórios:
   //aplica o valor de rendimento  recebido por parâmetro ao saldo da conta 

    public double calculaRendimento(double porcentagemRendimento){
        return (0.02 * saldo)*100.0;
        //--> rendimento anual de 2,45%, o que equivale a 0,20% ao mês
    }

    public ContaPoupança(String numeroConta, String nomeCliente, String cPF, double saldo) {
        super(numeroConta, nomeCliente, cPF, saldo);
    }
}
