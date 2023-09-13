package introducao;

public class Carro {

	//ATRIBUTOS = CARACTERISTICAS
		private String cor;
		private String marca;
		private String modelo;
		private int ano;
		private double preco;
		private int velocidade=0;
		private boolean ligado;
		
		//METODOS = COMPORTAMENTOS
		public void ligar()
		{
			if(this.ligado==true)
				System.out.println("Erro!!! O carro ja esta ligado");
			else
				this.ligado=true;
		}
		public void desligar()
		{
			if(this.ligado==false)
				System.out.println("Erro!!!! O carro esta desligado");
			else
				this.ligado=false;
		}
		public void acelerar()
		{
			if(this.ligado==false)
				System.out.println("Erro! ligue o carro");
			else
				this.velocidade+=5; // this.velocidade=this.velocidade+5;
			
		
				System.out.println("A marca e: "+ this.marca);
				System.out.println("O modelo e: "+ this.modelo);
				System.out.println("O ano e: "+this.ano);
				System.out.println("O valor e: "+ this.preco);
				System.out.println("O carro esta ligado? "+this.ligado);
				System.out.println("Qual a velocidade atual? "+this.velocidade+"km/h");
				
			}
		
		public void freiar()
		{
			if(this.velocidade>0)
				this.velocidade--;
			else
				this.velocidade=0;
		}
		
		public void estado()
		{
			System.out.println("A cor do carro e: "+ this.cor);
			System.out.println("A marca e: "+ this.marca);
			System.out.println("O modelo e: "+ this.modelo);
			System.out.println("O ano e: "+this.ano);
			System.out.println("O valor e: "+ this.preco);
			System.out.println("O carro esta ligado? "+this.ligado);
			System.out.println("Qual a velocidade atual? "+this.velocidade+"km/h");
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getVelocidade() {
			return velocidade;
		}
	
		
		

	
}


