package br.com.herancaPolimorfismo.ingressos;

public class IngressoMeia extends Ingresso {

	
	public IngressoMeia(String nomeFilme, boolean dublado) {
		super(nomeFilme, dublado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void valorReal() {
		System.out.println("O valor da meia entrada é: "+ getValor()/2);
		// TODO Auto-generated method stub
		
	}

}
