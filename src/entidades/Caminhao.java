package entidades;

import entidades.interfaces.InterirorImpermeavel;
import entidades.interfaces.OffRoad;
import entidades.interfaces.Rodovia;

/**
 * Classe que representa um caminhão.
 */

public class Caminhao extends Automovel implements OffRoad, InterirorImpermeavel, Rodovia {

    /**
     * Construtor do caminhão.
     */
    public Caminhao() {
        this.velocidadeMaxima = super.numeroAleatorio(40, 90);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(1000, 4000);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 3);
    }

    /**
     *
     * @return Informações do caminhão.
     */
    @Override
    public String toString(){
        return String.format("Caminhão: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }
}
