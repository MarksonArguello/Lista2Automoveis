package entidades;

import entidades.interfaces.InterirorImpermeavel;
import entidades.interfaces.Rodovia;

/**
 * Classe que representa um carro.
 */
public class Carro extends Automovel implements InterirorImpermeavel, Rodovia {
    /**
     * Construtor do carro.
     */
    public Carro() {
        this.velocidadeMaxima = super.numeroAleatorio(70, 180);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(100, 500);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(2, 5);
    }

    /**
     *
     * @return Informações do carro.
     */
    @Override
    public String toString(){
        return String.format("Carro: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }

}
