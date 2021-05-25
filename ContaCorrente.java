public class ContaCorrente extends Conta {
//Classe conta corrente: Herda a classe conta

//Adiciona as seguintes modificações:
protected double limite;

//Métodos obrigatórios:
public boolean usandoLimite(){
    if (saldo<0){
        return true;
    } return false;
    //--> Condição: Retorna true se o cliente estiver utilizando o limite (saldo negativo)
    //-->e false em caso contrário;
}

//Reimplementação do sacar, que deve considerar o limite – mesma assinatura do método original, apenas com reimplementação;
//--> Dar um Override 
@Override
    public boolean sacar(double valorSacado){
    if ((saldo-valorSacado)<0){
    saldo-=valorSacado;
    }return true;
}
//Mudanças no imprimir, que deve retornar também o limite da conta;
@Override
    public String imprimir(){
    s = String.valueOf(saldo);
    return s;
}
//-->Dar Override
//Construtor 1: um que recebe apenas os parâmetros necessários
public ContaCorrente(String numeroConta, String nomeCliente, String cPF, double saldo) {
    super(numeroConta, nomeCliente, cPF, saldo);
}

//Construtor 2 que recebe os mesmos parâmetros mais o limite da conta.
public ContaCorrente(String numeroConta, String nomeCliente, String cPF, double saldo, double limite) {
    super(numeroConta, nomeCliente, cPF, saldo);
    this.limite = limite;
}
}
