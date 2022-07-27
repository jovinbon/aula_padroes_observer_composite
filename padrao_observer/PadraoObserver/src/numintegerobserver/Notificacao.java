package numintegerobserver;
import java.util.List;

public class Notificacao implements Observer{

	@Override
	public void observerAdicaoNumero(List<Integer> numeros) {
		System.out.println("Atenção!!!!");
		System.out.println("Números adicionados: " + numeros);
	}

}
