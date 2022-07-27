package balancadietaobserver;

import java.util.ArrayList;
import java.util.List;

public class Dieta implements DietaObservable {

	private List<BalancaObserver> observers = new ArrayList();
	private double peso;

//	public Dieta(double peso) {
//		this.peso = peso;
//	}

	public void setPeso(double peso) {
		this.peso = peso;
		// Quando a alteração do peso ocorrer, esse é o momento correto para notificar
		// os observers.
		this.notifyObservers();
	}

	@Override
	public void registerObserver(BalancaObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(BalancaObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// Chama o método de atualização de todos os observers disponíveis.
		for (BalancaObserver ob : observers) {
			System.out.println("Notificando observers!");
			ob.update(this.peso);
		}
	}

}
