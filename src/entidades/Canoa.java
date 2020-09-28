package entidades;

import entidades.interfaces.Aquatico;

/**
 * Classe que representa uma canoa.
 */

public class Canoa extends Automovel implements Aquatico {

    /**
     * Construtor da canoa.
     */
    public Canoa() {
        this.velocidadeMaxima = super.numeroAleatorio(10, 30);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(60, 150);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 5);
    }


    /**
     *
     * @return Informações da canoa.
     */
    @Override
    public String toString(){
        return String.format("Canoa: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }
}
