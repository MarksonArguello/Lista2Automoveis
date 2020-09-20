package entidades;

public abstract class Automovel {
    protected double velocidadeMaxima;
    protected double quantidadeMaximaDeCarga;
    protected int quantidadeMaximaDePassageiros;

    public Automovel(double velocidadeMaxima, double quantidadeMaximaDeCarga, int quantidadeMaximaDePassageiros) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.quantidadeMaximaDeCarga = quantidadeMaximaDeCarga;
        this.quantidadeMaximaDePassageiros = quantidadeMaximaDePassageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getQuantidadeMaximaDeCarga() {
        return quantidadeMaximaDeCarga;
    }

    public int getQuantidadeMaximaDePassageiros() {
        return quantidadeMaximaDePassageiros;
    }
}
