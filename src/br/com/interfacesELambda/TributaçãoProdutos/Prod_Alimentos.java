package br.com.interfacesELambda.TributaçãoProdutos;

public class Prod_Alimentos implements Produtos {

	private String nomeAliment;
	private double valorAlimento;

	public Prod_Alimentos(String nomeAliment, double valorAlimento) {
		super();
		this.nomeAliment = nomeAliment;
		this.valorAlimento = valorAlimento;
	}

	public String getNomeAliment() {
		return nomeAliment;
	}

	public void setNomeAliment(String nomeAliment) {
		this.nomeAliment = nomeAliment;
	}

	public double getValorAlimento() {
		return valorAlimento;
	}

	public void setValorAlimento(double valorAlimento) {
		this.valorAlimento = valorAlimento;
	}

	@Override
	public double tributacao() {

		return valorAlimento * IMPOSTO_ALIMENTO;
	}

}
