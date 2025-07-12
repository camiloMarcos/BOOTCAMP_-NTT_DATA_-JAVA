package br.com.interfacesELambda.TributaçãoProdutos;

public class Prod_SaudeEBemEstar implements Produtos {

	private String nomeSaud;
	private double valorSaude;

	public Prod_SaudeEBemEstar(String nomeSaud, double valorSaude) {
		super();
		this.nomeSaud = nomeSaud;
		this.valorSaude = valorSaude;
	}

	public String getNomeSaud() {
		return nomeSaud;
	}

	public void setNomeSaud(String nomeSaud) {
		this.nomeSaud = nomeSaud;
	}

	public double getValorSaude() {
		return valorSaude;
	}

	public void setValorSaude(double valorSaude) {
		this.valorSaude = valorSaude;
	}

	@Override
	public double tributacao() {
		// TODO Auto-generated method stub
		return valorSaude * IMPOSTO_SAUDE;
	}

}
