import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sn.next();
        sn.next();

        System.out.println("Por favor, informe a agência: ");
        String agencia = sn.next();

        System.out.println("Por favor, informe o número da conta: ");
        int numero = sn.nextInt();

        System.out.println("Por favor, informe o saldo: ");
        double saldo = sn.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sn.close();
    }
}
