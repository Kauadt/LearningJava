
public class ExemploObjetosNulos {
    public static void main(String[] args) {
        String nome = "Kauã";

        try {
            int tamanhoNome = nome.length();
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e) {
            System.out.println("A variável nome está nula!");
        }
    }
}