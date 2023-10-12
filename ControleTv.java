package introducao;

public class ControleTv implements Controle {
	
	private boolean ligado;
	private int vol;
	private double canal;

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
			this.canal=x;
			else 
				this.canal++;
		
	}

	@Override
	public void ligar() {
		if(this.ligado==true)
			System.out.println("Erro! A Tv está ligada");
		else 
			this.ligado=true;
		
	}

	@Override
	public void desligar() {
		if(this.ligado==true)
		{	this.ligado=false;
		    this.vol=0;
		    this.canal=0;
		}
		
		else
			System.out.println("Erro a TV está desligada");
		
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

	public double getCanal() {
		return canal;
	}
	
	
}
  
	

	
		 
	
		
		

	


