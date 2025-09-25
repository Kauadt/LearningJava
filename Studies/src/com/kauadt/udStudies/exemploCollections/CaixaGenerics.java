class Carrinho{
	private String modelo;

	public Carrinho(String modelo){
		this.modelo = modelo;
	}

	public String getModelo(){
		return modelo;
	}
}

class Boneca{
	private String nome;

	public Boneca(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}
}



public class CaixaGenerics<T>{

	private T coisaNaCaixa;

	public void guardar(T coisa){
		this.coisaNaCaixa = coisa;
	}

	public T pegar(){
		return coisaNaCaixa;
	}

	public static void main(String[] args){
		CaixaGenerics<Carrinho> caixaDeCarrinhos = new CaixaGenerics<>();
		caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels"));

		CaixaGenerics<Boneca> caixaDeBonecas = new CaixaGenerics<>();
		caixaDeBonecas.guardar(new Boneca("Barbie"));

		Carrinho carrinho = caixaDeCarrinhos.pegar();
		Boneca boneca = caixaDeBonecas.pegar();

		System.out.println(carrinho.getModelo());
		System.out.println(boneca.getNome());

	}
}
