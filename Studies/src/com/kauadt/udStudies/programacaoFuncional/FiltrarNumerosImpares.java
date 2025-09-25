import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FiltrarNumerosImpares {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        numeros.removeIf(numero -> numero % 2 == 0);
        System.out.println("Números ímpares: " + numeros);
    }
}
