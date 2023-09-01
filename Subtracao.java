package exemplos;

import java.util.Scanner;

public class Subtracao {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor a ser subtraido, sendo que deve ser inteiro: ");
		int valor1=sc.nextInt();
		
		System.out.println("Digite o segundo valor a ser subtraido, sendo que deve ser inteiro: ");
		int valor2=sc.nextInt();

		int subtrair=valor1-valor2;
		System.out.println("O resultado é: "+subtrair);
	}
}
