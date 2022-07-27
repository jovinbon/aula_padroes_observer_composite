package desenhograficocomposite;

import java.util.List;

public abstract class Grafico {
	
	public abstract void adicionar(Grafico g);
	
	public abstract void remover(Grafico g);
	
	public abstract List<Grafico> getNos();
	
	public abstract void desenhar();

}
