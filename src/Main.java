import java.util.Scanner;

public class Main {

	static private final Banco bancoDio = new Banco();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option = 0;
		while(option != 8){
			menu();
			option = sc.nextInt();

			switch (option){
				case 1:
					System.out.println("Digite nome do cliente:");
					sc.nextLine();
					String cliente = sc.nextLine();
					System.out.println("Digite 1 para Conta Corrente e 2 para Poupança:");
					int tipoConta = sc.nextInt();
					if(tipoConta == 1){
						bancoDio.criarConta(new ContaCorrente(new Cliente(cliente)));
					} else if (tipoConta == 2){
						bancoDio.criarConta(new ContaPoupanca(new Cliente(cliente)));
					} else {
						System.out.println("Tipo de conta inválido!");
					}
					break;
				case 2:
					System.out.println("Digite numero da conta:");
					int numeroContaSaque = sc.nextInt();
					System.out.println("Digite o valor:");
					int valorSaque = sc.nextInt();
					bancoDio.buscarPorNumero(numeroContaSaque).sacar(valorSaque);
					break;
				case 3:
					System.out.println("Digite numero da conta:");
					int numeroContaDeposito = sc.nextInt();
					System.out.println("Digite o valor:");
					int valorDeposito = sc.nextInt();
					bancoDio.buscarPorNumero(numeroContaDeposito).depositar(valorDeposito);
					break;
				case 4:
					System.out.println("Digite numero da sua conta:");
					int numeroContaTransferencia  = sc.nextInt();
					System.out.println("Digite numero da conta destino:");
					int numeroContaDestino = sc.nextInt();
					System.out.println("Digite o valor:");
					int valorTransferencia = sc.nextInt();
					bancoDio.buscarPorNumero(numeroContaTransferencia).transferir(valorTransferencia, bancoDio.buscarPorNumero(numeroContaDestino));
					break;
				case 5:
					System.out.println("Digite numero da conta:");
					int numeroContaFechar  = sc.nextInt();
					bancoDio.deletarConta(numeroContaFechar);
					break;
				case 6:
					bancoDio.listarContas();
					break;
				case 7:
					System.out.println("Digite numero da conta:");
					int numeroContaBusca  = sc.nextInt();
					bancoDio.buscarPorNumero(numeroContaBusca).imprimirExtrato();
					break;
				case 8:
					System.out.println("Obrigado! Volte sempre!");
					break;
				default:
					System.out.println("Opção inválida.");
			}
		}



	}

	static public void menu(){
		System.out.println("Bem vindo ao Banco DIO\n" +
				"Escolha uma das opções abaixo:\n" +
				"1 - Abrir conta\n" +
				"2 - Sacar\n" +
				"3 - Depositar\n" +
				"4 - Transferir\n" +
				"5 - Fechar conta\n" +
				"6 - Listar contas\n" +
				"7 - Buscar conta\n" +
				"8 - Sair");
	}

}
