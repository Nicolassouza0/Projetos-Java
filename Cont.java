package introducao;

public class Cont {

	public static void main(String[] args) {
		ControleTv ctv = new ControleTv();
		ControleRadio cr = new ControleRadio();
		
		System.out.println("Dados do Controle da Tv");
		System.out.println("TV ligada :"+ctv.getLigado());
		System.out.println("canal: "+ctv.getCanal());
		System.out.println("volume: "+ctv.getVol());

		
		System.out.println("\n\nDados Do controle do radio");
		System.out.println("TV ligada :"+cr.getLigado());
		System.out.println("canal: "+cr.getEstacao());
		System.out.println("volume: "+cr.getVol());

	}

}
