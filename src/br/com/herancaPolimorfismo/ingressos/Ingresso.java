/*	Crie herança de classes para tratar os tipos de inressos que podem ser comercializados no cinema,
 	no ingresso deve ter um valor, o nome do filme e informar se é dublado, legendado.
 	
 	A partir desse ingresso, devem ser criados os tipos: meia, ingresso família.
 	
 	Cada ingresso deve ter um método que retorna seu valor real(Baseado no valor informado na criação do ingresso);
 	meia entrada deve ser a metade do valor;
 	ingresso família, deve-se  retornar o valor multiplicado pelo numero de pessoas e fornecer um desconto de 5% quando o
 	numero de pessoas for maior que 3
 */
package br.com.herancaPolimorfismo.ingressos;

public abstract class Ingresso {
	
	private final double valor = 50.0;
	private String nomeFilme;
	private boolean dublado;
	
	
	public Ingresso(String nomeFilme, boolean dublado) {
		this.nomeFilme = nomeFilme;
		this.dublado = dublado;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public boolean isDublado() {
		return dublado;
	}
	public void setDublado(boolean dublado) {
		this.dublado = dublado;
	}
	public double getValor() {
		return valor;
	}
	
	public abstract void valorReal();
	 
		
		
	
	
	

}
