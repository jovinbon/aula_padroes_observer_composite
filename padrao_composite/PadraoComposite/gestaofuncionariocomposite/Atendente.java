package gestaofuncionariocomposite;

public class Atendente extends Funcionario{
	
	public Atendente (String nomeDoAtendente) {
        this.nomeFuncionario = nomeDoAtendente;
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
     }

	@Override
	protected void adicionar(Funcionario funcionario) {
		
		//n�o delegado
	}

	@Override
	protected void remover(Funcionario funcionario) {
	    //n�o delegado
		
	}
}
