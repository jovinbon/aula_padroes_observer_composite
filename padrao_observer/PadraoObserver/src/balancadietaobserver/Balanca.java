package balancadietaobserver;

public class Balanca implements BalancaObserver {

	@Override
	public void update(double novoPeso) {
		if (novoPeso >= 80) {
			System.out.println("Você ultrapassou o peso limite no sistema!");
		} else {
			System.out.println("Parabéns, você está com a dieta em dia!");
		}
	}

}
