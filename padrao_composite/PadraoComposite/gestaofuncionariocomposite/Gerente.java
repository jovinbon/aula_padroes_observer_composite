package gestaofuncionariocomposite;

public class Gerente extends Supervisor{
	public Gerente(String nomeDoSupervisor) {
		super(nomeDoSupervisor);
        this.nomeFuncionario = nomeDoSupervisor;
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.printNomeDoFuncionario();
        }
    }
	
	@Override
	public void adicionar(Funcionario novoFuncionario) {
		this.funcionarios.add(novoFuncionario);
	}

	@Override
	protected void remover(Funcionario funcionario) {
		this.funcionarios.remove(funcionario);
	}
}
