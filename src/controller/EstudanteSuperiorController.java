package controller;

import model.Estudante;

public class EstudanteSuperiorController implements EstudanteController {
    @Override
    public float calcularPercentualRendimento(Estudante est) {
        return est.percentualRendimento();
    }

    @Override
    public float calcularPercentualProgressao(Estudante est) {
        return est.percentualProgressao();
    }
}