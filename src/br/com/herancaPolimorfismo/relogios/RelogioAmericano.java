/*
  2)	a partir da Super classe crie 2 implementações, uma chamada relógio américano e outra relógio Brasileiro,
  		lembrando que para o relógio americano não existem NÃO EXISTEM HORAS DAS 13 ÀS 24. 
 */

package br.com.herancaPolimorfismo.relogios;

public class RelogioAmericano extends Relogios{

	public RelogioAmericano(int hora, int minuto, int segundo) {
		super(hora, minuto, segundo);
		
	}

	@Override
	public void defnirFuncionamento(Relogios independent) {
		if (hora==0) {
			hora =12;
		}else if(hora > 12) {
			hora-=12;
			
		}
		
		
	}

	@Override
	public void sicronizarHorario(Relogios outro) {
		// TODO Auto-generated method stub
		
	}

}
