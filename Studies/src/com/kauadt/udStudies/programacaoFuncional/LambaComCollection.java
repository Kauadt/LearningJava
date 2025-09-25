
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambaComCollection {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 100);
        List<Integer> numerosPares = new ArrayList<>();

        listaDeNumeros.forEach(elemento -> {
            if (elemento % 2 == 0) {
                numerosPares.add(elemento);
            }
        });

        System.out.println("Números pares: " + numerosPares);
    }
}