/*	Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:
  	
  	Classe gerente que terá os atributos: nome, E-mail, senha, 
  	e um atributo que informa  se ele É ADMINISTRADOR, esse ultimo deve ser sempre verdadeiro.
  	
  	Classe vendedor que terá os atributos: nome, E-mail, senha, 
  	qde de vendas e um atributo que informa se ele é ADM, esse ultimo deve ser sempre falso.
  	
  	Classe atendente que terá os atributos: nome, E-mail, senha, valor em caixa e 
  	um atributo que informa se ele é ADM, esse ultimo deve ser sempre falso.
 
 	cada classe deve contes seus respectivos getters e setters (para os atributos que fazem sentido ter) e as classes
 	devem ter os seguintes metodos.
 	
 	gerente -> deve ter os métodos de gerar relatório financeiro, consultar vendas,
 				realizar login, realizar logf, alterar dados alterar senha.
 	
 	vendendor -> deve ter os realizar venda(incremetar o numero de vendas quendo acionado), consultar vendas,
 	 			realizar login, realizar logf, alterar dados alterar senha.
  
  	Atendente -> deve ter os receber os pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa),
  				fechar caixa, realizar login, realizar logf, alterar dados alterar senha.
  	
 * */

package br.com.herancaPolimorfismo.usuarios;

import java.util.Scanner;

public abstract class Usuarios {
	Scanner scan = new Scanner(System.in);

	private String nome;
	private String email;
	private String senha;
	private boolean administrador;

	public Usuarios(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public abstract void login();

	public abstract void logoff();

	public void alterarDados() {
		System.out.println("ALTERAR NOME");
		String nomeAlterado = scan.nextLine();
		setNome(nomeAlterado);

		System.out.println("ALTERAR EMAIL");
		String emailAlterado = scan.nextLine();
		setEmail(emailAlterado);
	}

	public void alterarSenha() {
		System.out.println("DIGITE NOVA SENHA");
		String novaSenha = scan.nextLine();
		setSenha(novaSenha);
	}

	public void exibirInfo() {
		System.out.println("=====" + getClass().getSimpleName() + "=====");
		System.out.println("Nome: " + getNome() + "\nEmail:  " + getEmail() + "\nSenha: " + getSenha()
				+ "\nAdministrador: " + isAdministrador());
	}

}
