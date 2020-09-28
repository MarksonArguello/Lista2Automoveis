package aplicacao;

import entidades.*;
import entidades.interfaces.Aquatico;
import entidades.interfaces.InterirorImpermeavel;
import entidades.interfaces.OffRoad;
import entidades.interfaces.Rodovia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Markson Arguello - marksonva@dcc.ufrj.br
 *
 * Classe principal do programa.
 *
 * <p>
 *     Lê distância, tipo de caminho, número de pessoas, quantidade de carga, tempo limite, clima de uma viagem e
 *     printa os veículos que conseguem fazer essa viagem.
 * </p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista;
        double distancia = 0.0, qtdCarga = 0.0, tempoLimite = 0.0;
        String tipoDeCaminho = "", clima = "";
        int numeroDePessoas = 0;

        boolean ok = false;
        do {
            try {
                lista = new ArrayList<String>(Arrays.asList(sc.nextLine().split(", ")));
                distancia = Double.parseDouble(lista.get(0));
                tipoDeCaminho  = lista.get(1);
                numeroDePessoas = Integer.parseInt(lista.get(2));
                qtdCarga = Double.parseDouble(lista.get(3));
                tempoLimite = Double.parseDouble(lista.get(4));
                clima = lista.get(5);
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Alguma letra foi digitado no lugar de um número.\n");
            }
        } while (!ok);


        ArrayList<Automovel> listaDeAutomoveis = new ArrayList<Automovel>();
        listaDeAutomoveis.add(new Bicicleta());
        listaDeAutomoveis.add(new Caminhao());
        listaDeAutomoveis.add(new Canoa());
        listaDeAutomoveis.add(new Carro());
        listaDeAutomoveis.add(new Jipe());
        listaDeAutomoveis.add(new Lancha());
        listaDeAutomoveis.add(new Moto());
        listaDeAutomoveis.add(new TanqueAnfibio());

        for (Automovel automovel : listaDeAutomoveis) {
            if (automovel.consegueChegarNoTempo(tempoLimite, distancia) &&
             automovel.getQuantidadeMaximaDeCarga() >= qtdCarga &&
             automovel.getQuantidadeMaximaDePassageiros() >= numeroDePessoas) {
                if (clima.equals("chuva") && automovel instanceof InterirorImpermeavel) {
                    if ((tipoDeCaminho.equals("rio") || tipoDeCaminho.equals("lago") || tipoDeCaminho.equals("mar")) &&
                    automovel instanceof Aquatico) {
                        System.out.println(automovel);
                    } else if (tipoDeCaminho.equals("rodovia") && automovel instanceof Rodovia) {
                        System.out.println(automovel);
                    } else if (tipoDeCaminho.equals("estrada de terra") && automovel instanceof OffRoad) {
                        System.out.println(automovel);
                    }
                } else if (clima.equals("sol")) {
                    if ((tipoDeCaminho.equals("rio") || tipoDeCaminho.equals("lago") || tipoDeCaminho.equals("mar")) &&
                            automovel instanceof Aquatico) {
                        System.out.println(automovel);
                    } else if (tipoDeCaminho.equals("rodovia") && automovel instanceof Rodovia) {
                        System.out.println(automovel);
                    } else if (tipoDeCaminho.equals("estrada de terra") && automovel instanceof OffRoad) {
                        System.out.println(automovel);
                    }
                }

            }
        }

    }
}
