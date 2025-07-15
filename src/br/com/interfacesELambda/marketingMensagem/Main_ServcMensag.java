package br.com.interfacesELambda.marketingMensagem;

import java.util.Scanner;

public class Main_ServcMensag {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		WhatsApp_Servico what1 = new WhatsApp_Servico(); 
		WhatsApp_Servico what2 = new WhatsApp_Servico();
		
		RedeSocial_Servico redSoci1 = new RedeSocial_Servico();
		RedeSocial_Servico redSoci2 = new RedeSocial_Servico();
		
		Email_Servico email1 = new Email_Servico();
		Email_Servico email2 = new Email_Servico();
		
		Msn_Servico msn1 = new Msn_Servico();
		Msn_Servico msn2 = new Msn_Servico();
		
//		msn1.enviarMensagem("Acabou a putariazinha... abusado, quero mais não!!!! É BABADO VIU");
		
		EnviadorMensagensMarketing eMM = new EnviadorMensagensMarketing();
		eMM.addServico(msn1);
		eMM.addServico(email1);
		eMM.addServico(redSoci1);
		eMM.addServico(what1);
		
		eMM.enviarParaTodos("Consegui finalizar e entender esse exercício.");
		
		
	}

}
