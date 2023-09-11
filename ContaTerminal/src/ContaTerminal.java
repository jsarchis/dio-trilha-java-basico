import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);
        int numeroConta;
        String nomeCliente, numeroAgencia;
        double saldo;

        System.out.println("## Por favor, preencha os dados ##");
        System.out.print("Nome: ");
        nomeCliente = le.nextLine();
        System.out.print("Numero da conta: ");
        numeroConta = le.nextInt();
        System.out.print("Agencia: ");
        numeroAgencia = le.next();
        System.out.print("Saldo requisitado: ");
        saldo = le.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua Agencia é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já esta disponivel para saque! ");

    }
}
