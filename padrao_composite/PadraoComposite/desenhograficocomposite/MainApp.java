package desenhograficocomposite;

public class MainApp {

	public static void main(String[] args) {

		Grafico g = new Pintura();
		Texto t = new Texto();
		Linha l = new Linha();
		Retangulo r = new Retangulo();
		Circulo c = new Circulo();
		Pintura p = new Pintura();

		g.adicionar(t);
		g.adicionar(l);
		g.adicionar(r);
		g.adicionar(c);

		System.out.println("Desenhando o todo");
		System.out.println();
		g.desenhar();

		System.out.println();
		System.out.println("Desenhando o texto");
		System.out.println();

		t.adicionar(t);
		t.desenhar();

		System.out.println();
		System.out.println("Pinturas");
		System.out.println();

		p.adicionar(r);
		p.adicionar(c);
		p.desenhar();
		
		System.out.println();
		System.out.println("Gráficos");
		System.out.println();
		g.adicionar(p);
		g.desenhar();

	}

}
