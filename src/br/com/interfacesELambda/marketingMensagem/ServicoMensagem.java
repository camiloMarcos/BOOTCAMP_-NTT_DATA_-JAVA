/*	Escreva um código para enviar mensagens de marketing, para isso você deve e ter a possibilidade de
  	enviar a mesma mensagem para serviços diferentes, esses serviços DEVEM TER UM MÉTODO para receber a mensagem como 
  	parâmetro, os serviços que devem estar disponíveis são:
  
  	MSN,
  	e-mail;
  	Redes Sociais;
  	WhatsApp;
*/

package br.com.interfacesELambda.marketingMensagem;


public interface ServicoMensagem {

	void enviarMensagem(String mensagem);

}
