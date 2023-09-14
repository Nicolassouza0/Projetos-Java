package introducao;

public class bomba {

	//Atributos
	
	private String tipoDeComb;
	private boolean ligado;
	private int nivel;
	private double preco;

	
	//metodos
	public void ligar()
	{
		if(this.ligado==true)
			System.out.println("A bomba está pronta para abstecer");
		else 
			this.ligado=true;
	}
	
	public void desligar()
	{
		if(this.ligado==false)
			System.out.println("ERRO a bomba explodiu");
	
	}
	public void abstecer()
	{
		if(this.nivel==0)
			System.out.println("erro a bomba está sem combustivél");
		else {
			this.nivel=10;
		System.out.println("A bomba está abstecendo");
		
		}
		
			
	}
	
	public String getTipoDeComb() {
		return tipoDeComb;
	}

	public void setTipoDeComb(String tipoDeComb) {
		this.tipoDeComb = tipoDeComb;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
		

	}


