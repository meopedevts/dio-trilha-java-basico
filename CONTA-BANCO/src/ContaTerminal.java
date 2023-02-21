import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.next();
        nome = nome + " " + sc.next();

        System.out.println("Digite sua agencia:");
        String agencia = sc.next();

        System.out.println("Digite o numero da Agencia:");
        int numero = sc.nextInt();

        System.out.println("Digite o valor do seu saldo:");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
    }
}
