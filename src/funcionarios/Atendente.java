package funcionarios;

import etm.ETM;

public class Atendente extends FuncionarioAdministrativo{

    public Atendente() {
    }

    public Atendente(String nome, String cpf, String ctps, String sexo, int idade, int cargaHoraria, float salario, ETM etm) {
        super(nome, cpf, ctps, sexo, idade, cargaHoraria, salario, etm);
    }

    public Atendente(String nome, String cpf, ETM etm) {
        super(nome, cpf, etm);
    }
    
}
