/*	Escreva um código que calcule o valor de tributos de produtos, os produtos disponíveis devem ser os seguintes:
 	Alimentação, Saúde e Bem Estar, Vestuário e Cultura. Todos os produtos devem ter um método para retornar o seu 
 	valor de imposto, de acordo com seu tipo
 	
 	Alimentação			-> 1%
 	Saúde e Bem Estar	-> 1,5%
 	Vestuário			-> 2,5%
 	Cultura				-> 4%
*/

package br.com.interfacesELambda.TributaçãoProdutos;

public abstract interface Produtos {
	public static final double IMPOSTO_ALIMENTO = 0.01;
	public static final double IMPOSTO_SAUDE = 0.015;
	public static final double IMPOSTO_VESTUARIO = 0.025;
	public static final double IMPOSTO_CULTURA = 0.04;
	
public abstract	double tributacao();

}
