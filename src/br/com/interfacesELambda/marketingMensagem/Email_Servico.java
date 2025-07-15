package br.com.interfacesELambda.marketingMensagem;

public class Email_Servico implements ServicoMensagem {

	@Override
	public void enviarMensagem(String Mensagem) {
		System.out.printf("O E-MAIL foi enviado com susesso:\n", Mensagem);

	}

}
