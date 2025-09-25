public class Produto{
	
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;


	public Produto(String nome, double preco, int quantidadeEmEstoque){
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String obterDados(){
		return "Nome do produto: " + nome + " | Preço: " + preco + " | QTD: " + quantidadeEmEstoque;
	}

}