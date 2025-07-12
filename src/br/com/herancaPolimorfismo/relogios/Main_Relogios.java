package br.com.herancaPolimorfismo.relogios;

import java.util.Scanner;

public class Main_Relogios {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	RelogioAmericano rA1 = new RelogioAmericano(5, 05, 05);
	System.out.println("Horario é: "+rA1.horaFormato_HH_MM_SS());
	rA1.defnirFuncionamento(rA1);

	}

}
