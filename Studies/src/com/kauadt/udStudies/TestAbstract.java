abstract class Carro{
	int codigo = 10;
	abstract void acelerar();

	Carro(int cod){
		codigo = cod;
	}

	void frear(){
		System.out.println("O carro está freando...");
	}
}

class Caminhao extends Carro{

	Caminhao(int codigo){
		super(codigo);
	}

	void acelerar(){
		System.out.println("O caminhão está acelerando lentamente...");
	} 
}


public class TestAbstract{
	public static void main(String[] args){

		Caminhao caminhao = new Caminhao(1000);
		System.out.println("Código: " + caminhao.codigo);

	}
}