package introducao;

public class BombaObjeto {

	public static void main(String[] args) {
		bomba patch = new bomba();
		bomba cc = new bomba();
		
		patch.setTipoDeComb("comum");
		System.out.println("O tipo de combustivel é :"+patch.getTipoDeComb());
		patch.setPreco(5);
		System.out.println("o valor do combustivel é :"+patch.getPreco()+"R$");
		patch.setNivel(10);
		System.out.println("a bomba esta em:"+patch.getNivel()+"%");
		cc.setTipoDeComb("Etanol");
		System.out.println("o tipo do combustivel é :"+cc.getTipoDeComb());
		cc.setPreco(4.20);
		System.out.println("o valor está em:"+cc.getPreco()+"R$");
		cc.setNivel(5);
		System.out.println("a bomba esta em:"+cc.getNivel()+"%");
		
		
		
		

	}

}
