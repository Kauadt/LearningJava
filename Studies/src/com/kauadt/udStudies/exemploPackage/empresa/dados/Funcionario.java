package empresa.dados;

public class Funcionario{
	private String nome;
	private double salario;

	public Funcionario(String nomeInit, double salarioInit){
		nome = nomeInit;
		salario = salarioInit;
	}

	public String obterInfo(){
		return "Nome: " + nome + ", Salário: " + salario;
	}

	public void aumentarSalario(double aumento){
		salario += aumento;
	}

	public void alterarQualquerSalario(Funcionario func, double novoSalario){
		func.salario = novoSalario;
	}
}