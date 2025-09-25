interface SerVivo {
	void respirar(); // Método abstrato
}

interface Animal extends SerVivo {
	public static final String DESCRICAO = "Animal é um ser vivo importante!"; // Essa tipagem é padrão
	void fazerSom(); // Método abstrato
}

class Cachorro implements Animal{
	public void fazerSom(){
		System.out.println("O cachorro faz: Au Au!");
	}

	public void respirar(){}
}

class Gato implements Animal{
	public void fazerSom(){
		System.out.println("O gato faz: Miaau!");
	}

	public void respirar(){}
}


public class TestInterface{
	public static void main(String[] args){
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();

		Gato gato = new Gato();
		gato.fazerSom();

		System.out.println(Animal.DESCRICAO);
	}
}