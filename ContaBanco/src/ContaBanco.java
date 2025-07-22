import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args){
        int conta;
        String agencia, nomeCliente;
        double saldo;

        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência: ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();
        System.out.println("Por favor, informe a Agência: ");
        agencia = scanner.next();
        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, conta, saldo);

    }
}
