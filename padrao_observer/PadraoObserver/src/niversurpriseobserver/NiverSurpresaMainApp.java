package niversurpriseobserver;

public class NiverSurpresaMainApp {

	public static void main(String[] args) {
	    Namorada namorada = new Namorada();
	    Porteiro porteiro = new Porteiro();
	    
	    //registrar a namorada no porteiro, se n�o 
	    //ela n�o ser� notificada.
	    porteiro.addChegadaObserver(namorada);
	    
	    porteiro.start();

	}

}
