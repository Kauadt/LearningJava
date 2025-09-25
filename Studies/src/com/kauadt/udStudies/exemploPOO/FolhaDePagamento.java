import empresa.dados.*;

public class FolhaDePagamento{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario("Arnaldo", 5000);
		System.out.println(funcionario.obterInfo());
		funcionario.alterarQualquerSalario(funcionario, 2000);
		System.out.println(funcionario.obterInfo());
	}

}