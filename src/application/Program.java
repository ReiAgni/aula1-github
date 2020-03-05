package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCoverter;


public class Program {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyCoverter conv = new CurrencyCoverter();
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double beBought = sc.nextDouble();
		
		double resultado = conv.convertendo(priceDollar, beBought);
		
		System.out.printf("Amount to be paid in reais = %.2f%n ", resultado );
		
		sc.close();
	}
	
	
}
