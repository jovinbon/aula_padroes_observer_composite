package desenhograficocomposite;

import java.util.ArrayList;
import java.util.List;

public class Pintura extends Grafico{
	
	private List<Grafico> nos = new ArrayList<Grafico>();

	@Override
	public void adicionar(Grafico g) {
		nos.add(g);
	}

	@Override
	public void remover(Grafico g) {
		nos.remove(g);
	}

	@Override
	public List<Grafico> getNos() {
		return nos;
	}

	@Override
	public void desenhar() {
		for (Grafico g : nos) {
			g.desenhar();
		}
		
	}

}
