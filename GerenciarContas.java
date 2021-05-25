import java.util.ArrayList;

public class GerenciarContas{
    int totaldeContas = 0;

//reúne todas as contas criadas
    ArrayList<Conta> conta = new ArrayList<>();
 
//Atributos:

//Metodos Obrigatorios
public void adicionarConta(Conta c){
    
}

//retorna true se conseguir encontrar 
//e remover a conta, false em caso contrário;
/* public boolean removerConta(int numeroConta){
    
}

//busca todas as contas especiais, guardando os 
//dados dessas contas em uma String e então retornando o resultado da busca;
public String buscarContasEspeciais(){

} 
/busca todos os clientes de conta corrente 
//que estejam utilizando o limite, guardando os dados dessas contas em uma String e 
//então retornando o resultado da busca
public String buscarClientesUsandoLimite(){

} 
//busca uma conta pelo seu número, e a 
//retorna se encontrar. Caso a conta não exista, deve retornar null;
public Conta buscarConta(int numeroConta){

}
public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double 
valor){

}//– deve buscar a conta 
indicada pelo número e então sacar o valor especificado, usando o método de sacar da 
//conta. Se a conta não for encontrada, ou o valor não puder ser sacado, retorna false;
public boolean sacar(int numeroConta, double valorSacado){

}
/*– deve buscar a conta indicada e realizar o depósito. Caso não encontre o número da conta,
ou o depósito falhe, retornar false;*/ 
//public boolean depositar(int numeroConta, double valorDepositado){

/*– retorna uma String com os dados de todas as contas;*/
//public String listarContas(){

}

