package br.com.herancaPolimorfismo.ingressos;

public class IngressoFamilia extends Ingresso{
	
	private int numPessoas;
	
	
	public IngressoFamilia(int numPessoas, String nomeFilme, boolean dublado) {
		super(nomeFilme, dublado);
		this.numPessoas = numPessoas;
		
	}

	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	@Override
	public void valorReal() {
		
		if(numPessoas>3) {
			double totalSemDesconto = numPessoas* getValor();
			double totalComDesconto = totalSemDesconto * 0.95;
			System.out.println("Valor Do Ingresso Família: " + totalComDesconto);
		
		}else {
			double totalSemDesconto = numPessoas* getValor();
			System.out.println("Valor Do Ingresso Família: " + totalSemDesconto);
		}
		
		
	}
	
	

}
