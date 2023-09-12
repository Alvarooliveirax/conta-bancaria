import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        Scanner teclado = new Scanner (System.in);

       System.out.println("Digite o número da agência: ");
        int num_agencia = teclado.nextInt();

       System.out.println("Digite o nome da agência bancária: ");
        String nome_agencia = teclado.next();

       System.out.println("Digite o nome do cliente: ");
        String nome_cliente = teclado.next();

       System.out.println("Digite o saldo bancário: ");
        Double saldo = teclado.nextDouble();

        System.out.println("Olá, " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é, " + nome_agencia + ", conta " + num_agencia + " e seu saldo de: " + saldo + ", já está disponível para saque");
       
    }
}
