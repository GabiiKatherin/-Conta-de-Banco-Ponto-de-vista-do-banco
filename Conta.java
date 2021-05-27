public abstract class Conta {

    protected String numeroConta;
    // -->Validação de conta 8 algarismos + dig
    protected String nomeCliente;
    // -->Minimo 3 letras
    protected String CPF;
    // --> Condição pra validar 11 digitos
    protected double saldo;
    protected String s;

    // Todos os atributos deverão ter get, porém o saldo, o número da conta
    // CPF não poderão ter sets públicos
    public String getNumeroConta() {
        return this.numeroConta;
    }

    protected void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPF() {
        return this.CPF;
    }

    protected void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos obrigatórios

    // --> Recebe um valor a ser sacado como parâmetro
    // --> E valida se é possível efetuar o saque
    // --> Retorna true, se for.
    public boolean sacar(double valorSacado) {
        if ((saldo - valorSacado) >= 0) {
            saldo -= valorSacado;
            return true;
        }
        return false;
    }

    // --> Recebe um valor a ser depositado como parâmetro
    // --> Deposita
    public boolean depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
            return true;
        }
        return false;
    }

    public String imprimir() {
        return new String("saldo: " + String.valueOf(this.saldo));
        // Converter de Double pra String e dar um imprimir saldo
    }

    // Construtor: que receba o número da conta, nome do cliente e CPF;
    public Conta(String numeroConta, String nomeCliente, String cPF, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        CPF = cPF;
    }

    public static void add(String numeroConta2) {
    }

    public static Object toArray() {
        return null;
    }

    public static void remove(String string) {
    }
}