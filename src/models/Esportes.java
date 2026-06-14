package models;

import enums.Modalidade;
import enums.Nivel;

// CLASSE ABSTRATA
// Representa as características básicas de qualquer esporte do sistema.
public abstract class Esportes {

    // Nome do jogador
    private String nome;

    // Número da camisa do jogador
    private int numeroJogador;

    // Duração da partida em minutos
    private int duracaoMinutos;

    // ENUM
    // Define a modalidade em que o esporte é praticado.
    private Modalidade modalidade;

    // ENUM
    // Define o nível do jogador.
    private Nivel nivel;

    // Construtor responsável por preencher os dados do esporte.
    public Esportes(String nome, int numeroJogador, int duracaoMinutos,
                    Modalidade modalidade, Nivel nivel) {
        this.nome = nome;
        this.numeroJogador = numeroJogador;
        this.duracaoMinutos = duracaoMinutos;
        this.modalidade = modalidade;
        this.nivel = nivel;
    }

    // Método abstrato que obriga as classes filhas a definirem
    // como a partida será iniciada.
    public abstract void iniciarPartida();

    // Adiciona minutos extras à partida e retorna a nova duração.
    public int acrescimo(int tempoAcrescimo) {
        this.duracaoMinutos += tempoAcrescimo;
        return this.duracaoMinutos;
    }

    // Exibe as informações cadastradas do jogador e da partida.
    public void exibirInfoJogador() {
        System.out.println("Nome jogador: " + nome);
        System.out.println("Numero camisa: " + numeroJogador);
        System.out.println("Duração partida: " + duracaoMinutos);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Nível: " + nivel);
    }
}