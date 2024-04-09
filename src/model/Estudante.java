package model;

public class Estudante {
    protected String ra;
    protected String nome;
    protected String email;
    protected float mediaNotas;
    protected String qtdAprovacoes;

    public Estudante(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.mediaNotas = mediaNotas;
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public float percentualRendimento() {
        return 0; 
    }

    public float percentualProgressao() {
        return 0; 
    }
}
