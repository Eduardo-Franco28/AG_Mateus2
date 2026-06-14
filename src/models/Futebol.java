package models;

import enums.Modalidade;
import enums.Nivel;

// HERANÇA
// A classe Futebol herda características e comportamentos da classe Esportes.
public class Futebol extends Esportes {

    // Nome do time em que o jogador atua.
    public String time;

    // Nome do treinador responsável pela equipe.
    public String treinador;

    // Construtor que inicializa os dados do esporte e os dados específicos do futebol.
    public Futebol(String nome, int numeroJogador, int duracaoMinutos,
                   Modalidade modalidade, Nivel nivel,
                   String time, String treinador) {

        super(nome, numeroJogador, duracaoMinutos, modalidade, nivel);
        this.time = time;
        this.treinador = treinador;
    }

    // OVERRIDE
    // Define como uma partida de futebol é iniciada.
    @Override
    public void iniciarPartida() {
        System.out.println("A partida de futebol começou!");
    }

    // Simula um gol durante a partida.
    public void fazerGol() {
        System.out.println("GOllllll");
    }

    // OVERRIDE
    // Exibe as informações herdadas da classe Esportes
    // e adiciona os dados específicos do futebol.
    @Override
    public void exibirInfoJogador() {
        super.exibirInfoJogador();
        System.out.println("Time: " + time);
        System.out.println("Treinador: " + treinador);
    }

    // Retorna o nome do time do jogador.
    public String getTime() {
        return time;
    }

    // Retorna o nome do treinador.
    public String getTreinador() {
        return treinador;
    }

    // OVERLOAD
    // Realiza uma substituição informando apenas os jogadores envolvidos.
    public void fazerSubstituicao(String jogadorSai, String jogadorEntra) {
        System.out.println(jogadorSai + " saiu e " + jogadorEntra + " entrou.");
    }

    // OVERLOAD
    // Realiza uma substituição informando os jogadores e o minuto da troca.
    public void fazerSubstituicao(String jogadorSai, String jogadorEntra, int minuto) {
        System.out.println(jogadorSai + " saiu e " + jogadorEntra + " entrou aos " + minuto + " minutos.");
    }
}