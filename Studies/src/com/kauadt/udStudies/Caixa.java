public class Caixa<T>{
	private T coisaNaCaixa;

	public void guardar(T coisa){
		this.coisaNaCaixa = coisa;
	}

	public T pegar(){
		return coisaNaCaixa;
	}

	public static void main(String[] args){
		// Criando uma caixa pra guardar Strings
		Caixa<String> caixaDeTexto = new Caixa<>();
		caixaDeTexto.guardar("Hello, World!");
		String texto = caixaDeTexto.pegar();
		System.out.println(texto);

		// Caixa para números
		Caixa<Integer> caixaDeNumeros = new Caixa<>();
		Integer numero = Integer.valueOf(3);
		caixaDeNumeros.guardar(numero);

		Integer valorResgatado = caixaDeNumeros.pegar();
		System.out.println(valorResgatado);

	}
}