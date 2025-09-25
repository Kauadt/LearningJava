public class SalaDeAula{
	
	private static int quantidadeDeAlunos;

	private static void adicionarAluno(){
		SalaDeAula.quantidadeDeAlunos += 1;
	}

	public SalaDeAula(){
		adicionarAluno();
	}

	public int getQuantidadeDeAlunos(){
		return SalaDeAula.quantidadeDeAlunos;
	}

}