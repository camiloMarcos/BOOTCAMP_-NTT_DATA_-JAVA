/*	vendendor->	deve ter os realizar venda(incremetar o numero de vendas quando acionado), consultar vendas,
 				realizar login, realizar logf, alterar dados alterar senha.
 * */

package br.com.herancaPolimorfismo.usuarios;

import java.util.Scanner;

public class Vendedor extends Usuarios {
	Scanner scan = new Scanner(System.in);

	private int quantidadeVenda;
	private int incrementoVenda;
	private final boolean ADMINISTRADOR = false;

	public Vendedor(String nome, String email, String senha, int quantidadeVenda) {
		super(nome, email, senha);
		this.quantidadeVenda = quantidadeVenda;

	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}

	public boolean isAdministrador() {
		return ADMINISTRADOR;
	}

	public int realizarVenda() {
		System.out.println("DIGITE QUANTIDADE DE VENDA!");
		int incrementoVenda = scan.nextInt();
		return quantidadeVenda + incrementoVenda;
	}

	public void consultarVendas() {
		System.out.println("Total De Vendas: " + quantidadeVenda);
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

	@Override
	public void alterarSenha() {
		// TODO Auto-generated method stub

	}

}