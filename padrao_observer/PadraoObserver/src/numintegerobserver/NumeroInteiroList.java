package numintegerobserver;
import java.util.ArrayList;
import java.util.List;

public class NumeroInteiroList {

	List<Integer> numeros = new ArrayList<>();

	List<Observer> observers = new ArrayList<>();

	public void adicionar(int numero) {
		numeros.add(numero);
		notificationObserver();
	}

	public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
        	observers.add(observer);
        }
	}

	public void removeObserver(Observer observer) {
        observers.remove(observer);
	}

	public void notificationObserver() {
       for (Observer o : observers) {
    	   o.observerAdicaoNumero(numeros);
       }
	}

	@Override
	public String toString() {
		return numeros.toString();
	}

}
