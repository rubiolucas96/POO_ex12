package controller;

import model.Estudante;

public interface EstudanteController {
    float calcularPercentualRendimento(Estudante est);

    float calcularPercentualProgressao(Estudante est);
}
