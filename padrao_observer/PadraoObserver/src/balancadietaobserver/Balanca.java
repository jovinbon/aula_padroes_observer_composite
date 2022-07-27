package balancadietaobserver;

public class Balanca implements BalancaObserver {

	@Override
	public void update(double novoPeso) {
		if (novoPeso >= 80) {
			System.out.println("Voc� ultrapassou o peso limite no sistema!");
		} else {
			System.out.println("Parab�ns, voc� est� com a dieta em dia!");
		}
	}

}
