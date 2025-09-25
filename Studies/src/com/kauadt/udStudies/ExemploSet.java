import java.util.Set;
import java.util.HashSet;
// import java.util.*;

public class ExemploSet{
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();

		conjunto.add("Java");
		conjunto.add("Python");
		conjunto.add("C++");

		System.out.println("Contém java? " + conjunto.contains("Java")); // t or f

		conjunto.add("JavaScript");
		conjunto.add("Ruby");

		System.out.println("Conjunto completo: " + conjunto);
		conjunto.remove("Python");
		System.out.println("Conjunto completo: " + conjunto);

		boolean foiAdicionado = conjunto.add("Java");
		System.out.println("Java foi adicionado novamente? " + foiAdicionado);


		conjunto.clear();
		System.out.println("Conjunto após limpar: " + conjunto);

	}
}