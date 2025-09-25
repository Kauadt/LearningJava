package exemploInputOutput;

import java.io.*;

public class ExemploIO {

    public static void main(String[] args) {
        String file = "/home/kauadt/IdeaProjects/Studies/src/com/kauadt/udStudies/exemploInputOutput/pastinha/meuArquivo.txt";

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Olá, Mundo!");
            writer.close();

            FileReader reader = new FileReader(file);
            int data = reader.read();

            while (data != -1) {
                // System.out.print((char) data); // With casting
                System.out.print(data); // No casting
                data = reader.read();
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Problema de IO: " + e.getMessage());
        }
    }
}