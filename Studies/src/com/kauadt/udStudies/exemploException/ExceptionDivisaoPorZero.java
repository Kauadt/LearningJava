public class ExceptionDivisaoPorZero {
	public static void main(String[] args) {
		int totalNotas = 0;
		int quantidadeAlunos = 0;

		try {
			int media = totalNotas / quantidadeAlunos;
			System.out.println(media);
		} catch (ArithmeticException e) {
			System.out.println("Problema: divisão por zero");
		} finally {
			System.out.println("O programa terminou");
		}
	}
}