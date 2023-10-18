package polimorfismo;

public class ExemploSobrecarga {

	public static void main(String[] args) {
		sobrecarga s = new sobrecarga();
		s.soma();
		System.out.println("A soma é: "+s.getValor());
		s.soma(3.5);
		System.out.println("A soma é: "+s.getValor());
		s.soma(7);
		System.out.println("A soma é: "+s.getValor());
		s.soma(4.2 , 7);
		System.out.println("A soma é: "+s.getValor());
		s.soma(11, 7.8);
		System.out.println("A soma é: "+s.getValor());
		s.soma(88, 40);
		System.out.println("A soma é: "+s.getValor());
		s.soma(8, 40, 150);
		System.out.println("A soma é: "+s.getValor());

	}

}
