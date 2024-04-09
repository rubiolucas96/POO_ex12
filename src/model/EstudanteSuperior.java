package model;

public class EstudanteSuperior extends Estudante {
    private String instituicaoSegundoGrau;
    private int anoConclusaoSegundoGrau;

    public EstudanteSuperior(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes,
            String instituicaoSegundoGrau, int anoConclusaoSegundoGrau) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    @Override
    public float percentualRendimento() {
        return mediaNotas * Float.parseFloat(qtdAprovacoes) * 0.972f;
    }

    @Override
    public float percentualProgressao() {
        return Float.parseFloat(qtdAprovacoes) / 6;
    }
}