package introducao;

public class CarroObjeto {

	public static void main(String[] args) {
		Carro bmw = new Carro();
		double valorDolar;
		
		bmw.setCor("branco");
		System.out.println("A cor do carro é :"+bmw.getCor());
		bmw.setAno(2015);
		System.out.println("O ano do carro é :"+bmw.getAno());
		bmw.setPreco(15000);
		System.out.println("O valor do carro é :"+bmw.getPreco());
		valorDolar=bmw.getPreco()/5;
		System.out.println("O valor do carro em dolar é :"+valorDolar);
		bmw.setMarca("BMW");
		bmw.setModelo("Bmw x6");
		System.out.println("O Modelo do carro é :"+bmw.getModelo());
		
		
		
		
		
		
		
	}

}
