package br.com.interfacesELambda.marketingMensagem;

import java.util.ArrayList;
import java.util.List;

public class EnviadorMensagensMarketing {

	private List<ServicoMensagem> servicos;

	public EnviadorMensagensMarketing() {
		servicos = new ArrayList<>();

	}

	public void addServico(ServicoMensagem servico) {
		servicos.add(servico);
	}
	
	public void enviarParaTodos(String mensagem) {
		for(ServicoMensagem servico: servicos) {
			servico.enviarMensagem(mensagem);
		}
	}

}
