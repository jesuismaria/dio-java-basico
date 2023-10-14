import java.util.Locale;
import java.util.Scanner; 
public class ContaTerminal {
    public static void main(String[] args) {
       try (//TODO:conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //Exibir as mensagens para o nosso usuário
               //Obter pela Scanner os valores digitados no terminal
                System.out.println("Por favor, insira o número da sua conta: ");
                int numero = scanner.nextInt();

                System.out.println("Insira sua agencia: ");
                String agencia = scanner.next();

                System.out.println("Insira seu nome: ");
                String nomeCliente = new Scanner(System.in).nextLine();
                
                System.out.println("Insira seu saldo: ");
                Float saldo = scanner.nextFloat();
               //Exibir a mensagem conta criada
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + ", já está disponível para saque.");
        }
       
       
    }
}
