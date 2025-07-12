package br.com.herancaPolimorfismo.usuarios;

import java.util.Scanner;

public class MainUsuarios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Atendente a1 = new Atendente("Emily João", "joaoemily@", "02468", 67000.0);
//		a1.exibirInfo();
//		
		System.out.println();
		Vendedor v1 = new Vendedor("liphe Lima","limaliphe@", "13579", 10);
		v1.exibirInfo();
		
		System.out.println();
		
		Gerente g1 = new Gerente("Marcos Camilo", "camiloMarcos@", "123456");
		g1.exibirInfo();
//		g1.alterarSenha();
//		System.out.println();
//		g1.exibirInfo();

	}

}
