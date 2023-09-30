package Entities;

public class PessoaJuridica extends Pessoa {
	
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String name, Double renda, int numeroFuncionarios) {
		super(name, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double taxa() {
		if (numeroFuncionarios <= 10) {
			return this.getRenda() * 0.16;
		}
		else {
			return this.getRenda() * 0.14;
		}
	}
	
	
	
	
}
