package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Digite um valor para saber o seu antecessor: ");
		
		Scanner sc = new Scanner(System.in);
		
		int valor=sc.nextInt();
		
		int antecessor=valor-1;
		
		System.out.println("O antecessor do número digitado é: "+antecessor);

	}

}
