package model;

public class EstudanteTecnico extends Estudante {
    public EstudanteTecnico(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
    }

    @Override
    public float percentualRendimento() {
        return mediaNotas * Float.parseFloat(qtdAprovacoes) * 0.931f;
    }

    @Override
    public float percentualProgressao() {
        return Float.parseFloat(qtdAprovacoes) / 3;
    }
}