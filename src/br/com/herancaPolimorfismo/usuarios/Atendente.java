/*
 Atendente-> deve ter os receber os pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa),
  				fechar caixa, realizar login, realizar logf, alterar dados alterar senha.
 * */

package br.com.herancaPolimorfismo.usuarios;

public class Atendente extends Usuarios {

	private double valorEmCaixa;
	private final boolean ADMINISTRADOR = false;

	public Atendente(String nome, String email, String senha, double valorEmCaixa) {
		super(nome, email, senha);
		this.valorEmCaixa = valorEmCaixa;

	}

	public double getValorEmCaixa() {
		return valorEmCaixa;
	}

	public void setValorEmCaixa(double valorEmCaixa) {
		this.valorEmCaixa = valorEmCaixa;
	}

	public boolean isAdministrador() {
		return ADMINISTRADOR;
	}
	
	public double receberPagamento(double valorRecebido) {
		return valorEmCaixa + valorRecebido;
	}
	
	public void fecharCaixa() {
		System.out.println("Valor Total Em Caixa: " + valorEmCaixa);
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logoff() {
		// TODO Auto-generated method stub

	}

		
	
}
