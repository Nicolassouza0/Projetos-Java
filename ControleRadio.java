package introducao;

public class ControleRadio  implements Controle{

	private boolean ligado;
	private int vol;
	private double estacao;

	@Override
	public void aumentaVolume() {
		if(this.ligado==true&&this.vol<100)
			this.vol++;
		else 
			System.out.println("Erro! não é possivél aumentar o vol");
		
	}

	@Override
	public void diminuiVolume() {
		if(this.ligado==true && this.vol>0)
			this.vol--;
		else 
			System.out.println("Erro! não é possivél diminuir o vol");
		
		
	}

	@Override
	public void mudaCanal(double x) {
		if(x>0)
			this.estacao=x;
			else 
				this.estacao++;
		
	}

	@Override
	public void ligar() {
		if(this.ligado==true)
			System.out.println("Erro! o radio está ligado");
		else 
			this.ligado=true;
		  
	}

	@Override
	public void desligar() {
		if(this.ligado==true)
			{this.ligado=false;
		    this.vol=0;
	        this.estacao=0;
			}
		else
			System.out.println("Erro o radio está desligado");
		
	}
 
	public void mudo() {
		this.vol=0;
	}

	public boolean getLigado() {
		return ligado;
	}

	public int getVol() {
		return vol;
	}

	public double getEstacao() {
		return estacao;
	}
	
	
}
  


