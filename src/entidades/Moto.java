package entidades;

import entidades.interfaces.OffRoad;
import entidades.interfaces.Rodovia;

/**
 * Classe que representa uma moto.
 */
public class Moto extends Automovel implements OffRoad, Rodovia {

    /**
     * Construtor da moto.
     */
    public Moto() {
        this.velocidadeMaxima = super.numeroAleatorio(90, 200);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(15, 60);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 2);
    }

    /**
     *
     * @return Informações da moto.
     */
    @Override
    public String toString(){
        return String.format("Moto: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }
}
