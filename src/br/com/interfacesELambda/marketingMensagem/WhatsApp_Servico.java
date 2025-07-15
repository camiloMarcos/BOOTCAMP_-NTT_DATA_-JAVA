package br.com.interfacesELambda.marketingMensagem;

public class WhatsApp_Servico implements ServicoMensagem {

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.printf("O WhatsApp foi enviado e Recebido!%s", mensagem);

	}

}
