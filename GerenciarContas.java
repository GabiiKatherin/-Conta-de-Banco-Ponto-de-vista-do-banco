import java.util.ArrayList;

public class GerenciarContas{
    int totaldeContas = 0;

//reúne todas as contas criadas
    ArrayList<Conta> conta = new ArrayList<>(); 
//Atributos:

//Metodos Obrigatorios
public void adicionarConta(Conta c){
    conta.add(c);
}
//retorna true se conseguir encontrar 
//e remover a conta, false em caso contrário;
public boolean removerConta(int numeroConta){
    conta.remove(conta);
    return true;
}
//busca todas as contas especiais, guardando os 
//dados dessas contas em uma String e então retornando o resultado da busca;
public String buscarContasEspeciais(int numeroConta){
    for (Conta ContaEspecial : conta) {System.out.println(ContaEspecial.getNomeCliente());}       
}}

//busca todos os clientes de conta corrente 
//que estejam utilizando o limite, guardando os dados dessas contas em uma String e 
//então retornando o resultado da busca
public String buscarClientesUsandoLimite(){
    for (Conta usandoLimite : conta) {System.out.println(usandoLimite.getNomeCliente());}     
    return null;   
} 
//busca uma conta pelo seu número, e a 
//retorna se encontrar. Caso a conta não exista, deve retornar null;
public void buscarConta(int numeroConta){
    for (Conta CPF : conta) {System.out.println(CPF.getNomeCliente());}        
}
public boolean transferirValor(int numeroContaFonte, double numeroContaDestino, double 
valor){
    if (valor > 0){
        boolean retirou = this.sacar(numeroContaFonte, valor);
        if (retirou == false){
        return false;
        }else{
        return true;
        }
        }else{
        }return false;
    }
private boolean sacar(int numeroContaFonte, double valor) {
    return false;
}

}

