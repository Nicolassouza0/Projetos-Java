package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro: ");
		float carro=sc.nextFloat();
		
		float impds=carro*28/100;
		float imposto=carro*45/100;
		float totalcon=carro+impds+imposto;
		
		System.out.println("o valor final do carro é igual a: R$"+totalcon);
		
		sc.close();
		

	}

}
