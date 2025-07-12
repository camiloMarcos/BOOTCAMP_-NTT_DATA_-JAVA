/*Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela.*/

package br.com.fundamentosProgramaçãoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CALCULADOR DE ÁREA RETANGULAR.\n");
		
		System.out.println("Informe o tamanho da BASE do retângulo, EM METROS");
		double baseMetros = scan.nextDouble();
		System.out.println("Informe o tamanho da ALTURA do retângulo, EM METROS");
		double alturaMetros = scan.nextDouble();
		scan.nextLine();
		
		double areaRetangulo = baseMetros* alturaMetros;
		double areaCentimetros = areaRetangulo* 10000;
		
				
		while (true) {
			
			System.out.println("DESEJA CONVERTER A ÁREA DE METROS PARA CENTÍMETROS? (y/n)");
			String convert = scan.nextLine();
			
			if(convert.equalsIgnoreCase("n")) {
				System.out.printf("A área do retângulo, EM METROS, é %.2f m².\n", areaRetangulo);
				break;
			}else if(convert.equalsIgnoreCase("y")){
				System.out.printf("A área do retângulo, EM CENTÍMETROS, é %.2f cm².\n", areaCentimetros);
				break;
			}else {
				System.out.println("OPERAÇÃO INVÁLIDA!!! Por favor, digite (y ou n).\n");
			}	
			
			
		}
		
		
			
	}

}
