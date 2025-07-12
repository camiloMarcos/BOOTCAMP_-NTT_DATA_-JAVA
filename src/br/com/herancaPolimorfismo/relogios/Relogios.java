/*
 * 	Escreva uma hierarquia de classes para criação de relógios para diferentes partes do mundo.
 * 
 * 1->	Definha uma superClasse que tenha as propriedades hora, minuto e segundo (com seus respectivos getters e setters)
 * 		(atendendo as regras do funcionamento de um relógio)?
 * 		e um 

 * 2->	a partir dessa classe crie 2 implementações, uma chamada relógio américano e outra relógio Brasileiro,
 * 		lembrando que para o relógio americano não existem NÃO EXISTEM HORAS DAS 13 ÀS 24. 
 * 	
 * 3->	Defina também na superClasse um método  que ficará por responsabilidade da classe que extende-la,
 * 		defnir seu funcionamento, esse método deve receber um relógio (independentemente da implementação),
 * 		e deve extrair as informações dele e usa-la no objeto que recebeu para setar as novas informações do relógio.
 * */

// REEVER

package br.com.herancaPolimorfismo.relogios;

// 1)
public abstract class Relogios {

	private int hora;
	private int minuto;
	private int segundo;

	public Relogios(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			throw new IllegalArgumentException("Hora INVÁLIDA. Digite entre em 0 e 23!");
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			throw new IllegalArgumentException("minuto INVÁLIDO. Digite entre em 0 e 59!");
		}

	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			throw new IllegalArgumentException("Segundo INVÁLIDO. Digite entre em 0 e 59!");
		}

	}

	public abstract void sicronizarHorario(Relogios outro);

	public String horaFormato_HH_MM_SS() {

		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
}
