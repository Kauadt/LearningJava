package exemploSerializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSerializacao {

    private static void serializarContatos(List<Contato> listaContatos) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
            objectOutputStream.writeObject(listaContatos);
            System.out.println("Contatos serializados e salvos com sucesso!");
        }
    }

    @SuppressWarnings("unchecked")
    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
            contatosLidos.forEach(contato -> System.out.println("Nome: " + contato.getNome() +
                    " | Telefone: " + contato.getTelefone()));
        }
    }

    public static void main(String[] args) {
        List<Contato> listaContatos = new ArrayList<>(
                Arrays.asList(
                        new Contato("Kauã", "11 11111-1111"),
                        new Contato("Tavares", "22 22222-2222")));

        try {
            serializarContatos(listaContatos);
            deserializarContatos();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao manipular contatos: " + e.getMessage());
        }
    }
}
