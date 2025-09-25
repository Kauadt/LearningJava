import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ExemploList{
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Java");
		lista.add("Python");
		lista.add("C++");

		System.out.println("Contém Java? " + lista.contains("Java"));

		// Adicionando todos os elementos de outra coleção
		List<String> outraLista = Arrays.asList("JavaScript", "Ruby");

		lista.addAll(outraLista);

		System.out.println("Lista completa concatenado com outra lista: " + lista);

		lista.remove("Python");
		System.out.println("Lista após remoção: " + lista);

		String elemento = lista.get(2);
		System.out.println(elemento);

		lista.clear();
		System.out.println("Lista após limpar:" + lista);
	}
}