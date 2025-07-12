package br.com.herancaPolimorfismo.ingressos;

public class IngressoMain {

	public static void main(String[] args) {
		Ingresso meia1 = new IngressoMeia("A volta dos que não foram", false);
		System.out.println(meia1.getNomeFilme());
		System.out.println(meia1.isDublado());
		meia1.valorReal();
		System.out.println("\n============================\n");
		var family = new IngressoFamilia(4, "Os que foram e já voltaram", false);
		System.out.println(family.getNomeFilme());
		System.out.println("Numero de ingressos: "+family.getNumPessoas());
		System.out.println(family.isDublado());
		family.valorReal();

	}

}
