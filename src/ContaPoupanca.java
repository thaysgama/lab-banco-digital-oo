
public class ContaPoupanca extends Conta {

	private double rendimento;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.rendimento = 0.01;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public void sacar(double valor) {
		if(getSaldo()<valor){
			System.out.println("Você não tem limite disponível para essa operação.");
		} else {
			setSaldo(getSaldo()-valor);;
			System.out.println("Saque feito com sucesso");
		}

	}

	public double getSaldo() {
		return saldo*(rendimento+1);
	}

	@Override
	public String toString() {
		return "ContaPoupanca{" +
				"agencia=" + agencia +
				", numero=" + numero +
				", saldo=" + getSaldo() +
				", cliente=" + cliente +
				", rendimento=" + rendimento +
				"} ";
	}
}
