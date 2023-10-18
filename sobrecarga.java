package polimorfismo;

public class sobrecarga {
	
	private double valor=0.0;
	
	public sobrecarga()
	{
		this.valor=15;
	}
	
	public void soma()
	{
		this.valor=5+3;
	}
	public void soma(int n1)
	{
		this.valor=5.0+n1;
		
	}
	
	public void soma(double n1)
	{
		this.valor=5+n1;
	}
	public void soma(int n1, int n2)
	{
		this.valor=5+n1+n2;
	}
	public void soma(int n1, double n2)
	{
		this.valor=n1+n2;
	}
	public void soma(double n1, int n2)
	{
		this.valor=n1+4+n2;
	}
	public void soma(int n1, int n2, int n3)
	{
		this.valor=n1+n2+n3;
	}
	public double getValor() {
		return valor;
	}
	
}