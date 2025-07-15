package br.com.interfaceELambda.AreaGeometrica;

public class MainAreaGeometrica {

	public static void main(String[] args) {
		
					
		Quadrado q1 = new Quadrado(5);
		System.out.println("Área do Quadrado é: ");
		System.out.println(q1.areaGeo());
		
		System.out.println("=======================");
		
		Retangulo r1 = new Retangulo(5, 4.2);
		System.out.println("Área do retangulo é: ");
		System.out.println(r1.areaGeo());
		
		System.out.println("=======================");
		
		Circulo c1 =  new Circulo(3);
		System.out.println("Área do Circulo é: ");
		System.out.println(c1.areaGeo());
		
		}
		
	}
	

