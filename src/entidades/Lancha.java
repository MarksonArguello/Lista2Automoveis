package entidades;

import entidades.interfaces.Aquatico;
import entidades.interfaces.InterirorImpermeavel;

/**
 * Classe que representa uma lancha.
 */
public class Lancha extends Automovel implements Aquatico, InterirorImpermeavel {

    /**
     * Construtor da lancha.
     */
    public Lancha() {
        this.velocidadeMaxima = super.numeroAleatorio(60, 90);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(700, 1500);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 8);
    }

    /**
     *
     * @return Informações da lancha.
     */
    @Override
    public String toString(){
        return String.format("Lancha: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }
}
