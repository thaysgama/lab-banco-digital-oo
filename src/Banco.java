import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Banco {

	private String nome;
	private List<Conta> contas;


	public Banco() {
		this.nome = "BNACO DIO";
		this.contas = new ArrayList<>();
	}

	public void criarConta(Conta conta){
		contas.add(conta);
	}

	public Conta buscarPorNumero(int numero){
		return contas.stream().filter(conta-> conta.getNumero()== numero).findFirst().orElse(null);
	}

	public void listarContas(){
		contas.forEach(System.out::println);
	}

	public void deletarConta(int numero){
		contas.remove(buscarPorNumero(numero));
	}


}
