package pedidolanchesobserver;

import java.util.ArrayList;
import java.util.List;

public class Atendimento implements AtendimentoObservable{
	
	private List<DeliveryObserver> observers = new ArrayList<>();
	
	private int pedido;
	
	public void fazerPedido(int pedido) {
		this.pedido = pedido;
	}
	
	public int getPedido() {
		return this.pedido;
	}

	@Override
	public void addDelyveryObserver(DeliveryObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}	
	}

	@Override
	public void removeDelyveryObserver(DeliveryObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (DeliveryObserver o : observers) {
			o.update(this.pedido);
		}
		
	}

}
