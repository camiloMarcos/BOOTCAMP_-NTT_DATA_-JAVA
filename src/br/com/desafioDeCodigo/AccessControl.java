package br.com.desafioDeCodigo;

import java.util.Scanner;

public class AccessControl {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Entrada de dados do usuário
		System.out.println("Possui Autorização - digite: (true ou false)");
		boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
		System.out.println("DIGITE A IDADE DO VISITANTE");
		int age = scanner.nextInt(); // Lê a idade como inteiro

		scanner.nextLine(); // Limpar o Buffer

		if (age < 18) {
			System.out.println("Idade insuficiente");
		} else if (!hasPermission) {
			System.out.println("Acesso negado");
		} else {
        	System.out.println("Acesso permitido");
        }

		scanner.close();
	}

}
