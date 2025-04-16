import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String agencia;
        int numeroConta;
        String nomeCliente;
        double saldo = 237.48;
        
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, informe seu nome: ");
        nomeCliente = scan.nextLine();

        scan.close();

        informacoesConta(agencia, numeroConta,  nomeCliente, saldo);
    }

    public static void informacoesConta(String agencia, int numeroConta, String nomeCliente, double saldo) {
    
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
