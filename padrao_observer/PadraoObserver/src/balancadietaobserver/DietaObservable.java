package balancadietaobserver;

public interface DietaObservable {
	
	public void registerObserver(BalancaObserver observer);
    public void removeObserver(BalancaObserver observer);
    public void notifyObservers();

}
