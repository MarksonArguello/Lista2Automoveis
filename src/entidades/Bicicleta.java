package entidades;


import entidades.interfaces.OffRoad;
import entidades.interfaces.Rodovia;

/**
 * Classe que representa a bicicleta
 */

public class Bicicleta extends Automovel implements OffRoad, Rodovia {

    /**
     * Construtor da bicicleta
     */
    public Bicicleta() {
        this.velocidadeMaxima = super.numeroAleatorio(10, 35);
        this.quantidadeMaximaDeCarga = super.numeroAleatorio(15, 60);
        this.quantidadeMaximaDePassageiros = super.numeroAleatorio(1, 2);
    }

    /**
     *
     * @return String com informações da bicicleta
     */
    @Override
    public String toString(){
        return String.format("Bicicleta: vel. máxima = %dkm/h, carga max. = %.1fkg, max. passageiros = %d", this.velocidadeMaxima, this.quantidadeMaximaDeCarga, this.quantidadeMaximaDePassageiros);
    }


}
