package exercicio5.test;

import exercicio5.domain.Forma;
import exercicio5.domain.PoligonoBaseAltura;
import exercicio5.domain.Triangulo;

public class FormaTest {
    public static void main(String[] args) {
        PoligonoBaseAltura quadrado = new PoligonoBaseAltura(20, 20);
        PoligonoBaseAltura retangulo = new PoligonoBaseAltura(10, 20);
        PoligonoBaseAltura triangulo = new Triangulo(10, 10);

        quadrado.calcularArea();
        retangulo.calcularArea();
        triangulo.calcularArea();
        Forma.mostrarQuantidadeObjetosCriados();

    }
}
