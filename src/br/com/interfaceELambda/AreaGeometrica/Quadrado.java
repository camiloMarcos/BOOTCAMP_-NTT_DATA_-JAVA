package br.com.interfaceELambda.AreaGeometrica;

public class Quadrado implements AreaGeometrica {

	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
