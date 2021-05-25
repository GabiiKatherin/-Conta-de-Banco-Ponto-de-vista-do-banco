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
public boolean sacar(double valor) {
    if (saldo < valor) {
        limite -= (valor-saldo);
        return false;
    }  return true;
    }

    //??Mudanças no imprimir, que deve retornar também o limite da conta;??

//-->Dar Override
//Construtor: um que recebe apenas os parâmetros necessários


//Construtor 2 que recebe os mesmos parâmetros mais o limite da conta.
public ContaCorrente(String numeroConta, String nomeCliente, String cPF, double saldo, double limite) {
    super(numeroConta, nomeCliente, cPF, saldo);
    this.limite = limite;
}
}
