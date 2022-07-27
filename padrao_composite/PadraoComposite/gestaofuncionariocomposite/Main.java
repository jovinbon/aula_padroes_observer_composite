package gestaofuncionariocomposite;

public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Amanda Melo");
		Funcionario presidente = new Presidente("José Carrêra");
	    Funcionario atendente = new Atendente("Maria Vitória");
	    Funcionario caixa = new Caixa("Camila Arantes");
	        
	    gerente.adicionar(atendente);
	    gerente.adicionar(caixa);
	    System.out.println("Todos os funcionários de gerente:");
	    System.out.println();
	    gerente.remover(caixa);
	    gerente.printNomeDoFuncionario();
	    presidente.adicionar(atendente);
	    presidente.adicionar(caixa);
	    presidente.remover(caixa);
	    presidente.adicionar(caixa);
	    System.out.println();
	    System.out.println("Todos os funcionários de presidente:");
	    System.out.println();
	    presidente.printNomeDoFuncionario();
	    atendente.adicionar(caixa);
	    atendente.remover(caixa);
	    System.out.println();
	    System.out.println("Atendente removeu funcionário:");
	    System.out.println();
	    atendente.printNomeDoFuncionario();
	    
	}
}
