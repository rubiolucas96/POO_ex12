package controller;

import model.Estudante;

public class EstudanteTecnicoController implements EstudanteController {
    @Override
    public float calcularPercentualRendimento(Estudante est) {
        return est.percentualRendimento();
    }

    @Override
    public float calcularPercentualProgressao(Estudante est) {
        return est.percentualProgressao();
    }
}