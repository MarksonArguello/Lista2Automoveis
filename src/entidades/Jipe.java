package entidades;

import entidades.interfaces.InterirorImpermeavel;
import entidades.interfaces.OffRoad;
import entidades.interfaces.Rodovia;

/**
 * Classe que representa um jipe.
 */
public class Jipe extends Automovel implements OffRoad, InterirorImpermeavel, Rodovia {

    /**
     * Construtor do jipe.
     */
    public Jipe() {
        this.velocidadeMaxima = super.numeroAleatorio(70, 140);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(400, 800);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 7);
    }

    /**
     *
     * @return Informações do jipe.
     */
    @Override
    public String toString(){
        return String.format("Jipe: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }
}
