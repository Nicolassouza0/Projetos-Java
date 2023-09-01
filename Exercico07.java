package exercicios;
import java.util.Scanner;


public class Exercico07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de anos vividos: ");
		
		byte ano =sc.nextByte();
		
        System.out.println("Digite a quantidade de meses vividos depois do seu aniversario : ");
		
		byte mes =sc.nextByte();
		
        System.out.println("Digite a quantidade de dias vividos depois do seu mesversario : ");
		
		byte dia =sc.nextByte();
		
		int total = ano*365+mes*30+dia;
		
		System.out.println("A quantidade de dias vividos pela pessoa é : "+total);
		
		sc.close();
				

		

	}

}
