package pedidolanchesobserver;

public interface AtendimentoObservable {

	void addDelyveryObserver(DeliveryObserver observer);
	void removeDelyveryObserver(DeliveryObserver observer);
	public void notifyObservers();
	
}
