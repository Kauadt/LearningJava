package exemploInputOutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ExemploNIO {
    public ExemploNIO() {
    }

    public static void main(String[] args) {
        Path path = Paths.get("meuArquivo.txt");

        try {
            Files.write(path, "Olá, Mundo!".getBytes());
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Problemas de IO" + e.getMessage());
        }

    }
}
