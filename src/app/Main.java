package app;

import enums.Modalidade;
import enums.Nivel;
import models.Futebol;

public class Main {
    public static void main(String[] args) {

        Futebol futebol = new Futebol(
                "Edson",
                10,
                90,
                Modalidade.CAMPAO,
                Nivel.MEDIO,
                "Corinthians",
                "Tite"
        );

        // Exibe as informações
        futebol.exibirInfoJogador();

        System.out.println();

        // Inicia a partida
        futebol.iniciarPartida();

        // Faz um gol
        futebol.fazerGol();

        // Testa o acréscimo
        System.out.println("Nova duração da partida: "
                + futebol.acrescimo(5) + " minutos");

        // Testa a sobrecarga
        futebol.fazerSubstituicao("Pedro", "João");
        futebol.fazerSubstituicao("Carlos", "Lucas", 75);

        System.out.println();

        // Testa os getters
        System.out.println("Time: " + futebol.getTime());
        System.out.println("Treinador: " + futebol.getTreinador());
    }
}