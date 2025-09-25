abstract class Animal{
	public abstract void fazerSom(); 
}

class Cachorro extends Animal{
	public void fazerSom(){
		System.out.println("O cachorro faz: Au Au!");
	}
}

class Gato extends Animal{
	public void fazerSom(){
		System.out.println("O gato faz: Miaaaaaaaaaaaaaaaaau!");
	}
}

public class TestPolimorfismo{
	public static void main(String[] args){
		Object meuCachorro = new Cachorro();
		Object meuGato = new Gato();

		Cachorro objConvertido = (Cachorro) meuCachorro;
		objConvertido.fazerSom();

		// Ou
		
		((Cachorro) meuCachorro).fazerSom();
	}
}