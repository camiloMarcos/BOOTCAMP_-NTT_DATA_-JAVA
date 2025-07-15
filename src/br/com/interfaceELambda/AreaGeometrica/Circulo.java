package br.com.interfaceELambda.AreaGeometrica;

public class Circulo implements AreaGeometrica {

	private final double PI = Math.PI;
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return PI * (raio * raio);
	}

}
