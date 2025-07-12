package br.com.desafioDeCodigo;

import java.util.Locale;
import java.util.Scanner;

public class ControleDeGastosDiarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner scanner = new Scanner(System.in);
		        scanner.useLocale(Locale.US);
		        int totalCompras = scanner.nextInt();

		        double totalGasto = 0;
		        double media = 0 ;
		        
		        if (totalCompras <= 0) {
		            System.out.println("Nenhuma compra registrada.");
		        } else {
		          for(int i=0 ; i < totalCompras ; i++){
		            
		           double valorUni = scanner.nextDouble();
		            
		            totalGasto += valorUni;
		        }
		          	media = totalGasto / totalCompras;
		            System.out.printf("%.2f %n", totalGasto);
		            System.out.printf("%.2f %n",media ); // TODO: Imprima a média   

		            // TODO: Leia os valores das compras e calcule a média

		            
		            
		        }

		        scanner.close();
		    }
		

	}

