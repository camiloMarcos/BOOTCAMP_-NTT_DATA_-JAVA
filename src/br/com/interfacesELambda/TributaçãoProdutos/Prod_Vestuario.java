package br.com.interfacesELambda.TributaçãoProdutos;

public class Prod_Vestuario implements Produtos {

	private String nomeVest;
	private double valorVestuario;

	public Prod_Vestuario(String nomeVest, double valorVestuario) {
		super();
		this.nomeVest = nomeVest;
		this.valorVestuario = valorVestuario;
	}

	public String getNomeVest() {
		return nomeVest;
	}

	public void setNomeVest(String nomeVest) {
		this.nomeVest = nomeVest;
	}

	public double getValorVestuario() {
		return valorVestuario;
	}

	public void setValorVestuario(double valorVestuario) {
		this.valorVestuario = valorVestuario;
	}

	@Override
	public double tributacao() {
		// TODO Auto-generated method stub
		return valorVestuario * IMPOSTO_VESTUARIO;
	}

}
