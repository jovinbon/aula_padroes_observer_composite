package numintegerobserver;
import java.util.List;

public class Notificacao implements Observer{

	@Override
	public void observerAdicaoNumero(List<Integer> numeros) {
		System.out.println("Aten��o!!!!");
		System.out.println("N�meros adicionados: " + numeros);
	}

}
