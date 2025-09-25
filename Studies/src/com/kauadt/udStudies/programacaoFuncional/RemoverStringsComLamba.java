import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoverStringsComLamba {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Pera", "Uva"));
        myList.removeIf(item -> item.length() > 5);
        System.out.println(myList);
    }

}