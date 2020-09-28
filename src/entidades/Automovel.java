package entidades;

import java.util.Random;

/**
 * Classe mãe que respresenta todos os veículos.
 */

public abstract class Automovel {
    protected int velocidadeMaxima;
    protected double quantidadeMaximaDeCarga;
    protected int quantidadeMaximaDePassageiros;
    private Random random = new Random();


    /**
     *
     * @return velocidadeMaxima Velocidade máxima do veículo em inteiro.
     */
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    /**
     *
     * @return quantidadeMaximaDeCarga Quantidade máxima de carga que o veículo suporta em número real.
     */
    public double getQuantidadeMaximaDeCarga() {
        return quantidadeMaximaDeCarga;
    }

    /**
     *
     * @return quantidadeMaximaDePassageiros Quantidade de passageiros, inclusive o piloto, que o veículo suporta.
     */
    public int getQuantidadeMaximaDePassageiros() {
        return quantidadeMaximaDePassageiros;
    }

    /**
     * Retorna um número inteiro aleatório.
     * @param min Valor mínimo de retorno da função
     * @param max Valor máximo de retorno da função
     * @return Número aleatório entre [min,max]
     */
    protected int numeroAleatorio(int min, int max){
        return min + random.nextInt(max-min+1);
    }

    /**
     * Função para saber se o veículo consegue fazer a viagem dentro do tempo máximo
     * @param tempo Tempo máximo da viagem
     * @param distancia Distancia total da viagem
     * @return Boleano indicando se o veículo consegue chegar a tempo no destino
     */
    public boolean consegueChegarNoTempo(double tempo, double distancia) {
        double velocidadeMedia = this.velocidadeMaxima / 2.0;
        return distancia / tempo <= velocidadeMedia;
    }


}
