package br.com.interfacesELambda.marketingMensagem;

public class Msn_Servico implements ServicoMensagem {

	private String mensagMsn;

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.printf("A mensagem enviada, VIA MSN!\n", mensagem);

	}

}
