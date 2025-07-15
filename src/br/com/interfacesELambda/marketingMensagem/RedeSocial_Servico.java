package br.com.interfacesELambda.marketingMensagem;

public class RedeSocial_Servico implements ServicoMensagem {

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.printf("O direct, NA REDE SOCIAL foi enviado na integra: \n", mensagem);

	}

}
