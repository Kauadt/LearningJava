package domain;

public class Ponto2D {
    private double coordX, coordY;

    public Ponto2D() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public Ponto2D(double coord) {
        this.coordX = coord;
        this.coordY = coord;
    }

    public Ponto2D(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }

    public void moverPonto() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public void moverPonto(Ponto2D point) {
        this.coordX = point.getCoordX();
        this.coordY = point.getCoordY();
    }

    public void moverPonto(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }

    public void mostrarDistancia(double x, double y) {
        double distance = calcularDistancia(x, y);
        System.out.println("A distância entre os pontos é: " + distance);
    }

    public void mostrarDistancia(Ponto2D ponto) {
        double distance = calcularDistancia(ponto.coordX, ponto.coordY);
        System.out.println("A distância entre os pontos é: " + distance);
    }

    private double calcularDistancia(double x, double y) {
        double powX = Math.pow((x - this.coordX), 2);
        double powY = Math.pow((y - this.coordY), 2);
        return Math.sqrt(powX + powY);
    }

    @Override
    public String toString() {
        return "(" + coordX + ", " + coordY + ")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Ponto2D(this.coordX, this.coordY);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Ponto2D outro = (Ponto2D) obj;
        return this.coordX == outro.coordX && this.coordY == outro.coordY;
    }

    public void setCoordX(double x) {
        this.coordX = x;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordY(double y) {
        this.coordY = y;
    }

    public double getCoordY() {
        return coordY;
    }

}
