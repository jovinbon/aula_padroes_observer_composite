package niversurpriseobserver;

public class Namorada implements ChegadaObserver{

	@Override
	public void notificaChegou(ChegadaAniversarianteEvent evento) {
		System.out.println("Apagar as luzes...");
		System.out.println("Fazer sil�ncio...");
		System.out.println("Surpresa!!!");
		System.out.println("Parab�ns pra voc� meu amor!!! ����... � festa!!!!");
	}
	

}
