/*
 * Escreva um código que receba o nome e o ano de nascimento de alguém e imprima em tela a seguinte mensagem:
 * "Olá ´fulano´você tem x idade." * */

package br.com.fundamentosProgramaçãoJava;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		LocalDate anoAtual = LocalDate.now();

		System.out.println("Digite seu nome!");
		String nome = scan.nextLine();
		System.out.println("Digite o ano de seu nascimento!");
		int dataNasc = scan.nextInt();

		var calculoIdade = anoAtual.getYear() - dataNasc;

		System.out.printf("Olá %s, você tem %s anos de idade.", nome, calculoIdade);

		scan.close();

	}

}
