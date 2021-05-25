public class ContaEspecial extends ContaCorrente{
/* e indica uma conta que possui um gerente 
associado. Para tanto, adiciona as seguintes modificações:*/

//Atributos:
protected String nomeGerenteResponsável;

//Métodos Obrigatórios:
//get/set do nome do gerente;
public String getNomeGerenteResponsável() {
    return nomeGerenteResponsável;
}

public void setNomeGerenteResponsável(String nomeGerenteResponsável) {
    this.nomeGerenteResponsável = nomeGerenteResponsável;
}
//Modificações no imprimir, para que o nome do gerente seja retornado;

//--> Construtor 1:

/*Construtor:
 adiciona o nome do gerente aos dois construtores da classe conta corrente – ou 
seja, um construtor recebe os três parâmetros necessários à classe conta, mais o nome do 
gerente, e o outro construtor recebe todos esses parâmetros e ainda o limite da conta;
*/

//--> Construtor 2
public ContaEspecial(String numeroConta, String nomeCliente, String cPF, double limite, String nomeGerenteResponsável) {
    super(numeroConta, nomeCliente, cPF, limite);
    this.nomeGerenteResponsável = nomeGerenteResponsável;
}
}
