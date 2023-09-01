package exercicios;

import java.util.Scanner;

public class exercicioSucessor {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero para saber o seu Sucessor: ");
		
		Scanner sc = new Scanner(System.in);
		
		int valor=sc.nextInt();
		
		int sucessor=valor+1;
		
		System.out.println("O sucessor do numero digitado é: "+sucessor);
		
		
		

	}

}
