package niversurpriseobserver;

public class Namorada implements ChegadaObserver{

	@Override
	public void notificaChegou(ChegadaAniversarianteEvent evento) {
		System.out.println("Apagar as luzes...");
		System.out.println("Fazer silêncio...");
		System.out.println("Surpresa!!!");
		System.out.println("Parabéns pra você meu amor!!! Êêêê... É festa!!!!");
	}
	

}
