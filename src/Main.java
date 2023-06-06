import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "John Doe";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n************************************");

        int operacao;
        double valor =0;
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println(
                    """
                    
                    Selecione uma opção:
                    
                    1 - Ver saldo
                    2 - Receber depósito
                    3 - Sacar valor
                    4 - Sair
                    """
            );

            operacao = leitura.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Saldo atualizado: R$" + saldo);
                    break;
                case 2:
                    System.out.printf("Digite o valor a ser depositado:");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo Atualizado: R$" + saldo);
                    break;
                case 3:
                    System.out.printf("Digite o valor a ser sacado:");
                    valor = leitura.nextDouble();
                    if(valor>saldo){
                        System.out.println("Sem saldo suficiente!");
                    } else {
                        saldo-= valor;
                        System.out.println("Saldo Atualizado: R$" + saldo);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (operacao!=4);
    }
}
