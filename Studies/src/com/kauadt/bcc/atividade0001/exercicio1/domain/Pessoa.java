package exercicio1.domain;

public class Pessoa {

    private String name;
    private double weight;
    private double height;

    public Pessoa(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double calculateIMC() {
        return weight / Math.pow(height, 2);
    }

    public String classifyIMC() {
        double imc = calculateIMC();

        if (imc < 18.5)
            return "Magreza";
        else if (imc < 24.9)
            return "Normal";
        else if (imc < 29.9)
            return "Sobrepeso";
        else if (imc < 34.9)
            return "Obesidade grau I";
        else if (imc < 39.9)
            return "Obesidade grau II";
        return "Obesidade grau III";
    }

}