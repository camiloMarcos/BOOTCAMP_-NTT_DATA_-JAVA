/*
 2)	a partir da Super classe crie 2 implementações, uma chamada relógio américano e outra relógio Brasileiro,
 	Brasileiro 24h
*/

package br.com.herancaPolimorfismo.relogios;

public class RelogioBrasileiro extends Relogios {

	public RelogioBrasileiro(int hora, int minuto, int segundo) {
		super(hora, minuto, segundo);
		
	}

	@Override
	public void sicronizarHorario(Relogios outrotictac) {
		this.setHora(outrotictac.getHora());
		this.setMinuto(outrotictac.getMinuto());
		this.setSegundo(outrotictac.getSegundo());
		
	}

}
