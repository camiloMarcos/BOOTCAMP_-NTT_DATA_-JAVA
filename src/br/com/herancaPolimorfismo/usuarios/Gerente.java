/*	gerente ->	deve ter os métodos de gerar relatório financeiro, consultar vendas,
 				realizar login, realizar logf, alterar dados alterar senha.*/
package br.com.herancaPolimorfismo.usuarios;

public class Gerente extends Usuarios {

	private final boolean ADMINISTRADOR = true;

	public Gerente(String nome, String email, String senha) {
		super(nome, email, senha);

	}

	public boolean isAdministrador() {
		return ADMINISTRADOR;
	}

	public void gerarRelatorioFinanceiro() {

	}

	public void consultarVendas() {

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logoff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterarDados() {
		// TODO Auto-generated method stub

	}

	
}
