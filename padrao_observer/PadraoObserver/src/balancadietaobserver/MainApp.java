package balancadietaobserver;

public class MainApp {

	public static void main(String[] args) {
		Balanca balanca = new Balanca();
        Dieta dieta = new Dieta();
        dieta.registerObserver(balanca);
        dieta.setPeso(70);

	}

}
