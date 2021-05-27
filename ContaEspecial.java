public class ContaEspecial extends ContaCorrente{
/* e indica uma conta que possui um gerente 
associado. Para tanto, adiciona as seguintes modificações:*/

//Atributos:
protected String nomeGerenteResponsavel = "Victor";

//Métodos Obrigatórios:
//get/set do nome do gerente;
public String getNomeGerenteResponsavel() {
    return nomeGerenteResponsavel;
}

public void setNomeGerenteResponsavel(String nomeGerenteResponsavel) {
    this.nomeGerenteResponsavel = nomeGerenteResponsavel;
}
//Modificações no imprimir, para que o nome do gerente seja retornado;
@Override
public String imprimir() {
    return new String("saldo: " + String.valueOf(this.saldo) + " - limite: " + String.valueOf(this.limite)) + "Nome do gerente: " + nomeGerenteResponsavel;
}
//Construtor: adiciona o nome do gerente aos dois construtores da classe conta corrente.

//--> Contrutor 1: um construtor recebe os parâmetros necessários à classe conta, + o gerente.
public ContaEspecial(String numeroConta, String nomeCliente, String cPF, double saldo, String nomeGerenteResponsavel){
    super(numeroConta, nomeCliente, cPF, saldo);
    this.nomeGerenteResponsavel = nomeGerenteResponsavel;
}

//--> Construtor 2: recebe todos esses parâmetros e ainda o limite da conta;
public ContaEspecial(String numeroConta, String nomeCliente, String cPF, double saldo, double limite,
            String nomeGerenteResponsavel) {
        super(numeroConta, nomeCliente, cPF, saldo, limite);
        this.nomeGerenteResponsavel = nomeGerenteResponsavel;
    }
}
