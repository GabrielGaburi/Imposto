package Entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String name, Double renda, Double gastosSaude) {
		super(name, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double taxa() {

		if (this.getRenda() < 20000) {
			return (this.getRenda() * 0.15 - this.getGastosSaude() * 0.5 );
		} else {
			return (this.getRenda() * 0.25 - this.getGastosSaude() * 0.5 );
		}

	}

}
