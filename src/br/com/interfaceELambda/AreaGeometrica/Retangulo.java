package br.com.interfaceELambda.AreaGeometrica;

public class Retangulo implements AreaGeometrica {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
	
		return base * altura;
	}

}
