package enums;

// ENUM
// Representa os níveis de dificuldade disponíveis para a prática do esporte.
public enum Nivel {
    FACIL(1, "Felicidade com os parceiro"),
    MEDIO(2, "Condicionamento em dia"),
    DIFICIL(3, "Apenas seja uma estrela");

    private final int codigo;
    private final String descricao;

    // Construtor responsável por associar um código e uma descrição
    // a cada opção do enum.
    Nivel(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    // Retorna a descrição do nível selecionado.
    public String getDescricao() {
        return this.descricao;
    }
}