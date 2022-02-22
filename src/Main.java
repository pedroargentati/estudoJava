import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaCorrente pessoa = new ContaCorrente();
		pessoa.setSaldo(0);

		System.out.print("Informe o nome usuário: ");
		pessoa.setNome(teclado.next());

		System.out.print("Informe o numero: ");
		pessoa.setNumero(teclado.nextInt());
		System.out.println();

		int escolha = 0;
		while (escolha != 4) {
			System.out.println("Qual ação você deseja realizar: ");
			System.out.println("1- Sacar");
			System.out.println("2- Depositar");
			System.out.println("3- Ver saldo ");
			System.out.println("4- Sair");
			System.out.print("Ação: ");

			escolha = teclado.nextInt();

			switch (escolha) {
			case 1: {
				double valor = 0;
				System.out.println();
				System.out.print(pessoa.getNome() + ", informe o valor a ser sacado : R$");
				valor = teclado.nextInt();

				if (pessoa.getSaldo() < valor) {
					System.out.println("\nSaldo insuficiente! Saldo atual: R$" + pessoa.getSaldo());
					System.out.println();
				} else if (valor == 0) {
					System.out.println("\nVocê precisa informar um valor maior que 0!");
					System.out.println();
				} else {
					pessoa.sacar(valor);
					System.out.println("\nSaldo após o saque de " + valor + ": R$" + pessoa.getSaldo());
					System.out.println();
				}
				break;

			}
			case 2: {
				double valor = 0;
				System.out.print(pessoa.getNome() + ", informe o valor que deseja depositar: R$ ");
				valor = teclado.nextInt();
				pessoa.depositar(valor);
				System.out.println("Saldo após o depósito de " + valor + ": R$" + pessoa.getSaldo());
				System.out.println();
				break;
			}

			case 3: {
				System.out.println(pessoa.getNome() + ", seu saldo da sua Conta Corrente é: R$" + pessoa.getSaldo());
				break;
			}

			case 4:
				System.out.println("O programa foi encerrado.");
				System.exit(0);
			default:
				System.out.println("\nOpção " + escolha + " inválida! Tente novamente.");
				System.out.println();
			}

		}

		teclado.close();
	}

}
