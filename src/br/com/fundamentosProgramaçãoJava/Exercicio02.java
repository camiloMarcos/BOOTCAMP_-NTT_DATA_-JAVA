/*Escreva um código que receba o tamanho do Lado de um quadradi, calcule sua área e imprima na tela */

package br.com.fundamentosProgramaçãoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("	!");
		double tamanhoLado = scan.nextDouble();
		scan.nextLine(); // Limpar o buffer
		System.out.println("Deseja converter para centímetos? (y/n)");
		String conversor = scan.nextLine();
		
		double tamanhoLadoConvert = tamanhoLado* 100;
		
		double areaMetros =  tamanhoLado* tamanhoLado;
		double areaCentimetros = areaMetros* 10.000;
		
		
		
		if(conversor.equalsIgnoreCase("n")) {
			System.out.printf("A área do quadrado é %s m²", areaMetros);
		}
		else if (conversor.equalsIgnoreCase("y")) {
			System.out.printf("A Área do quadrado, CONVERTIDA é %s cm²", areaCentimetros);
		}
		else {
			System.out.println("Opção Inválida, Bença!\nEscolha: (Y ou N)");
		}
		
		
		scan.close();

	}

}
