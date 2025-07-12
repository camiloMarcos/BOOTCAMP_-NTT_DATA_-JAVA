package br.com.interfacesELambda.TributaçãoProdutos;

public class Prod_Cultura implements Produtos {
	private String nomeCult;
	private double valorCultura;

	public Prod_Cultura(String nomeCult, double valorCultura) {
		super();
		this.nomeCult = nomeCult;
		this.valorCultura = valorCultura;
	}

	public String getNomeCult() {
		return nomeCult;
	}

	public void setNomeCult(String nomeCult) {
		this.nomeCult = nomeCult;
	}

	public double getValorCultura() {
		return valorCultura;
	}

	public void setValorCultura(double valorCultura) {
		this.valorCultura = valorCultura;
	}

	@Override
	public double tributacao() {
		// TODO Auto-generated method stub
		return valorCultura * IMPOSTO_CULTURA;
	}

}
