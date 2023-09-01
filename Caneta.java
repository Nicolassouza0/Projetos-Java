package introducao;

public class Caneta {

	//ATRIBUTOS
	
	String cor;
	double ponta;
	int carga; 
	boolean tampada;
	
	//METODO CONSTRUTOR
	
	public Caneta(String c, double p) {
		this.carga=100;
		this.tampada=true;
		this.cor=c;
		this.ponta=p;
	}
	
	
	//METODOS
	
	public void escrever()
	{
		if(this.tampada==true)
			System.out.println("Erro!! A caneta esta tampada");
		else
			System.out.println("escrevendo");
	}
	
	public void tampar() 
	{
		this.tampada=true;
	}
	public void destampar()
	{
		this.tampada=false; 
	}
			
	public void estado()
				{
					System.out.println("cor: "+ this.cor);
					System.out.println("ponta; "+ this.ponta);
					System.out.println("Esta tampada? "+ this.tampada);
					System.out.println("a carga esta em "+this.carga+"%");
					
				}
		
	}

