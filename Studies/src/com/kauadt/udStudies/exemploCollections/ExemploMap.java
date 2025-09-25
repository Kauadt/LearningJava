import java.util.HashMap;
import java.util.Map;

public class ExemploMap{
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();

		mapa.put("Java", 20);
		mapa.put("Python", 10);
		mapa.put("C++", 15);

		System.out.println("Contém Java? " + mapa.containsKey("Java"));

		System.out.println("Valor associado a Java: " + mapa.get("Java"));

		mapa.put("JavaScript", 25);
		mapa.put("Ruby", 5);

		System.out.println("Mapa completo:" + mapa);

		mapa.remove("Python");

		System.out.println("Mapa após remoção do elemento: " + mapa);

		mapa.put("Java", 30); // Atualizando o valor associado a uma chave

		System.out.println("Mapa após atualização: " + mapa);


		mapa.clear();
		System.out.println("Mapa após limpeza: " + mapa);
	}
}