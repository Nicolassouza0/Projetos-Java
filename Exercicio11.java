package exercicios;
import java.util.Scanner;


public class Exercicio11 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario fixo:");
		float salario=sc.nextFloat();
		
		System.out.println("Digite o numero de vendas do funcionario: ");
		float vendas=sc.nextFloat();
		
		System.out.println("Digite a Comisão fixa:");
		float fixa=sc.nextFloat();
		
		System.out.println("fale o valor total de vendas no mês: ");
		float valortotal=sc.nextFloat();
		
		float comisãovendas=vendas*fixa+valortotal*5/100;
		
	    float total=salario+comisãovendas;
	    
	    System.out.println("O valor total da comisão é: "+comisãovendas);
	    
	    System.out.println("O valor total do salario é: "+total);
	 
		
		
			
	}

}
