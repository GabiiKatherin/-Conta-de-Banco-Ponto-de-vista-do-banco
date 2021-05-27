import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    ContaCorrente cc1 = new ContaCorrente("", "", "", 0);
    cc1.setNomeCliente("");
    cc1.setNumeroConta("");
    cc1.imprimir();

        boolean sair = true;
  
        while (sair) {
            int menu;
            System.out.println("\nEscolha a sua opção desejada:");

            do {
                System.out.println("----- Abertura de Contas: -------"); 
                System.out.println("1 – Abrir Conta Corrente: "); 
                System.out.println("2 – Abrir Conta Especial: ");
                System.out.println("3 - Abrir Conta Poupança:"); 


                System.out.println("----- Movimentação de Contas: -------"); 
                System.out.println("4 – Sacar Conta Corrente: ");
                System.out.println("5 – Sacar Conta Especial: ");
                System.out.println("6 – Sacar Conta Poupança: ");

                System.out.println("7 – Depositar Conta Corrente: ");
                System.out.println("8 – Depositar Conta Especial: ");
                System.out.println("9 – Depositar Conta Poupança: ");

                System.out.println("10 - Cancelar.");
            
                if (menu < 1 || menu > 10) {
                    System.out.println("Opção Inválida, tente novamente.");
                }
            } break;
        } 
    }
} 
