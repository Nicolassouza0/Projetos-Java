package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        

	        System.out.println("Digite a quantidade total de eleitores do municipío : ");

	        float quantidadeTotalEleitores= sc.nextInt();

	        System.out.println("Digite a quantidade de votos brancos do municipío : ");

	        int quantidadeVotosBrancos= sc.nextInt();

	        System.out.println("Digite a quantidade de votos nulos : ");

	        float quantidadeVotosNulos= sc.nextInt();

	        System.out.println("Digite a quantidade total de votos válidos do municipío : ");

	        float quantidadeTotalVotosValidos= sc.nextInt();

	        

	        //Processamento

	        

	        float porcentagemVotosBrancos = quantidadeVotosBrancos/quantidadeTotalEleitores*100;

	 

	    

	        

	        //Saída

	        

	        System.out.println("A porcentagem de votos brancos corresponde a : "+porcentagemVotosBrancos + "%");

	        

	    }

	 

	
		
		

	}


