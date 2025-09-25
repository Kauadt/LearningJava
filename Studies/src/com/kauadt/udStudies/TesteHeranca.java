class Animal{

	public String nome;

	public void fazerSom(){
		System.out.println("O Animal fez um som");
	}
}

class Cachorro extends Animal {

	public void fazerSom(){
		super.fazerSom();
		System.out.println("O cachorro late");
	}
}

public class TesteHeranca{
	public static void main(String[] args){
		Cachorro dog = new Cachorro();
		dog.fazerSom();
	}
}