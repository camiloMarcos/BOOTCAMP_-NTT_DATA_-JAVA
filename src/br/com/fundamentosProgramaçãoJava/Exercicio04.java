/*Escreva um código que receba o nome e a idade de duas pessoas, e imprima a diferença de idade*/

package br.com.fundamentosProgramaçãoJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("DIGITE O NOME DA PRIMEIRA PESSOA!");
		String pessoa1 = scan.nextLine();
		System.out.println("DIGITE A IDADE DA PRIMEIRA PESSOA!");
		int idadeP1 = scan.nextInt();
		
		scan.nextLine(); // Limpar o buffer
		
		System.out.println("DIGITE O NOME DA SEGUNDA PESSOA!");
		String pessoa2 = scan.nextLine();
		System.out.println("DIGITE A IDADE DA SEGUNDA PESSOA!");
		int idadeP2 = scan.nextInt();
		
		int diferencaIdade = Math.abs(idadeP1 - idadeP2);
		
		System.out.printf("""
				NOME: %s ->	IDADE: %s
				NOME: %s ->	IDADE: %s
				
				A diferença de idade é de: %s anos.""", pessoa1, idadeP1, pessoa2, idadeP2, diferencaIdade);
		
		scan.close();

	}

}

		
//		if (idadeP1>=idadeP2) {
//			int diferencaIdade = idadeP1 - idadeP2;
//			System.out.printf("""
//					NOME: %s ->	IDADE: %s
//					NOME: %s ->	IDADE: %s
//					
//					A diferença de idade é de: %s anos.""", pessoa1, idadeP1, pessoa2, idadeP2, diferencaIdade);
//		}else {
//			int diferencaIdade = idadeP2 - idadeP1;
//			System.out.printf("""
//					NOME: %s ->	IDADE: %s
//					NOME: %s ->	IDADE: %s
//					
//					A diferença de idade é de: %s anos.""", pessoa1, idadeP1, pessoa2, idadeP2, diferencaIdade);
//		}
		
		
		

