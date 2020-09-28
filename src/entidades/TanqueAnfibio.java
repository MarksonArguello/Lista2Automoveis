package entidades;

import entidades.interfaces.Aquatico;
import entidades.interfaces.InterirorImpermeavel;
import entidades.interfaces.OffRoad;

/**
 * Classe que representa um tanque anfíbio
 */
public class TanqueAnfibio extends Automovel implements Aquatico, OffRoad, InterirorImpermeavel {

    /**
     * Construtor do tanque anfíbio.
     */
    public TanqueAnfibio() {
        this.velocidadeMaxima = super.numeroAleatorio(20, 60);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(1000, 2000);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 3);
    }

    /**
     *
     * @return Informações do tanque anfíbio.
     */
    @Override
    public String toString(){
        return String.format("Tanque anfíbio: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }
}
