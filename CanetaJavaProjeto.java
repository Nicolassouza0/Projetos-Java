package introducao;

public class CanetaJavaProjeto {

	public static void main(String[] args) {
		Caneta bic = new Caneta("verde",1.5);
		Caneta momblan = new Caneta("Vermelho",0.7);
		
		System.out.println("dados da caneta bic: ");
		bic.estado();
		bic.cor="Verde";
		bic.carga=90;
		bic.ponta=0.7;
		bic.estado();
		System.out.println("\nDados da caneta Momban: ");
		momblan.estado();
		momblan.cor="vermelho";
		momblan.carga=50;
		momblan.ponta=0.5;
		momblan.tampar();
		momblan.estado();

	}

}
