package view;

import controller.EstudanteController;
import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.Estudante;
import model.EstudanteSuperior;
import model.EstudanteTecnico;


public class Principal {
 public static void main(String[] args) {
     EstudanteTecnico estudanteTecnico = new EstudanteTecnico("987151252", "Lucas", "lucas@example.com", 10.0f, "10");
     EstudanteSuperior estudanteSuperior = new EstudanteSuperior("563030505", "Soraia", "soraia@example.com", 10.0f, "10", "Escola XYZ", 2018);

     EstudanteController tecnicoController = new EstudanteTecnicoController();
     EstudanteController superiorController = new EstudanteSuperiorController();

     System.out.println("Percentual de rendimento do estudante técnico: " + tecnicoController.calcularPercentualRendimento(estudanteTecnico));
     System.out.println("Percentual de progressão do estudante técnico: " + tecnicoController.calcularPercentualProgressao(estudanteTecnico));

     System.out.println("Percentual de rendimento do estudante superior: " + superiorController.calcularPercentualRendimento(estudanteSuperior));
     System.out.println("Percentual de progressão do estudante superior: " + superiorController.calcularPercentualProgressao(estudanteSuperior));
 }
}
