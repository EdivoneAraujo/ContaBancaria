import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nome = "Helena Machado";
        String tipoConta = "corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("Banco Maravilha");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("************************");

        String menu = """
                *** Digite sua opção ***
               1 - Consultar saldos
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
               """;

        Scanner scan = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valor = scan.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo é de R$" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja depositar: ");
                double valor = scan.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo é de R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}