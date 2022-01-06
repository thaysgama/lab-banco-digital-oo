public class ContaCorrente extends Conta {

	private double chequeEspecial;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.chequeEspecial = 1000.0;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}


	public void sacar(double valor) {
		if(getSaldo() + chequeEspecial <valor){
			System.out.println("Você não tem limite disponível para essa operação.");
		} else {
			saldo -= valor;
			System.out.println("Saque feito com sucesso");
		}

	}

	@Override
	public String toString() {
		return "ContaCorrente{" +
				"agencia=" + agencia +
				", numero=" + numero +
				", saldo=" + saldo +
				", cliente=" + cliente +
				", chequeEspecial=" + chequeEspecial +
				"} ";
	}
}
