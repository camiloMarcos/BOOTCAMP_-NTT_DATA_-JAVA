package br.com.interfacesELambda.TributaçãoProdutos;

public class MainProdutos {

	public static void main(String[] args) {
		
		Prod_Alimentos a1 = new Prod_Alimentos("Feijão", 6);
		System.out.println("nome: "+ a1.getNomeAliment());
		System.out.println("Valor: "+ a1.getValorAlimento()+ "R$");
		System.out.println("Imposto: "+ a1.tributacao());
		
		System.out.println();
		
		Prod_SaudeEBemEstar s1 = new Prod_SaudeEBemEstar(" Vitamínas", 50.0);
		System.out.println("nome: "+ s1.getNomeSaud());
		System.out.println("Valor: "+ s1.getValorSaude()+ "R$");
		System.out.println("Imposto: "+ s1.tributacao());
		
		System.out.println();
		
		Prod_Vestuario v1 = new Prod_Vestuario("Tenis", 350.0);
		System.out.println("nome: "+ v1.getNomeVest());
		System.out.println("Valor: "+ v1.getValorVestuario()+ "R$");
		System.out.println("Imposto: "+ v1.tributacao());
		
		System.out.println();
		
		Prod_Cultura c1 = new Prod_Cultura("Curso de Lígua estrangeira", 250);
		System.out.println("nome: "+ c1.getNomeCult());
		System.out.println("Valor: "+ c1.getValorCultura()+ "R$");
		System.out.println("Imposto: "+ c1.tributacao());

	}

}
